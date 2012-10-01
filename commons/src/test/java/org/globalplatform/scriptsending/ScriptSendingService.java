package org.globalplatform.scriptsending;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:50:18.351+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "ScriptSendingService", 
                  wsdlLocation = "ScriptSending.wsdl",
                  targetNamespace = "http://globalplatform.org/scriptsending") 
public class ScriptSendingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/scriptsending", "ScriptSendingService");
    public final static QName ScriptSendingEndPoint = new QName("http://globalplatform.org/scriptsending", "ScriptSendingEndPoint");
    static {
        URL url = ScriptSendingService.class.getResource("ScriptSending.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ScriptSendingService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "ScriptSending.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ScriptSendingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ScriptSendingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScriptSendingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ScriptSending
     */
    @WebEndpoint(name = "ScriptSendingEndPoint")
    public ScriptSending getScriptSendingEndPoint() {
        return super.getPort(ScriptSendingEndPoint, ScriptSending.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScriptSending
     */
    @WebEndpoint(name = "ScriptSendingEndPoint")
    public ScriptSending getScriptSendingEndPoint(WebServiceFeature... features) {
        return super.getPort(ScriptSendingEndPoint, ScriptSending.class, features);
    }

}
