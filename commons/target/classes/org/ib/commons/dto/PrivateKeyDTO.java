package org.ib.commons.dto;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/6/12
 * Time: 10:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrivateKeyDTO extends BaseDTO {

    private String algorithm;
    private String format;
    private byte[] encoded;
    private String privKeyStr;

     public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public byte[] getEncoded() {
        return encoded;
    }

    public void setEncoded(byte[] encoded) {
        this.encoded = encoded;
    }

    public String getPrivKeyStr() {
        return privKeyStr;
    }

    public void setPrivKeyStr(String privKeyStr) {
        this.privKeyStr = privKeyStr;
    }
}
