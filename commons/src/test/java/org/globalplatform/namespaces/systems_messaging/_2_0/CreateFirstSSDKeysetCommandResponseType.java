
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The response to the CreateFirstSSDKeysetCommandRequest SE Command
 * 
 * <p>Java class for CreateFirstSSDKeysetCommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFirstSSDKeysetCommandResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandResponseType">
 *       &lt;sequence>
 *         &lt;element name="SequenceCounter" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFirstSSDKeysetCommandResponseType", propOrder = {
    "sequenceCounter"
})
@XmlSeeAlso({
    CCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType.class,
    CCCMScenario2BCreateFirstSSDKeysetCommandResponseType.class,
    CCCMScenario2ACreateFirstSSDKeysetCommandResponseType.class,
    BasicCreateFirstSSDKeysetCommandResponseType.class,
    BasicRandomCreateFirstSSDKeysetCommandResponseType.class
})
public class CreateFirstSSDKeysetCommandResponseType
    extends SECommandResponseType
{

    @XmlElement(name = "SequenceCounter")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceCounter;

    /**
     * Gets the value of the sequenceCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceCounter() {
        return sequenceCounter;
    }

    /**
     * Sets the value of the sequenceCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceCounter(BigInteger value) {
        this.sequenceCounter = value;
    }

}
