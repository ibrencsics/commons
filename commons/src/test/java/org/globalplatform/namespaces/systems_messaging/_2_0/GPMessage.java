
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}GPHeader"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}GPBody"/>
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
    "gpHeader",
    "gpBody"
})
@XmlRootElement(name = "GPMessage")
public class GPMessage {

    @XmlElement(name = "GPHeader", required = true)
    protected GPHeader gpHeader;
    @XmlElement(name = "GPBody", required = true)
    protected GPBody gpBody;

    /**
     * Gets the value of the gpHeader property.
     * 
     * @return
     *     possible object is
     *     {@link GPHeader }
     *     
     */
    public GPHeader getGPHeader() {
        return gpHeader;
    }

    /**
     * Sets the value of the gpHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPHeader }
     *     
     */
    public void setGPHeader(GPHeader value) {
        this.gpHeader = value;
    }

    /**
     * Gets the value of the gpBody property.
     * 
     * @return
     *     possible object is
     *     {@link GPBody }
     *     
     */
    public GPBody getGPBody() {
        return gpBody;
    }

    /**
     * Sets the value of the gpBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPBody }
     *     
     */
    public void setGPBody(GPBody value) {
        this.gpBody = value;
    }

}
