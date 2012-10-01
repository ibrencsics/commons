
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the GenerateDMTokenRequest message, in case or successful processing of the function
 * 
 * <p>Java class for GenerateDMTokenResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateDMTokenResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdatedCCMCommand" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CCMCommandType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateDMTokenResponseDataType", propOrder = {
    "updatedCCMCommand"
})
public class GenerateDMTokenResponseDataType {

    @XmlElement(name = "UpdatedCCMCommand")
    protected List<CCMCommandType> updatedCCMCommand;

    /**
     * Gets the value of the updatedCCMCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatedCCMCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatedCCMCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCMCommandType }
     * 
     * 
     */
    public List<CCMCommandType> getUpdatedCCMCommand() {
        if (updatedCCMCommand == null) {
            updatedCCMCommand = new ArrayList<CCMCommandType>();
        }
        return this.updatedCCMCommand;
    }

}
