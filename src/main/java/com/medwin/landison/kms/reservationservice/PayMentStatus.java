
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PayMentStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PayMentStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAID"/&gt;
 *     &lt;enumeration value="CANCEL"/&gt;
 *     &lt;enumeration value="UNPAID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayMentStatus")
@XmlEnum
public enum PayMentStatus {

    PAID,
    CANCEL,
    UNPAID;

    public String value() {
        return name();
    }

    public static PayMentStatus fromValue(String v) {
        return valueOf(v);
    }

}
