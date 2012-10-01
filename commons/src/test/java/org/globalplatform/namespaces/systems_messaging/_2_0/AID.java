
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AID" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="Order" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="TargeState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReachedState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AID")
public class AID {

    @XmlAttribute(name = "AID", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] aid;
    @XmlAttribute(name = "Order", required = true)
    protected short order;
    @XmlAttribute(name = "TargeState")
    protected String targeState;
    @XmlAttribute(name = "ReachedState")
    protected String reachedState;

    /**
     * Gets the value of the aid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAID() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAID(byte[] value) {
        this.aid = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public short getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(short value) {
        this.order = value;
    }

    /**
     * Gets the value of the targeState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargeState() {
        return targeState;
    }

    /**
     * Sets the value of the targeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargeState(String value) {
        this.targeState = value;
    }

    /**
     * Gets the value of the reachedState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReachedState() {
        return reachedState;
    }

    /**
     * Sets the value of the reachedState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReachedState(String value) {
        this.reachedState = value;
    }

}
