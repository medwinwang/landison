
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResvStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ResvStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="CheckIn"/&gt;
 *     &lt;enumeration value="Watting"/&gt;
 *     &lt;enumeration value="CheckOut"/&gt;
 *     &lt;enumeration value="NoShow"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResvStatus")
@XmlEnum
public enum ResvStatus {

    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("CheckIn")
    CHECK_IN("CheckIn"),
    @XmlEnumValue("Watting")
    WATTING("Watting"),
    @XmlEnumValue("CheckOut")
    CHECK_OUT("CheckOut"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    ResvStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResvStatus fromValue(String v) {
        for (ResvStatus c: ResvStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
