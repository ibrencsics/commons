
package org.globalplatform.namespaces.systems_profiles._1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Privileges" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProfileID" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}uniqueID" />
 *       &lt;attribute name="Label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AID" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="LifeCycle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecurityDomain" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="VolatileDataSpaceLimit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="NonVolatileDataSpaceLimit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AppSpecificInstallParams" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="Order" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LoadFileID" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "privileges"
})
@XmlRootElement(name = "ApplicationInstance")
public class ApplicationInstance {

    @XmlElement(name = "Privileges")
    protected Privileges privileges;
    @XmlAttribute(name = "ProfileID", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] profileID;
    @XmlAttribute(name = "Label")
    protected String label;
    @XmlAttribute(name = "AID", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] aid;
    @XmlAttribute(name = "LifeCycle", required = true)
    protected String lifeCycle;
    @XmlAttribute(name = "SecurityDomain")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] securityDomain;
    @XmlAttribute(name = "VolatileDataSpaceLimit")
    protected BigInteger volatileDataSpaceLimit;
    @XmlAttribute(name = "NonVolatileDataSpaceLimit")
    protected BigInteger nonVolatileDataSpaceLimit;
    @XmlAttribute(name = "AppSpecificInstallParams")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appSpecificInstallParams;
    @XmlAttribute(name = "Order")
    protected BigInteger order;
    @XmlAttribute(name = "LoadFileID", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] loadFileID;

    /**
     * Gets the value of the privileges property.
     * 
     * @return
     *     possible object is
     *     {@link Privileges }
     *     
     */
    public Privileges getPrivileges() {
        return privileges;
    }

    /**
     * Sets the value of the privileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Privileges }
     *     
     */
    public void setPrivileges(Privileges value) {
        this.privileges = value;
    }

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
     * Gets the value of the aid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAID() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAID(byte[] value) {
        this.aid = value;
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
     * Gets the value of the securityDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSecurityDomain() {
        return securityDomain;
    }

    /**
     * Sets the value of the securityDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityDomain(byte[] value) {
        this.securityDomain = value;
    }

    /**
     * Gets the value of the volatileDataSpaceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVolatileDataSpaceLimit() {
        return volatileDataSpaceLimit;
    }

    /**
     * Sets the value of the volatileDataSpaceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVolatileDataSpaceLimit(BigInteger value) {
        this.volatileDataSpaceLimit = value;
    }

    /**
     * Gets the value of the nonVolatileDataSpaceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonVolatileDataSpaceLimit() {
        return nonVolatileDataSpaceLimit;
    }

    /**
     * Sets the value of the nonVolatileDataSpaceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonVolatileDataSpaceLimit(BigInteger value) {
        this.nonVolatileDataSpaceLimit = value;
    }

    /**
     * Gets the value of the appSpecificInstallParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppSpecificInstallParams() {
        return appSpecificInstallParams;
    }

    /**
     * Sets the value of the appSpecificInstallParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppSpecificInstallParams(byte[] value) {
        this.appSpecificInstallParams = value;
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
     * Gets the value of the loadFileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getLoadFileID() {
        return loadFileID;
    }

    /**
     * Sets the value of the loadFileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadFileID(byte[] value) {
        this.loadFileID = value;
    }

}
