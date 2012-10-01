
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This complex structure contains the information about an audited Executable Load File
 * 
 * <p>Java class for ELF_ComponentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ELF_ComponentStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ComponentStatusType">
 *       &lt;sequence>
 *         &lt;element name="ELFLifeCycle" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ELFLifeCycleType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELF_ComponentStatusType", propOrder = {
    "elfLifeCycle"
})
public class ELFComponentStatusType
    extends ComponentStatusType
{

    @XmlElement(name = "ELFLifeCycle", required = true)
    protected List<ELFLifeCycleType> elfLifeCycle;

    /**
     * Gets the value of the elfLifeCycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elfLifeCycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getELFLifeCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ELFLifeCycleType }
     * 
     * 
     */
    public List<ELFLifeCycleType> getELFLifeCycle() {
        if (elfLifeCycle == null) {
            elfLifeCycle = new ArrayList<ELFLifeCycleType>();
        }
        return this.elfLifeCycle;
    }

}
