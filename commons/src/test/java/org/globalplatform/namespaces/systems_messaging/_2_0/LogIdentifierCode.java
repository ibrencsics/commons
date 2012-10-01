
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CardConfigurationLog" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ApplicationLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Identifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardConfigurationLog",
    "applicationLog"
})
@XmlRootElement(name = "LogIdentifierCode")
public class LogIdentifierCode {

    @XmlElement(name = "CardConfigurationLog")
    protected CardConfigurationLog cardConfigurationLog;
    @XmlElement(name = "ApplicationLog")
    protected List<ApplicationLog> applicationLog;
    @XmlAttribute(name = "Identifier", required = true)
    protected String identifier;

    /**
     * Updated for version 2.0.0: element is made optional as it is:
     * - Not used for mobile-NFC service management
     * - But mandatory for other use cases
     * 
     * @return
     *     possible object is
     *     {@link CardConfigurationLog }
     *     
     */
    public CardConfigurationLog getCardConfigurationLog() {
        return cardConfigurationLog;
    }

    /**
     * Sets the value of the cardConfigurationLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardConfigurationLog }
     *     
     */
    public void setCardConfigurationLog(CardConfigurationLog value) {
        this.cardConfigurationLog = value;
    }

    /**
     * Gets the value of the applicationLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationLog }
     * 
     * 
     */
    public List<ApplicationLog> getApplicationLog() {
        if (applicationLog == null) {
            applicationLog = new ArrayList<ApplicationLog>();
        }
        return this.applicationLog;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
