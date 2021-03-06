package org.globalplatform.mobilesubscriptionlifecyclenotification;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:50:05.581+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/mobilesubscriptionlifecyclenotification", name = "MobileSubscriptionLifeCycleNotification")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MobileSubscriptionLifeCycleNotification {

    @Oneway
    @WebMethod(operationName = "HandleMobileSubscriptionStatusChangeNotification", action = "HandleMobileSubscriptionStatusChangeNotification")
    public void handleMobileSubscriptionStatusChangeNotification(
        @WebParam(partName = "HandleMobileSubscriptionStatusChangeNotificationRequest", name = "HandleMobileSubscriptionStatusChangeNotificationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.HandleMobileSubscriptionStatusChangeNotificationRequestType handleMobileSubscriptionStatusChangeNotificationRequest
    );

    @Oneway
    @WebMethod(operationName = "HandleMobileSubscriptionIdentifierChangedNotification", action = "HandleMobileSubscriptionIdentifierChangedNotification")
    public void handleMobileSubscriptionIdentifierChangedNotification(
        @WebParam(partName = "HandleMobileSubscriptionIdentifierChangedNotificationRequest", name = "HandleMobileSubscriptionIdentifierChangedNotificationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.HandleMobileSubscriptionIdentifierChangedNotificationRequestType handleMobileSubscriptionIdentifierChangedNotificationRequest
    );
}
