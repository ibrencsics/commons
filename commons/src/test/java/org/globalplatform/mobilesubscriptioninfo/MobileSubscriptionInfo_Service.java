package org.globalplatform.mobilesubscriptioninfo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:49:52.921+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "MobileSubscriptionInfo", 
                  wsdlLocation = "MobileSubscriptionInfo.wsdl",
                  targetNamespace = "http://globalplatform.org/mobilesubscriptioninfo") 
public class MobileSubscriptionInfo_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/mobilesubscriptioninfo", "MobileSubscriptionInfo");
    public final static QName MobileSubscriptionInfoEndPoint = new QName("http://globalplatform.org/mobilesubscriptioninfo", "MobileSubscriptionInfoEndPoint");
    static {
        URL url = MobileSubscriptionInfo_Service.class.getResource("MobileSubscriptionInfo.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(MobileSubscriptionInfo_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "MobileSubscriptionInfo.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public MobileSubscriptionInfo_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MobileSubscriptionInfo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileSubscriptionInfo_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns MobileSubscriptionInfo
     */
    @WebEndpoint(name = "MobileSubscriptionInfoEndPoint")
    public MobileSubscriptionInfo getMobileSubscriptionInfoEndPoint() {
        return super.getPort(MobileSubscriptionInfoEndPoint, MobileSubscriptionInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileSubscriptionInfo
     */
    @WebEndpoint(name = "MobileSubscriptionInfoEndPoint")
    public MobileSubscriptionInfo getMobileSubscriptionInfoEndPoint(WebServiceFeature... features) {
        return super.getPort(MobileSubscriptionInfoEndPoint, MobileSubscriptionInfo.class, features);
    }

}
