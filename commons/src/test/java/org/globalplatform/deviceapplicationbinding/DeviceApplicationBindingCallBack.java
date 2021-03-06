package org.globalplatform.deviceapplicationbinding;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:48:15.270+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/deviceapplicationbinding", name = "DeviceApplicationBindingCallBack")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DeviceApplicationBindingCallBack {

    @Oneway
    @WebMethod(operationName = "BindDeviceApplicationToSEApplication", action = "BindDeviceApplicationToSEApplication")
    public void bindDeviceApplicationToSEApplication(
        @WebParam(partName = "BindDeviceApplicationToSEApplicationResponse", name = "BindDeviceApplicationToSEApplicationResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.BindDeviceApplicationToSEApplicationResponseType bindDeviceApplicationToSEApplicationResponse
    );

    @Oneway
    @WebMethod(operationName = "UnbindDeviceApplicationToSEApplication", action = "UnbindDeviceApplicationToSEApplication")
    public void unbindDeviceApplicationToSEApplication(
        @WebParam(partName = "UnbindDeviceApplicationToSEApplicationResponse", name = "UnbindDeviceApplicationToSEApplicationResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.UnbindDeviceApplicationToSEApplicationResponseType unbindDeviceApplicationToSEApplicationResponse
    );
}
