
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DIAD_SecureElementId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_SecureElementId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GP_SEIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CardUniqueData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CardUniqueDataType" minOccurs="0"/>
 *                   &lt;element name="ICCID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ICCIDType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ATR" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ATR" minOccurs="0"/>
 *         &lt;element name="CPLC" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_CPLC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIAD_SecureElementId", propOrder = {
    "gpseIds",
    "atr",
    "cplc"
})
public class DIADSecureElementId {

    @XmlElement(name = "GP_SEIds")
    protected DIADSecureElementId.GPSEIds gpseIds;
    @XmlElement(name = "ATR", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] atr;
    @XmlElement(name = "CPLC", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] cplc;

    /**
     * Gets the value of the gpseIds property.
     * 
     * @return
     *     possible object is
     *     {@link DIADSecureElementId.GPSEIds }
     *     
     */
    public DIADSecureElementId.GPSEIds getGPSEIds() {
        return gpseIds;
    }

    /**
     * Sets the value of the gpseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADSecureElementId.GPSEIds }
     *     
     */
    public void setGPSEIds(DIADSecureElementId.GPSEIds value) {
        this.gpseIds = value;
    }

    /**
     * Gets the value of the atr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getATR() {
        return atr;
    }

    /**
     * Sets the value of the atr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATR(byte[] value) {
        this.atr = value;
    }

    /**
     * Gets the value of the cplc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCPLC() {
        return cplc;
    }

    /**
     * Sets the value of the cplc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPLC(byte[] value) {
        this.cplc = value;
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
     *         &lt;element name="CardUniqueData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CardUniqueDataType" minOccurs="0"/>
     *         &lt;element name="ICCID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ICCIDType" minOccurs="0"/>
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
        "cardUniqueData",
        "iccid"
    })
    public static class GPSEIds {

        @XmlElement(name = "CardUniqueData")
        protected String cardUniqueData;
        @XmlElement(name = "ICCID")
        protected String iccid;

        /**
         * Gets the value of the cardUniqueData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardUniqueData() {
            return cardUniqueData;
        }

        /**
         * Sets the value of the cardUniqueData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardUniqueData(String value) {
            this.cardUniqueData = value;
        }

        /**
         * Gets the value of the iccid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getICCID() {
            return iccid;
        }

        /**
         * Sets the value of the iccid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setICCID(String value) {
            this.iccid = value;
        }

    }

}
