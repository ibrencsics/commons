package org.ib.commons.dto;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/6/12
 * Time: 10:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class CertificateDTO extends BaseDTO {

    private String type;
    private byte[] encoded;
    private String certStr;

    private String pubKeyAlgorithm;
    private String pubKeyFormat;
    private byte[] pubKeyEncoded;
    private String pubKeyStr;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getEncoded() {
        return encoded;
    }

    public void setEncoded(byte[] encoded) {
        this.encoded = encoded;
    }

    public String getCertStr() {
        return certStr;
    }

    public void setCertStr(String certStr) {
        this.certStr = certStr;
    }

    public String getPubKeyAlgorithm() {
        return pubKeyAlgorithm;
    }

    public void setPubKeyAlgorithm(String pubKeyAlgorithm) {
        this.pubKeyAlgorithm = pubKeyAlgorithm;
    }

    public String getPubKeyFormat() {
        return pubKeyFormat;
    }

    public void setPubKeyFormat(String pubKeyFormat) {
        this.pubKeyFormat = pubKeyFormat;
    }

    public byte[] getPubKeyEncoded() {
        return pubKeyEncoded;
    }

    public void setPubKeyEncoded(byte[] pubKeyEncoded) {
        this.pubKeyEncoded = pubKeyEncoded;
    }

    public String getPubKeyStr() {
        return pubKeyStr;
    }

    public void setPubKeyStr(String pubKeyStr) {
        this.pubKeyStr = pubKeyStr;
    }
}
