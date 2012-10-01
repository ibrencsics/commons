
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This complex structure contains the information about an audited component.
 * 
 * <p>Java class for ComponentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationOrExecutableLoadFileAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentStatusType", propOrder = {
    "applicationOrExecutableLoadFileAID"
})
@XmlSeeAlso({
    ELFComponentStatusType.class,
    SDComponentStatusType.class,
    ApplicationComponentStatusType.class
})
public abstract class ComponentStatusType {

    @XmlElement(name = "ApplicationOrExecutableLoadFileAID", required = true)
    protected String applicationOrExecutableLoadFileAID;

    /**
     * Gets the value of the applicationOrExecutableLoadFileAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationOrExecutableLoadFileAID() {
        return applicationOrExecutableLoadFileAID;
    }

    /**
     * Sets the value of the applicationOrExecutableLoadFileAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationOrExecutableLoadFileAID(String value) {
        this.applicationOrExecutableLoadFileAID = value;
    }

}
