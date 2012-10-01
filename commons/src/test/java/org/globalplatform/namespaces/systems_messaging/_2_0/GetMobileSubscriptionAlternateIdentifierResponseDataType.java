
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the GetMobileSubscriptionAlternateIdentifierRequest message, in case or successful processing of the function
 * 
 * <p>Java class for GetMobileSubscriptionAlternateIdentifierResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobileSubscriptionAlternateIdentifierResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternateMobileSubscriptionIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMobileSubscriptionAlternateIdentifierResponseDataType", propOrder = {
    "alternateMobileSubscriptionIdentifier"
})
public class GetMobileSubscriptionAlternateIdentifierResponseDataType {

    @XmlElement(name = "AlternateMobileSubscriptionIdentifier", required = true)
    protected MobileSubscriptionIdentifierType alternateMobileSubscriptionIdentifier;

    /**
     * Gets the value of the alternateMobileSubscriptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getAlternateMobileSubscriptionIdentifier() {
        return alternateMobileSubscriptionIdentifier;
    }

    /**
     * Sets the value of the alternateMobileSubscriptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setAlternateMobileSubscriptionIdentifier(MobileSubscriptionIdentifierType value) {
        this.alternateMobileSubscriptionIdentifier = value;
    }

}
