package org.ib.commons.client.backend;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.ib.commons.dto.*;
import org.ib.commons.dto.BaseDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.shared.exception.CommonsGWTException;

import java.util.List;

/**
 * The async counterpart of <code>BackendService</code>.
 */
public interface BackendServiceAsync {
    void greetServer(String input, AsyncCallback<String> callback)
            throws IllegalArgumentException;

    void signXML(String xml, AsyncCallback<String> async);

    void verifySignature(String xml, AsyncCallback<Boolean> async);

    void printDOM(String xml, AsyncCallback<String> async);

    void canonicalize(String xml, AsyncCallback<String> async);

    void getKeystores(AsyncCallback<List<BaseDTO>> async);

    void saveKeystore(KeystoreDTO keystoreDTO, AsyncCallback<Void> async);

    void createNewRoot(KeystoreDTO keystoreDTO, EntryDTO entryDTO, X509CertificateDTO x509CertificateDTO, AsyncCallback<Void> async);

    void getPKCS10CertRequests(AsyncCallback<List<BaseDTO>> async);

    void createPKCS10CertRequest(PKCS10CertRequestDTO pkcs10Dto, AsyncCallback<Void> async) throws CommonsGWTException;

    void issueCertificate(PKCS10CertRequestDTO pkcs10DTO,
                          KeystoreDTO issuerKS, PrivateKeyEntryDTO issuerEntry,
                          KeystoreDTO targetKS, PrivateKeyEntryDTO subjectEntry, AsyncCallback<Void> async);
}
