package org.ib.commons.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/5/12
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivateKeyEntryDTO extends EntryDTO {

    private PrivateKeyDTO privateKeyDTO;
    private CertificateChainDTO certificateChainDTO;

    public PrivateKeyEntryDTO() {

    }

    public PrivateKeyEntryDTO(String alias) {
        super(alias);
    }

    public PrivateKeyDTO getPrivateKeyDTO() {
        return privateKeyDTO;
    }

    public void setPrivateKeyDTO(PrivateKeyDTO privateKeyDTO) {
        this.privateKeyDTO = privateKeyDTO;
    }

    public CertificateChainDTO getCertificateChainDTO() {
        return certificateChainDTO;
    }

    public void setCertificateChainDTO(CertificateChainDTO certificateChainDTO) {
        this.certificateChainDTO = certificateChainDTO;
    }
}
