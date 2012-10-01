
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig.SignatureType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *           &lt;element name="RequestingEntity" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}EntityID" minOccurs="0"/>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Entity" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="TargetEntity" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}EntityID" minOccurs="0"/>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Entity" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MessageContext" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="TransactionID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Source" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}OID" />
 *       &lt;attribute name="Destination" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}OID" />
 *       &lt;attribute name="Type" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}messageType" />
 *       &lt;attribute name="MessageVersion" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}version" />
 *       &lt;attribute name="ErrataVersion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signatureOrRequestingEntityOrTargetEntity"
})
@XmlRootElement(name = "GPHeader")
public class GPHeader {

    @XmlElements({
        @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", type = SignatureType.class),
        @XmlElement(name = "RequestingEntity", type = GPHeader.RequestingEntity.class),
        @XmlElement(name = "TargetEntity", type = GPHeader.TargetEntity.class),
        @XmlElement(name = "MessageContext", type = MessageContext.class)
    })
    protected List<Object> signatureOrRequestingEntityOrTargetEntity;
    @XmlAttribute(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlAttribute(name = "Source", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] source;
    @XmlAttribute(name = "Destination", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] destination;
    @XmlAttribute(name = "Type", required = true)
    protected MessageType type;
    @XmlAttribute(name = "MessageVersion", required = true)
    protected String messageVersion;
    @XmlAttribute(name = "ErrataVersion")
    protected BigInteger errataVersion;

    /**
     * Gets the value of the signatureOrRequestingEntityOrTargetEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureOrRequestingEntityOrTargetEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureOrRequestingEntityOrTargetEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureType }
     * {@link GPHeader.RequestingEntity }
     * {@link GPHeader.TargetEntity }
     * {@link MessageContext }
     * 
     * 
     */
    public List<Object> getSignatureOrRequestingEntityOrTargetEntity() {
        if (signatureOrRequestingEntityOrTargetEntity == null) {
            signatureOrRequestingEntityOrTargetEntity = new ArrayList<Object>();
        }
        return this.signatureOrRequestingEntityOrTargetEntity;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(byte[] value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(byte[] value) {
        this.destination = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setType(MessageType value) {
        this.type = value;
    }

    /**
     * Gets the value of the messageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * Sets the value of the messageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageVersion(String value) {
        this.messageVersion = value;
    }

    /**
     * Gets the value of the errataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrataVersion() {
        return errataVersion;
    }

    /**
     * Sets the value of the errataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrataVersion(BigInteger value) {
        this.errataVersion = value;
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
     *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}EntityID" minOccurs="0"/>
     *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Entity" minOccurs="0"/>
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
        "entityID",
        "entity"
    })
    public static class RequestingEntity {

        @XmlElement(name = "EntityID")
        protected EntityID entityID;
        @XmlElement(name = "Entity")
        protected Entity entity;

        /**
         * Gets the value of the entityID property.
         * 
         * @return
         *     possible object is
         *     {@link EntityID }
         *     
         */
        public EntityID getEntityID() {
            return entityID;
        }

        /**
         * Sets the value of the entityID property.
         * 
         * @param value
         *     allowed object is
         *     {@link EntityID }
         *     
         */
        public void setEntityID(EntityID value) {
            this.entityID = value;
        }

        /**
         * Gets the value of the entity property.
         * 
         * @return
         *     possible object is
         *     {@link Entity }
         *     
         */
        public Entity getEntity() {
            return entity;
        }

        /**
         * Sets the value of the entity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Entity }
         *     
         */
        public void setEntity(Entity value) {
            this.entity = value;
        }

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
     *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}EntityID" minOccurs="0"/>
     *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Entity" minOccurs="0"/>
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
        "entityID",
        "entity"
    })
    public static class TargetEntity {

        @XmlElement(name = "EntityID")
        protected EntityID entityID;
        @XmlElement(name = "Entity")
        protected Entity entity;

        /**
         * Gets the value of the entityID property.
         * 
         * @return
         *     possible object is
         *     {@link EntityID }
         *     
         */
        public EntityID getEntityID() {
            return entityID;
        }

        /**
         * Sets the value of the entityID property.
         * 
         * @param value
         *     allowed object is
         *     {@link EntityID }
         *     
         */
        public void setEntityID(EntityID value) {
            this.entityID = value;
        }

        /**
         * Gets the value of the entity property.
         * 
         * @return
         *     possible object is
         *     {@link Entity }
         *     
         */
        public Entity getEntity() {
            return entity;
        }

        /**
         * Sets the value of the entity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Entity }
         *     
         */
        public void setEntity(Entity value) {
            this.entity = value;
        }

    }

}
