
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="membershipCardTopupNewIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}MembershipCardTopupNewIn" minOccurs="0"/&gt;
 *         &lt;element name="placeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "membershipCardTopupNewIn",
    "placeCode",
    "fromId"
})
@XmlRootElement(name = "MembershipCardTopupNew")
public class MembershipCardTopupNew {

    protected MembershipCardTopupNewIn membershipCardTopupNewIn;
    protected String placeCode;
    protected String fromId;

    /**
     * 获取membershipCardTopupNewIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MembershipCardTopupNewIn }
     *     
     */
    public MembershipCardTopupNewIn getMembershipCardTopupNewIn() {
        return membershipCardTopupNewIn;
    }

    /**
     * 设置membershipCardTopupNewIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipCardTopupNewIn }
     *     
     */
    public void setMembershipCardTopupNewIn(MembershipCardTopupNewIn value) {
        this.membershipCardTopupNewIn = value;
    }

    /**
     * 获取placeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCode() {
        return placeCode;
    }

    /**
     * 设置placeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCode(String value) {
        this.placeCode = value;
    }

    /**
     * 获取fromId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromId() {
        return fromId;
    }

    /**
     * 设置fromId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromId(String value) {
        this.fromId = value;
    }

}
