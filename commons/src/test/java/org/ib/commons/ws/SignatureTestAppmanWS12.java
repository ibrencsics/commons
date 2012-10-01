package org.ib.commons.ws;

import org.ib.commons.xml.SOAPUtils;

import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/14/12
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */

@WebServiceProvider()
@ServiceMode(value = Service.Mode.MESSAGE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class SignatureTestAppmanWS12 implements Provider<DOMSource> {

    public DOMSource invoke(DOMSource request) {
        SignatureTestAppmanProcessor processor = new SignatureTestAppmanProcessor();
        return processor.invoke(request, SOAPConstants.SOAP_1_2_PROTOCOL);

//        DOMSource response = new DOMSource();
//        try {
//            response.setNode(SOAPUtils.createEmptySOAPMessage(SOAPConstants.SOAP_1_2_PROTOCOL).getSOAPPart());
//        } catch (SOAPException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return response;
    }
}
