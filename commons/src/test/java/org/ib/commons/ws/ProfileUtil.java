package org.ib.commons.ws;

import org.w3c.dom.Document;

import javax.xml.bind.JAXBElement;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/30/12
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProfileUtil {

    String profileStr;
    Document profileDoc;
    JAXBElement profileJAXB;

    public void setProfile(JAXBElement profileJAXB) {
        this.profileJAXB = profileJAXB;
    }

    public Object getProfile(Class clazz) {
        return null;
    }

    public Boolean validateSignature() {
        return false;
    }
}
