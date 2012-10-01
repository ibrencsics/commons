package org.ib.commons.crypto;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.junit.Test;

import javax.crypto.Cipher;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/21/12
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class ASN1UtilsTest {

    /*
        AlgorithmIdentifier ::= SEQUENCE {
                           algorithm OBJECT IDENTIFIER,
                           parameters SomeASN1Type OPTIONAL }
     */

    /*
        Attribute ::= SEQUENCE {
                         attrType OBJECT IDENTIFIER,
                         attrValues SET OF AttributeValue
        }
        AttributeValue ::= ANY
     */

    /*
        IvParam ::= OCTET STRING
     */


    /**
     * PKCS #1 V1.5 Signature
     */

    /*
        DigestInfo ::= SEQUENCE{
               digestAlgorithm DigestAlgorithm,
               digest OCTET STRING }
        DigestAlgorithm ::= AlgorithmIdentifier { {PKCS1-v1-5DigestAlgorithms} }
     */
    @Test
    public void PKCS1SigEncodingExample() throws Exception {
        System.out.println("\n *PKCS1SigEncodingExample\n");

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA", "BC");

        keyGen.initialize(512, new SecureRandom());

        KeyPair keyPair = keyGen.generateKeyPair();


        Signature signature = Signature.getInstance("SHA256withRSA", "BC");

        // generate a signature
        signature.initSign(keyPair.getPrivate());

        byte[] message = new byte[]{(byte) 'a', (byte) 'b', (byte) 'c'};

        signature.update(message);

        byte[] sigBytes = signature.sign();

        // verify hash in signature
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding", "BC");

        cipher.init(Cipher.DECRYPT_MODE, keyPair.getPublic());

        byte[] decSig = cipher.doFinal(sigBytes);

        // parse the signature
        ASN1InputStream aIn = new ASN1InputStream(decSig);
        ASN1Sequence seq = (ASN1Sequence) aIn.readObject();

        System.out.println(ASN1Dump.dumpAsString(seq));

        // grab a digest of the correct type
        MessageDigest hash = MessageDigest.getInstance("SHA-256", "BC");

        hash.update(message);

        ASN1OctetString sigHash = (ASN1OctetString) seq.getObjectAt(1);
        if (MessageDigest.isEqual(hash.digest(), sigHash.getOctets())) {
            System.out.println("hash verification succeeded");
        } else {
            System.out.println("hash verification failed");
        }
    }


    /**
     * X509EncodedKeySpec
     */

    /*
        SubjectPublicKeyInfo ::= SEQUENCE {
                algorithm AlgorithmIdentifier,
                subjectPublicKey BIT STRING }

        RSA:
        ----

        RSAPublicKey ::= SEQUENCE {
                modulus INTEGER,
                publicExponent INTEGER }

        rsaEncryption OBJECT IDENTIFIER ::= {
                iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs-1(1) 1
        }
     */
    @Test
    public void X509EncodedKeySpecExample() throws Exception {
        System.out.println("\n * X509EncodedKeySpecExample\n");

        // create the keys
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA", "BC");

        generator.initialize(128, CryptoTestData.createFixedRandom());
        KeyPair pair = generator.generateKeyPair();

        // dump public key
        ASN1InputStream aIn = new ASN1InputStream(pair.getPublic().getEncoded());
        SubjectPublicKeyInfo info = SubjectPublicKeyInfo.getInstance(aIn.readObject());

        System.out.println(ASN1Dump.dumpAsString(info));
        System.out.println(ASN1Dump.dumpAsString(info.getPublicKey()));

        // create from specification
        X509EncodedKeySpec x509Spec = new X509EncodedKeySpec(pair.getPublic().getEncoded());
//        KeyFactory keyFact = KeyFactory.getInstance("RSA", "BC");
        KeyFactory keyFact = KeyFactory.getInstance(info.getAlgorithmId().getObjectId().getId(), "BC");

        PublicKey pubKey = keyFact.generatePublic(x509Spec);

        if (pubKey.equals(pair.getPublic())) {
            System.out.println("key recovery successful");
        } else {
            System.out.println("key recovery failed");
        }
    }


    /**
     * PKCS8EncodedKeySpec
     */

    /*
        PrivateKeyInfo ::= SEQUENCE {
                 version Version,
                 privateKeyAlgorithm PrivateKeyAlgorithmIdentifier,
                 privateKey PrivateKey,
                 attributes [0] IMPLICIT Attributes OPTIONAL }
        Version ::= INTEGER {v1(0)}
        PrivateKeyAlgorithmIdentifier ::= AlgorithmIdentifier
        PrivateKey ::= OCTET STRING
        Attributes ::= SET OF Attribute

        RSAPrivateKey ::= SEQUENCE {
                version Version,
                modulus INTEGER,
                publicExponent INTEGER,
                privateExponent INTEGER,
                prime1 INTEGER,
                prime2 INTEGER,
                exponent1 INTEGER,
                exponent2 INTEGER,
                coefficient INTEGER,
                otherPrimeInfos OtherPrimeInfos OPTIONAL }
        Version ::= INTEGER { two-prime(0), multi(1) }
        (CONSTRAINED BY {-- version must be multi if otherPrimeInfos present --})

        OtherPrimeInfos ::= SEQUENCE SIZE(1..MAX) OF OtherPrimeInfo

        OtherPrimeInfo ::= SEQUENCE {
                prime INTEGER,
                exponent INTEGER,
                coefficient INTEGER }
     */
    @Test
    public void PrivateKeyInfoExample() throws Exception {
        System.out.println("\n * PrivateKeyInfoExample\n");

        // create the keys
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA", "BC");

        generator.initialize(128, CryptoTestData.createFixedRandom());
        KeyPair pair = generator.generateKeyPair();

        PKCS8EncodedKeySpec pkcs8Spec = new PKCS8EncodedKeySpec(pair.getPrivate().getEncoded());

        ASN1InputStream aIn = new ASN1InputStream(pair.getPrivate().getEncoded());
        PrivateKeyInfo info = PrivateKeyInfo.getInstance(aIn.readObject());

        System.out.println(ASN1Dump.dumpAsString(info));
        System.out.println(ASN1Dump.dumpAsString(info.getPrivateKey()));
    }

    /*
        EncryptedPrivateKeyInfo ::= SEQUENCE {
               encryptionAlgorithm AlgorithmIdentifier,
               encryptedData EncryptedData }
        EncryptedData ::= OCTET STRING
     */

    @Test
    public void EncryptedPrivateKeyInfoExample() throws Exception {
        System.out.println("\n * EncryptedPrivateKeyInfoExample\n");

        // generate a key pair
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA", "BC");
        kpg.initialize(128, CryptoTestData.createFixedRandom());

        KeyPair pair = kpg.generateKeyPair();

        // wrapping step
        char[] password = "hello".toCharArray();
        byte[] salt = new byte[20];
        int iCount = 100;
        String pbeAlgorithm = "PBEWithSHAAnd3-KeyTripleDES-CBC";
        PBEKeySpec pbeKeySpec = new PBEKeySpec(password, salt, iCount);
        SecretKeyFactory secretKeyFact = SecretKeyFactory.getInstance(pbeAlgorithm, "BC");
        Cipher cipher = Cipher.getInstance(pbeAlgorithm, "BC");

        cipher.init(Cipher.WRAP_MODE, secretKeyFact.generateSecret(pbeKeySpec));

        System.out.println(ASN1Dump.dumpAsString(
             new ASN1InputStream(cipher.getParameters().getEncoded()).readObject()));
        System.out.println(cipher.getParameters().getAlgorithm());

        byte[] wrappedKey = cipher.wrap(pair.getPrivate());

        // create carrier
        EncryptedPrivateKeyInfo pInfo = new EncryptedPrivateKeyInfo(cipher.getParameters(), wrappedKey);

        // unwrapping step - note we only use the password
        pbeKeySpec = new PBEKeySpec(password);

        cipher = Cipher.getInstance(pInfo.getAlgName(), "BC");

        cipher.init(Cipher.DECRYPT_MODE, secretKeyFact.generateSecret(pbeKeySpec), pInfo.getAlgParameters());

        PKCS8EncodedKeySpec pkcs8Spec = pInfo.getKeySpec(cipher);
        KeyFactory keyFact = KeyFactory.getInstance("RSA", "BC");
        PrivateKey privKey = keyFact.generatePrivate(pkcs8Spec);

        if (privKey.equals(pair.getPrivate())) {
            System.out.println("key recovery successful");
        } else {
            System.out.println("key recovery failed");
        }
    }
}
