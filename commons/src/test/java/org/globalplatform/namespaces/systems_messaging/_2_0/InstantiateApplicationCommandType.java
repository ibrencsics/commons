
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This SE Command requests the instantiation of a particular Application.
 * 
 * <p>Java class for InstantiateApplicationCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstantiateApplicationCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandType">
 *       &lt;sequence>
 *         &lt;element name="ExecutableLoadFileAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType" minOccurs="0"/>
 *         &lt;element name="ExecutableModuleAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType" minOccurs="0"/>
 *         &lt;element name="ApplicationAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType" minOccurs="0"/>
 *         &lt;element name="ParametersProfileIdentifier" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ApplicationSpecificParameters" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="GenerateTAR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MakeSelectable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstantiateApplicationCommandType", propOrder = {
    "executableLoadFileAID",
    "executableModuleAID",
    "applicationAID",
    "parametersProfileIdentifier",
    "applicationSpecificParameters",
    "generateTAR",
    "makeSelectable"
})
public class InstantiateApplicationCommandType
    extends SECommandType
{

    @XmlElement(name = "ExecutableLoadFileAID")
    protected String executableLoadFileAID;
    @XmlElement(name = "ExecutableModuleAID")
    protected String executableModuleAID;
    @XmlElement(name = "ApplicationAID")
    protected String applicationAID;
    @XmlElement(name = "ParametersProfileIdentifier")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger parametersProfileIdentifier;
    @XmlElement(name = "ApplicationSpecificParameters", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] applicationSpecificParameters;
    @XmlElement(name = "GenerateTAR")
    protected Boolean generateTAR;
    @XmlElement(name = "MakeSelectable")
    protected Boolean makeSelectable;

    /**
     * Gets the value of the executableLoadFileAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutableLoadFileAID() {
        return executableLoadFileAID;
    }

    /**
     * Sets the value of the executableLoadFileAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutableLoadFileAID(String value) {
        this.executableLoadFileAID = value;
    }

    /**
     * Gets the value of the executableModuleAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutableModuleAID() {
        return executableModuleAID;
    }

    /**
     * Sets the value of the executableModuleAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutableModuleAID(String value) {
        this.executableModuleAID = value;
    }

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

    /**
     * Gets the value of the applicationSpecificParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getApplicationSpecificParameters() {
        return applicationSpecificParameters;
    }

    /**
     * Sets the value of the applicationSpecificParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationSpecificParameters(byte[] value) {
        this.applicationSpecificParameters = value;
    }

    /**
     * Gets the value of the generateTAR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateTAR() {
        return generateTAR;
    }

    /**
     * Sets the value of the generateTAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateTAR(Boolean value) {
        this.generateTAR = value;
    }

    /**
     * Gets the value of the makeSelectable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMakeSelectable() {
        return makeSelectable;
    }

    /**
     * Sets the value of the makeSelectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakeSelectable(Boolean value) {
        this.makeSelectable = value;
    }

}
