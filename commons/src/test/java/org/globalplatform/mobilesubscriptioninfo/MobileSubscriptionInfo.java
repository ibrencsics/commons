package org.globalplatform.mobilesubscriptioninfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:49:52.881+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/mobilesubscriptioninfo", name = "MobileSubscriptionInfo")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MobileSubscriptionInfo {

    @WebResult(name = "CheckMobileSubscriptionEligibilityResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", partName = "CheckMobileSubscriptionEligibilityResponse")
    @WebMethod(operationName = "CheckMobileSubscriptionEligibility", action = "CheckMobileSubscriptionEligibility")
    public org.globalplatform.namespaces.systems_messaging._2_0.CheckMobileSubscriptionEligibilityResponseType checkMobileSubscriptionEligibility(
        @WebParam(partName = "CheckMobileSubscriptionEligibilityRequest", name = "CheckMobileSubscriptionEligibilityRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.CheckMobileSubscriptionEligibilityRequestType checkMobileSubscriptionEligibilityRequest
    );

    @WebResult(name = "GetMobileSubscriptionAlternateIdentifierResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", partName = "GetMobileSubscriptionAlternateIdentifierResponse")
    @WebMethod(operationName = "GetMobileSubscriptionAlternateIdentifier", action = "GetMobileSubscriptionAlternateIdentifier")
    public org.globalplatform.namespaces.systems_messaging._2_0.GetMobileSubscriptionAlternateIdentifierResponseType getMobileSubscriptionAlternateIdentifier(
        @WebParam(partName = "GetMobileSubscriptionAlternateIdentifierRequest", name = "GetMobileSubscriptionAlternateIdentifierRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.GetMobileSubscriptionAlternateIdentifierRequestType getMobileSubscriptionAlternateIdentifierRequest
    );
}
