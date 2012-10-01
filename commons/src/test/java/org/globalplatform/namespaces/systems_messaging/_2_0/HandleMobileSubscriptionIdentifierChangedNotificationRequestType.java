
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notifies that the identification of the Mobile Subscription has changed. Note that the Mobile Subscription itself is still the same; it is only the identifier which has changed. This new identifier SHALL be used for any later function call taking a Mobile Subscription Identifier as input parameter (in place of the former Mobile Subscription Identifier value).
 * 
 * <p>Java class for HandleMobileSubscriptionIdentifierChangedNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleMobileSubscriptionIdentifierChangedNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="MobileSubscriptionOldIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType"/>
 *         &lt;element name="MobileSubscriptionNewIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleMobileSubscriptionIdentifierChangedNotificationRequestType", propOrder = {
    "mobileSubscriptionOldIdentifier",
    "mobileSubscriptionNewIdentifier"
})
public class HandleMobileSubscriptionIdentifierChangedNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "MobileSubscriptionOldIdentifier", required = true)
    protected MobileSubscriptionIdentifierType mobileSubscriptionOldIdentifier;
    @XmlElement(name = "MobileSubscriptionNewIdentifier", required = true)
    protected MobileSubscriptionIdentifierType mobileSubscriptionNewIdentifier;

    /**
     * Gets the value of the mobileSubscriptionOldIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getMobileSubscriptionOldIdentifier() {
        return mobileSubscriptionOldIdentifier;
    }

    /**
     * Sets the value of the mobileSubscriptionOldIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setMobileSubscriptionOldIdentifier(MobileSubscriptionIdentifierType value) {
        this.mobileSubscriptionOldIdentifier = value;
    }

    /**
     * Gets the value of the mobileSubscriptionNewIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getMobileSubscriptionNewIdentifier() {
        return mobileSubscriptionNewIdentifier;
    }

    /**
     * Sets the value of the mobileSubscriptionNewIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setMobileSubscriptionNewIdentifier(MobileSubscriptionIdentifierType value) {
        this.mobileSubscriptionNewIdentifier = value;
    }

}
