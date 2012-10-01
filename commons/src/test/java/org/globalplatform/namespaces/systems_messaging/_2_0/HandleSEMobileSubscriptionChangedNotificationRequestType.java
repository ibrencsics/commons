
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notifies that the Mobile Subscription that is used for reaching by OTA the Secure Element and the Device has changed. It does not refer to a change of the identifier of the Mobile Subscription (notified by the HandleMobileSubscriptionIdentifierChangedNotification function); but, it really refers to a change of the Mobile Subscription itself.
 * 
 * <p>Java class for HandleSEMobileSubscriptionChangedNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleSEMobileSubscriptionChangedNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType"/>
 *         &lt;element name="OldMobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType"/>
 *         &lt;element name="NewMobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleSEMobileSubscriptionChangedNotificationRequestType", propOrder = {
    "secureElement",
    "oldMobileSubscription",
    "newMobileSubscription"
})
public class HandleSEMobileSubscriptionChangedNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "SecureElement", required = true)
    protected SEIdentifierType secureElement;
    @XmlElement(name = "OldMobileSubscription", required = true)
    protected MobileSubscriptionIdentifierType oldMobileSubscription;
    @XmlElement(name = "NewMobileSubscription", required = true)
    protected MobileSubscriptionIdentifierType newMobileSubscription;

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
     * Gets the value of the oldMobileSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getOldMobileSubscription() {
        return oldMobileSubscription;
    }

    /**
     * Sets the value of the oldMobileSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setOldMobileSubscription(MobileSubscriptionIdentifierType value) {
        this.oldMobileSubscription = value;
    }

    /**
     * Gets the value of the newMobileSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getNewMobileSubscription() {
        return newMobileSubscription;
    }

    /**
     * Sets the value of the newMobileSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setNewMobileSubscription(MobileSubscriptionIdentifierType value) {
        this.newMobileSubscription = value;
    }

}
