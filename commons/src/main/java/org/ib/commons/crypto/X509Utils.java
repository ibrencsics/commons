package org.ib.commons.crypto;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.*;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.jce.PKCS10CertificationRequest;
import org.bouncycastle.openssl.PEMReader;
import org.bouncycastle.openssl.PEMWriter;
import org.bouncycastle.x509.X509V1CertificateGenerator;
import org.bouncycastle.x509.X509V2CRLGenerator;
import org.bouncycastle.x509.X509V3CertificateGenerator;
import org.bouncycastle.x509.extension.AuthorityKeyIdentifierStructure;
import org.bouncycastle.x509.extension.SubjectKeyIdentifierStructure;
import org.ib.commons.dto.PKCS10CertRequestDTO;
import org.ib.commons.dto.X509CertificateDTO;
import org.ib.commons.dto.X509Data;

import javax.security.auth.x500.X500Principal;
import java.io.*;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.*;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/21/12
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class X509Utils {

    /****************************************************************************************************/
    /*                                         X.509                                                    */
    /****************************************************************************************************/

    @SuppressWarnings({"deprecation"})
    public static X509Certificate createSelfSignedX509V1Cert(KeyPair pair, X509CertificateDTO x509DTO) throws Exception {

        X509V1CertificateGenerator certGen = new X509V1CertificateGenerator();

        certGen.setSerialNumber(new BigInteger(x509DTO.getSerialNumber()));
        certGen.setIssuerDN(new X500Principal(x509DTO.getIssuerDN()));
        certGen.setNotBefore(x509DTO.getNotBefore());
        certGen.setNotAfter(x509DTO.getNotAfter());
        certGen.setSubjectDN(new X500Principal(x509DTO.getSubjectDN()));

        certGen.setPublicKey(pair.getPublic());
        certGen.setSignatureAlgorithm(x509DTO.getSignatureAlgorithm());

        return certGen.generateX509Certificate(pair.getPrivate(), "BC");
    }

    @SuppressWarnings({"deprecation"})
    public static X509Certificate createSelfSignedX509V3Cert(KeyPair pair, X509CertificateDTO x509DTO, String provider) throws Exception {

        X509V3CertificateGenerator certGen = new X509V3CertificateGenerator();

        certGen.setSerialNumber(new BigInteger(x509DTO.getSerialNumber()));
        certGen.setIssuerDN(new X500Principal(x509DTO.getIssuerDN()));
        certGen.setNotBefore(x509DTO.getNotBefore());
        certGen.setNotAfter(x509DTO.getNotAfter());
        certGen.setSubjectDN(new X500Principal(x509DTO.getSubjectDN()));

        certGen.setPublicKey(pair.getPublic());
        certGen.setSignatureAlgorithm(x509DTO.getSignatureAlgorithm());

        certGen.addExtension(X509Extensions.BasicConstraints, true, new BasicConstraints(false));
        certGen.addExtension(X509Extensions.KeyUsage, true,
                new KeyUsage(KeyUsage.digitalSignature | KeyUsage.keyEncipherment));
        certGen.addExtension(X509Extensions.ExtendedKeyUsage, true,
                new ExtendedKeyUsage(KeyPurposeId.id_kp_serverAuth));

        certGen.addExtension(X509Extensions.SubjectAlternativeName, false,
                new GeneralNames(
                        new GeneralName(GeneralName.rfc822Name, "test@test.test")));

        return certGen.generateX509Certificate(pair.getPrivate(), "BC");
    }


    public static X509Certificate createX509Certificate(InputStream is) throws NoSuchProviderException, CertificateException {
        // create the certificate factory
        CertificateFactory fact = CertificateFactory.getInstance("X.509", "BC");

        // read the certificate
        X509Certificate x509Cert = (X509Certificate) fact.generateCertificate(is);

        return x509Cert;
    }

    public static List<X509Certificate> createX509Certificates(InputStream is) throws NoSuchProviderException, CertificateException {
        CertificateFactory fact = CertificateFactory.getInstance("X.509", "BC");

        X509Certificate x509Cert;
        List<X509Certificate> collection = new ArrayList<X509Certificate>();

        while ((x509Cert = (X509Certificate) fact.generateCertificate(is)) != null) {
            collection.add(x509Cert);
        }

        return collection;
    }

    /****************************************************************************************************/
    /*                                         Conversion                                               */
    /****************************************************************************************************/

    public static byte[] toPEM(Object obj) throws IOException {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();

        PEMWriter pemWrt = new PEMWriter(new OutputStreamWriter(bOut));
        pemWrt.writeObject(obj);
        pemWrt.close();

        bOut.close();

        return bOut.toByteArray();
    }

    public static <T> T readPEM(Reader reader, Class<?> T) throws IOException {
        PEMReader pemReader = new PEMReader(reader);
        T obj = (T) pemReader.readObject();
        return obj;
    }

    public static byte[] toDER(X509Certificate cert) throws CertificateEncodingException {
        return cert.getEncoded();
    }

    /****************************************************************************************************/
    /*                                         PKCS10                                                   */
    /****************************************************************************************************/

    @SuppressWarnings({"deprecation"})
    public static PKCS10CertificationRequest generateRequest(KeyPair pair, PKCS10CertRequestDTO pkcs10DTO) throws Exception {
        // create a SubjectAlternativeName extension value
        GeneralNames subjectAltName = new GeneralNames(
                new GeneralName(GeneralName.rfc822Name, "test@test.test"));

        // create the extensions object and add it as an attribute
        Vector oids = new Vector();
        Vector values = new Vector();

        oids.add(X509Extensions.SubjectAlternativeName);
        values.add(new X509Extension(false, new DEROctetString(subjectAltName)));

        X509Extensions extensions = new X509Extensions(oids, values);

        Attribute attribute = new Attribute(
                               PKCSObjectIdentifiers.pkcs_9_at_extensionRequest,
                               new DERSet(extensions));

        return new PKCS10CertificationRequest(
               "SHA256withRSA",
               new X500Principal(pkcs10DTO.getSubjectDN()),
               pair.getPublic(),
               new DERSet(attribute),
               pair.getPrivate());
    }

    @SuppressWarnings({"deprecation"})
    public static X509Certificate[] issueCertificate(KeyPair rootPair, X509Certificate rootCert, PKCS10CertificationRequest request) throws Exception {

        // validate the certification request
        if (!request.verify("BC"))
        {
           System.out.println("request failed to verify!");
           System.exit(1);
        }

        // create the certificate using the information in the request
        X509V3CertificateGenerator certGen = new X509V3CertificateGenerator();

        certGen.setSerialNumber(BigInteger.valueOf(System.currentTimeMillis()));
        certGen.setIssuerDN(rootCert.getSubjectX500Principal());
        certGen.setNotBefore(new Date(System.currentTimeMillis()));
        certGen.setNotAfter(new Date(System.currentTimeMillis() + 50000));
        certGen.setSubjectDN(new X500Principal(request.getCertificationRequestInfo().getSubject().getEncoded()));
        certGen.setPublicKey(request.getPublicKey("BC"));
        certGen.setSignatureAlgorithm("SHA256WithRSAEncryption");

        certGen.addExtension(X509Extensions.AuthorityKeyIdentifier,
                false, new AuthorityKeyIdentifierStructure(rootCert));

        certGen.addExtension(X509Extensions.SubjectKeyIdentifier,
                false, new SubjectKeyIdentifierStructure(request.getPublicKey("BC")));

        certGen.addExtension(X509Extensions.BasicConstraints,
                true, new BasicConstraints(false));

        certGen.addExtension(X509Extensions.KeyUsage,
                true, new KeyUsage(KeyUsage.digitalSignature | KeyUsage.keyEncipherment));

        certGen.addExtension(X509Extensions.ExtendedKeyUsage,
                true, new ExtendedKeyUsage(KeyPurposeId.id_kp_serverAuth));

        // extract the extension request attribute
        ASN1Set attributes = request.getCertificationRequestInfo().getAttributes();

        for (int i = 0; i != attributes.size(); i++) {
            Attribute attr = Attribute.getInstance(attributes.getObjectAt(i));

            // process extension request
            if (attr.getAttrType().equals(
                    PKCSObjectIdentifiers.pkcs_9_at_extensionRequest)) {
                X509Extensions extensions = X509Extensions.getInstance(
                        attr.getAttrValues().getObjectAt(0));

                Enumeration e = extensions.oids();
                while (e.hasMoreElements()) {
                    DERObjectIdentifier oid = (DERObjectIdentifier) e.nextElement();
                    X509Extension ext = extensions.getExtension(oid);

                    certGen.addExtension(oid, ext.isCritical(),
                            ext.getValue().getOctets());
                }
            }
        }

        X509Certificate issuedCert = certGen.generateX509Certificate(rootPair.getPrivate());

        return new X509Certificate[]{issuedCert, rootCert};
    }

    /****************************************************************************************************/
    /*                                         CRL                                                      */
    /****************************************************************************************************/

    public static X509CRL createCRL(
            X509Certificate caCert,
            PrivateKey caKey,
            BigInteger revokedSerialNumber)
            throws Exception {
        X509V2CRLGenerator crlGen = new X509V2CRLGenerator();
        Date now = new Date();

        crlGen.setIssuerDN(caCert.getSubjectX500Principal());

        crlGen.setThisUpdate(now);
        crlGen.setNextUpdate(new Date(now.getTime() + 100000));
        crlGen.setSignatureAlgorithm("SHA256WithRSAEncryption");

        crlGen.addCRLEntry(revokedSerialNumber, now, CRLReason.privilegeWithdrawn);

        crlGen.addExtension(X509Extensions.AuthorityKeyIdentifier,
                false, new AuthorityKeyIdentifierStructure(caCert));
        crlGen.addExtension(X509Extensions.CRLNumber,
                false, new CRLNumber(BigInteger.valueOf(1)));

        return crlGen.generateX509CRL(caKey, "BC");
    }

    public static X509CRL createCRL(InputStream is) throws Exception {
        // encode it and reconstruct it
        CertificateFactory   fact = CertificateFactory.getInstance("X.509", "BC");
        return (X509CRL)fact.generateCRL(is);
    }

}
