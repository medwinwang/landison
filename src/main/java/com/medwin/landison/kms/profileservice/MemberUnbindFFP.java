
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
 *         &lt;element name="memberOnlineConmmunication" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}MemberOnlineCommunication" minOccurs="0"/&gt;
 *         &lt;element name="ffpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "memberOnlineConmmunication",
    "ffpType",
    "cardNo"
})
@XmlRootElement(name = "MemberUnbindFFP")
public class MemberUnbindFFP {

    protected MemberOnlineCommunication memberOnlineConmmunication;
    protected String ffpType;
    protected String cardNo;

    /**
     * 获取memberOnlineConmmunication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemberOnlineCommunication }
     *     
     */
    public MemberOnlineCommunication getMemberOnlineConmmunication() {
        return memberOnlineConmmunication;
    }

    /**
     * 设置memberOnlineConmmunication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemberOnlineCommunication }
     *     
     */
    public void setMemberOnlineConmmunication(MemberOnlineCommunication value) {
        this.memberOnlineConmmunication = value;
    }

    /**
     * 获取ffpType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpType() {
        return ffpType;
    }

    /**
     * 设置ffpType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpType(String value) {
        this.ffpType = value;
    }

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

}
