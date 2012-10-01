
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersoDataSimple.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersoDataSimple">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCT"/>
 *     &lt;enumeration value="Image1"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="Text1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersoDataSimple")
@XmlEnum
public enum PersoDataSimple {

    ACCT("ACCT"),
    @XmlEnumValue("Image1")
    IMAGE_1("Image1"),
    MS("MS"),
    @XmlEnumValue("Text1")
    TEXT_1("Text1");
    private final String value;

    PersoDataSimple(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersoDataSimple fromValue(String v) {
        for (PersoDataSimple c: PersoDataSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
