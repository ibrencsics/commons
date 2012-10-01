
package org.globalplatform.namespaces.systems_profiles._1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Protocols"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PPS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BaudRateMin" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="BaudRateMax" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "protocols"
})
@XmlRootElement(name = "Contact")
public class Contact {

    @XmlElement(name = "Protocols", required = true)
    protected Protocols protocols;
    @XmlAttribute(name = "PPS")
    protected Boolean pps;
    @XmlAttribute(name = "Unit")
    protected String unit;
    @XmlAttribute(name = "BaudRateMin")
    protected BigInteger baudRateMin;
    @XmlAttribute(name = "BaudRateMax")
    protected BigInteger baudRateMax;

    /**
     * Gets the value of the protocols property.
     * 
     * @return
     *     possible object is
     *     {@link Protocols }
     *     
     */
    public Protocols getProtocols() {
        return protocols;
    }

    /**
     * Sets the value of the protocols property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocols }
     *     
     */
    public void setProtocols(Protocols value) {
        this.protocols = value;
    }

    /**
     * Gets the value of the pps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPPS() {
        return pps;
    }

    /**
     * Sets the value of the pps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPPS(Boolean value) {
        this.pps = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the baudRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaudRateMin() {
        return baudRateMin;
    }

    /**
     * Sets the value of the baudRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaudRateMin(BigInteger value) {
        this.baudRateMin = value;
    }

    /**
     * Gets the value of the baudRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaudRateMax() {
        return baudRateMax;
    }

    /**
     * Sets the value of the baudRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaudRateMax(BigInteger value) {
        this.baudRateMax = value;
    }

}
