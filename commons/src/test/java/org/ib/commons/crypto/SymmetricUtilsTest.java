package org.ib.commons.crypto;

import org.junit.Test;

import javax.crypto.Cipher;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/17/12
 * Time: 11:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class SymmetricUtilsTest {

    @Test
    public void encryptNoPaddingTest() {
        byte[] input = new byte[] {
                          0x00, 0x11, 0x22, 0x33, 0x44, 0x55, 0x66, 0x77,
                          (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb,
                          (byte)0xcc, (byte)0xdd, (byte)0xee, (byte)0xff };
        byte[] keyBytes = new byte[] {
                          0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                          0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                          0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17 };

        System.out.println("AES ESB NoPadding");

        SymmetricUtils.CipherContext cipherContext =
                new SymmetricUtils.CipherContext(SymmetricUtils.ALG_AES, SymmetricUtils.MODE_ECB, SymmetricUtils.PADDING_NO, SymmetricUtils.PROVIDER_BC);
        cipherContext.setKey(keyBytes);

        doCrypto(input, cipherContext);
    }

    @Test
    public void encryptPaddingTest() {
        byte[]        input = new byte[] {
                          0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                          0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                          0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17 };
        byte[]        keyBytes = new byte[] {
                          0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                          0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                          0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17 };

        System.out.println("AES ESB PKCS7Padding");

        SymmetricUtils.CipherContext cipherContext =
                new SymmetricUtils.CipherContext(SymmetricUtils.ALG_AES, SymmetricUtils.MODE_ECB, SymmetricUtils.PADDING_PKCS7, SymmetricUtils.PROVIDER_BC);
        cipherContext.setKey(keyBytes);

        doCrypto(input, cipherContext);
    }

    @Test
    public void cbcTest() {
        byte[]          input = new byte[] {
                                0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                                0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                                0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07 };
        byte[]          keyBytes = new byte[] {
                                0x01, 0x23, 0x45, 0x67,
                                (byte)0x89, (byte)0xab, (byte)0xcd, (byte)0xef };
        byte[]          ivBytes = new byte[] {
                                0x07, 0x06, 0x05, 0x04, 0x03, 0x02, 0x01, 0x00 };

        System.out.println("DES CBC PKCS7Padding");

        SymmetricUtils.CipherContext cipherContext =
                new SymmetricUtils.CipherContext(SymmetricUtils.ALG_DES, SymmetricUtils.MODE_CBC, SymmetricUtils.PADDING_PKCS7, SymmetricUtils.PROVIDER_BC);
        cipherContext.setKey(keyBytes);
        cipherContext.setIV(ivBytes);

        doCrypto(input, cipherContext);
    }

    @Test
    public void ctrTest() {
        byte[]          input = new byte[] {
                                0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                                0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                                0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06 };
        byte[]          keyBytes = new byte[] {
                                0x01, 0x23, 0x45, 0x67,
                                (byte)0x89, (byte)0xab, (byte)0xcd, (byte)0xef };
        byte[]          ivBytes = new byte[] {
                                0x00, 0x01, 0x02, 0x03, 0x00, 0x00, 0x00, 0x01 };

        System.out.println("DES CTR NoPadding");

        SymmetricUtils.CipherContext cipherContext =
                new SymmetricUtils.CipherContext(SymmetricUtils.ALG_DES, SymmetricUtils.MODE_CTR, SymmetricUtils.PADDING_NO, SymmetricUtils.PROVIDER_BC);
        cipherContext.setKey(keyBytes);
        cipherContext.setIV(ivBytes);

        doCrypto(input, cipherContext);
    }

    @Test
    public void arc4Test() {
        byte[]        input = new byte[] {
                          0x00, 0x11, 0x22, 0x33, 0x44, 0x55, 0x66, 0x77,
                          (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb,
                          (byte)0xcc, (byte)0xdd, (byte)0xee, (byte)0xff };
        byte[]        keyBytes = new byte[] {
                          0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                          0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f };

        System.out.println("ARC4");

        SymmetricUtils.CipherContext cipherContext = new SymmetricUtils.CipherContext(SymmetricUtils.ALG_ARC4, null, null, SymmetricUtils.PROVIDER_BC);
        cipherContext.setKey(keyBytes);

        doCrypto(input, cipherContext);
    }

    @Test
    public void randomKeyTest() {
        byte[]          input = new byte[] {
                            0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                            0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                            0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07 };
        byte[]          ivBytes = new byte[] {
                            0x00, 0x00, 0x00, 0x01, 0x04, 0x05, 0x06, 0x07,
                            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 };

        System.out.println("Random key");

        try {
            Key randomKey = SymmetricUtils.generateRandomKey(SymmetricUtils.ALG_AES, SymmetricUtils.PROVIDER_BC, 192);

            SymmetricUtils.CipherContext cipherContext =
                new SymmetricUtils.CipherContext(SymmetricUtils.ALG_AES, SymmetricUtils.MODE_CTR, SymmetricUtils.PADDING_NO, SymmetricUtils.PROVIDER_BC);
            cipherContext.setKey(randomKey);
            cipherContext.setIV(ivBytes);

            doCrypto(input, cipherContext);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Test
    public void pbeTest() throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
        System.out.println("PBE key");

        char[] password = "password".toCharArray();
        byte[] salt = new byte[] {
                 0x7d, 0x60, 0x43, 0x5f,
                 0x02, (byte)0xe9, (byte)0xe0, (byte)0xae };
        int iterationCount = 2048;

        Key sKey = null;
        try {
            sKey = SymmetricUtils.createPBEKey(password, salt, iterationCount, SymmetricUtils.ALG_PBE_SHA_3DES, SymmetricUtils.PROVIDER_BC);
            System.out.println(CryptoUtils.toHex(sKey.getEncoded()) + " : " + sKey.getFormat());
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Test
    public void ioTest() throws Exception {
        byte[]          input = new byte[] {
                            0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                            0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                            0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06 };
        byte[]		    keyBytes = new byte[] {
                            0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                            0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                            0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17 };
        byte[]		    ivBytes = new byte[] {
                            0x00, 0x01, 0x02, 0x03, 0x00, 0x01, 0x02, 0x03,
                            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 };

        System.out.println("Cipher-based I/O");

        SymmetricUtils.CipherContext cipherContext =
                new SymmetricUtils.CipherContext(SymmetricUtils.ALG_AES, SymmetricUtils.MODE_CTR, SymmetricUtils.PADDING_NO, SymmetricUtils.PROVIDER_BC);
        cipherContext.setKey(keyBytes);
        cipherContext.setIV(ivBytes);
        cipherContext.cipherMode = Cipher.ENCRYPT_MODE;

        ByteArrayInputStream bIn = new ByteArrayInputStream(input);
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();

        SymmetricUtils.crypt(bIn, bOut, cipherContext);
        byte[] cipherText = bOut.toByteArray();
        System.out.println("cipher: " + CryptoUtils.toHex(cipherText));
    }


    /*
       Utils
     */

    private void doCrypto(byte[] input, SymmetricUtils.CipherContext cipherContext) {
        try {
            cipherContext.cipherMode = Cipher.ENCRYPT_MODE;
            ResponseWrapper response = SymmetricUtils.crypt(input, cipherContext);

            System.out.println("input text : " + CryptoUtils.toHex(input));
            System.out.println("cipher text: " + CryptoUtils.toHex(response.data, response.length) + " bytes: " + response.length);

            cipherContext.cipherMode = Cipher.DECRYPT_MODE;
            response = SymmetricUtils.crypt(response.data, cipherContext);
            System.out.println("plain text : " + CryptoUtils.toHex(response.data, response.length) + " bytes: " + response.length);

//            Assert.assertArrayEquals(input, response.data);

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
