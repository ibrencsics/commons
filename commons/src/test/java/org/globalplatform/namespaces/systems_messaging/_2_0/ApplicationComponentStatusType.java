
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This complex structure contains the information about an audited Application.
 * 
 * <p>Java class for Application_ComponentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_ComponentStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ComponentStatusType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationLifeCycle" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEApplicationLifeCycleType" maxOccurs="unbounded"/>
 *         &lt;element name="ApplicationSpecificBits" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_ComponentStatusType", propOrder = {
    "applicationLifeCycle",
    "applicationSpecificBits"
})
public class ApplicationComponentStatusType
    extends ComponentStatusType
{

    @XmlElement(name = "ApplicationLifeCycle", required = true)
    protected List<SEApplicationLifeCycleType> applicationLifeCycle;
    @XmlElement(name = "ApplicationSpecificBits")
    protected Byte applicationSpecificBits;

    /**
     * Gets the value of the applicationLifeCycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationLifeCycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationLifeCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEApplicationLifeCycleType }
     * 
     * 
     */
    public List<SEApplicationLifeCycleType> getApplicationLifeCycle() {
        if (applicationLifeCycle == null) {
            applicationLifeCycle = new ArrayList<SEApplicationLifeCycleType>();
        }
        return this.applicationLifeCycle;
    }

    /**
     * Gets the value of the applicationSpecificBits property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getApplicationSpecificBits() {
        return applicationSpecificBits;
    }

    /**
     * Sets the value of the applicationSpecificBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setApplicationSpecificBits(Byte value) {
        this.applicationSpecificBits = value;
    }

}
