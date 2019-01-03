
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BarType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BarType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="BAR"/&gt;
 *     &lt;enumeration value="DBAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BarType")
@XmlEnum
public enum BarType {

    NONE,
    BAR,
    DBAR;

    public String value() {
        return name();
    }

    public static BarType fromValue(String v) {
        return valueOf(v);
    }

}
