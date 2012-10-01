
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for the generation and the OTA execution of a sequence of Card Content Management commands for a Secure Element, in the context of the management of a particular instance of mobile-NFC service, through a particular Mobile Subscription.
 * 
 * <p>Java class for SECommandsGenerationAndRemoteExecutionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECommandsGenerationAndRemoteExecutionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="MobileNFCServiceContext" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileNFCServiceContextType"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CardCustomization"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECommandsGenerationAndRemoteExecutionRequestType", propOrder = {
    "mobileNFCServiceContext",
    "cardCustomization"
})
public class SECommandsGenerationAndRemoteExecutionRequestType
    extends BasicRequestType
{

    @XmlElement(name = "MobileNFCServiceContext", required = true)
    protected MobileNFCServiceContextType mobileNFCServiceContext;
    @XmlElement(name = "CardCustomization", required = true)
    protected CardCustomization cardCustomization;

    /**
     * Gets the value of the mobileNFCServiceContext property.
     * 
     * @return
     *     possible object is
     *     {@link MobileNFCServiceContextType }
     *     
     */
    public MobileNFCServiceContextType getMobileNFCServiceContext() {
        return mobileNFCServiceContext;
    }

    /**
     * Sets the value of the mobileNFCServiceContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileNFCServiceContextType }
     *     
     */
    public void setMobileNFCServiceContext(MobileNFCServiceContextType value) {
        this.mobileNFCServiceContext = value;
    }

    /**
     * The Card Customization message for application management.
     * 
     * @return
     *     possible object is
     *     {@link CardCustomization }
     *     
     */
    public CardCustomization getCardCustomization() {
        return cardCustomization;
    }

    /**
     * Sets the value of the cardCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardCustomization }
     *     
     */
    public void setCardCustomization(CardCustomization value) {
        this.cardCustomization = value;
    }

}
