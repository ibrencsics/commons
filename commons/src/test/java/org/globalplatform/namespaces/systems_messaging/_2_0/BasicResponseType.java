
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The base type for a Response types.
 * 
 * <p>Java class for BasicResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessingStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ProcessingEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AcceptableValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="FunctionExecutionStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ExecutionStatusType"/>
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
@XmlType(name = "BasicResponseType", propOrder = {
    "processingStart",
    "processingEnd",
    "acceptableValidityPeriod",
    "functionExecutionStatus",
    "extensions"
})
@XmlSeeAlso({
    GetMobileSubscriptionAlternateIdentifierResponseType.class,
    LoadDeviceApplicationResponseType.class,
    GenerateDMTokenResponseType.class,
    DeleteDeviceApplicationResponseType.class,
    GetSEMobileSubscriptionIdentifierResponseType.class,
    GetDeviceCapabilityProfileIdResponseType.class,
    BeginConversationResponseType.class,
    EnrollSSDOwnerCertificateResponseType.class,
    VerifyDMReceiptResponseType.class,
    LoadSCWSServicePortalResponseType.class,
    UnbindDeviceApplicationToSEApplicationResponseType.class,
    DeleteSCWSServicePortalResponseType.class,
    EndConversationResponseType.class,
    GetSECapabilityProfileIdResponseType.class,
    GetCAInformationResponseType.class,
    SendScriptResponseType.class,
    CheckMobileSubscriptionEligibilityResponseType.class,
    SECommandsGenerationAndRemoteExecutionResponseType.class,
    GetApplicationOrELFStatusResponseType.class,
    BindDeviceApplicationToSEApplicationResponseType.class
})
public class BasicResponseType {

    @XmlElement(name = "ProcessingStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processingStart;
    @XmlElement(name = "ProcessingEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processingEnd;
    @XmlElement(name = "AcceptableValidityPeriod")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger acceptableValidityPeriod;
    @XmlElement(name = "FunctionExecutionStatus", required = true)
    protected ExecutionStatusType functionExecutionStatus;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsType> extensions;

    /**
     * Gets the value of the processingStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessingStart() {
        return processingStart;
    }

    /**
     * Sets the value of the processingStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessingStart(XMLGregorianCalendar value) {
        this.processingStart = value;
    }

    /**
     * Gets the value of the processingEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessingEnd() {
        return processingEnd;
    }

    /**
     * Sets the value of the processingEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessingEnd(XMLGregorianCalendar value) {
        this.processingEnd = value;
    }

    /**
     * Gets the value of the acceptableValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcceptableValidityPeriod() {
        return acceptableValidityPeriod;
    }

    /**
     * Sets the value of the acceptableValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcceptableValidityPeriod(BigInteger value) {
        this.acceptableValidityPeriod = value;
    }

    /**
     * Gets the value of the functionExecutionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionStatusType }
     *     
     */
    public ExecutionStatusType getFunctionExecutionStatus() {
        return functionExecutionStatus;
    }

    /**
     * Sets the value of the functionExecutionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionStatusType }
     *     
     */
    public void setFunctionExecutionStatus(ExecutionStatusType value) {
        this.functionExecutionStatus = value;
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
