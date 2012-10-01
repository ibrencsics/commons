
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A SD keyset
 * 
 * <p>Java class for KeySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeySetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SDKeyType" maxOccurs="unbounded"/>
 *         &lt;element name="TransportKeyIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeySetType", propOrder = {
    "key",
    "transportKeyIndex"
})
public class KeySetType {

    @XmlElement(name = "Key", required = true)
    protected List<SDKeyType> key;
    @XmlElement(name = "TransportKeyIndex", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger transportKeyIndex;

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SDKeyType }
     * 
     * 
     */
    public List<SDKeyType> getKey() {
        if (key == null) {
            key = new ArrayList<SDKeyType>();
        }
        return this.key;
    }

    /**
     * Gets the value of the transportKeyIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransportKeyIndex() {
        return transportKeyIndex;
    }

    /**
     * Sets the value of the transportKeyIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransportKeyIndex(BigInteger value) {
        this.transportKeyIndex = value;
    }

}
