
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}LogIdentifierCode"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BatchID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BatchID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "logIdentifierCode"
})
@XmlRootElement(name = "CardAuditTrail")
public class CardAuditTrail {

    @XmlElement(name = "LogIdentifierCode", required = true)
    protected LogIdentifierCode logIdentifierCode;
    @XmlAttribute(name = "BatchID")
    protected String batchID;

    /**
     * Gets the value of the logIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link LogIdentifierCode }
     *     
     */
    public LogIdentifierCode getLogIdentifierCode() {
        return logIdentifierCode;
    }

    /**
     * Sets the value of the logIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogIdentifierCode }
     *     
     */
    public void setLogIdentifierCode(LogIdentifierCode value) {
        this.logIdentifierCode = value;
    }

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchID(String value) {
        this.batchID = value;
    }

}
