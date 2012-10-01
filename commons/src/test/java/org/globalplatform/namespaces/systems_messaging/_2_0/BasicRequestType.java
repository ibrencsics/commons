
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The base type for a Request types.
 * 
 * <p>Java class for BasicRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FunctionCallIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ExtensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicRequestType", propOrder = {
    "functionCallIdentifier",
    "validityPeriod",
    "extensions"
})
@XmlSeeAlso({
    UnbindDeviceApplicationToSEApplicationRequestType.class,
    BindDeviceApplicationToSEApplicationRequestType.class,
    HandleSEStatusChangeNotificationRequestType.class,
    GetDeviceCapabilityProfileIdRequestType.class,
    DeleteSCWSServicePortalRequestType.class,
    GetCAInformationRequestType.class,
    HandleSEDeviceChangedNotificationRequestType.class,
    HandleEndServiceStateChangeNotificationRequestType.class,
    VerifyDMReceiptRequestType.class,
    GetApplicationOrELFStatusRequestType.class,
    HandleMobileSubscriptionIdentifierChangedNotificationRequestType.class,
    DeleteDeviceApplicationRequestType.class,
    EnrollSSDOwnerCertificateRequestType.class,
    LoadDeviceApplicationRequestType.class,
    GetSEMobileSubscriptionIdentifierRequestType.class,
    HandleMobileSubscriptionStatusChangeNotificationRequestType.class,
    SECommandsGenerationAndRemoteExecutionRequestType.class,
    HandleSEMobileSubscriptionChangedNotificationRequestType.class,
    GenerateDMTokenRequestType.class,
    EndConversationRequestType.class,
    GetSECapabilityProfileIdRequestType.class,
    CheckMobileSubscriptionEligibilityRequestType.class,
    HandleStartServiceStateChangeNotificationRequestType.class,
    GetMobileSubscriptionAlternateIdentifierRequestType.class,
    HandleSERenewalNotificationRequestType.class,
    BeginConversationRequestType.class,
    SendScriptRequestType.class,
    LoadSCWSServicePortalRequestType.class
})
public class BasicRequestType {

    @XmlElement(name = "FunctionCallIdentifier")
    protected String functionCallIdentifier;
    @XmlElement(name = "ValidityPeriod")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger validityPeriod;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsType> extensions;

    /**
     * Gets the value of the functionCallIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionCallIdentifier() {
        return functionCallIdentifier;
    }

    /**
     * Sets the value of the functionCallIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionCallIdentifier(String value) {
        this.functionCallIdentifier = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValidityPeriod(BigInteger value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsType }
     * 
     * 
     */
    public List<ExtensionsType> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionsType>();
        }
        return this.extensions;
    }

}
