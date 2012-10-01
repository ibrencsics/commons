package org.ib.commons.crypto;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.PKCS10CertificationRequest;
import org.bouncycastle.openssl.PEMReader;
import org.bouncycastle.util.io.pem.PemReader;
import org.bouncycastle.x509.extension.X509ExtensionUtil;
import org.ib.commons.dto.PKCS10CertRequestDTO;
import org.ib.commons.dto.X509CertificateDTO;
import org.ib.commons.dto.X509Data;
import org.ib.commons.io.IOUtils;
import org.junit.Test;

import javax.security.auth.x500.X500Principal;
import java.io.*;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.cert.*;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/21/12
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class X509UtilsTest {

    private X509CertificateDTO getX509DTO() {
        X509CertificateDTO x509DTO = new X509CertificateDTO();
        x509DTO.setSerialNumber(System.currentTimeMillis() + "");
        x509DTO.setIssuerDN("CN=Test Certificate");
        x509DTO.setNotBefore(new Date(System.currentTimeMillis() - 50000));
        x509DTO.setNotAfter(new Date(System.currentTimeMillis() + 50000));
        x509DTO.setSubjectDN("CN=Test Certificate");
        x509DTO.setSignatureAlgorithm("SHA256WithRSAEncryption");

        return x509DTO;
    }

//    @Test
    public void createSelfSignedX509CertTest() throws Exception {
        KeyPair pair = CryptoTestData.generateRSAKeyPair();

        X509Certificate cert = X509Utils.createSelfSignedX509V1Cert(pair, getX509DTO());

        cert.checkValidity(new Date());
        cert.verify(cert.getPublicKey());
        System.out.println("valid certificate generated");
    }

//    @Test
    public void certificateFactoryExample() throws Exception {
        // create the keys
        KeyPair pair = CryptoTestData.generateRSAKeyPair();

        // create the input stream
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        bOut.write(X509Utils.createSelfSignedX509V1Cert(pair, getX509DTO()).getEncoded());
        bOut.close();

        InputStream in = new ByteArrayInputStream(bOut.toByteArray());

        X509Certificate x509Cert = X509Utils.createX509Certificate(in);

        System.out.println("issuer: " + x509Cert.getIssuerX500Principal());
    }

//    @Test
    public void multipleCertificateExample() throws Exception {
        KeyPair pair = CryptoTestData.generateRSAKeyPair();

        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        bOut.write(X509Utils.createSelfSignedX509V1Cert(pair, getX509DTO()).getEncoded());
        bOut.write(X509Utils.createSelfSignedX509V3Cert(pair, getX509DTO(), "BC").getEncoded());
        bOut.close();

        InputStream in = new ByteArrayInputStream(bOut.toByteArray());

        List<X509Certificate> certs = X509Utils.createX509Certificates(in);

        for (X509Certificate cert : certs) {
            System.out.println(cert.getVersion());
        }
    }

//    @Test
    public void pemDerTest() throws Exception {
        KeyPair pair = CryptoTestData.generateRSAKeyPair();
        X509Certificate cert = X509Utils.createSelfSignedX509V3Cert(pair, getX509DTO(), "BC");

        System.out.println("DER: " + CryptoUtils.toHex(X509Utils.toDER(cert)));
        System.out.println("PEM: " + CryptoUtils.toString(X509Utils.toPEM(cert)));
    }

//    @Test
    public void certreqTest() throws Exception {
        KeyPair pair = CryptoTestData.generateRSAKeyPair();
        PKCS10CertificationRequest request = X509Utils.generateRequest(pair, new PKCS10CertRequestDTO());
        System.out.println(CryptoUtils.toString(X509Utils.toPEM(request)));
    }

    private X509Certificate[] buildChain() throws Exception {
        // create root cert
        KeyPair rootPair = CryptoTestData.generateRSAKeyPair();
        X509Certificate rootCert = X509Utils.createSelfSignedX509V1Cert(rootPair, getX509DTO());

        //create the certification request
        KeyPair pair = CryptoTestData.generateRSAKeyPair();
        PKCS10CertificationRequest request = X509Utils.generateRequest(pair, new PKCS10CertRequestDTO());

        X509Certificate[] chain = X509Utils.issueCertificate(rootPair, rootCert, request);

        return chain;
    }

//    @Test
    public void chainTest() throws Exception {
        System.out.println("\nchainTest\n");

        X509Certificate[] chain = buildChain();

        System.out.println("issued:");
        System.out.println(CryptoUtils.toString(X509Utils.toPEM(chain[0])));
        System.out.println("root:");
        System.out.println(CryptoUtils.toString(X509Utils.toPEM(chain[1])));
    }

//    @Test
    public void certStoreExample() throws Exception {
        X509Certificate[] chain = buildChain();

        // create the store
        CollectionCertStoreParameters params = new CollectionCertStoreParameters(Arrays.asList(chain));
        CertStore store = CertStore.getInstance("Collection", params);

        // create the selector
        X509CertSelector selector = new X509CertSelector();
        selector.setSubject(new X500Principal("CN=Requested Test Certificate").getEncoded());

        // print the subjects of the results
        Iterator certsIt = store.getCertificates(selector).iterator();
        while (certsIt.hasNext()) {
            X509Certificate cert = (X509Certificate) certsIt.next();
            System.out.println(cert.getSubjectX500Principal());
        }
    }

//    @Test
    public void crlTest() throws Exception {
        // create CA keys and certificate
        KeyPair         caPair = CryptoTestData.generateRSAKeyPair();
        X509Certificate caCert = CryptoTestData.generateRootCert(caPair);
        BigInteger      revokedSerialNumber = BigInteger.valueOf(2);

        // create a CRL revoking certificate number 2
        X509CRL crl = X509Utils.createCRL(caCert, caPair.getPrivate(), revokedSerialNumber);

        // encode it and reconstruct it - this step is not necessary, only demonstrates how to reconstruct a CRL from raw bytes
        crl = X509Utils.createCRL(new ByteArrayInputStream(crl.getEncoded()));

        // verify the CRL
        crl.verify(caCert.getPublicKey(), "BC");

        // check if the CRL revokes certificate number 2
        X509CRLEntry entry = crl.getRevokedCertificate(revokedSerialNumber);
        System.out.println("Revocation Details:");
        System.out.println(" Certificate number: " + entry.getSerialNumber());
        System.out.println(" Issuer            : " +crl.getIssuerX500Principal());

        if (entry.hasExtensions()) {

           byte[] ext = entry.getExtensionValue(X509Extensions.ReasonCode.getId());

           if (ext != null) {
               DEREnumerated reasonCode =(DEREnumerated) X509ExtensionUtil.fromExtensionValue(ext);
               System.out.println("    Reason Code      : "+reasonCode.getValue());
           }
        }
    }


    private List<?> createCertsAndCRLs() throws Exception {
        // create certificates and CRLs
        KeyPair         rootPair = CryptoTestData.generateRSAKeyPair();
        KeyPair         interPair = CryptoTestData.generateRSAKeyPair();
        KeyPair         endPair = CryptoTestData.generateRSAKeyPair();

        X509Certificate rootCert = CryptoTestData.generateRootCert(rootPair);
        X509Certificate interCert = CryptoTestData.generateIntermediateCert(
                           interPair.getPublic(), rootPair.getPrivate(), rootCert);

        X509Certificate endCert = CryptoTestData.generateEndEntityCert(
                           endPair.getPublic(), interPair.getPrivate(), interCert);

        BigInteger      revokedSerialNumber = BigInteger.valueOf(2);
        X509CRL         rootCRL = X509Utils.createCRL(
                          rootCert, rootPair.getPrivate(), revokedSerialNumber);
        X509CRL         interCRL = X509Utils.createCRL(
                          interCert, interPair.getPrivate(), revokedSerialNumber);

        // create CertStore to support validation
        List list = new ArrayList();

        list.add(rootCert);
        list.add(interCert);
        list.add(endCert);
        list.add(rootCRL);
        list.add(interCRL);

        return list;
    }

    @Test
    public void readPKCS10() throws IOException {
//        InputStream is = IOUtils.getInputStreamAbsolute("C:\\Projects\\Experiments\\wsCommons\\temp\\keystore\\server.csr");
//        byte[] bytes = org.apache.commons.io.IOUtils.toByteArray(is);
//
//        ASN1InputStream in = new ASN1InputStream(bytes);
//        DERObject obj = in.readObject();
//        PKCS10CertificationRequest req = new PKCS10CertificationRequest(obj.getDEREncoded());

        PEMReader pemReader = new PEMReader(new FileReader("C:\\Projects\\Experiments\\wsCommons\\temp\\keystore\\server.csr"));

        PKCS10CertificationRequest pkcs10 = (PKCS10CertificationRequest)pemReader.readObject();

        System.out.println(pkcs10.getCertificationRequestInfo().getSubject());
    }
}
