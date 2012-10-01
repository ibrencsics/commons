
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Notifies of a global status change on the Mobile Subscription. Four possible statuses may be notified: Suspended, Activated, Terminated, Restricted.
 * 
 * <p>Java class for HandleMobileSubscriptionStatusChangeNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleMobileSubscriptionStatusChangeNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NewStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionStatusType"/>
 *         &lt;element name="Reason" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionStatusChangeReasonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleMobileSubscriptionStatusChangeNotificationRequestType", propOrder = {
    "mobileSubscription",
    "date",
    "newStatus",
    "reason"
})
public class HandleMobileSubscriptionStatusChangeNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "MobileSubscription", required = true)
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "NewStatus", required = true)
    protected MobileSubscriptionStatusType newStatus;
    @XmlElement(name = "Reason")
    protected BigInteger reason;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the newStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionStatusType }
     *     
     */
    public MobileSubscriptionStatusType getNewStatus() {
        return newStatus;
    }

    /**
     * Sets the value of the newStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionStatusType }
     *     
     */
    public void setNewStatus(MobileSubscriptionStatusType value) {
        this.newStatus = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReason(BigInteger value) {
        this.reason = value;
    }

}
