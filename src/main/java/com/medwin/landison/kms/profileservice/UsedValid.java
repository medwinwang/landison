
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UsedValid的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="UsedValid"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIXED"/&gt;
 *     &lt;enumeration value="DELAY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsedValid")
@XmlEnum
public enum UsedValid {

    FIXED,
    DELAY;

    public String value() {
        return name();
    }

    public static UsedValid fromValue(String v) {
        return valueOf(v);
    }

}
