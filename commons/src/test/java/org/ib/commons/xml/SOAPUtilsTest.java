package org.ib.commons.xml;

import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/11/12
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class SOAPUtilsTest {

    @Test
    public void createSOAPMessageTest() {
        try {
            SOAPMessage soapMessage = SOAPUtils.createEmptySOAPMessage(SOAPConstants.SOAP_1_2_PROTOCOL);

            SOAPElement body = soapMessage.getSOAPBody();

            QName signatureTest = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.1", "SignatureTest");
            SOAPElement signatureTestElement = body.addChildElement(signatureTest);

            NodeList nodes = DOMUtils.getDocumentFromFile("app-profile-1.xml").getChildNodes();
            for (int i=0; i<nodes.getLength(); i++) {
                DOMUtils.copyNodeToDocument(soapMessage.getSOAPPart(), signatureTestElement, nodes.item(i));
            }

            soapMessage.writeTo(System.out);
        } catch (SOAPException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
