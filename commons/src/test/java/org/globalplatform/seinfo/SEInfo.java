package org.globalplatform.seinfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:51:34.321+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/seinfo", name = "SEInfo")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SEInfo {

    @WebResult(name = "GetSEMobileSubscriptionIdentifierResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", partName = "GetSEMobileSubscriptionIdentifierResponse")
    @WebMethod(operationName = "GetSEMobileSubscriptionIdentifier", action = "GetMobileSubscriptionAlternateIdentifier")
    public org.globalplatform.namespaces.systems_messaging._2_0.GetSEMobileSubscriptionIdentifierResponseType getSEMobileSubscriptionIdentifier(
        @WebParam(partName = "GetSEMobileSubscriptionIdentifierRequest", name = "GetSEMobileSubscriptionIdentifierRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.GetSEMobileSubscriptionIdentifierRequestType getSEMobileSubscriptionIdentifierRequest
    );

    @WebResult(name = "GetSECapabilityProfileIdResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", partName = "GetSECapabilityProfileIdResponse")
    @WebMethod(operationName = "GetSECapabilityProfileId", action = "GetSECapabilityProfileId")
    public org.globalplatform.namespaces.systems_messaging._2_0.GetSECapabilityProfileIdResponseType getSECapabilityProfileId(
        @WebParam(partName = "GetSECapabilityProfileIdRequest", name = "GetSECapabilityProfileIdRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.GetSECapabilityProfileIdRequestType getSECapabilityProfileIdRequest
    );
}