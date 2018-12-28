
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CancelUseCouponType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CancelUseCouponType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ExchangeId"/&gt;
 *     &lt;enumeration value="SerialNumber"/&gt;
 *     &lt;enumeration value="Amount"/&gt;
 *     &lt;enumeration value="Percent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelUseCouponType")
@XmlEnum
public enum CancelUseCouponType {

    @XmlEnumValue("ExchangeId")
    EXCHANGE_ID("ExchangeId"),
    @XmlEnumValue("SerialNumber")
    SERIAL_NUMBER("SerialNumber"),
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("Percent")
    PERCENT("Percent");
    private final String value;

    CancelUseCouponType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelUseCouponType fromValue(String v) {
        for (CancelUseCouponType c: CancelUseCouponType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
