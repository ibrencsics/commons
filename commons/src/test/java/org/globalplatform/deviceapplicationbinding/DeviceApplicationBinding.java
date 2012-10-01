package org.globalplatform.deviceapplicationbinding;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:47:55.380+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/deviceapplicationbinding", name = "DeviceApplicationBinding")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DeviceApplicationBinding {

    @Oneway
    @WebMethod(operationName = "BindDeviceApplicationToSEApplication", action = "BindDeviceApplicationToSEApplication")
    public void bindDeviceApplicationToSEApplication(
        @WebParam(partName = "BindDeviceApplicationToSEApplicationRequest", name = "BindDeviceApplicationToSEApplicationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.BindDeviceApplicationToSEApplicationRequestType bindDeviceApplicationToSEApplicationRequest
    );

    @Oneway
    @WebMethod(operationName = "UnbindDeviceApplicationToSEApplication", action = "UnbindDeviceApplicationToSEApplication")
    public void unbindDeviceApplicationToSEApplication(
        @WebParam(partName = "UnbindDeviceApplicationToSEApplicationRequest", name = "UnbindDeviceApplicationToSEApplicationRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.UnbindDeviceApplicationToSEApplicationRequestType unbindDeviceApplicationToSEApplicationRequest
    );
}