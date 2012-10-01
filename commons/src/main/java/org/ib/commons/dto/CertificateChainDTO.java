package org.ib.commons.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/6/12
 * Time: 10:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class CertificateChainDTO extends BaseDTO {

    private List<CertificateDTO> certChain;

    public List<CertificateDTO> getCertChain() {
        return certChain;
    }

    public void setCertChain(List<CertificateDTO> certChain) {
        this.certChain = certChain;
    }

    public void addCertChain(CertificateDTO certificateDTO) {
        if (this.certChain==null) {
            this.certChain = new ArrayList<CertificateDTO>();
        }
        this.certChain.add(certificateDTO);
    }
}
