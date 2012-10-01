
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the GetSEMobileSubscriptionIdentifierRequest message, in case or successful processing of the function
 * 
 * <p>Java class for GetSEMobileSubscriptionIdentifierResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSEMobileSubscriptionIdentifierResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileSubscriptionIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSEMobileSubscriptionIdentifierResponseDataType", propOrder = {
    "mobileSubscriptionIdentifier"
})
public class GetSEMobileSubscriptionIdentifierResponseDataType {

    @XmlElement(name = "MobileSubscriptionIdentifier", required = true)
    protected MobileSubscriptionIdentifierType mobileSubscriptionIdentifier;

    /**
     * Gets the value of the mobileSubscriptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getMobileSubscriptionIdentifier() {
        return mobileSubscriptionIdentifier;
    }

    /**
     * Sets the value of the mobileSubscriptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setMobileSubscriptionIdentifier(MobileSubscriptionIdentifierType value) {
        this.mobileSubscriptionIdentifier = value;
    }

}
