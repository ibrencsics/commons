package org.ib.commons.client.services.keystore2.request;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import org.apache.jcp.xml.dsig.internal.dom.Utils;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;
import org.ib.commons.dto.BaseDTO;
import org.ib.commons.dto.PKCS10CertRequestDTO;
import org.ib.commons.shared.exception.CommonsGWTException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/12/12
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class CertificateRequestService extends Composite {
    @UiField
    Button btnCertReq;
    @UiField
    TextBox tbSubjectDN;
    @UiField
    CertificateRequestList certReqList;
    @UiField
    Button btnRefresh;
    @UiField
    TextBox tbAlgorithm;
    @UiField
    TextBox tbName;

    private List<BaseDTO> pkcs10DTOList;

    final BackendServiceAsync backendService = GWT.create(BackendService.class);

    interface MyUiBinder extends UiBinder<Widget, CertificateRequestService> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    public CertificateRequestService() {
        initWidget(uiBinder.createAndBindUi(this));

        tbAlgorithm.setText("SHA256withRSA");
    }

    @UiHandler("btnRefresh")
    void refresh(ClickEvent event) {
        refreshFromServer();
    }

    private void refreshFromServer() {
        backendService.getPKCS10CertRequests(new AsyncCallback<List<BaseDTO>>() {
            @Override
            public void onFailure(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onSuccess(List<BaseDTO> pkcs10CertRequestDTOs) {
                pkcs10DTOList = pkcs10CertRequestDTOs;
                certReqList.refreshTree(pkcs10CertRequestDTOs);
            }
        });
    }

    @UiHandler("btnCertReq")
    void create(ClickEvent event) {

        PKCS10CertRequestDTO pkcs10DTO = new PKCS10CertRequestDTO();
        pkcs10DTO.setName(org.ib.commons.client.Utils.getTextBoxStringValue(tbName));
        pkcs10DTO.setSubjectDN(org.ib.commons.client.Utils.getTextBoxStringValue(tbSubjectDN));
        pkcs10DTO.setSignatureAlgorithm(org.ib.commons.client.Utils.getTextBoxStringValue(tbAlgorithm));

        try {
            backendService.createPKCS10CertRequest(pkcs10DTO, new AsyncCallback<Void>() {
                @Override
                public void onFailure(Throwable throwable) {
                    throwable.printStackTrace();
                }

                @Override
                public void onSuccess(Void aVoid) {
                    Window.alert("Created");
                }
            });
        } catch (CommonsGWTException e) {
            e.printStackTrace();
        }
    }

    public CertificateRequestList getCertReqList() {
        return certReqList;
    }
}
