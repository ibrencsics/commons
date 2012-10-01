
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This SE Command requests the loading of an Executable Load File.
 * 
 * <p>Java class for LoadELFCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadELFCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandType">
 *       &lt;sequence>
 *         &lt;element name="ExecutableLoadFileAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType"/>
 *         &lt;element name="ByteCode" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="ByteCodeEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParametersProfileIdentifier" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="DAPBlock" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DAPBlockType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSDAidForExtradition" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadELFCommandType", propOrder = {
    "executableLoadFileAID",
    "byteCode",
    "byteCodeEncrypted",
    "parametersProfileIdentifier",
    "dapBlock",
    "ssdAidForExtradition"
})
public class LoadELFCommandType
    extends SECommandType
{

    @XmlElement(name = "ExecutableLoadFileAID", required = true)
    protected String executableLoadFileAID;
    @XmlElement(name = "ByteCode", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] byteCode;
    @XmlElement(name = "ByteCodeEncrypted")
    protected Boolean byteCodeEncrypted;
    @XmlElement(name = "ParametersProfileIdentifier")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger parametersProfileIdentifier;
    @XmlElement(name = "DAPBlock")
    protected List<DAPBlockType> dapBlock;
    @XmlElement(name = "SSDAidForExtradition")
    protected String ssdAidForExtradition;

    /**
     * Gets the value of the executableLoadFileAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutableLoadFileAID() {
        return executableLoadFileAID;
    }

    /**
     * Sets the value of the executableLoadFileAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutableLoadFileAID(String value) {
        this.executableLoadFileAID = value;
    }

    /**
     * Gets the value of the byteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getByteCode() {
        return byteCode;
    }

    /**
     * Sets the value of the byteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByteCode(byte[] value) {
        this.byteCode = value;
    }

    /**
     * Gets the value of the byteCodeEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByteCodeEncrypted() {
        return byteCodeEncrypted;
    }

    /**
     * Sets the value of the byteCodeEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByteCodeEncrypted(Boolean value) {
        this.byteCodeEncrypted = value;
    }

    /**
     * Gets the value of the parametersProfileIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParametersProfileIdentifier() {
        return parametersProfileIdentifier;
    }

    /**
     * Sets the value of the parametersProfileIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParametersProfileIdentifier(BigInteger value) {
        this.parametersProfileIdentifier = value;
    }

    /**
     * Gets the value of the dapBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dapBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAPBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAPBlockType }
     * 
     * 
     */
    public List<DAPBlockType> getDAPBlock() {
        if (dapBlock == null) {
            dapBlock = new ArrayList<DAPBlockType>();
        }
        return this.dapBlock;
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
