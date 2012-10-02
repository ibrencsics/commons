package org.ib.commons.client.services.keystore;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;
import org.ib.commons.client.services.keystore.toolbar.KeystoreDialog;
import org.ib.commons.client.services.keystore.toolbar.KeystoreManipulation;
import org.ib.commons.client.services.keystore.toolbar.X509Dialog;
import org.ib.commons.dto.BaseDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.dto.BaseDTO;
import org.ib.commons.dto.KeystoreDTO;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/1/12
 * Time: 11:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreService extends ResizeComposite implements IsWidget {

    interface Binder extends UiBinder<Widget, KeystoreService> {}

    private static final Binder binder = GWT.create(Binder.class);

    private final BackendServiceAsync backendService = GWT.create(BackendService.class);

    @UiField
    TextArea taWorkspace;
    @UiField
    KeystoreTreeGWT treeKeystore;
    @UiField
    Button btnNewKeystore;
    @UiField
    KeystoreTools keystoreTools;

    public KeystoreService() {
        initWidget(binder.createAndBindUi(this));

        treeKeystore.setTreeClickHandler(new KeystoreTreeGWT.TreeClickHandler() {
            @Override
            public void click(BaseDTO selDTO, String textToShow) {
                if (textToShow!=null)
                    taWorkspace.setText(textToShow);
                else
                    taWorkspace.setText("");

                if (selDTO instanceof KeystoreDTO) {
                    keystoreTools.setCurrentWidget(new KeystoreManipulation((KeystoreDTO)selDTO));
                }
            }
        });
    }

    @UiHandler("btnNewKeystore")
    void click(ClickEvent event) {
        keystoreTools.setCurrentWidget(new KeystoreDialog());
    }
}
