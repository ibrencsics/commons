
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This SE Command requests the creation of the first keyset of a Supplementary Security Domain.
 * 
 * <p>Java class for CreateFirstSSDKeysetCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFirstSSDKeysetCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandType">
 *       &lt;sequence>
 *         &lt;element name="SSDAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType"/>
 *         &lt;element name="KeyVersionNumber" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}KeyVersionNumberType" minOccurs="0"/>
 *         &lt;element name="InitialSequenceCounter" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFirstSSDKeysetCommandType", propOrder = {
    "ssdaid",
    "keyVersionNumber",
    "initialSequenceCounter"
})
@XmlSeeAlso({
    CCCMScenario2BCreateFirstSSDKeysetCommandType.class,
    BasicRandomCreateFirstSSDKeysetCommandType.class,
    CCCMScenario2ACreateFirstSSDKeysetCommandType.class,
    CCCMScenario1UsingPKCreateFirstSSDKeysetCommandType.class,
    BasicCreateFirstSSDKeysetCommandType.class
})
public abstract class CreateFirstSSDKeysetCommandType
    extends SECommandType
{

    @XmlElement(name = "SSDAID", required = true)
    protected String ssdaid;
    @XmlElement(name = "KeyVersionNumber")
    protected Byte keyVersionNumber;
    @XmlElement(name = "InitialSequenceCounter")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger initialSequenceCounter;

    /**
     * Gets the value of the ssdaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSDAID() {
        return ssdaid;
    }

    /**
     * Sets the value of the ssdaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSDAID(String value) {
        this.ssdaid = value;
    }

    /**
     * Gets the value of the keyVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getKeyVersionNumber() {
        return keyVersionNumber;
    }

    /**
     * Sets the value of the keyVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setKeyVersionNumber(Byte value) {
        this.keyVersionNumber = value;
    }

    /**
     * Gets the value of the initialSequenceCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInitialSequenceCounter() {
        return initialSequenceCounter;
    }

    /**
     * Sets the value of the initialSequenceCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInitialSequenceCounter(BigInteger value) {
        this.initialSequenceCounter = value;
    }

}
