
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for the Card Profile
 * 
 * <p>Java class for DIAD_GetSECapabilityProfileRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_GetSECapabilityProfileRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_SecureElementId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIAD_GetSECapabilityProfileRequestType", propOrder = {
    "secureElement"
})
public class DIADGetSECapabilityProfileRequestType
    extends BasicRequestType
{

    @XmlElement(name = "SecureElement", required = true)
    protected DIADSecureElementId secureElement;

    /**
     * Gets the value of the secureElement property.
     * 
     * @return
     *     possible object is
     *     {@link DIADSecureElementId }
     *     
     */
    public DIADSecureElementId getSecureElement() {
        return secureElement;
    }

    /**
     * Sets the value of the secureElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADSecureElementId }
     *     
     */
    public void setSecureElement(DIADSecureElementId value) {
        this.secureElement = value;
    }

}
