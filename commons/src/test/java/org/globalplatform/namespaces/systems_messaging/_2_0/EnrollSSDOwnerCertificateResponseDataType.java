
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data of the response to the EnrollSSDOwnerCertificateRequest message, in case or successful processing of the function
 * 
 * <p>Java class for EnrollSSDOwnerCertificateResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollSSDOwnerCertificateResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSDOwnerCertificate" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollSSDOwnerCertificateResponseDataType", propOrder = {
    "ssdOwnerCertificate"
})
public class EnrollSSDOwnerCertificateResponseDataType {

    @XmlElement(name = "SSDOwnerCertificate", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ssdOwnerCertificate;

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
