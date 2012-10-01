package org.ib.commons.crypto;

import org.apache.commons.lang.StringUtils;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.io.IOUtils;

import javax.crypto.SecretKey;
import javax.security.auth.x500.X500PrivateCredential;
import java.io.*;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/23/12
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class KeyStoreUtils {

    /*
     * Read keystores
     */

    public static KeyStore getKeyStoreFromResources(
            String fileName,
            String keyStorePass,
            String keyStoreType,
            String provider)
            throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException, NoSuchProviderException {

        return getKeyStoreFromInputStream(IOUtils.getInputStreamFromResources(fileName), keyStorePass, keyStoreType, provider);
    }

    public static KeyStore getKeyStoreFromInputStream(
            InputStream is,
            String keyStorePass,
            String keyStoreType,
            String provider)
            throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException, NoSuchProviderException {

        KeyStore ks = StringUtils.isBlank(provider) ? KeyStore.getInstance(keyStoreType) : KeyStore.getInstance(keyStoreType, provider);
        ks.load(is, keyStorePass==null ? null : keyStorePass.toCharArray());

        return ks;
    }

    /*
     * Create keystores
     */

    public static KeyStore createEmptyKeyStore(
            String keyStoreType,
            String provider)
            throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException, NoSuchProviderException {

        KeyStore ks = StringUtils.isBlank(provider) ? KeyStore.getInstance(keyStoreType) : KeyStore.getInstance(keyStoreType, provider);
        ks.load(null,null);

        return ks;
    }

    public static void createAndPersistEmptyKeyStore(KeystoreDTO ksDTO, File file)
            throws IOException, NoSuchProviderException, NoSuchAlgorithmException, KeyStoreException, CertificateException {

        KeyStore ks = KeyStoreUtils.createEmptyKeyStore(ksDTO.getType(), ksDTO.getSecurityProvider());

        OutputStream out = new FileOutputStream(file);
        KeyStoreUtils.storeKeyStore(ks, ksDTO.getPassword().toCharArray(), out);
        out.close();
    }

    public static void addTrustedCertificateEntry(
            KeyStore ks,
            X500PrivateCredential credential)
            throws KeyStoreException {

        ks.setEntry(
                credential.getAlias(),
                new KeyStore.TrustedCertificateEntry(credential.getCertificate()), null);
    }

    public static void addPrivateKeyEntry(
            KeyStore ks,
            X500PrivateCredential credential,
            Certificate[] chain,
            char[] keyPass) throws KeyStoreException {

        ks.setEntry(
                credential.getAlias(),
                new KeyStore.PrivateKeyEntry(credential.getPrivateKey(), chain),
                new KeyStore.PasswordProtection(keyPass));
    }

    public static void addSecretKeyEntry(
            KeyStore ks,
            String alias,
            SecretKey key,
            char[] keyPass) throws KeyStoreException {

        ks.setEntry(
                "secret",
                new KeyStore.SecretKeyEntry(key),
                new KeyStore.PasswordProtection(keyPass));
    }

    public static void storeKeyStore(
            KeyStore ks,
            char[] storePass,
            OutputStream os)
            throws IOException, NoSuchAlgorithmException, KeyStoreException, CertificateException {

        ks.store(os, storePass);
    }
}
