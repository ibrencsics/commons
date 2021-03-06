package org.globalplatform.carddb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:49:14.991+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "CardDBService", 
                  wsdlLocation = "DIAD_CardDB.wsdl",
                  targetNamespace = "http://globalplatform.org/carddb") 
public class CardDBService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://globalplatform.org/carddb", "CardDBService");
    public final static QName CardDBEndPoint = new QName("http://globalplatform.org/carddb", "CardDBEndPoint");
    static {
        URL url = CardDBService.class.getResource("DIAD_CardDB.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CardDBService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "DIAD_CardDB.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public CardDBService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CardDBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardDBService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns CardDB
     */
    @WebEndpoint(name = "CardDBEndPoint")
    public CardDB getCardDBEndPoint() {
        return super.getPort(CardDBEndPoint, CardDB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardDB
     */
    @WebEndpoint(name = "CardDBEndPoint")
    public CardDB getCardDBEndPoint(WebServiceFeature... features) {
        return super.getPort(CardDBEndPoint, CardDB.class, features);
    }

}
