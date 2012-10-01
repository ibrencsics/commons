
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the EnrollSSDOwnerCertificateRequest message
 * 
 * <p>Java class for EnrollSSDOwnerCertificateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollSSDOwnerCertificateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}EnrollSSDOwnerCertificateResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollSSDOwnerCertificateResponseType", propOrder = {
    "responseData"
})
public class EnrollSSDOwnerCertificateResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected EnrollSSDOwnerCertificateResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollSSDOwnerCertificateResponseDataType }
     *     
     */
    public EnrollSSDOwnerCertificateResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollSSDOwnerCertificateResponseDataType }
     *     
     */
    public void setResponseData(EnrollSSDOwnerCertificateResponseDataType value) {
        this.responseData = value;
    }

}
