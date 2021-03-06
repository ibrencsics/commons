package org.globalplatform.selifecyclenotification;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:51:48.666+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/selifecyclenotification", name = "SELifeCycleNotification")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SELifeCycleNotification {

    @Oneway
    @WebMethod(operationName = "HandleSERenewalNotification", action = "HandleSERenewalNotification")
    public void handleSERenewalNotification(
        @WebParam(partName = "HandleSERenewalNotificationRequest", name = "HandleSERenewalNotificationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.HandleSERenewalNotificationRequestType handleSERenewalNotificationRequest
    );

    @Oneway
    @WebMethod(operationName = "HandleSEStatusChangeNotification", action = "HandleSEStatusChangeNotification")
    public void handleSEStatusChangeNotification(
        @WebParam(partName = "HandleSEStatusChangeNotificationRequest", name = "HandleSEStatusChangeNotificationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.HandleSEStatusChangeNotificationRequestType handleSEStatusChangeNotificationRequest
    );

    @Oneway
    @WebMethod(operationName = "HandleSEDeviceChangedNotification", action = "HandleSEDeviceChangedNotification")
    public void handleSEDeviceChangedNotification(
        @WebParam(partName = "HandleSEDeviceChangedNotificationRequest", name = "HandleSEDeviceChangedNotificationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.HandleSEDeviceChangedNotificationRequestType handleSEDeviceChangedNotificationRequest
    );

    @Oneway
    @WebMethod(operationName = "HandleSEMobileSubscriptionChangedNotification", action = "HandleSEMobileSubscriptionChangedNotification")
    public void handleSEMobileSubscriptionChangedNotification(
        @WebParam(partName = "HandleSEMobileSubscriptionChangedNotificationRequest", name = "HandleSEMobileSubscriptionChangedNotificationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.HandleSEMobileSubscriptionChangedNotificationRequestType handleSEMobileSubscriptionChangedNotificationRequest
    );
}
