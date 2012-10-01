
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notifies that the Secure Element has been renewed. Renewal means that the previous Secure Element is no longer alive and accessible.
 * 
 * <p>Java class for HandleSERenewalNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleSERenewalNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="OldSecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType"/>
 *         &lt;element name="NewSecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleSERenewalNotificationRequestType", propOrder = {
    "oldSecureElement",
    "newSecureElement"
})
public class HandleSERenewalNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "OldSecureElement", required = true)
    protected SEIdentifierType oldSecureElement;
    @XmlElement(name = "NewSecureElement", required = true)
    protected SEIdentifierType newSecureElement;

    /**
     * Gets the value of the oldSecureElement property.
     * 
     * @return
     *     possible object is
     *     {@link SEIdentifierType }
     *     
     */
    public SEIdentifierType getOldSecureElement() {
        return oldSecureElement;
    }

    /**
     * Sets the value of the oldSecureElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEIdentifierType }
     *     
     */
    public void setOldSecureElement(SEIdentifierType value) {
        this.oldSecureElement = value;
    }

    /**
     * Gets the value of the newSecureElement property.
     * 
     * @return
     *     possible object is
     *     {@link SEIdentifierType }
     *     
     */
    public SEIdentifierType getNewSecureElement() {
        return newSecureElement;
    }

    /**
     * Sets the value of the newSecureElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEIdentifierType }
     *     
     */
    public void setNewSecureElement(SEIdentifierType value) {
        this.newSecureElement = value;
    }

}
