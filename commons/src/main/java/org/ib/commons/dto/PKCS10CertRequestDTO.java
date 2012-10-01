package org.ib.commons.dto;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/21/12
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class PKCS10CertRequestDTO extends BaseDTO {

    private String name;
    String subjectDN;
    String signatureAlgorithm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectDN() {
        return subjectDN;
    }

    public void setSubjectDN(String subjectDN) {
        this.subjectDN = subjectDN;
    }

    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }
}
