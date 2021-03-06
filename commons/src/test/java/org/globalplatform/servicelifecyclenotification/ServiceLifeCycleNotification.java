package org.globalplatform.servicelifecyclenotification;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:52:05.128+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/servicelifecyclenotification", name = "ServiceLifeCycleNotification")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ServiceLifeCycleNotification {

    @Oneway
    @WebMethod(operationName = "HandleEndServiceStateChangeNotification", action = "HandleEndServiceStateChangeNotification")
    public void handleEndServiceStateChangeNotification(
        @WebParam(partName = "HandleEndServiceStateChangeNotificationRequest", name = "HandleEndServiceStateChangeNotificationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.HandleEndServiceStateChangeNotificationRequestType handleEndServiceStateChangeNotificationRequest
    );

    @Oneway
    @WebMethod(operationName = "HandleStartServiceStateChangeNotification", action = "HandleStartServiceStateChangeNotification")
    public void handleStartServiceStateChangeNotification(
        @WebParam(partName = "HandleStartServiceStateChangeNotificationRequest", name = "HandleStartServiceStateChangeNotificationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.HandleStartServiceStateChangeNotificationRequestType handleStartServiceStateChangeNotificationRequest
    );
}
