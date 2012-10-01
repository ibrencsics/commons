
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response with installation conditions
 * 
 * <p>Java class for DIAD_NegotiationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_NegotiationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="NegotiationResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InstallEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="Reason" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="TECHNICAL INCOMPATIBILITY"/>
 *                         &lt;enumeration value="NOT ENOUGH SPACE"/>
 *                         &lt;enumeration value="DAP_NOT_SUPPORTED"/>
 *                         &lt;enumeration value="SSD_NOT_SUPORTED"/>
 *                         &lt;enumeration value="NOT_ALLOWED"/>
 *                         &lt;enumeration value="LONG_AID_ALREADY_EXISTS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AID_Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Action" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="LOAD"/>
 *                         &lt;enumeration value="INSTANTIATE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SupportedKeyExchangeMethod" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CAInfo" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_CAInfo" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIAD_NegotiationResponseType", propOrder = {
    "negotiationResponse"
})
public class DIADNegotiationResponseType
    extends BasicResponseType
{

    @XmlElement(name = "NegotiationResponse")
    protected DIADNegotiationResponseType.NegotiationResponse negotiationResponse;

    /**
     * Gets the value of the negotiationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DIADNegotiationResponseType.NegotiationResponse }
     *     
     */
    public DIADNegotiationResponseType.NegotiationResponse getNegotiationResponse() {
        return negotiationResponse;
    }

    /**
     * Sets the value of the negotiationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADNegotiationResponseType.NegotiationResponse }
     *     
     */
    public void setNegotiationResponse(DIADNegotiationResponseType.NegotiationResponse value) {
        this.negotiationResponse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="InstallEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="Reason" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="TECHNICAL INCOMPATIBILITY"/>
     *               &lt;enumeration value="NOT ENOUGH SPACE"/>
     *               &lt;enumeration value="DAP_NOT_SUPPORTED"/>
     *               &lt;enumeration value="SSD_NOT_SUPORTED"/>
     *               &lt;enumeration value="NOT_ALLOWED"/>
     *               &lt;enumeration value="LONG_AID_ALREADY_EXISTS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AID_Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Action" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="LOAD"/>
     *               &lt;enumeration value="INSTANTIATE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SupportedKeyExchangeMethod" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CAInfo" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_CAInfo" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "installEnabled",
        "reason",
        "aidSuffix",
        "action",
        "supportedKeyExchangeMethod",
        "caInfo"
    })
    public static class NegotiationResponse {

        @XmlElement(name = "InstallEnabled")
        protected boolean installEnabled;
        @XmlElement(name = "Reason")
        protected String reason;
        @XmlElement(name = "AID_Suffix")
        protected String aidSuffix;
        @XmlElement(name = "Action")
        protected String action;
        @XmlElement(name = "SupportedKeyExchangeMethod")
        protected List<Object> supportedKeyExchangeMethod;
        @XmlElement(name = "CAInfo")
        protected DIADCAInfo caInfo;

        /**
         * Gets the value of the installEnabled property.
         * 
         */
        public boolean isInstallEnabled() {
            return installEnabled;
        }

        /**
         * Sets the value of the installEnabled property.
         * 
         */
        public void setInstallEnabled(boolean value) {
            this.installEnabled = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

        /**
         * Gets the value of the aidSuffix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIDSuffix() {
            return aidSuffix;
        }

        /**
         * Sets the value of the aidSuffix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIDSuffix(String value) {
            this.aidSuffix = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

        /**
         * Gets the value of the supportedKeyExchangeMethod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supportedKeyExchangeMethod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupportedKeyExchangeMethod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getSupportedKeyExchangeMethod() {
            if (supportedKeyExchangeMethod == null) {
                supportedKeyExchangeMethod = new ArrayList<Object>();
            }
            return this.supportedKeyExchangeMethod;
        }

        /**
         * Gets the value of the caInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DIADCAInfo }
         *     
         */
        public DIADCAInfo getCAInfo() {
            return caInfo;
        }

        /**
         * Sets the value of the caInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIADCAInfo }
         *     
         */
        public void setCAInfo(DIADCAInfo value) {
            this.caInfo = value;
        }

    }

}
