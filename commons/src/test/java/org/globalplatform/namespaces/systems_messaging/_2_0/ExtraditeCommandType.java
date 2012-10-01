
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This SE Command requests the extradition of an Application or an Executable Load File to a targeted Security Domain.
 * 
 * <p>Java class for ExtraditeCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtraditeCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationOrExecutableLoadFileAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType"/>
 *         &lt;element name="SSDAidForExtradition" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraditeCommandType", propOrder = {
    "applicationOrExecutableLoadFileAID",
    "ssdAidForExtradition"
})
public class ExtraditeCommandType
    extends SECommandType
{

    @XmlElement(name = "ApplicationOrExecutableLoadFileAID", required = true)
    protected String applicationOrExecutableLoadFileAID;
    @XmlElement(name = "SSDAidForExtradition", required = true)
    protected String ssdAidForExtradition;

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

    /**
     * Gets the value of the ssdAidForExtradition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSDAidForExtradition() {
        return ssdAidForExtradition;
    }

    /**
     * Sets the value of the ssdAidForExtradition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSDAidForExtradition(String value) {
        this.ssdAidForExtradition = value;
    }

}
