
package org.globalplatform.namespaces.systems_profiles._1_1;

import java.math.BigInteger;
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
 *       &lt;attribute name="Type" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}secureElementProtocol" />
 *       &lt;attribute name="MaxApduLen" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Protocol")
public class Protocol {

    @XmlAttribute(name = "Type", required = true)
    protected SecureElementProtocol type;
    @XmlAttribute(name = "MaxApduLen", required = true)
    protected BigInteger maxApduLen;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SecureElementProtocol }
     *     
     */
    public SecureElementProtocol getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureElementProtocol }
     *     
     */
    public void setType(SecureElementProtocol value) {
        this.type = value;
    }

    /**
     * Gets the value of the maxApduLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxApduLen() {
        return maxApduLen;
    }

    /**
     * Sets the value of the maxApduLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxApduLen(BigInteger value) {
        this.maxApduLen = value;
    }

}
