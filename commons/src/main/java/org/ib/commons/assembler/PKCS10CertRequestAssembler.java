package org.ib.commons.assembler;

import org.bouncycastle.jce.PKCS10CertificationRequest;
import org.ib.commons.dto.PKCS10CertRequestDTO;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/21/12
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class PKCS10CertRequestAssembler {

    public static PKCS10CertRequestDTO createDTO(PKCS10CertificationRequest req, String csrFileName) {

        PKCS10CertRequestDTO reqDTO = new PKCS10CertRequestDTO();

        reqDTO.setName(csrFileName);
        reqDTO.setSubjectDN(req.getCertificationRequestInfo().getSubject().toString());
        reqDTO.setSignatureAlgorithm(req.getSignatureAlgorithm().toString());

        return reqDTO;
    }
}
