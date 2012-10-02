package org.ib.commons.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.TabPanel;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/29/12
 * Time: 12:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainGUI extends Composite {

    interface Binder extends UiBinder<Widget, MainGUI> {
    }

    private static final Binder binder = GWT.create(Binder.class);

    @UiField
    TabPanel folder;

    public MainGUI() {
        initWidget(binder.createAndBindUi(this));
    }
}
