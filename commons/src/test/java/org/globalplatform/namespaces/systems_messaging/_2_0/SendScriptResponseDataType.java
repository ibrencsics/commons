
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data of the response to the SendScriptRequest message, in case or successful processing of the function
 * 
 * <p>Java class for SendScriptResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendScriptResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseAPDU" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}APDUResponseType" maxOccurs="unbounded"/>
 *         &lt;element name="FailedAPDUIndex" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendScriptResponseDataType", propOrder = {
    "responseAPDU",
    "failedAPDUIndex"
})
public class SendScriptResponseDataType {

    @XmlElement(name = "ResponseAPDU", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected List<byte[]> responseAPDU;
    @XmlElement(name = "FailedAPDUIndex")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger failedAPDUIndex;

    /**
     * Gets the value of the responseAPDU property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseAPDU property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseAPDU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<byte[]> getResponseAPDU() {
        if (responseAPDU == null) {
            responseAPDU = new ArrayList<byte[]>();
        }
        return this.responseAPDU;
    }

    /**
     * Gets the value of the failedAPDUIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFailedAPDUIndex() {
        return failedAPDUIndex;
    }

    /**
     * Sets the value of the failedAPDUIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFailedAPDUIndex(BigInteger value) {
        this.failedAPDUIndex = value;
    }

}
