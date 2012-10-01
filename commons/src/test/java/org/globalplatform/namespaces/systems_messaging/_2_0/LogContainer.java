
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}LogIdentifierCode"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ModuleLog" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeliveryModuleLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "logIdentifierCodeAndModuleLogAndDeliveryModuleLog"
})
@XmlRootElement(name = "LogContainer")
public class LogContainer {

    @XmlElements({
        @XmlElement(name = "LogIdentifierCode", required = true, type = LogIdentifierCode.class),
        @XmlElement(name = "ModuleLog", required = true, type = ModuleLog.class),
        @XmlElement(name = "DeliveryModuleLog", required = true, type = DeliveryModuleLog.class)
    })
    protected List<Object> logIdentifierCodeAndModuleLogAndDeliveryModuleLog;

    /**
     * Gets the value of the logIdentifierCodeAndModuleLogAndDeliveryModuleLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logIdentifierCodeAndModuleLogAndDeliveryModuleLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogIdentifierCodeAndModuleLogAndDeliveryModuleLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogIdentifierCode }
     * {@link ModuleLog }
     * {@link DeliveryModuleLog }
     * 
     * 
     */
    public List<Object> getLogIdentifierCodeAndModuleLogAndDeliveryModuleLog() {
        if (logIdentifierCodeAndModuleLogAndDeliveryModuleLog == null) {
            logIdentifierCodeAndModuleLogAndDeliveryModuleLog = new ArrayList<Object>();
        }
        return this.logIdentifierCodeAndModuleLogAndDeliveryModuleLog;
    }

}
