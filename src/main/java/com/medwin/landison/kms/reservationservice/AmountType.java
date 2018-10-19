
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Amount_type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Amount_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POINTS"/&gt;
 *     &lt;enumeration value="MONEY"/&gt;
 *     &lt;enumeration value="CARDVALUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Amount_type")
@XmlEnum
public enum AmountType {

    POINTS,
    MONEY,
    CARDVALUE;

    public String value() {
        return name();
    }

    public static AmountType fromValue(String v) {
        return valueOf(v);
    }

}
