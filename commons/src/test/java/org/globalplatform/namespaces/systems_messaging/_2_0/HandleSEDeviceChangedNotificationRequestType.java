
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Notifies that the Device hosting the SE has changed.
 * 
 * <p>Java class for HandleSEDeviceChangedNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleSEDeviceChangedNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType"/>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *         &lt;element name="OldDeviceCapabilityProfileId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="NewDeviceCapabilityProfileId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleSEDeviceChangedNotificationRequestType", propOrder = {
    "secureElement",
    "mobileSubscription",
    "oldDeviceCapabilityProfileId",
    "newDeviceCapabilityProfileId"
})
public class HandleSEDeviceChangedNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "SecureElement", required = true)
    protected SEIdentifierType secureElement;
    @XmlElement(name = "MobileSubscription")
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "OldDeviceCapabilityProfileId", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger oldDeviceCapabilityProfileId;
    @XmlElement(name = "NewDeviceCapabilityProfileId", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger newDeviceCapabilityProfileId;

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

    /**
     * Gets the value of the mobileSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getMobileSubscription() {
        return mobileSubscription;
    }

    /**
     * Sets the value of the mobileSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setMobileSubscription(MobileSubscriptionIdentifierType value) {
        this.mobileSubscription = value;
    }

    /**
     * Gets the value of the oldDeviceCapabilityProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOldDeviceCapabilityProfileId() {
        return oldDeviceCapabilityProfileId;
    }

    /**
     * Sets the value of the oldDeviceCapabilityProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOldDeviceCapabilityProfileId(BigInteger value) {
        this.oldDeviceCapabilityProfileId = value;
    }

    /**
     * Gets the value of the newDeviceCapabilityProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewDeviceCapabilityProfileId() {
        return newDeviceCapabilityProfileId;
    }

    /**
     * Sets the value of the newDeviceCapabilityProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewDeviceCapabilityProfileId(BigInteger value) {
        this.newDeviceCapabilityProfileId = value;
    }

}
