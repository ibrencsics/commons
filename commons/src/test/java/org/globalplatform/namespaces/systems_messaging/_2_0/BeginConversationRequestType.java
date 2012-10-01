
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Request performing an OTA conversation with an Application or Security Domain of a Secure Element, in the context of the management of a particular instance of mobile-NFC service through a particular Mobile Subscription.
 * 
 * <p>Java class for BeginConversationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeginConversationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType"/>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceIdentifierType"/>
 *         &lt;element name="ServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceQualifierType" minOccurs="0"/>
 *         &lt;element name="TargetIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEApplicationIdentifierType"/>
 *         &lt;element name="RequestedScriptFormat" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ScriptFormatType"/>
 *         &lt;element name="EstimatedAPDUScriptSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeginConversationRequestType", propOrder = {
    "secureElement",
    "mobileSubscription",
    "service",
    "serviceQualifier",
    "targetIdentifier",
    "requestedScriptFormat",
    "estimatedAPDUScriptSize"
})
public class BeginConversationRequestType
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
    @XmlElement(name = "TargetIdentifier", required = true)
    protected SEApplicationIdentifierType targetIdentifier;
    @XmlElement(name = "RequestedScriptFormat", required = true)
    protected ScriptFormatType requestedScriptFormat;
    @XmlElement(name = "EstimatedAPDUScriptSize", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger estimatedAPDUScriptSize;

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
     * Gets the value of the targetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SEApplicationIdentifierType }
     *     
     */
    public SEApplicationIdentifierType getTargetIdentifier() {
        return targetIdentifier;
    }

    /**
     * Sets the value of the targetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEApplicationIdentifierType }
     *     
     */
    public void setTargetIdentifier(SEApplicationIdentifierType value) {
        this.targetIdentifier = value;
    }

    /**
     * Gets the value of the requestedScriptFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ScriptFormatType }
     *     
     */
    public ScriptFormatType getRequestedScriptFormat() {
        return requestedScriptFormat;
    }

    /**
     * Sets the value of the requestedScriptFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptFormatType }
     *     
     */
    public void setRequestedScriptFormat(ScriptFormatType value) {
        this.requestedScriptFormat = value;
    }

    /**
     * Gets the value of the estimatedAPDUScriptSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEstimatedAPDUScriptSize() {
        return estimatedAPDUScriptSize;
    }

    /**
     * Sets the value of the estimatedAPDUScriptSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEstimatedAPDUScriptSize(BigInteger value) {
        this.estimatedAPDUScriptSize = value;
    }

}
