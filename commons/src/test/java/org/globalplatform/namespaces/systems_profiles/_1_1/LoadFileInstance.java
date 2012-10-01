
package org.globalplatform.namespaces.systems_profiles._1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ProfileID" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}uniqueID" />
 *       &lt;attribute name="Label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LifeCycle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Masked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SecurityDomainAid" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="Order" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="NonVolatileCodeSpaceLimit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LoadFileInstance")
public class LoadFileInstance {

    @XmlAttribute(name = "ProfileID", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] profileID;
    @XmlAttribute(name = "Label")
    protected String label;
    @XmlAttribute(name = "LifeCycle", required = true)
    protected String lifeCycle;
    @XmlAttribute(name = "Masked", required = true)
    protected boolean masked;
    @XmlAttribute(name = "SecurityDomainAid")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] securityDomainAid;
    @XmlAttribute(name = "Order")
    protected BigInteger order;
    @XmlAttribute(name = "NonVolatileCodeSpaceLimit")
    protected BigInteger nonVolatileCodeSpaceLimit;

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(byte[] value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the lifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Sets the value of the lifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycle(String value) {
        this.lifeCycle = value;
    }

    /**
     * Gets the value of the masked property.
     * 
     */
    public boolean isMasked() {
        return masked;
    }

    /**
     * Sets the value of the masked property.
     * 
     */
    public void setMasked(boolean value) {
        this.masked = value;
    }

    /**
     * Gets the value of the securityDomainAid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSecurityDomainAid() {
        return securityDomainAid;
    }

    /**
     * Sets the value of the securityDomainAid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityDomainAid(byte[] value) {
        this.securityDomainAid = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Gets the value of the nonVolatileCodeSpaceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonVolatileCodeSpaceLimit() {
        return nonVolatileCodeSpaceLimit;
    }

    /**
     * Sets the value of the nonVolatileCodeSpaceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonVolatileCodeSpaceLimit(BigInteger value) {
        this.nonVolatileCodeSpaceLimit = value;
    }

}
