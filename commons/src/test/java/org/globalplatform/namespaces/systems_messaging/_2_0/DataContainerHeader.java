
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CommonDataContainer" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DataContainer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DataGenerationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CardProductID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CardProductVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IssuerName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CardRecordCount" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PlasticStockID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RequiredProcessingDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "commonDataContainer",
    "dataContainer"
})
@XmlRootElement(name = "DataContainerHeader")
public class DataContainerHeader {

    @XmlElement(name = "CommonDataContainer")
    protected CommonDataContainer commonDataContainer;
    @XmlElement(name = "DataContainer", required = true)
    protected List<DataContainer> dataContainer;
    @XmlAttribute(name = "DataGenerationDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dataGenerationDate;
    @XmlAttribute(name = "CardProductID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cardProductID;
    @XmlAttribute(name = "CardProductVersion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cardProductVersion;
    @XmlAttribute(name = "IssuerName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issuerName;
    @XmlAttribute(name = "CardRecordCount", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cardRecordCount;
    @XmlAttribute(name = "PlasticStockID")
    @XmlSchemaType(name = "anySimpleType")
    protected String plasticStockID;
    @XmlAttribute(name = "RequiredProcessingDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String requiredProcessingDate;

    /**
     * Gets the value of the commonDataContainer property.
     * 
     * @return
     *     possible object is
     *     {@link CommonDataContainer }
     *     
     */
    public CommonDataContainer getCommonDataContainer() {
        return commonDataContainer;
    }

    /**
     * Sets the value of the commonDataContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonDataContainer }
     *     
     */
    public void setCommonDataContainer(CommonDataContainer value) {
        this.commonDataContainer = value;
    }

    /**
     * Gets the value of the dataContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataContainer }
     * 
     * 
     */
    public List<DataContainer> getDataContainer() {
        if (dataContainer == null) {
            dataContainer = new ArrayList<DataContainer>();
        }
        return this.dataContainer;
    }

    /**
     * Gets the value of the dataGenerationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataGenerationDate() {
        return dataGenerationDate;
    }

    /**
     * Sets the value of the dataGenerationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataGenerationDate(String value) {
        this.dataGenerationDate = value;
    }

    /**
     * Gets the value of the cardProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductID() {
        return cardProductID;
    }

    /**
     * Sets the value of the cardProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProductID(String value) {
        this.cardProductID = value;
    }

    /**
     * Gets the value of the cardProductVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductVersion() {
        return cardProductVersion;
    }

    /**
     * Sets the value of the cardProductVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProductVersion(String value) {
        this.cardProductVersion = value;
    }

    /**
     * Gets the value of the issuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Sets the value of the issuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

    /**
     * Gets the value of the cardRecordCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardRecordCount() {
        return cardRecordCount;
    }

    /**
     * Sets the value of the cardRecordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardRecordCount(String value) {
        this.cardRecordCount = value;
    }

    /**
     * Gets the value of the plasticStockID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticStockID() {
        return plasticStockID;
    }

    /**
     * Sets the value of the plasticStockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticStockID(String value) {
        this.plasticStockID = value;
    }

    /**
     * Gets the value of the requiredProcessingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredProcessingDate() {
        return requiredProcessingDate;
    }

    /**
     * Sets the value of the requiredProcessingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredProcessingDate(String value) {
        this.requiredProcessingDate = value;
    }

}
