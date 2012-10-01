package org.ib.commons.crypto;

import org.junit.Test;
import sun.security.tools.KeyStoreUtil;

import javax.crypto.SecretKey;
import javax.security.auth.x500.X500PrivateCredential;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.util.Enumeration;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/23/12
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class KeyStoreUtilsTest {

    public static char[] keyPassword = "keyPassword".toCharArray();
    public static char[]  secretKeyPassword = "secretPassword".toCharArray();

    private static KeyStore createKeyStore() throws Exception {
        KeyStore store = KeyStore.getInstance("JKS");

        // initialize
        store.load(null, null);

        X500PrivateCredential rootCredential = CryptoTestData.createRootCredential();
        X500PrivateCredential interCredential = CryptoTestData.createIntermediateCredential(
                rootCredential.getPrivateKey(), rootCredential.getCertificate());
        X500PrivateCredential endCredential = CryptoTestData.createEndEntityCredential(
                interCredential.getPrivateKey(), interCredential.getCertificate());

        Certificate[] chain = new Certificate[3];

        chain[0] = endCredential.getCertificate();
        chain[1] = interCredential.getCertificate();
        chain[2] = rootCredential.getCertificate();

        // set the entries
        store.setCertificateEntry(
                rootCredential.getAlias(), rootCredential.getCertificate());
        store.setKeyEntry(
                endCredential.getAlias(), endCredential.getPrivateKey(),
                keyPassword, chain);
        return store;
    }

    private static KeyStore createKeyStoreNew()
            throws Exception {
        KeyStore store = KeyStore.getInstance("JCEKS");

        // initialize
        store.load(null, null);

        X500PrivateCredential rootCredential = CryptoTestData.createRootCredential();
        X500PrivateCredential interCredential = CryptoTestData.createIntermediateCredential(
                rootCredential.getPrivateKey(), rootCredential.getCertificate());
        X500PrivateCredential endCredential = CryptoTestData.createEndEntityCredential(
                interCredential.getPrivateKey(), interCredential.getCertificate());
        Certificate[] chain = new Certificate[3];

        chain[0] = endCredential.getCertificate();
        chain[1] = interCredential.getCertificate();
        chain[2] = rootCredential.getCertificate();

        SecretKey secret = CryptoTestData.createKeyForAES(256, new SecureRandom());

        // set the entries
        store.setEntry(rootCredential.getAlias(),
                new KeyStore.TrustedCertificateEntry(
                        rootCredential.getCertificate()), null);
        store.setEntry(endCredential.getAlias(),
                new KeyStore.PrivateKeyEntry(
                        endCredential.getPrivateKey(), chain),
                new KeyStore.PasswordProtection(
                        keyPassword));
        store.setEntry("secret",
                new KeyStore.SecretKeyEntry(secret),
                new KeyStore.PasswordProtection(secretKeyPassword));

        return store;
    }


    @Test
    public void basicTests() throws Exception {
        System.out.println(KeyStore.getDefaultType());

        X500PrivateCredential rootCredential = CryptoTestData.createRootCredential();
        X500PrivateCredential interCredential = CryptoTestData.createIntermediateCredential(
                rootCredential.getPrivateKey(), rootCredential.getCertificate());
        X500PrivateCredential endCredential = CryptoTestData.createEndEntityCredential(
                interCredential.getPrivateKey(), interCredential.getCertificate());
        Certificate[] chain = new Certificate[3];

        chain[0] = endCredential.getCertificate();
        chain[1] = interCredential.getCertificate();
        chain[2] = rootCredential.getCertificate();

        SecretKey secret = CryptoTestData.createKeyForAES(256, new SecureRandom());

        KeyStore ks = KeyStoreUtils.createEmptyKeyStore("JCEKS", null);
        KeyStoreUtils.addPrivateKeyEntry(ks, endCredential, chain, keyPassword);
        KeyStoreUtils.addTrustedCertificateEntry(ks, rootCredential);
        KeyStoreUtils.addSecretKeyEntry(ks, "secret", secret, secretKeyPassword);

        char[] password = "storePassword".toCharArray();
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        // save the store
        ks.store(bOut, password);

        // reload from scratch
//        ks = KeyStore.getInstance("JCEKS");
//        ks.load(new ByteArrayInputStream(bOut.toByteArray()), password);

        ks = KeyStoreUtils.getKeyStoreFromInputStream(new ByteArrayInputStream(bOut.toByteArray()), "storePassword", "JCEKS", null);

        Enumeration en = ks.aliases();
        while (en.hasMoreElements()) {

            String alias = (String) en.nextElement();
            System.out.println("found " + alias
                    + ", isCertificate? " + ks.isCertificateEntry(alias)
                    + ", secret key entry? " + ks.entryInstanceOf(
                    alias, KeyStore.SecretKeyEntry.class));
        }

    }

}
