package org.ib.commons.client.services.keystore.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;
import org.ib.commons.dto.KeystoreDTO;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/7/12
 * Time: 12:10 AM
 * To change this template use File | Settings | File Templates.
 */

public class KeystoreDialog extends Composite {

    interface Binder extends UiBinder<Widget, KeystoreDialog> {}

    private static final Binder binder = GWT.create(Binder.class);

    private final BackendServiceAsync backendService = GWT.create(BackendService.class);

    @UiField
    TextBox tbKeystoreName;
    @UiField
    ListBox lbKeystoreType;
    @UiField
    TextBox tbKeystorePass;
    @UiField
    ListBox lbSecurityProvider;
    @UiField
    Button btnCreate;

    public KeystoreDialog() {
        initWidget(binder.createAndBindUi(this));

        lbKeystoreType.addItem("JKS");
        lbKeystoreType.addItem("JCEKS");

        lbSecurityProvider.addItem("");
        lbSecurityProvider.addItem("BC");
    }


    @UiHandler("btnCreate")
    void click(ClickEvent event) {

        String ksName = tbKeystoreName.getText();
        String ksPass = tbKeystorePass.getText();
        String ksType = lbKeystoreType.getItemText(lbKeystoreType.getSelectedIndex());
        String selectedSecurityProvider = lbSecurityProvider.getItemText(lbSecurityProvider.getSelectedIndex());
        String secProvider = selectedSecurityProvider==null || selectedSecurityProvider.trim().equals("") ? selectedSecurityProvider : null;

        KeystoreDTO keystoreDTO = new KeystoreDTO();
        keystoreDTO.setName(ksName);
        keystoreDTO.setType(ksType);
        keystoreDTO.setPassword(ksPass);
        keystoreDTO.setSecurityProvider(secProvider);

        backendService.saveKeystore(keystoreDTO, new AsyncCallback<Void>() {
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
}
