
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
 *       &lt;attribute name="NumberOfParts" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Algorithm" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}keypartalgorithm" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "KeyPart")
public class KeyPart {

    @XmlAttribute(name = "NumberOfParts")
    protected BigInteger numberOfParts;
    @XmlAttribute(name = "PartNumber")
    protected BigInteger partNumber;
    @XmlAttribute(name = "Algorithm")
    protected Keypartalgorithm algorithm;

    /**
     * Gets the value of the numberOfParts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfParts() {
        return numberOfParts;
    }

    /**
     * Sets the value of the numberOfParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfParts(BigInteger value) {
        this.numberOfParts = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartNumber(BigInteger value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link Keypartalgorithm }
     *     
     */
    public Keypartalgorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keypartalgorithm }
     *     
     */
    public void setAlgorithm(Keypartalgorithm value) {
        this.algorithm = value;
    }

}
