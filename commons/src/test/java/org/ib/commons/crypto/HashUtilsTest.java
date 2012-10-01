package org.ib.commons.crypto;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/20/12
 * Time: 12:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class HashUtilsTest {

    @Test
    public void digestTest() {
        String input = "String to hash";
        try {
            ResponseWrapper resp = HashUtils.digest(CryptoUtils.toByteArray(input), new HashUtils.DigestContext(HashUtils.ALG_SHA1, HashUtils.PROVIDER_BC));
            System.out.println(CryptoUtils.toHex(resp.data, resp.length));
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Test
    public void ioTest() {
        byte[]          input = new byte[] {
                            0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                            0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
                            0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06 };

        ByteArrayInputStream bIn = new ByteArrayInputStream(input);
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();

        try {
            HashUtils.digest(bIn, bOut, new HashUtils.DigestContext(HashUtils.ALG_SHA1, HashUtils.PROVIDER_BC));

            byte[] hash = bOut.toByteArray();
            System.out.println("hash: " + CryptoUtils.toHex(hash));
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
