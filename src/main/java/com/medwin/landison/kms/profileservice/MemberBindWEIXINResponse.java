
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberBindWEIXINResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memberBindWEIXINResult"
})
@XmlRootElement(name = "MemberBindWEIXINResponse")
public class MemberBindWEIXINResponse {

    @XmlElement(name = "MemberBindWEIXINResult")
    protected boolean memberBindWEIXINResult;

    /**
     * 获取memberBindWEIXINResult属性的值。
     * 
     */
    public boolean isMemberBindWEIXINResult() {
        return memberBindWEIXINResult;
    }

    /**
     * 设置memberBindWEIXINResult属性的值。
     * 
     */
    public void setMemberBindWEIXINResult(boolean value) {
        this.memberBindWEIXINResult = value;
    }

}
