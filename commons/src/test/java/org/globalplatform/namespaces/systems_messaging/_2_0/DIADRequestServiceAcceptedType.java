
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Response with OTP
 * 
 * <p>Java class for DIAD_RequestServiceAcceptedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_RequestServiceAcceptedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TransactionId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="OK"/>
 *                         &lt;enumeration value="NEXT_ACTION"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OTP" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_OTP"/>
 *                   &lt;element name="ContextInfo" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ContextInfo"/>
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
@XmlType(name = "DIAD_RequestServiceAcceptedType", propOrder = {
    "responseData"
})
public class DIADRequestServiceAcceptedType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected DIADRequestServiceAcceptedType.ResponseData responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link DIADRequestServiceAcceptedType.ResponseData }
     *     
     */
    public DIADRequestServiceAcceptedType.ResponseData getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADRequestServiceAcceptedType.ResponseData }
     *     
     */
    public void setResponseData(DIADRequestServiceAcceptedType.ResponseData value) {
        this.responseData = value;
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
     *         &lt;element name="TransactionId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="OK"/>
     *               &lt;enumeration value="NEXT_ACTION"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OTP" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_OTP"/>
     *         &lt;element name="ContextInfo" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ContextInfo"/>
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
        "transactionId",
        "otp",
        "contextInfo"
    })
    public static class ResponseData {

        @XmlElement(name = "TransactionId", required = true)
        protected String transactionId;
        @XmlElement(name = "OTP", required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] otp;
        @XmlElement(name = "ContextInfo", required = true)
        protected DIADContextInfo contextInfo;

        /**
         * Gets the value of the transactionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionId() {
            return transactionId;
        }

        /**
         * Sets the value of the transactionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionId(String value) {
            this.transactionId = value;
        }

        /**
         * Gets the value of the otp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getOTP() {
            return otp;
        }

        /**
         * Sets the value of the otp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTP(byte[] value) {
            this.otp = value;
        }

        /**
         * Gets the value of the contextInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DIADContextInfo }
         *     
         */
        public DIADContextInfo getContextInfo() {
            return contextInfo;
        }

        /**
         * Sets the value of the contextInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIADContextInfo }
         *     
         */
        public void setContextInfo(DIADContextInfo value) {
            this.contextInfo = value;
        }

    }

}
