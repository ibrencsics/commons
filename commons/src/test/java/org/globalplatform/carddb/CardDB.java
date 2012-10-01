package org.globalplatform.carddb;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:49:14.946+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/carddb", name = "CardDB")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CardDB {

    @Oneway
    @WebMethod(operationName = "NegotiationConfirm", action = "urn:#NewOperation")
    public void negotiationConfirm(
        @WebParam(partName = "NegotiationConfirm", name = "DIAD_NegotiationConfirm", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.DIADNegatiationConfirmType negotiationConfirm
    );

    @WebResult(name = "DIAD_NegotiationResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", partName = "NegotiationResponse")
    @WebMethod(operationName = "Negotiation", action = "urn:#NewOperation")
    public org.globalplatform.namespaces.systems_messaging._2_0.DIADNegotiationResponseType negotiation(
        @WebParam(partName = "NegotiationRequest", name = "DIAD_NegotiationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.DIADNegotiationRequestType negotiationRequest
    );

    @WebResult(name = "DIAD_GetSECapabilityProfileResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", partName = "GetSECapabilityProfileResponse")
    @WebMethod(operationName = "GetSECapabilityProfile", action = "GetSECapabilityProfile")
    public org.globalplatform.namespaces.systems_messaging._2_0.DIADGetSECapabilityProfileResponseType getSECapabilityProfile(
        @WebParam(partName = "GetSECapabilityProfileRequest", name = "DIAD_GetSECapabilityProfileRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.DIADGetSECapabilityProfileRequestType getSECapabilityProfileRequest
    );
}
