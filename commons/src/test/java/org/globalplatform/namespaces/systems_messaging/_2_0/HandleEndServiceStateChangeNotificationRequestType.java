
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notifies the end of a global operation on a particular instance of mobile-NFC service.
 * 
 * <p>Java class for HandleEndServiceStateChangeNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleEndServiceStateChangeNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType" minOccurs="0"/>
 *         &lt;element name="CurrentService" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceIdentifierType" minOccurs="0"/>
 *         &lt;element name="CurrentServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceQualifierType" minOccurs="0"/>
 *         &lt;element name="NewService" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceIdentifierType" minOccurs="0"/>
 *         &lt;element name="NewServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceQualifierType" minOccurs="0"/>
 *         &lt;element name="Operation" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}OperationType"/>
 *         &lt;element name="OperationStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ExecutionStatusType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleEndServiceStateChangeNotificationRequestType", propOrder = {
    "mobileSubscription",
    "secureElement",
    "currentService",
    "currentServiceQualifier",
    "newService",
    "newServiceQualifier",
    "operation",
    "operationStatus"
})
public class HandleEndServiceStateChangeNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "MobileSubscription")
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "SecureElement")
    protected SEIdentifierType secureElement;
    @XmlElement(name = "CurrentService")
    protected ServiceIdentifierType currentService;
    @XmlElement(name = "CurrentServiceQualifier")
    protected ServiceQualifierType currentServiceQualifier;
    @XmlElement(name = "NewService")
    protected ServiceIdentifierType newService;
    @XmlElement(name = "NewServiceQualifier")
    protected ServiceQualifierType newServiceQualifier;
    @XmlElement(name = "Operation", required = true)
    protected BigInteger operation;
    @XmlElement(name = "OperationStatus", required = true)
    protected ExecutionStatusType operationStatus;

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
     * Gets the value of the currentService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public ServiceIdentifierType getCurrentService() {
        return currentService;
    }

    /**
     * Sets the value of the currentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public void setCurrentService(ServiceIdentifierType value) {
        this.currentService = value;
    }

    /**
     * Gets the value of the currentServiceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQualifierType }
     *     
     */
    public ServiceQualifierType getCurrentServiceQualifier() {
        return currentServiceQualifier;
    }

    /**
     * Sets the value of the currentServiceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQualifierType }
     *     
     */
    public void setCurrentServiceQualifier(ServiceQualifierType value) {
        this.currentServiceQualifier = value;
    }

    /**
     * Gets the value of the newService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public ServiceIdentifierType getNewService() {
        return newService;
    }

    /**
     * Sets the value of the newService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public void setNewService(ServiceIdentifierType value) {
        this.newService = value;
    }

    /**
     * Gets the value of the newServiceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQualifierType }
     *     
     */
    public ServiceQualifierType getNewServiceQualifier() {
        return newServiceQualifier;
    }

    /**
     * Sets the value of the newServiceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQualifierType }
     *     
     */
    public void setNewServiceQualifier(ServiceQualifierType value) {
        this.newServiceQualifier = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOperation(BigInteger value) {
        this.operation = value;
    }

    /**
     * Gets the value of the operationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionStatusType }
     *     
     */
    public ExecutionStatusType getOperationStatus() {
        return operationStatus;
    }

    /**
     * Sets the value of the operationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionStatusType }
     *     
     */
    public void setOperationStatus(ExecutionStatusType value) {
        this.operationStatus = value;
    }

}
