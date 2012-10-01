
package org.globalplatform.namespaces.systems_profiles._1_1;

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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Description" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}KeyTypes"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Algorithm" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="arrayElement" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="arrayIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "keyTypes",
    "algorithm"
})
@XmlRootElement(name = "CryptoEngine")
public class CryptoEngine {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "KeyTypes", required = true)
    protected KeyTypes keyTypes;
    @XmlElement(name = "Algorithm", required = true)
    protected List<Algorithm> algorithm;
    @XmlAttribute(name = "arrayElement", required = true)
    protected String arrayElement;
    @XmlAttribute(name = "arrayIndex", required = true)
    protected String arrayIndex;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the keyTypes property.
     * 
     * @return
     *     possible object is
     *     {@link KeyTypes }
     *     
     */
    public KeyTypes getKeyTypes() {
        return keyTypes;
    }

    /**
     * Sets the value of the keyTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTypes }
     *     
     */
    public void setKeyTypes(KeyTypes value) {
        this.keyTypes = value;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm }
     * 
     * 
     */
    public List<Algorithm> getAlgorithm() {
        if (algorithm == null) {
            algorithm = new ArrayList<Algorithm>();
        }
        return this.algorithm;
    }

    /**
     * Gets the value of the arrayElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrayElement() {
        return arrayElement;
    }

    /**
     * Sets the value of the arrayElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrayElement(String value) {
        this.arrayElement = value;
    }

    /**
     * Gets the value of the arrayIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrayIndex() {
        return arrayIndex;
    }

    /**
     * Sets the value of the arrayIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrayIndex(String value) {
        this.arrayIndex = value;
    }

}
