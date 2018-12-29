
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PartyAction的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PartyAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SELECT"/&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="CHANGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyAction")
@XmlEnum
public enum PartyAction {

    SELECT,
    ADD,
    CHANGE;

    public String value() {
        return name();
    }

    public static PartyAction fromValue(String v) {
        return valueOf(v);
    }

}
