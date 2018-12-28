
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CaptchaType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CaptchaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Mobile"/&gt;
 *     &lt;enumeration value="OnlyEmail"/&gt;
 *     &lt;enumeration value="OnlyMobile"/&gt;
 *     &lt;enumeration value="LastNameAndEmail"/&gt;
 *     &lt;enumeration value="LastNameAndMobile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaptchaType")
@XmlEnum
public enum CaptchaType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("OnlyEmail")
    ONLY_EMAIL("OnlyEmail"),
    @XmlEnumValue("OnlyMobile")
    ONLY_MOBILE("OnlyMobile"),
    @XmlEnumValue("LastNameAndEmail")
    LAST_NAME_AND_EMAIL("LastNameAndEmail"),
    @XmlEnumValue("LastNameAndMobile")
    LAST_NAME_AND_MOBILE("LastNameAndMobile");
    private final String value;

    CaptchaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaptchaType fromValue(String v) {
        for (CaptchaType c: CaptchaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
