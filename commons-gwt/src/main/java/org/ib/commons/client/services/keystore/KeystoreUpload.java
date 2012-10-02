package org.ib.commons.client.services.keystore;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/2/12
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreUpload extends FormPanel {

    private static final String UPLOAD_ACTION_URL = GWT.getModuleBaseURL() + "upload";

    public KeystoreUpload() {
        this.setAction(UPLOAD_ACTION_URL);
        this.setEncoding(FormPanel.ENCODING_MULTIPART);
        this.setMethod(FormPanel.METHOD_POST);

        VerticalPanel panel = new VerticalPanel();
        this.setWidget(panel);

        FileUpload upload = new FileUpload();
        upload.setName("uploadFormElement");
        panel.add(upload);

        panel.add(new Button("Submit", new ClickHandler() {
            public void onClick(ClickEvent event) {
                submit();
            }
        }));

        // Add an event handler to the form.
//        this.addSubmitHandler(new FormPanel.SubmitHandler() {
//            public void onSubmit(SubmitEvent event) {
//                // This event is fired just before the form is submitted. We can
//                // take this opportunity to perform validation.
//                if (tb.getText().length() == 0) {
//                    Window.alert("The text box must not be empty");
//                    event.cancel();
//                }
//            }
//        });

        this.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
            public void onSubmitComplete(SubmitCompleteEvent event) {
                // When the form submission is successfully completed, this
                // event is fired. Assuming the service returned a response of type
                // text/html, we can get the result text here (see the FormPanel
                // documentation for further explanation).
                Window.alert(event.getResults());
            }
        });


//        final FileUploadField file = new FileUploadField();
//        file.addChangeHandler(new ChangeHandler() {
//            @Override
//            public void onChange(ChangeEvent event) {
//                Window.alert("File Changed - You selected " + file.getValue());
//            }
//        });
//        file.setName("uploadedfile");
//        file.setAllowBlank(false);
//        panel.add(new FieldLabel(file, "File"));
    }
}
