
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the GetMobileSubscriptionAlternateIdentifierRequest message
 * 
 * <p>Java class for GetMobileSubscriptionAlternateIdentifierResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobileSubscriptionAlternateIdentifierResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}GetMobileSubscriptionAlternateIdentifierResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMobileSubscriptionAlternateIdentifierResponseType", propOrder = {
    "responseData"
})
public class GetMobileSubscriptionAlternateIdentifierResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected GetMobileSubscriptionAlternateIdentifierResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link GetMobileSubscriptionAlternateIdentifierResponseDataType }
     *     
     */
    public GetMobileSubscriptionAlternateIdentifierResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMobileSubscriptionAlternateIdentifierResponseDataType }
     *     
     */
    public void setResponseData(GetMobileSubscriptionAlternateIdentifierResponseDataType value) {
        this.responseData = value;
    }

}
