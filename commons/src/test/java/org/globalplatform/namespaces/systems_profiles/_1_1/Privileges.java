
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SecurityDomain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DAPVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DelegatedManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CardManagerLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CardTerminate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DefaultSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CVMChange" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ManadatedDAPVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Privileges")
public class Privileges {

    @XmlAttribute(name = "SecurityDomain")
    protected Boolean securityDomain;
    @XmlAttribute(name = "DAPVerification")
    protected Boolean dapVerification;
    @XmlAttribute(name = "DelegatedManagement")
    protected Boolean delegatedManagement;
    @XmlAttribute(name = "CardManagerLock")
    protected Boolean cardManagerLock;
    @XmlAttribute(name = "CardTerminate")
    protected Boolean cardTerminate;
    @XmlAttribute(name = "DefaultSelected")
    protected Boolean defaultSelected;
    @XmlAttribute(name = "CVMChange")
    protected Boolean cvmChange;
    @XmlAttribute(name = "ManadatedDAPVerification")
    protected Boolean manadatedDAPVerification;

    /**
     * Gets the value of the securityDomain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecurityDomain() {
        return securityDomain;
    }

    /**
     * Sets the value of the securityDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecurityDomain(Boolean value) {
        this.securityDomain = value;
    }

    /**
     * Gets the value of the dapVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDAPVerification() {
        return dapVerification;
    }

    /**
     * Sets the value of the dapVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDAPVerification(Boolean value) {
        this.dapVerification = value;
    }

    /**
     * Gets the value of the delegatedManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelegatedManagement() {
        return delegatedManagement;
    }

    /**
     * Sets the value of the delegatedManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelegatedManagement(Boolean value) {
        this.delegatedManagement = value;
    }

    /**
     * Gets the value of the cardManagerLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardManagerLock() {
        return cardManagerLock;
    }

    /**
     * Sets the value of the cardManagerLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardManagerLock(Boolean value) {
        this.cardManagerLock = value;
    }

    /**
     * Gets the value of the cardTerminate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardTerminate() {
        return cardTerminate;
    }

    /**
     * Sets the value of the cardTerminate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardTerminate(Boolean value) {
        this.cardTerminate = value;
    }

    /**
     * Gets the value of the defaultSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultSelected() {
        return defaultSelected;
    }

    /**
     * Sets the value of the defaultSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultSelected(Boolean value) {
        this.defaultSelected = value;
    }

    /**
     * Gets the value of the cvmChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCVMChange() {
        return cvmChange;
    }

    /**
     * Sets the value of the cvmChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCVMChange(Boolean value) {
        this.cvmChange = value;
    }

    /**
     * Gets the value of the manadatedDAPVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManadatedDAPVerification() {
        return manadatedDAPVerification;
    }

    /**
     * Sets the value of the manadatedDAPVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManadatedDAPVerification(Boolean value) {
        this.manadatedDAPVerification = value;
    }

}
