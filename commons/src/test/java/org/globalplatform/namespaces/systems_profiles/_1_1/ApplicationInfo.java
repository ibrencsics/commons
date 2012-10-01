
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Privileges"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}LifeCycles"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}version" />
 *       &lt;attribute name="Type" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}application" />
 *       &lt;attribute name="Subtype" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}applicationsubtype" />
 *       &lt;attribute name="Owner" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Developer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Provider" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Domain" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VolatileDataSpaceMin" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="NonVolatileDataSpaceMin" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="VolatileDataSpaceMax" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="NonVolatileDataSpaceMax" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AppSpecificInstallParams" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "privileges",
    "lifeCycles"
})
@XmlRootElement(name = "ApplicationInfo")
public class ApplicationInfo {

    @XmlElement(name = "Privileges", required = true)
    protected Privileges privileges;
    @XmlElement(name = "LifeCycles", required = true)
    protected LifeCycles lifeCycles;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "Type", required = true)
    protected Application type;
    @XmlAttribute(name = "Subtype", required = true)
    protected Applicationsubtype subtype;
    @XmlAttribute(name = "Owner", required = true)
    protected String owner;
    @XmlAttribute(name = "Developer", required = true)
    protected String developer;
    @XmlAttribute(name = "Provider", required = true)
    protected String provider;
    @XmlAttribute(name = "Domain", required = true)
    protected String domain;
    @XmlAttribute(name = "VolatileDataSpaceMin", required = true)
    protected BigInteger volatileDataSpaceMin;
    @XmlAttribute(name = "NonVolatileDataSpaceMin", required = true)
    protected BigInteger nonVolatileDataSpaceMin;
    @XmlAttribute(name = "VolatileDataSpaceMax")
    protected BigInteger volatileDataSpaceMax;
    @XmlAttribute(name = "NonVolatileDataSpaceMax")
    protected BigInteger nonVolatileDataSpaceMax;
    @XmlAttribute(name = "AppSpecificInstallParams")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appSpecificInstallParams;

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
     * Gets the value of the lifeCycles property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycles }
     *     
     */
    public LifeCycles getLifeCycles() {
        return lifeCycles;
    }

    /**
     * Sets the value of the lifeCycles property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycles }
     *     
     */
    public void setLifeCycles(LifeCycles value) {
        this.lifeCycles = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Application }
     *     
     */
    public Application getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application }
     *     
     */
    public void setType(Application value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link Applicationsubtype }
     *     
     */
    public Applicationsubtype getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Applicationsubtype }
     *     
     */
    public void setSubtype(Applicationsubtype value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the developer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * Sets the value of the developer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloper(String value) {
        this.developer = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the volatileDataSpaceMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVolatileDataSpaceMin() {
        return volatileDataSpaceMin;
    }

    /**
     * Sets the value of the volatileDataSpaceMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVolatileDataSpaceMin(BigInteger value) {
        this.volatileDataSpaceMin = value;
    }

    /**
     * Gets the value of the nonVolatileDataSpaceMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonVolatileDataSpaceMin() {
        return nonVolatileDataSpaceMin;
    }

    /**
     * Sets the value of the nonVolatileDataSpaceMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonVolatileDataSpaceMin(BigInteger value) {
        this.nonVolatileDataSpaceMin = value;
    }

    /**
     * Gets the value of the volatileDataSpaceMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVolatileDataSpaceMax() {
        return volatileDataSpaceMax;
    }

    /**
     * Sets the value of the volatileDataSpaceMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVolatileDataSpaceMax(BigInteger value) {
        this.volatileDataSpaceMax = value;
    }

    /**
     * Gets the value of the nonVolatileDataSpaceMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonVolatileDataSpaceMax() {
        return nonVolatileDataSpaceMax;
    }

    /**
     * Sets the value of the nonVolatileDataSpaceMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonVolatileDataSpaceMax(BigInteger value) {
        this.nonVolatileDataSpaceMax = value;
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

}
