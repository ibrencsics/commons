package org.ib.commons.client.backend;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import org.ib.commons.dto.*;
import org.ib.commons.dto.BaseDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.shared.exception.CommonsGWTException;

import java.util.List;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("backend")
public interface BackendService extends RemoteService {
    String greetServer(String name) throws IllegalArgumentException;

    String signXML(String xml);
    Boolean verifySignature(String xml);
    String printDOM(String xml);
    String canonicalize(String xml);

    List<BaseDTO> getKeystores() throws CommonsGWTException;
    void saveKeystore(KeystoreDTO keystoreDTO) throws CommonsGWTException;
    void createNewRoot(KeystoreDTO keystoreDTO, EntryDTO entryDTO, X509CertificateDTO x509CertificateDTO) throws CommonsGWTException;
    List<BaseDTO> getPKCS10CertRequests();
    void createPKCS10CertRequest(PKCS10CertRequestDTO pkcs10Dto) throws CommonsGWTException;
    void issueCertificate(PKCS10CertRequestDTO pkcs10DTO,
                          KeystoreDTO issuerKS, PrivateKeyEntryDTO issuerEntry,
                          KeystoreDTO targetKS, PrivateKeyEntryDTO subjectEntry) throws CommonsGWTException;
}
