package org.ib.commons.crypto;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/17/12
 * Time: 11:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class SymmetricUtils {

    public static final String ALG_AES = "AES";
    public static final String ALG_DES = "DES";
    public static final String ALG_3DES = "DESede";
    public static final String ALG_ARC4 = "ARC4";
    public static final String ALG_PBE_SHA_3DES = "PBEWithSHAAnd3KeyTripleDES";

    public static final String MODE_ECB = "ECB";
    public static final String MODE_CBC = "CBC";
    public static final String MODE_CTS = "CTS";
    public static final String MODE_CTR = "CTR";
    public static final String MODE_OFB = "OFB";
    public static final String MODE_CFB = "CFB";

    public static final String PADDING_NO = "NoPadding";
    public static final String PADDING_PKCS7 = "PKCS7Padding";

    public static final String PROVIDER_BC = "BC";

    private static String createCipherString(CipherContext cipherContext) {
        StringBuffer sb = new StringBuffer();
        sb.append(cipherContext.algorithm);
        if (cipherContext.mode!=null && cipherContext.padding!=null) {
            sb.append("/");
            sb.append(cipherContext.mode);
            sb.append("/");
            sb.append(cipherContext.padding);
        }
        return sb.toString();
    }

    private static Cipher getCipher(CipherContext cipherContext) throws Exception {
        IvParameterSpec ivSpec=null;
        if (cipherContext.ivBytes != null) {
            ivSpec = new IvParameterSpec(cipherContext.ivBytes);
        }

        Cipher cipher = Cipher.getInstance(createCipherString(cipherContext), cipherContext.provider);
        if (cipherContext.ivBytes == null)
            cipher.init(cipherContext.cipherMode, cipherContext.key);
        else {
            cipher.init(cipherContext.cipherMode, cipherContext.key, ivSpec);
        }

        return cipher;
    }

    public static ResponseWrapper crypt(byte[] input, CipherContext cipherContext) throws Exception {

        Cipher cipher = getCipher(cipherContext);

        byte[] result = new byte[cipher.getOutputSize(input.length)];

        int resultLength = cipher.update(input, 0, input.length, result, 0);
        resultLength += cipher.doFinal(result, resultLength);

        return new ResponseWrapper(result, resultLength);
    }

    public static void crypt(InputStream is, OutputStream os, CipherContext cipherContext) throws Exception {

        Cipher cipher = getCipher(cipherContext);

        // with CipherInputStream
        CipherInputStream cIn = new CipherInputStream(is, cipher);

        int ch;
        while ((ch = cIn.read()) >= 0) {
            os.write(ch);
        }

        // with CipherOutputStream
//        CipherOutputStream cOut = new CipherOutputStream(os, cipher);
//
//        int ch;
//        while ((ch = is.read()) >= 0) {
//            cOut.write(ch);
//        }
    }

    public static Key generateRandomKey(String algorithm, String provider, int keyLength) throws Exception {
        KeyGenerator generator = KeyGenerator.getInstance(algorithm, provider);
        generator.init(keyLength);

        return generator.generateKey();
    }

    private static Key createKey(byte[] key, String algorithm) {
        return new SecretKeySpec(key, algorithm);
    }

    private static SecretKeySpec createKey(Key encodedKey) {
        return new SecretKeySpec(encodedKey.getEncoded(), encodedKey.getAlgorithm());
    }

    public static Key createPBEKey(char[] password, byte[] salt, int iterationCount, String algorithm, String provider) throws Exception {
        PBEKeySpec pbeSpec = new PBEKeySpec(password, salt, iterationCount);
        SecretKeyFactory keyFact = SecretKeyFactory.getInstance(algorithm, provider);
        Key sKey = keyFact.generateSecret(pbeSpec);
        return sKey;
    }


    public static class CipherContext {
        String algorithm;
        String mode;
        String padding;
        String provider;

//        byte[] keyBytes;
        Key key;
        byte[] ivBytes;

        int cipherMode;

        public CipherContext(String algorithm, String mode, String padding, String provider) {
            this.algorithm = algorithm;
            this.mode = mode;
            this.padding = padding;
            this.provider = provider;
        }

        public void setKey(byte[] keyBytes) {
//            this.keyBytes = keyBytes;
            this.key = createKey(keyBytes, algorithm);
        }

        public void setKey(Key key) {
            this.key = key;
        }

        public void setIV(byte[] ivBytes) {
            this.ivBytes = ivBytes;
        }
    }

}
