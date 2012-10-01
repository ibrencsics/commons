
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="Importable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Exportable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Attribute")
public class Attribute {

    @XmlAttribute(name = "Importable")
    protected Boolean importable;
    @XmlAttribute(name = "Exportable")
    protected Boolean exportable;
    @XmlAttribute(name = "Sensitive")
    protected Boolean sensitive;

    /**
     * Gets the value of the importable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportable() {
        return importable;
    }

    /**
     * Sets the value of the importable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportable(Boolean value) {
        this.importable = value;
    }

    /**
     * Gets the value of the exportable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportable() {
        return exportable;
    }

    /**
     * Sets the value of the exportable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportable(Boolean value) {
        this.exportable = value;
    }

    /**
     * Gets the value of the sensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSensitive() {
        return sensitive;
    }

    /**
     * Sets the value of the sensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSensitive(Boolean value) {
        this.sensitive = value;
    }

}
