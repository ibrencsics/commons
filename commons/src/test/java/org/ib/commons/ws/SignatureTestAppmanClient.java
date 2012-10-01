package org.ib.commons.ws;

import org.ib.commons.security.SignatureUtils;
import org.ib.commons.xml.DOMUtils;
import org.ib.commons.xml.SOAPUtils;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/10/12
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class SignatureTestAppmanClient {

    public static final String WSDLFile = "http://localhost:8080/sigtest/services/appman?wsdl";

    @Test
    public void testClient() throws Exception {
        URL wsdlURL = new URL(WSDLFile);

        QName domProvider = new QName("http://globalplatform.org/appman", "AppmanService");
        QName portName = new QName("http://globalplatform.org/appman", "AppmanEndPoint");

        Service service = Service.create(wsdlURL, domProvider);

//        SOAPMessage soapMessage = SOAPUtils.getSOAPMessageFromResources("soap-app-profile-1.xml", SOAPConstants.SOAP_1_1_PROTOCOL);
        SOAPMessage soapMessage = createSOAPMessage();

        NodeList revisions = soapMessage.getSOAPPart().getDocumentElement().getElementsByTagNameNS("http://namespaces.globalplatform.org/systems-profiles/1.1.1", "Revision");
        Node sigPlaceHolder = revisions.item(0);

        SignatureUtils su = new SignatureUtils();
        su.initDefaultKeystore();

        su.sign(soapMessage.getSOAPPart(), sigPlaceHolder);

        Dispatch<SOAPMessage> dispSOAPMsg = service.createDispatch(portName, SOAPMessage.class, Service.Mode.MESSAGE);
        SOAPMessage soapResp = dispSOAPMsg.invoke(soapMessage);
    }

    private SOAPMessage createSOAPMessage() throws SOAPException, IOException {
        SOAPMessage soapMessage = SOAPUtils.createEmptySOAPMessage(SOAPConstants.SOAP_1_1_PROTOCOL);

        SOAPBody body = soapMessage.getSOAPBody();
        body.addNamespaceDeclaration("gp", "http://namespaces.globalplatform.org/systems-profiles/1.1.1");

        SOAPElement signatureTestElement = body.addChildElement("SignatureTest", "gp", "http://namespaces.globalplatform.org/systems-profiles/1.1.1");

        NodeList nodes = DOMUtils.getDocumentFromFile("app-profile-1.xml").getChildNodes();
        for (int i=0; i<nodes.getLength(); i++) {
            DOMUtils.copyNodeToDocument(soapMessage.getSOAPPart(), signatureTestElement, nodes.item(i));
        }

        soapMessage.writeTo(System.out);

        return soapMessage;
    }
}
