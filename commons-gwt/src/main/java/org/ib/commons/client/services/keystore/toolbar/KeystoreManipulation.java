package org.ib.commons.client.services.keystore.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;
import org.ib.commons.dto.EntryDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.dto.X509CertificateDTO;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/7/12
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreManipulation extends Composite {

    interface Binder extends UiBinder<Widget, KeystoreManipulation> {}
    private static final Binder binder = GWT.create(Binder.class);

    private final BackendServiceAsync backendService = GWT.create(BackendService.class);

    @UiField
    Button btnNewRootCert;
    @UiField
    VerticalPanel vpWorkspace;
    @UiField
    X509Dialog toolbarX509;

    public KeystoreManipulation(final KeystoreDTO selKeystore) {

        initWidget(binder.createAndBindUi(this));

        toolbarX509.setX509ClickHandler(new X509Dialog.X509ClickHandler() {
            @Override
            public void click(EntryDTO entryDTO, X509CertificateDTO x509DTO) {
                backendService.createNewRoot(selKeystore, entryDTO, x509DTO, new AsyncCallback<Void>() {
                    @Override
                    public void onFailure(Throwable throwable) {
                        throwable.printStackTrace();
                    }

                    @Override
                    public void onSuccess(Void aVoid) {
                        //To change body of implemented methods use File | Settings | File Templates.
                    }
                });
            }
        });
    }

    @UiHandler("btnNewRootCert")
    void click(ClickEvent event) {
        toolbarX509.setVisible(true);
    }
}
