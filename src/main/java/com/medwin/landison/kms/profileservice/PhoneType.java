
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PhoneType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *     &lt;enumeration value="TELEPHONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhoneType")
@XmlEnum
public enum PhoneType {

    ALL,
    MOBILE,
    TELEPHONE;

    public String value() {
        return name();
    }

    public static PhoneType fromValue(String v) {
        return valueOf(v);
    }

}
