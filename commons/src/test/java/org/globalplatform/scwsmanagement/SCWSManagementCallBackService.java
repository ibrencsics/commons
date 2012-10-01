package org.globalplatform.scwsmanagement;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:50:54.036+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "SCWSManagementCallBackService", 
                  wsdlLocation = "SCWSManagementCallBack.wsdl",
                  targetNamespace = "http://globalplatform.org/scwsmanagement") 
public class SCWSManagementCallBackService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/scwsmanagement", "SCWSManagementCallBackService");
    public final static QName SCWSManagementCallBackEndPoint = new QName("http://globalplatform.org/scwsmanagement", "SCWSManagementCallBackEndPoint");
    static {
        URL url = SCWSManagementCallBackService.class.getResource("SCWSManagementCallBack.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(SCWSManagementCallBackService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "SCWSManagementCallBack.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public SCWSManagementCallBackService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SCWSManagementCallBackService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SCWSManagementCallBackService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SCWSManagementCallBack
     */
    @WebEndpoint(name = "SCWSManagementCallBackEndPoint")
    public SCWSManagementCallBack getSCWSManagementCallBackEndPoint() {
        return super.getPort(SCWSManagementCallBackEndPoint, SCWSManagementCallBack.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SCWSManagementCallBack
     */
    @WebEndpoint(name = "SCWSManagementCallBackEndPoint")
    public SCWSManagementCallBack getSCWSManagementCallBackEndPoint(WebServiceFeature... features) {
        return super.getPort(SCWSManagementCallBackEndPoint, SCWSManagementCallBack.class, features);
    }

}
