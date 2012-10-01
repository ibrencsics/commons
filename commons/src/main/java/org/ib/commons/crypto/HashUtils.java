package org.ib.commons.crypto;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/19/12
 * Time: 11:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class HashUtils {

    public static final String ALG_SHA1 = "SHA-1";
    public static final String PROVIDER_BC = "BC";

    public static ResponseWrapper digest(byte[] input, DigestContext digestContext) throws Exception {
        MessageDigest hash = MessageDigest.getInstance(digestContext.algorithm, digestContext.provider);

        hash.update(input);
        return new ResponseWrapper(hash.digest(), hash.getDigestLength());
    }

    // not working properly
    public static void digest(InputStream is, OutputStream os, DigestContext digestContext) throws Exception {
        MessageDigest hash = MessageDigest.getInstance(digestContext.algorithm, digestContext.provider);

        // with DigestInputStream
        DigestInputStream dIn = new DigestInputStream(is, hash);

        int ch;
        while ((ch = dIn.read()) >= 0) {
            os.write(ch);
        }
    }


    public static class DigestContext {
        String algorithm;
        String provider;

        public DigestContext(String algorithm, String provider) {
            this.algorithm = algorithm;
            this.provider = provider;
        }
    }
}
