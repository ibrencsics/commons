
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Confirm the installation conditions
 * 
 * <p>Java class for DIAD_NegatiationConfirmType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_NegatiationConfirmType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="NegotiationConfirm">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KeyExhangeProtocol" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
@XmlType(name = "DIAD_NegatiationConfirmType", propOrder = {
    "negotiationConfirm"
})
public class DIADNegatiationConfirmType
    extends BasicRequestType
{

    @XmlElement(name = "NegotiationConfirm", required = true)
    protected DIADNegatiationConfirmType.NegotiationConfirm negotiationConfirm;

    /**
     * Gets the value of the negotiationConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link DIADNegatiationConfirmType.NegotiationConfirm }
     *     
     */
    public DIADNegatiationConfirmType.NegotiationConfirm getNegotiationConfirm() {
        return negotiationConfirm;
    }

    /**
     * Sets the value of the negotiationConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADNegatiationConfirmType.NegotiationConfirm }
     *     
     */
    public void setNegotiationConfirm(DIADNegatiationConfirmType.NegotiationConfirm value) {
        this.negotiationConfirm = value;
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
     *         &lt;element name="KeyExhangeProtocol" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        "keyExhangeProtocol"
    })
    public static class NegotiationConfirm {

        @XmlElement(name = "KeyExhangeProtocol", required = true)
        protected Object keyExhangeProtocol;

        /**
         * Gets the value of the keyExhangeProtocol property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getKeyExhangeProtocol() {
            return keyExhangeProtocol;
        }

        /**
         * Sets the value of the keyExhangeProtocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setKeyExhangeProtocol(Object value) {
            this.keyExhangeProtocol = value;
        }

    }

}
