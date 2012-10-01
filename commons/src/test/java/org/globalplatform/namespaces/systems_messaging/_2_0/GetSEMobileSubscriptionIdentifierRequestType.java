
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for the identifier of the Mobile Subscription that shall be used to target a particular Secure Element.
 * This function might be used by the SDM in case the Mobile Subscription identifier is not known by itself, or has not been provided by the AP or by another SDM.
 * 
 * 
 * <p>Java class for GetSEMobileSubscriptionIdentifierRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSEMobileSubscriptionIdentifierRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSEMobileSubscriptionIdentifierRequestType", propOrder = {
    "secureElement"
})
public class GetSEMobileSubscriptionIdentifierRequestType
    extends BasicRequestType
{

    @XmlElement(name = "SecureElement", required = true)
    protected SEIdentifierType secureElement;

    /**
     * Gets the value of the secureElement property.
     * 
     * @return
     *     possible object is
     *     {@link SEIdentifierType }
     *     
     */
    public SEIdentifierType getSecureElement() {
        return secureElement;
    }

    /**
     * Sets the value of the secureElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEIdentifierType }
     *     
     */
    public void setSecureElement(SEIdentifierType value) {
        this.secureElement = value;
    }

}
