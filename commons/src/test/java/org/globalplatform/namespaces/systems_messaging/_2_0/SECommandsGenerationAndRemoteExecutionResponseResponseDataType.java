
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the SECommandsGenerationAndRemoteExecutionRequest message, in case or successful processing of the function
 * 
 * <p>Java class for SECommandsGenerationAndRemoteExecutionResponseResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECommandsGenerationAndRemoteExecutionResponseResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CardAuditTrail"/>
 *         &lt;element name="MobileNFCServiceResultContext" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileNFCServiceResultContextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECommandsGenerationAndRemoteExecutionResponseResponseDataType", propOrder = {
    "cardAuditTrail",
    "mobileNFCServiceResultContext"
})
public class SECommandsGenerationAndRemoteExecutionResponseResponseDataType {

    @XmlElement(name = "CardAuditTrail", required = true)
    protected CardAuditTrail cardAuditTrail;
    @XmlElement(name = "MobileNFCServiceResultContext", required = true)
    protected MobileNFCServiceResultContextType mobileNFCServiceResultContext;

    /**
     * The Card Customization message for application management.
     * 
     * @return
     *     possible object is
     *     {@link CardAuditTrail }
     *     
     */
    public CardAuditTrail getCardAuditTrail() {
        return cardAuditTrail;
    }

    /**
     * Sets the value of the cardAuditTrail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAuditTrail }
     *     
     */
    public void setCardAuditTrail(CardAuditTrail value) {
        this.cardAuditTrail = value;
    }

    /**
     * Gets the value of the mobileNFCServiceResultContext property.
     * 
     * @return
     *     possible object is
     *     {@link MobileNFCServiceResultContextType }
     *     
     */
    public MobileNFCServiceResultContextType getMobileNFCServiceResultContext() {
        return mobileNFCServiceResultContext;
    }

    /**
     * Sets the value of the mobileNFCServiceResultContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileNFCServiceResultContextType }
     *     
     */
    public void setMobileNFCServiceResultContext(MobileNFCServiceResultContextType value) {
        this.mobileNFCServiceResultContext = value;
    }

}
