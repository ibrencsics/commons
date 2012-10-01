package org.ib.commons.ws;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.globalplatform.namespaces.systems_profiles._1_1.ApplicationProfile;
import org.ib.commons.security.SignatureUtils;
import org.ib.commons.xml.DOMUtils;
import org.ib.commons.xml.JAXBUtils;
import org.ib.commons.xml.SOAPUtils;
import org.w3c.dom.Node;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/10/12
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */

@WebServiceProvider()
@ServiceMode(value = Service.Mode.MESSAGE)
public class SignatureTestAppmanWS implements Provider<DOMSource> {

    public DOMSource invoke(DOMSource request) {
        SignatureTestAppmanProcessor processor = new SignatureTestAppmanProcessor();
        return processor.invoke(request, SOAPConstants.SOAP_1_1_PROTOCOL);
    }
}
