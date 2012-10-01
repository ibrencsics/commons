
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The mode for the Device application deletion.
 * 
 * <p>Java class for DeviceDeletionModeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDeletionModeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accountability" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeviceDeletionAccountabilityType"/>
 *         &lt;element name="Silent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDeletionModeType", propOrder = {
    "accountability",
    "silent"
})
public class DeviceDeletionModeType {

    @XmlElement(name = "Accountability", required = true)
    protected BigInteger accountability;
    @XmlElement(name = "Silent")
    protected boolean silent;

    /**
     * Gets the value of the accountability property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountability() {
        return accountability;
    }

    /**
     * Sets the value of the accountability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountability(BigInteger value) {
        this.accountability = value;
    }

    /**
     * Gets the value of the silent property.
     * 
     */
    public boolean isSilent() {
        return silent;
    }

    /**
     * Sets the value of the silent property.
     * 
     */
    public void setSilent(boolean value) {
        this.silent = value;
    }

}
