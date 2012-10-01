package org.globalplatform.cardcontentmanagement;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:46:51.485+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "CardContentManagementCallBackService", 
                  wsdlLocation = "CardContentManagementCallBack.wsdl",
                  targetNamespace = "http://globalplatform.org/cardcontentmanagement") 
public class CardContentManagementCallBackService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/cardcontentmanagement", "CardContentManagementCallBackService");
    public final static QName CardContentManagementCallBackEndpoint = new QName("http://globalplatform.org/cardcontentmanagement", "CardContentManagementCallBackEndpoint");
    static {
        URL url = CardContentManagementCallBackService.class.getResource("CardContentManagementCallBack.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CardContentManagementCallBackService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "CardContentManagementCallBack.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public CardContentManagementCallBackService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CardContentManagementCallBackService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardContentManagementCallBackService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns CardContentManagementCallBack
     */
    @WebEndpoint(name = "CardContentManagementCallBackEndpoint")
    public CardContentManagementCallBack getCardContentManagementCallBackEndpoint() {
        return super.getPort(CardContentManagementCallBackEndpoint, CardContentManagementCallBack.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardContentManagementCallBack
     */
    @WebEndpoint(name = "CardContentManagementCallBackEndpoint")
    public CardContentManagementCallBack getCardContentManagementCallBackEndpoint(WebServiceFeature... features) {
        return super.getPort(CardContentManagementCallBackEndpoint, CardContentManagementCallBack.class, features);
    }

}
