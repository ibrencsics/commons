package org.globalplatform.seaudit;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:51:18.641+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "SEAuditCallBackService", 
                  wsdlLocation = "SEAuditCallBack.wsdl",
                  targetNamespace = "http://globalplatform.org/seaudit") 
public class SEAuditCallBackService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/seaudit", "SEAuditCallBackService");
    public final static QName SEAuditCallBackEndPoint = new QName("http://globalplatform.org/seaudit", "SEAuditCallBackEndPoint");
    static {
        URL url = SEAuditCallBackService.class.getResource("SEAuditCallBack.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(SEAuditCallBackService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "SEAuditCallBack.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public SEAuditCallBackService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SEAuditCallBackService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SEAuditCallBackService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SEAuditCallBack
     */
    @WebEndpoint(name = "SEAuditCallBackEndPoint")
    public SEAuditCallBack getSEAuditCallBackEndPoint() {
        return super.getPort(SEAuditCallBackEndPoint, SEAuditCallBack.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SEAuditCallBack
     */
    @WebEndpoint(name = "SEAuditCallBackEndPoint")
    public SEAuditCallBack getSEAuditCallBackEndPoint(WebServiceFeature... features) {
        return super.getPort(SEAuditCallBackEndPoint, SEAuditCallBack.class, features);
    }

}