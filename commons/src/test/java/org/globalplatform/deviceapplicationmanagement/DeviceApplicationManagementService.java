package org.globalplatform.deviceapplicationmanagement;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:48:26.430+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "DeviceApplicationManagementService", 
                  wsdlLocation = "DeviceApplicationManagement.wsdl",
                  targetNamespace = "http://globalplatform.org/deviceapplicationmanagement") 
public class DeviceApplicationManagementService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/deviceapplicationmanagement", "DeviceApplicationManagementService");
    public final static QName DeviceApplicationManagementEndPoint = new QName("http://globalplatform.org/deviceapplicationmanagement", "DeviceApplicationManagementEndPoint");
    static {
        URL url = DeviceApplicationManagementService.class.getResource("DeviceApplicationManagement.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(DeviceApplicationManagementService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "DeviceApplicationManagement.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public DeviceApplicationManagementService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeviceApplicationManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeviceApplicationManagementService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns DeviceApplicationManagement
     */
    @WebEndpoint(name = "DeviceApplicationManagementEndPoint")
    public DeviceApplicationManagement getDeviceApplicationManagementEndPoint() {
        return super.getPort(DeviceApplicationManagementEndPoint, DeviceApplicationManagement.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeviceApplicationManagement
     */
    @WebEndpoint(name = "DeviceApplicationManagementEndPoint")
    public DeviceApplicationManagement getDeviceApplicationManagementEndPoint(WebServiceFeature... features) {
        return super.getPort(DeviceApplicationManagementEndPoint, DeviceApplicationManagement.class, features);
    }

}
