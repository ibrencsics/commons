
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the CheckMobileSubscriptionEligibilityRequest message
 * 
 * <p>Java class for CheckMobileSubscriptionEligibilityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckMobileSubscriptionEligibilityResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CheckMobileSubscriptionEligibilityResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckMobileSubscriptionEligibilityResponseType", propOrder = {
    "responseData"
})
public class CheckMobileSubscriptionEligibilityResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected CheckMobileSubscriptionEligibilityResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link CheckMobileSubscriptionEligibilityResponseDataType }
     *     
     */
    public CheckMobileSubscriptionEligibilityResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckMobileSubscriptionEligibilityResponseDataType }
     *     
     */
    public void setResponseData(CheckMobileSubscriptionEligibilityResponseDataType value) {
        this.responseData = value;
    }

}
