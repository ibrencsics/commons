package org.ib.commons.dto;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/6/12
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class TrustedCertificateEntryDTO extends EntryDTO {

    private CertificateDTO certificateDTO;

    public TrustedCertificateEntryDTO() {

    }

    public TrustedCertificateEntryDTO(String alias) {
        super(alias);
    }

    public CertificateDTO getCertificateDTO() {
        return certificateDTO;
    }

    public void setCertificateDTO(CertificateDTO certificateDTO) {
        this.certificateDTO = certificateDTO;
    }
}
