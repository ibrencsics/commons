package org.ib.commons.dto;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/6/12
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class X509CertificateDTO extends CertificateDTO {

    String serialNumber;
    String subjectDN;
    String issuerDN;
    Date notBefore;
    Date notAfter;
    String signatureAlgorithm;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSubjectDN() {
        return subjectDN;
    }

    public void setSubjectDN(String subjectDN) {
        this.subjectDN = subjectDN;
    }

    public String getIssuerDN() {
        return issuerDN;
    }

    public void setIssuerDN(String issuerDN) {
        this.issuerDN = issuerDN;
    }

    public Date getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(Date notBefore) {
        this.notBefore = notBefore;
    }

    public Date getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(Date notAfter) {
        this.notAfter = notAfter;
    }

    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }
}
