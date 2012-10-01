
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This complex structure contains the information about an audited Security Domain
 * 
 * <p>Java class for SD_ComponentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SD_ComponentStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ComponentStatusType">
 *       &lt;sequence>
 *         &lt;element name="SDLifeCycle" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SDLifeCycleType" maxOccurs="unbounded"/>
 *         &lt;element name="DescendantComponent" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ComponentStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SD_ComponentStatusType", propOrder = {
    "sdLifeCycle",
    "descendantComponent"
})
public class SDComponentStatusType
    extends ComponentStatusType
{

    @XmlElement(name = "SDLifeCycle", required = true)
    protected List<SDLifeCycleType> sdLifeCycle;
    @XmlElement(name = "DescendantComponent")
    protected List<ComponentStatusType> descendantComponent;

    /**
     * Gets the value of the sdLifeCycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdLifeCycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDLifeCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SDLifeCycleType }
     * 
     * 
     */
    public List<SDLifeCycleType> getSDLifeCycle() {
        if (sdLifeCycle == null) {
            sdLifeCycle = new ArrayList<SDLifeCycleType>();
        }
        return this.sdLifeCycle;
    }

    /**
     * Gets the value of the descendantComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descendantComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescendantComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentStatusType }
     * 
     * 
     */
    public List<ComponentStatusType> getDescendantComponent() {
        if (descendantComponent == null) {
            descendantComponent = new ArrayList<ComponentStatusType>();
        }
        return this.descendantComponent;
    }

}
