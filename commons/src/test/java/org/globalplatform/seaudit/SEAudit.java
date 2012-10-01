package org.globalplatform.seaudit;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:51:05.726+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/seaudit", name = "SEAudit")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SEAudit {

    @Oneway
    @WebMethod(operationName = "GetApplicationOrELFStatus", action = "GetApplicationOrELFStatus")
    public void getApplicationOrELFStatus(
        @WebParam(partName = "GetApplicationOrELFStatusRequest", name = "GetApplicationOrELFStatusRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.GetApplicationOrELFStatusRequestType getApplicationOrELFStatusRequest
    );
}