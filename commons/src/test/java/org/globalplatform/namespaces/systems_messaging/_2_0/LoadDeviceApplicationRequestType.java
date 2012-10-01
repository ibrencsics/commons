
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for the loading of a Device application, in the context of the management of a particular instance of mobile-NFC service through a particular Mobile Subscription.
 * 
 * <p>Java class for LoadDeviceApplicationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadDeviceApplicationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType"/>
 *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceIdentifierType"/>
 *         &lt;element name="ServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceQualifierType" minOccurs="0"/>
 *         &lt;element name="DeviceApplicationIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeviceApplicationIdentifierType" minOccurs="0"/>
 *         &lt;element name="PreferredInstallationMode" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeviceInstallationModeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadDeviceApplicationRequestType", propOrder = {
    "mobileSubscription",
    "service",
    "serviceQualifier",
    "deviceApplicationIdentifier",
    "preferredInstallationMode"
})
public class LoadDeviceApplicationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "MobileSubscription", required = true)
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "Service", required = true)
    protected ServiceIdentifierType service;
    @XmlElement(name = "ServiceQualifier")
    protected ServiceQualifierType serviceQualifier;
    @XmlElement(name = "DeviceApplicationIdentifier")
    protected String deviceApplicationIdentifier;
    @XmlElement(name = "PreferredInstallationMode")
    protected DeviceInstallationModeType preferredInstallationMode;

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
     * Gets the value of the preferredInstallationMode property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInstallationModeType }
     *     
     */
    public DeviceInstallationModeType getPreferredInstallationMode() {
        return preferredInstallationMode;
    }

    /**
     * Sets the value of the preferredInstallationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInstallationModeType }
     *     
     */
    public void setPreferredInstallationMode(DeviceInstallationModeType value) {
        this.preferredInstallationMode = value;
    }

}
