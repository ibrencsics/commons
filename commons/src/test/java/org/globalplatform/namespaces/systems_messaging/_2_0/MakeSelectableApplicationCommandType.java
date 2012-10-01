
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This SE Command requests for making an Application selectable.
 * 
 * <p>Java class for MakeSelectableApplicationCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MakeSelectableApplicationCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType"/>
 *         &lt;element name="ParametersProfileIdentifier" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakeSelectableApplicationCommandType", propOrder = {
    "applicationAID",
    "parametersProfileIdentifier"
})
public class MakeSelectableApplicationCommandType
    extends SECommandType
{

    @XmlElement(name = "ApplicationAID", required = true)
    protected String applicationAID;
    @XmlElement(name = "ParametersProfileIdentifier")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger parametersProfileIdentifier;

    /**
     * Gets the value of the applicationAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationAID() {
        return applicationAID;
    }

    /**
     * Sets the value of the applicationAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationAID(String value) {
        this.applicationAID = value;
    }

    /**
     * Gets the value of the parametersProfileIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParametersProfileIdentifier() {
        return parametersProfileIdentifier;
    }

    /**
     * Sets the value of the parametersProfileIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParametersProfileIdentifier(BigInteger value) {
        this.parametersProfileIdentifier = value;
    }

}
