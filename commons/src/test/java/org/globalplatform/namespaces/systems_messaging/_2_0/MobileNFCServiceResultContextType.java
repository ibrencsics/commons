
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Context related to mobile-NFC service management, for results.
 * 
 * <p>Java class for MobileNFCServiceResultContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileNFCServiceResultContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsedBearer" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BearerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileNFCServiceResultContextType", propOrder = {
    "usedBearer"
})
public class MobileNFCServiceResultContextType {

    @XmlElement(name = "UsedBearer")
    protected BigInteger usedBearer;

    /**
     * Gets the value of the usedBearer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedBearer() {
        return usedBearer;
    }

    /**
     * Sets the value of the usedBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedBearer(BigInteger value) {
        this.usedBearer = value;
    }

}
