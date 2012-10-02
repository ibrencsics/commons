package org.ib.commons.client.misc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/23/12
 * Time: 12:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWidgetWorld extends Composite {

    interface MyUiBinder extends UiBinder<Widget, HelloWidgetWorld> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    ListBox listBox;

    public HelloWidgetWorld(String... names) {
        // sets listBox
        initWidget(uiBinder.createAndBindUi(this));
        for (String name : names) {
            listBox.addItem(name);
        }
    }
}
