
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for the unbinding of a Device application from a SE application, in the context of the management of a particular instance of mobile-NFC service through a particular Mobile Subscription.
 * 
 * <p>Java class for UnbindDeviceApplicationToSEApplicationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbindDeviceApplicationToSEApplicationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType"/>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceIdentifierType"/>
 *         &lt;element name="ServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceQualifierType" minOccurs="0"/>
 *         &lt;element name="DeviceApplicationIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeviceApplicationIdentifierType" minOccurs="0"/>
 *         &lt;element name="SEApplicationAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnbindDeviceApplicationToSEApplicationRequestType", propOrder = {
    "secureElement",
    "mobileSubscription",
    "service",
    "serviceQualifier",
    "deviceApplicationIdentifier",
    "seApplicationAID"
})
public class UnbindDeviceApplicationToSEApplicationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "SecureElement", required = true)
    protected SEIdentifierType secureElement;
    @XmlElement(name = "MobileSubscription")
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "Service", required = true)
    protected ServiceIdentifierType service;
    @XmlElement(name = "ServiceQualifier")
    protected ServiceQualifierType serviceQualifier;
    @XmlElement(name = "DeviceApplicationIdentifier")
    protected String deviceApplicationIdentifier;
    @XmlElement(name = "SEApplicationAID")
    protected String seApplicationAID;

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
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public ServiceIdentifierType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public void setService(ServiceIdentifierType value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQualifierType }
     *     
     */
    public ServiceQualifierType getServiceQualifier() {
        return serviceQualifier;
    }

    /**
     * Sets the value of the serviceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQualifierType }
     *     
     */
    public void setServiceQualifier(ServiceQualifierType value) {
        this.serviceQualifier = value;
    }

    /**
     * Gets the value of the deviceApplicationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceApplicationIdentifier() {
        return deviceApplicationIdentifier;
    }

    /**
     * Sets the value of the deviceApplicationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceApplicationIdentifier(String value) {
        this.deviceApplicationIdentifier = value;
    }

    /**
     * Gets the value of the seApplicationAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEApplicationAID() {
        return seApplicationAID;
    }

    /**
     * Sets the value of the seApplicationAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEApplicationAID(String value) {
        this.seApplicationAID = value;
    }

}
