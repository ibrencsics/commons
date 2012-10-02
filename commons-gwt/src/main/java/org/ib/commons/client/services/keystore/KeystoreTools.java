package org.ib.commons.client.services.keystore;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/6/12
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreTools extends Composite {

    interface Binder extends UiBinder<Widget, KeystoreTools> {}

    private static final Binder binder = GWT.create(Binder.class);

    @UiField
    VerticalPanel pToolbar;

    public KeystoreTools() {
        initWidget(binder.createAndBindUi(this));

        pToolbar.add(new Button("sd"));
    }

    public void setCurrentWidget(Widget widget) {
        pToolbar.clear();
        pToolbar.add(widget);
    }
}
