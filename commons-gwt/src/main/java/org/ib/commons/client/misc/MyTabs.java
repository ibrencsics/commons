package org.ib.commons.client.misc;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/26/12
 * Time: 1:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyTabs implements IsWidget, EntryPoint {

    interface MyUiBinder extends UiBinder<Widget, MyTabs> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    ListBox listBox;

    public Widget asWidget() {
        return uiBinder.createAndBindUi(this);
    }

    public void onModuleLoad() {
        RootPanel.get().add(asWidget());
        listBox.addItem("asd");
    }
}
