
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CardConfiguration"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ApplicationData" maxOccurs="unbounded" minOccurs="0"/>
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
    "cardConfiguration",
    "applicationData"
})
@XmlRootElement(name = "ModuleIdentifierCode")
public class ModuleIdentifierCode {

    @XmlElement(name = "CardConfiguration", required = true)
    protected CardConfiguration cardConfiguration;
    @XmlElement(name = "ApplicationData")
    protected List<ApplicationData> applicationData;
    @XmlAttribute(name = "Identifier", required = true)
    protected String identifier;

    /**
     * Gets the value of the cardConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link CardConfiguration }
     *     
     */
    public CardConfiguration getCardConfiguration() {
        return cardConfiguration;
    }

    /**
     * Sets the value of the cardConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardConfiguration }
     *     
     */
    public void setCardConfiguration(CardConfiguration value) {
        this.cardConfiguration = value;
    }

    /**
     * Gets the value of the applicationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationData }
     * 
     * 
     */
    public List<ApplicationData> getApplicationData() {
        if (applicationData == null) {
            applicationData = new ArrayList<ApplicationData>();
        }
        return this.applicationData;
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
