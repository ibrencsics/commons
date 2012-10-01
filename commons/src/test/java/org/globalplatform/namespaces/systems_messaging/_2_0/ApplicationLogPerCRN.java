
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
 *       &lt;all>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CRN"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ApplicationLog"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ApplicationLogPerCRN")
public class ApplicationLogPerCRN {

    @XmlElement(name = "CRN", required = true)
    protected CRN crn;
    @XmlElement(name = "ApplicationLog", required = true)
    protected ApplicationLog applicationLog;

    /**
     * Gets the value of the crn property.
     * 
     * @return
     *     possible object is
     *     {@link CRN }
     *     
     */
    public CRN getCRN() {
        return crn;
    }

    /**
     * Sets the value of the crn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRN }
     *     
     */
    public void setCRN(CRN value) {
        this.crn = value;
    }

    /**
     * Gets the value of the applicationLog property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationLog }
     *     
     */
    public ApplicationLog getApplicationLog() {
        return applicationLog;
    }

    /**
     * Sets the value of the applicationLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationLog }
     *     
     */
    public void setApplicationLog(ApplicationLog value) {
        this.applicationLog = value;
    }

}
