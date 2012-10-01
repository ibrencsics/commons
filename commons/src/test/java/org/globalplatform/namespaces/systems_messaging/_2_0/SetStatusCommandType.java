
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This SE Command requests a change of the Application Life Cycle State (either a simple Application or a Supplementary Security Domain).
 * 
 * <p>Java class for SetStatusCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetStatusCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType"/>
 *         &lt;element name="LockControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetStatusCommandType", propOrder = {
    "applicationAID",
    "lockControl"
})
public class SetStatusCommandType
    extends SECommandType
{

    @XmlElement(name = "ApplicationAID", required = true)
    protected String applicationAID;
    @XmlElement(name = "LockControl")
    protected boolean lockControl;

    /**
     * Gets the value of the applicationAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationAID() {
        return applicationAID;
    }

    /**
     * Sets the value of the applicationAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationAID(String value) {
        this.applicationAID = value;
    }

    /**
     * Gets the value of the lockControl property.
     * 
     */
    public boolean isLockControl() {
        return lockControl;
    }

    /**
     * Sets the value of the lockControl property.
     * 
     */
    public void setLockControl(boolean value) {
        this.lockControl = value;
    }

}
