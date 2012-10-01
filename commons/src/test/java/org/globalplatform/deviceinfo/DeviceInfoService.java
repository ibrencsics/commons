package org.globalplatform.deviceinfo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:48:50.360+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "DeviceInfoService", 
                  wsdlLocation = "DeviceInfo.wsdl",
                  targetNamespace = "http://globalplatform.org/deviceinfo") 
public class DeviceInfoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/deviceinfo", "DeviceInfoService");
    public final static QName DeviceInfoEndpoint = new QName("http://globalplatform.org/deviceinfo", "DeviceInfoEndpoint");
    static {
        URL url = DeviceInfoService.class.getResource("DeviceInfo.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(DeviceInfoService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "DeviceInfo.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public DeviceInfoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeviceInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeviceInfoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns DeviceInfo
     */
    @WebEndpoint(name = "DeviceInfoEndpoint")
    public DeviceInfo getDeviceInfoEndpoint() {
        return super.getPort(DeviceInfoEndpoint, DeviceInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeviceInfo
     */
    @WebEndpoint(name = "DeviceInfoEndpoint")
    public DeviceInfo getDeviceInfoEndpoint(WebServiceFeature... features) {
        return super.getPort(DeviceInfoEndpoint, DeviceInfo.class, features);
    }

}
