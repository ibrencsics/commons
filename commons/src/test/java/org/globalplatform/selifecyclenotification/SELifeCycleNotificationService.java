package org.globalplatform.selifecyclenotification;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:51:48.726+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "SELifeCycleNotificationService", 
                  wsdlLocation = "SELifeCycleNotification.wsdl",
                  targetNamespace = "http://globalplatform.org/selifecyclenotification") 
public class SELifeCycleNotificationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/selifecyclenotification", "SELifeCycleNotificationService");
    public final static QName SELifeCycleNotificationEndPoint = new QName("http://globalplatform.org/selifecyclenotification", "SELifeCycleNotificationEndPoint");
    static {
        URL url = SELifeCycleNotificationService.class.getResource("SELifeCycleNotification.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(SELifeCycleNotificationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "SELifeCycleNotification.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public SELifeCycleNotificationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SELifeCycleNotificationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SELifeCycleNotificationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SELifeCycleNotification
     */
    @WebEndpoint(name = "SELifeCycleNotificationEndPoint")
    public SELifeCycleNotification getSELifeCycleNotificationEndPoint() {
        return super.getPort(SELifeCycleNotificationEndPoint, SELifeCycleNotification.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SELifeCycleNotification
     */
    @WebEndpoint(name = "SELifeCycleNotificationEndPoint")
    public SELifeCycleNotification getSELifeCycleNotificationEndPoint(WebServiceFeature... features) {
        return super.getPort(SELifeCycleNotificationEndPoint, SELifeCycleNotification.class, features);
    }

}
