package org.ib.commons.xml;

import org.ib.commons.io.IOUtils;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/9/12
 * Time: 9:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class SOAPUtils {

    public static SOAPMessage createEmptySOAPMessage(String protocol) throws SOAPException {
        MessageFactory factory = MessageFactory.newInstance(protocol);
        SOAPMessage message = factory.createMessage();
        return message;
    }

    /**
     * Test messages
     */

    public static SOAPMessage getTestSOAPMessage1() throws SOAPException {
        MessageFactory factory = MessageFactory.newInstance();

        SOAPMessage soapRequest = factory.createMessage();

        QName processOrderQName = new QName("http://order.demo/", "processOrder");
        //create the element - <http://order.demo/:processOrder></http://order.demo/:processOrder>
        SOAPElement processOrderResponse = soapRequest.getSOAPBody().addChildElement(processOrderQName);
        SOAPElement order = processOrderResponse.addChildElement("arg0");
        order.addChildElement("customerID").addTextNode("Naveen");
        order.addChildElement("itemID").addTextNode("I001");
        order.addChildElement("price").addTextNode("200.00");
        order.addChildElement("qty").addTextNode("200");
        order.addChildElement("sig");

        return soapRequest;
    }

    public static SOAPMessage getSOAPMessageFromResources(String filename, String protocol) throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance(protocol);

        InputStream is = IOUtils.getInputStreamFromResources(filename);
        SOAPMessage soapMessage = factory.createMessage(null, is);

        return soapMessage;
    }

}
