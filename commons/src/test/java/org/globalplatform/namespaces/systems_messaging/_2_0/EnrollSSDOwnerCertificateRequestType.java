
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This function enables a SSD owner to request for the enrollment of a certificate to the CA, for later confidential SSD key management. This function is based on RFC 2986, providing an ASN.1 CertificationRequest that is DER encoded.
 * 
 * <p>Java class for EnrollSSDOwnerCertificateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollSSDOwnerCertificateRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="CertificationRequest" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollSSDOwnerCertificateRequestType", propOrder = {
    "certificationRequest"
})
public class EnrollSSDOwnerCertificateRequestType
    extends BasicRequestType
{

    @XmlElement(name = "CertificationRequest", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] certificationRequest;

    /**
     * Gets the value of the certificationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCertificationRequest() {
        return certificationRequest;
    }

    /**
     * Sets the value of the certificationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationRequest(byte[] value) {
        this.certificationRequest = value;
    }

}
