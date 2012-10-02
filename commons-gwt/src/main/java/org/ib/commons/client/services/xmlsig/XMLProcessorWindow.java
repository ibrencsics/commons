package org.ib.commons.client.services.xmlsig;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/29/12
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class XMLProcessorWindow extends ResizeComposite implements IsWidget {
    @UiField
    TextArea taXML;
    @UiField
    Button btnOpen;
    @UiField
    Button btnSign;
    @UiField
    Button btnVerify;
    @UiField
    Button btnShowDOM;
    @UiField
    Button btnCanonicalize;

    interface Binder extends UiBinder<Widget, XMLProcessorWindow> {
    }

    private static final Binder binder = GWT.create(Binder.class);

    private final BackendServiceAsync backendService = GWT.create(BackendService.class);

    public XMLProcessorWindow() {
        initWidget(binder.createAndBindUi(this));
    }

    @UiHandler({"btnOpen", "btnSign", "btnVerify", "btnShowDOM", "btnCanonicalize"})
    void open(ClickEvent event) {
        Button button = (Button)event.getSource();
        String xml = taXML.getText();

        if (btnSign.equals(button)) {

            backendService.signXML(xml, new AsyncCallback<String>() {
                public void onFailure(Throwable throwable) {
                    throwable.printStackTrace();
                }

                public void onSuccess(String s) {
                    taXML.setText(s);
                }
            });
        }
        else if (btnVerify.equals(button)) {

            backendService.verifySignature(xml, new AsyncCallback<Boolean>() {
                public void onFailure(Throwable throwable) {
                    throwable.printStackTrace();
                }

                public void onSuccess(Boolean aBoolean) {
                    Window.alert(aBoolean ? "Valid" : "Invalid");
                }
            });
        }
        else if (btnShowDOM.equals(button)) {

            backendService.printDOM(xml, new AsyncCallback<String>() {
                public void onFailure(Throwable throwable) {
                    throwable.printStackTrace();
                }

                public void onSuccess(String s) {
                    taXML.setText(s);
                }
            });
        }
        else if (btnCanonicalize.equals(button)) {

            backendService.canonicalize(xml, new AsyncCallback<String>() {
                public void onFailure(Throwable throwable) {
                    throwable.printStackTrace();
                }

                public void onSuccess(String s) {
                    taXML.setText(s);
                }
            });
        }
    }
}
