package org.ib.commons.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/23/12
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main implements EntryPoint {
    public void onModuleLoad() {
        RootLayoutPanel.get().add(new MainGUI());
    }
}
