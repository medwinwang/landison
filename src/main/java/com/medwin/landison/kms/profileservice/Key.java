
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Key的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Key"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mobile"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="IDNo"/&gt;
 *     &lt;enumeration value="MobileName"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Key")
@XmlEnum
public enum Key {

    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("IDNo")
    ID_NO("IDNo"),
    @XmlEnumValue("MobileName")
    MOBILE_NAME("MobileName");
    private final String value;

    Key(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Key fromValue(String v) {
        for (Key c: Key.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
