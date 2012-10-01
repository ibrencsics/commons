
package org.globalplatform.namespaces.systems_profiles._1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}KeyPart" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}TransportKey" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="Type" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}keyCategory" />
 *       &lt;attribute name="SubType" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}keysubtype" />
 *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Exponent" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RecovationDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="KCVAlgorithm" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}kcvalgorithmtype" />
 *       &lt;attribute name="KCVSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Mode" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}mode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyPart",
    "transportKey"
})
@XmlRootElement(name = "KeyInfo")
public class KeyInfo {

    @XmlElement(name = "KeyPart")
    protected KeyPart keyPart;
    @XmlElement(name = "TransportKey")
    protected TransportKey transportKey;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] id;
    @XmlAttribute(name = "Type", required = true)
    protected KeyCategory type;
    @XmlAttribute(name = "SubType", required = true)
    protected Keysubtype subType;
    @XmlAttribute(name = "Size")
    protected BigInteger size;
    @XmlAttribute(name = "Exponent")
    protected BigInteger exponent;
    @XmlAttribute(name = "Owner")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] owner;
    @XmlAttribute(name = "Version")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] version;
    @XmlAttribute(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "RecovationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recovationDate;
    @XmlAttribute(name = "KCVAlgorithm")
    protected Kcvalgorithmtype kcvAlgorithm;
    @XmlAttribute(name = "KCVSize")
    protected BigInteger kcvSize;
    @XmlAttribute(name = "Mode")
    protected Mode mode;

    /**
     * Gets the value of the keyPart property.
     * 
     * @return
     *     possible object is
     *     {@link KeyPart }
     *     
     */
    public KeyPart getKeyPart() {
        return keyPart;
    }

    /**
     * Sets the value of the keyPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyPart }
     *     
     */
    public void setKeyPart(KeyPart value) {
        this.keyPart = value;
    }

    /**
     * Gets the value of the transportKey property.
     * 
     * @return
     *     possible object is
     *     {@link TransportKey }
     *     
     */
    public TransportKey getTransportKey() {
        return transportKey;
    }

    /**
     * Sets the value of the transportKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportKey }
     *     
     */
    public void setTransportKey(TransportKey value) {
        this.transportKey = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(byte[] value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link KeyCategory }
     *     
     */
    public KeyCategory getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyCategory }
     *     
     */
    public void setType(KeyCategory value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link Keysubtype }
     *     
     */
    public Keysubtype getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keysubtype }
     *     
     */
    public void setSubType(Keysubtype value) {
        this.subType = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the exponent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExponent(BigInteger value) {
        this.exponent = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(byte[] value) {
        this.owner = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(byte[] value) {
        this.version = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the recovationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecovationDate() {
        return recovationDate;
    }

    /**
     * Sets the value of the recovationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecovationDate(XMLGregorianCalendar value) {
        this.recovationDate = value;
    }

    /**
     * Gets the value of the kcvAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link Kcvalgorithmtype }
     *     
     */
    public Kcvalgorithmtype getKCVAlgorithm() {
        return kcvAlgorithm;
    }

    /**
     * Sets the value of the kcvAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kcvalgorithmtype }
     *     
     */
    public void setKCVAlgorithm(Kcvalgorithmtype value) {
        this.kcvAlgorithm = value;
    }

    /**
     * Gets the value of the kcvSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKCVSize() {
        return kcvSize;
    }

    /**
     * Sets the value of the kcvSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKCVSize(BigInteger value) {
        this.kcvSize = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Mode }
     *     
     */
    public Mode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mode }
     *     
     */
    public void setMode(Mode value) {
        this.mode = value;
    }

}
