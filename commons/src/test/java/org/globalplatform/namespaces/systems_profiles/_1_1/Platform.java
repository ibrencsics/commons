
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
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}version" />
 *       &lt;attribute name="OSPlatform" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OSVersion" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}version" />
 *       &lt;attribute name="Implementor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Platform")
public class Platform {

    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "OSPlatform", required = true)
    protected String osPlatform;
    @XmlAttribute(name = "OSVersion", required = true)
    protected String osVersion;
    @XmlAttribute(name = "Implementor")
    protected String implementor;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the osPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSPlatform() {
        return osPlatform;
    }

    /**
     * Sets the value of the osPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSPlatform(String value) {
        this.osPlatform = value;
    }

    /**
     * Gets the value of the osVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSVersion() {
        return osVersion;
    }

    /**
     * Sets the value of the osVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSVersion(String value) {
        this.osVersion = value;
    }

    /**
     * Gets the value of the implementor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementor() {
        return implementor;
    }

    /**
     * Sets the value of the implementor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementor(String value) {
        this.implementor = value;
    }

}
