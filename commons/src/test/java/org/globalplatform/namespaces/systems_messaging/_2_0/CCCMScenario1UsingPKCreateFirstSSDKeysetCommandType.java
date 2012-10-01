
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This SE Command requests the creation of the first keyset of a Supplementary Security Domain in "CCCM Schenario 1 using PK scheme" mode.
 * 
 * <p>Java class for CCCMScenario1UsingPK_CreateFirstSSDKeysetCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCMScenario1UsingPK_CreateFirstSSDKeysetCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CreateFirstSSDKeysetCommandType">
 *       &lt;sequence>
 *         &lt;element name="SDIN" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SDINType" minOccurs="0"/>
 *         &lt;element name="SSDOwnerCertificate" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCMScenario1UsingPK_CreateFirstSSDKeysetCommandType", propOrder = {
    "sdin",
    "ssdOwnerCertificate"
})
public class CCCMScenario1UsingPKCreateFirstSSDKeysetCommandType
    extends CreateFirstSSDKeysetCommandType
{

    @XmlElement(name = "SDIN")
    protected String sdin;
    @XmlElement(name = "SSDOwnerCertificate", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ssdOwnerCertificate;

    /**
     * Gets the value of the sdin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDIN() {
        return sdin;
    }

    /**
     * Sets the value of the sdin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDIN(String value) {
        this.sdin = value;
    }

    /**
     * Gets the value of the ssdOwnerCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSSDOwnerCertificate() {
        return ssdOwnerCertificate;
    }

    /**
     * Sets the value of the ssdOwnerCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSDOwnerCertificate(byte[] value) {
        this.ssdOwnerCertificate = value;
    }

}
