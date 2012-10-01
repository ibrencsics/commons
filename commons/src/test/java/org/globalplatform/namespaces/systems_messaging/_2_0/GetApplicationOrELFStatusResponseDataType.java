
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the GetApplicationOrELFStatusRequest message, in case or successful processing of the function
 * 
 * <p>Java class for GetApplicationOrELFStatusResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApplicationOrELFStatusResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ComponentStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApplicationOrELFStatusResponseDataType", propOrder = {
    "componentStatus"
})
public class GetApplicationOrELFStatusResponseDataType {

    @XmlElement(name = "ComponentStatus")
    protected List<ComponentStatusType> componentStatus;

    /**
     * Gets the value of the componentStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentStatusType }
     * 
     * 
     */
    public List<ComponentStatusType> getComponentStatus() {
        if (componentStatus == null) {
            componentStatus = new ArrayList<ComponentStatusType>();
        }
        return this.componentStatus;
    }

}
