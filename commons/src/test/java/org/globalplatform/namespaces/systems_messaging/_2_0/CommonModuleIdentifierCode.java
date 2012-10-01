
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CardCommonConfiguration" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ApplicationCommonData" maxOccurs="unbounded" minOccurs="0"/>
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
    "cardCommonConfiguration",
    "applicationCommonData"
})
@XmlRootElement(name = "CommonModuleIdentifierCode")
public class CommonModuleIdentifierCode {

    @XmlElement(name = "CardCommonConfiguration")
    protected CardCommonConfiguration cardCommonConfiguration;
    @XmlElement(name = "ApplicationCommonData")
    protected List<ApplicationCommonData> applicationCommonData;
    @XmlAttribute(name = "Identifier", required = true)
    protected String identifier;

    /**
     * Gets the value of the cardCommonConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link CardCommonConfiguration }
     *     
     */
    public CardCommonConfiguration getCardCommonConfiguration() {
        return cardCommonConfiguration;
    }

    /**
     * Sets the value of the cardCommonConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardCommonConfiguration }
     *     
     */
    public void setCardCommonConfiguration(CardCommonConfiguration value) {
        this.cardCommonConfiguration = value;
    }

    /**
     * Gets the value of the applicationCommonData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationCommonData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationCommonData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationCommonData }
     * 
     * 
     */
    public List<ApplicationCommonData> getApplicationCommonData() {
        if (applicationCommonData == null) {
            applicationCommonData = new ArrayList<ApplicationCommonData>();
        }
        return this.applicationCommonData;
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
