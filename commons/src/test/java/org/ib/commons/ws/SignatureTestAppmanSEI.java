package org.ib.commons.ws;

import org.globalplatform.appman.Appman;
import org.globalplatform.namespaces.systems_profiles._1_1.SignatureTest;
import org.ib.commons.security.SignatureUtils;

import javax.jws.WebParam;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/29/12
 * Time: 12:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignatureTestAppmanSEI implements Appman {
    public SignatureTest getAppProfile(@WebParam(partName = "GetAppProfileRequest", name = "SignatureTest", targetNamespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.1") SignatureTest getAppProfileRequest) {

//        System.out.println(getAppProfileRequest.getApplicationProfileString());

        SignatureUtils su = new SignatureUtils();
        try {
            su.initDefaultKeystore();

            su.verify(getAppProfileRequest.getApplicationProfileString());

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return new SignatureTest();
    }
}
