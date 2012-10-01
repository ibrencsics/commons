package org.ib.commons.ws;

import org.apache.commons.io.IOUtils;
import org.globalplatform.appman.Appman;
import org.globalplatform.appman.AppmanService;
import org.globalplatform.namespaces.systems_profiles._1_1.SignatureTest;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/29/12
 * Time: 11:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class SignatureTestAppmanClientJAXB {

    @Test
    public void test() throws IOException {
        SignatureTest signatureTest = new SignatureTest();
        signatureTest.setApplicationProfileString(IOUtils.toString(org.ib.commons.io.IOUtils.getInputStreamFromResources("app-profile-1-signed.xml")));

        AppmanService service = new AppmanService(new URL("http://localhost:8080/sigtest/services/appmanSEI?wsdl"));
        Appman port = service.getAppmanEndPoint();

        port.getAppProfile(signatureTest);
    }
}
