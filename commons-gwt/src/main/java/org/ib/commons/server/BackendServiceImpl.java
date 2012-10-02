package org.ib.commons.server;

import org.apache.commons.lang.StringUtils;
import org.bouncycastle.jce.PKCS10CertificationRequest;
import org.ib.commons.assembler.PKCS10CertRequestAssembler;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.crypto.CryptoUtils;
import org.ib.commons.crypto.KeyStoreUtils;
import org.ib.commons.crypto.X509Utils;
import org.ib.commons.dto.*;
import org.ib.commons.io.IOUtils;
import org.ib.commons.security.SignatureUtils;
import org.ib.commons.shared.Configuration;
import org.ib.commons.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.ib.commons.shared.exception.CommonsGWTException;
import org.ib.commons.xml.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.security.auth.x500.X500PrivateCredential;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class BackendServiceImpl extends RemoteServiceServlet implements BackendService {

    public String greetServer(String input) throws IllegalArgumentException {
        // Verify that the input is valid.
        if (!FieldVerifier.isValidName(input)) {
            // If the input is not valid, throw an IllegalArgumentException back to
            // the client.
            throw new IllegalArgumentException(
                    "Name must be at least 4 characters long");
        }

        String serverInfo = getServletContext().getServerInfo();
        String userAgent = getThreadLocalRequest().getHeader("User-Agent");

        // Escape data from the client to avoid cross-site script vulnerabilities.
        input = escapeHtml(input);
        userAgent = escapeHtml(userAgent);

        return "Hello, " + input + "!<br><br>I am running " + serverInfo
                + ".<br><br>It looks like you are using:<br>" + userAgent;
    }

    /**
     * Escape an html string. Escaping data received from the client helps to
     * prevent cross-site script vulnerabilities.
     *
     * @param html the html string to escape
     * @return the escaped string
     */
    private String escapeHtml(String html) {
        if (html == null) {
            return null;
        }
        return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(
                ">", "&gt;");
    }


    public String signXML(String xml) {

//        System.setProperty("org.apache.xml.security.ignoreLineBreaks", "true");

        SignatureUtils su = new SignatureUtils();
        try {
            su.initDefaultKeystore();

            Document dom = DOMUtils.stringToDom(xml);
            Node sig = su.sign(dom, "//gp:Revision");
//            su.sign(dom, dom.getDocumentElement());
//            su.sign(dom, sig);

            return DOMUtils.nodeToString(dom);

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Boolean verifySignature(String xml) {

        SignatureUtils su = new SignatureUtils();

        try {
            su.initDefaultKeystore();

            Boolean valid = su.verify(xml);
            System.out.println("Signature: " + valid);

            return valid;

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return false;
    }

    public String printDOM(String xml) {
        DOMUtils domUtils = new DOMUtils();
        try {
            Document dom = DOMUtils.stringToDom(xml);

            Writer writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            domUtils.printDOM(dom, printWriter);

            return writer.toString();

        } catch (SAXException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ParserConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return "-";
    }

    public String canonicalize(String xml) {
        try {
            Document dom = DOMUtils.stringToDom(xml);

            return SignatureUtils.canonicalize(dom);

        } catch (SAXException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ParserConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /*******************************************************************************************************************************/

    @Override
    public List<BaseDTO> getKeystores() {

        List<BaseDTO> ret = new ArrayList<BaseDTO>();

        try {

            File[] files = IOUtils.getFilesInDirectory(Configuration.KEYSTORE_BASE);
            if (files != null) {
                for (File file : files) {
                    if (file.getName().endsWith(".properties")) {

                        PropertiesEditor pe = new PropertiesEditor();
                        PropertiesEditor.KeystoreProperties ksProps = pe.getConfig(file);

                        KeystoreDTO keystoreDTO = ksProps.getKeystoreDTO();

                        KeyStore ks = KeyStoreUtils.getKeyStoreFromInputStream(
                                IOUtils.getInputStreamAbsolute(Configuration.KEYSTORE_BASE + keystoreDTO.getName()),
                                keystoreDTO.getPassword(), keystoreDTO.getType(), keystoreDTO.getSecurityProvider());

                        if (ksProps.isIgnoreEntryPassword()) {
                            Enumeration<String> aliases = ks.aliases();
                            while (aliases.hasMoreElements()) {
                                String alias = aliases.nextElement();

                                keystoreDTO.addEntry(getEntryDTO(ks, alias, null));
                            }
                        }
                        else {
                            if (ksProps.getAliases()!=null) {
                                for (Map.Entry<String,String> entry : ksProps.getAliases().entrySet()) {
                                    keystoreDTO.addEntry(getEntryDTO(ks, entry.getKey(), entry.getValue()));
                                }
                            }
                        }

                        ret.add(keystoreDTO);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } 

        return ret;
    }

    /**
     * Create a new empty keystore
     * @param keystoreDTO: the keystore params
     * @throws CommonsGWTException
     */
    @Override
    public void saveKeystore(KeystoreDTO keystoreDTO) throws CommonsGWTException {

        if (StringUtils.isBlank(keystoreDTO.getName()) || StringUtils.isBlank(keystoreDTO.getPassword())
                || StringUtils.isBlank(keystoreDTO.getType()) )// || keystoreDTO.getSecurityProvider()==null)
            throw new CommonsGWTException("Validation error");

        String fileBase = Configuration.KEYSTORE_BASE + keystoreDTO.getName();

        // save properties
        PropertiesEditor.KeystoreProperties ksProps = new PropertiesEditor.KeystoreProperties();
        ksProps.setKeystoreDTO(keystoreDTO);

        PropertiesEditor pe = new PropertiesEditor();
        pe.createPropsFile(fileBase, ksProps);

        // save keystore
        try {
//            KeyStore ks = KeyStoreUtils.createEmptyKeyStore(keystoreDTO.getType(), keystoreDTO.getSecurityProvider());

            File file = new File(fileBase);
            KeyStoreUtils.createAndPersistEmptyKeyStore(keystoreDTO, file);
//            OutputStream out = new FileOutputStream(file);
//            KeyStoreUtils.storeKeyStore(ks, keystoreDTO.getPassword().toCharArray(), out);
//            out.close();
        } catch (Exception e) {
            throw new CommonsGWTException("Error when saving the keystore", e);
        }
    }

    /**
     * Create a new self-signed certificate, and store it in a keystore
     * @param keystoreDTO: the keystore into that the new PrivateKeyEntry should be stored
     * @param entryDTO: the alias and password of the new entry
     * @param x509CertificateDTO: the certificate params
     * @throws CommonsGWTException
     */
    @Override
    public void createNewRoot(KeystoreDTO keystoreDTO, EntryDTO entryDTO, X509CertificateDTO x509CertificateDTO) throws CommonsGWTException {

        String fileBase = Configuration.KEYSTORE_BASE + keystoreDTO.getName();

        try {
            // read keystore
            InputStream is = IOUtils.getInputStreamAbsolute(fileBase);
            KeyStore ks = KeyStoreUtils.getKeyStoreFromInputStream(is, keystoreDTO.getPassword(), keystoreDTO.getType(), keystoreDTO.getSecurityProvider());
            is.close();

            // create new keypair, self-signed cert
            KeyPair keyPair = CryptoUtils.generateRSAKeyPair(1024);
            X509Certificate cert = X509Utils.createSelfSignedX509V1Cert(keyPair, x509CertificateDTO);
            Certificate[] chain = new Certificate[1];
            chain[0] = cert;

            // update/store the keystore
            KeyStoreUtils.addPrivateKeyEntry(ks,
                    new X500PrivateCredential(cert, keyPair.getPrivate(), entryDTO.getAlias()),
                    chain,
                    entryDTO.getPassword().toCharArray());
            OutputStream out = new FileOutputStream(new File(fileBase));
            KeyStoreUtils.storeKeyStore(ks, keystoreDTO.getPassword().toCharArray(), out);
            out.close();

            // update the properties file
            PropertiesEditor pe = new PropertiesEditor();
            pe.updatePropsFile(fileBase, entryDTO);

        } catch (Exception e) {
            throw new CommonsGWTException("Error when creating new root certificate", e);
        }
    }

    private EntryDTO getEntryDTO(KeyStore ks, String alias, String pass) throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException {

        KeyStore.Entry entry = ks.getEntry(alias,
                pass!=null ? new KeyStore.PasswordProtection(pass.toCharArray()) : null);

        if (entry instanceof KeyStore.PrivateKeyEntry) {
            KeyStore.PrivateKeyEntry privKeyEntry = (KeyStore.PrivateKeyEntry) entry;

            // add private key info
            PrivateKeyEntryDTO privateKeyEntryDTO = new PrivateKeyEntryDTO(alias);

            privateKeyEntryDTO.setPassword(pass);

            PrivateKeyDTO privateKeyDTO = new PrivateKeyDTO();
            privateKeyDTO.setAlgorithm(privKeyEntry.getPrivateKey().getAlgorithm());
            privateKeyDTO.setFormat(privKeyEntry.getPrivateKey().getFormat());
            privateKeyDTO.setEncoded(privKeyEntry.getPrivateKey().getEncoded());
            privateKeyDTO.setPrivKeyStr(privKeyEntry.getPrivateKey().toString());

            privateKeyEntryDTO.setPrivateKeyDTO(privateKeyDTO);

            // add certificate chain
            CertificateChainDTO certificateChainDTO = new CertificateChainDTO();

            for (Certificate cert : privKeyEntry.getCertificateChain()) {

                if (cert instanceof X509Certificate) {
                    X509Certificate x509Certificate = (X509Certificate) cert;

                    X509CertificateDTO x509CertificateDTO = new X509CertificateDTO();

                    x509CertificateDTO.setCertStr(cert.toString());
                    x509CertificateDTO.setSerialNumber(x509Certificate.getSerialNumber().toString());

                    certificateChainDTO.addCertChain(x509CertificateDTO);
                }
            }

            privateKeyEntryDTO.setCertificateChainDTO(certificateChainDTO);

            return privateKeyEntryDTO;

        } else if (entry instanceof KeyStore.TrustedCertificateEntry) {
            KeyStore.TrustedCertificateEntry certEntry = (KeyStore.TrustedCertificateEntry) entry;

            TrustedCertificateEntryDTO tceDTO = new TrustedCertificateEntryDTO(alias);

            if (certEntry.getTrustedCertificate() instanceof X509Certificate) {
                X509Certificate x509Certificate = (X509Certificate) certEntry.getTrustedCertificate();

                // TODO: move it out to a function
                X509CertificateDTO x509CertificateDTO = new X509CertificateDTO();

                x509CertificateDTO.setCertStr(x509Certificate.toString());
                x509CertificateDTO.setSerialNumber(x509Certificate.getSerialNumber().toString());

                tceDTO.setCertificateDTO(x509CertificateDTO);
            }

            return tceDTO;

        } else if (entry instanceof KeyStore.SecretKeyEntry) {

        }

        return null;
    }

    public List<BaseDTO> getPKCS10CertRequests() {

        List<BaseDTO> ret = new ArrayList<BaseDTO>();

        try {

            File[] files = IOUtils.getFilesInDirectory(Configuration.KEYSTORE_BASE);
            if (files != null) {
                for (File file : files) {
                    if (file.getName().endsWith(".csr")) {

                        PKCS10CertificationRequest req = X509Utils.readPEM(
                                new FileReader(file.getAbsoluteFile()), PKCS10CertificationRequest.class
                        );

                        PKCS10CertRequestDTO reqDTO = PKCS10CertRequestAssembler.createDTO(req, file.getName());

                        ret.add(reqDTO);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return ret;
    }

    @Override
    public void createPKCS10CertRequest(PKCS10CertRequestDTO pkcs10Dto) throws CommonsGWTException {

        try {
            KeyPair keyPair = CryptoUtils.generateRSAKeyPair(1024);
            PKCS10CertificationRequest pkcs10 = X509Utils.generateRequest(keyPair, pkcs10Dto);

            byte[] privateKeyBytes = X509Utils.toPEM(keyPair.getPrivate());
            byte[] pkcs10Bytes = X509Utils.toPEM(pkcs10);

            IOUtils.storeFile(Configuration.KEYSTORE_BASE + pkcs10Dto.getName(), pkcs10Bytes);
            IOUtils.storeFile(Configuration.KEYSTORE_BASE + pkcs10Dto.getName() + ".key", privateKeyBytes);

        } catch (Exception e) {
            throw new CommonsGWTException("Error when creating new PKCS10 certificate request", e);
        }
    }

    @Override
    public void issueCertificate(PKCS10CertRequestDTO pkcs10DTO,
                                 KeystoreDTO issuerKsDTO, PrivateKeyEntryDTO issuerEntryDTO,
                                 KeystoreDTO targetKsDTO, PrivateKeyEntryDTO subjectEntryDTO) throws CommonsGWTException {
        try {

            KeyStore issuerKs = getKeystoreByDTO(issuerKsDTO);
            KeyStore.Entry issuerEntry = getEntryByDTO(issuerKs, issuerEntryDTO);
            
            KeyStore targetKs = getKeystoreByDTO(targetKsDTO);
            String targetAlias = subjectEntryDTO.getAlias();

            if (issuerEntry instanceof KeyStore.PrivateKeyEntry) {
                KeyStore.PrivateKeyEntry issuerPrivateKeyEntry = (KeyStore.PrivateKeyEntry) issuerEntry;
                PrivateKey issuerPrivateKey = issuerPrivateKeyEntry.getPrivateKey();
                X509Certificate issuerCert = (X509Certificate) issuerPrivateKeyEntry.getCertificate();
                KeyPair issuerKp = new KeyPair(issuerCert.getPublicKey(), issuerPrivateKey);
//                System.out.println(issuerPrivateKeyEntry.getPrivateKey().toString());
                
                PKCS10CertificationRequest pkcs10 = getPKCS10ByDTO(pkcs10DTO);

                X509Certificate[] certs = X509Utils.issueCertificate(issuerKp, issuerCert, pkcs10);

                // read private key from file system
                KeyPair subjectKeyPair = X509Utils.readPEM(
                        new FileReader(Configuration.KEYSTORE_BASE + pkcs10DTO.getName() + ".key"), KeyPair.class);
//                PrivateKey subjectPrivateKey = X509Utils.readPEM(
//                        new FileReader(Configuration.KEYSTORE_BASE + pkcs10DTO.getName() + ".key"), PrivateKey.class);

                // create a private key entry in the target keystore
                KeyStoreUtils.addPrivateKeyEntry(
                        targetKs,
                        new X500PrivateCredential(certs[0], subjectKeyPair.getPrivate(), targetAlias),
                        certs,
                        subjectEntryDTO.getPassword().toCharArray());

                // store target keystore
                KeyStoreUtils.storeKeyStore(targetKs, targetKsDTO.getPassword().toCharArray(), new FileOutputStream(Configuration.KEYSTORE_BASE + targetKsDTO.getName()));

                // update the properties file
                PropertiesEditor pe = new PropertiesEditor();
                pe.updatePropsFile(Configuration.KEYSTORE_BASE + targetKsDTO.getName(), subjectEntryDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private KeyStore getKeystoreByDTO(KeystoreDTO ksDTO) throws Exception {
        InputStream is = IOUtils.getInputStreamAbsolute(Configuration.KEYSTORE_BASE + ksDTO.getName());
        KeyStore ks = KeyStoreUtils.getKeyStoreFromInputStream(is, ksDTO.getPassword(), ksDTO.getType(), ksDTO.getSecurityProvider());
        is.close();
        return ks;
    }

    private KeyStore.Entry getEntryByDTO(KeyStore ks, EntryDTO entryDTO) throws Exception {
        KeyStore.Entry entry = ks.getEntry(entryDTO.getAlias(),
                entryDTO.getPassword()!=null ? new KeyStore.PasswordProtection(entryDTO.getPassword().toCharArray()) : null);
        return entry;
    }
    
    private PKCS10CertificationRequest getPKCS10ByDTO(PKCS10CertRequestDTO pkcs10DTO) throws Exception {
        File file = new File(Configuration.KEYSTORE_BASE + pkcs10DTO.getName());
        PKCS10CertificationRequest req = X509Utils.readPEM(new FileReader(file.getAbsoluteFile()), PKCS10CertificationRequest.class);
        return req;
    }
}
