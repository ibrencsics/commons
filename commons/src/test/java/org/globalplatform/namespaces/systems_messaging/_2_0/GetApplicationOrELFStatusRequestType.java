
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This function is used to request information about services present on a Secure Element.The command is used to audit one or many services among Applications, Security Domains, and Executable Load Files.
 * 
 * <p>Java class for GetApplicationOrELFStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApplicationOrELFStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType"/>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *         &lt;element name="ApplicationOrExecutableLoadFileAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType" maxOccurs="unbounded"/>
 *         &lt;element name="AuditType" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEAuditType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApplicationOrELFStatusRequestType", propOrder = {
    "secureElement",
    "mobileSubscription",
    "applicationOrExecutableLoadFileAID",
    "auditType"
})
public class GetApplicationOrELFStatusRequestType
    extends BasicRequestType
{

    @XmlElement(name = "SecureElement", required = true)
    protected SEIdentifierType secureElement;
    @XmlElement(name = "MobileSubscription")
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "ApplicationOrExecutableLoadFileAID", required = true)
    protected List<String> applicationOrExecutableLoadFileAID;
    @XmlElement(name = "AuditType", required = true)
    protected SEAuditType auditType;

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
     * Gets the value of the applicationOrExecutableLoadFileAID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationOrExecutableLoadFileAID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationOrExecutableLoadFileAID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicationOrExecutableLoadFileAID() {
        if (applicationOrExecutableLoadFileAID == null) {
            applicationOrExecutableLoadFileAID = new ArrayList<String>();
        }
        return this.applicationOrExecutableLoadFileAID;
    }

    /**
     * Gets the value of the auditType property.
     * 
     * @return
     *     possible object is
     *     {@link SEAuditType }
     *     
     */
    public SEAuditType getAuditType() {
        return auditType;
    }

    /**
     * Sets the value of the auditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEAuditType }
     *     
     */
    public void setAuditType(SEAuditType value) {
        this.auditType = value;
    }

}
