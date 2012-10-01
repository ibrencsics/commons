
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates whether the execution of a processing has been completed correctly or not and provides information to give details on the processing result (status code, status data, status message)
 * 
 * <p>Java class for ExecutionStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutionStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}StatusType"/>
 *         &lt;element name="StatusCodeData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}StatusCodeDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionStatusType", propOrder = {
    "status",
    "statusCodeData"
})
public class ExecutionStatusType {

    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "StatusCodeData")
    protected StatusCodeDataType statusCodeData;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeDataType }
     *     
     */
    public StatusCodeDataType getStatusCodeData() {
        return statusCodeData;
    }

    /**
     * Sets the value of the statusCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeDataType }
     *     
     */
    public void setStatusCodeData(StatusCodeDataType value) {
        this.statusCodeData = value;
    }

}
