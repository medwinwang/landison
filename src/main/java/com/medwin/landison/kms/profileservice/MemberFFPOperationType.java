
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MemberFFPOperationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MemberFFPOperationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Modify"/&gt;
 *     &lt;enumeration value="Query"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MemberFFPOperationType")
@XmlEnum
public enum MemberFFPOperationType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Query")
    QUERY("Query");
    private final String value;

    MemberFFPOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MemberFFPOperationType fromValue(String v) {
        for (MemberFFPOperationType c: MemberFFPOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
