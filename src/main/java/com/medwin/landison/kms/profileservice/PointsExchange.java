
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
 *         &lt;element name="card_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrCouponn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSvcCouponInfo" minOccurs="0"/&gt;
 *         &lt;element name="arrSpecialCoupon" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSpecialCouponInfo" minOccurs="0"/&gt;
 *         &lt;element name="member_info" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ConsigneeInfo" minOccurs="0"/&gt;
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
    "cardNo",
    "arrCouponn",
    "arrSpecialCoupon",
    "memberInfo"
})
@XmlRootElement(name = "PointsExchange")
public class PointsExchange {

    @XmlElement(name = "card_No")
    protected String cardNo;
    protected ArrayOfSvcCouponInfo arrCouponn;
    protected ArrayOfSpecialCouponInfo arrSpecialCoupon;
    @XmlElement(name = "member_info")
    protected ConsigneeInfo memberInfo;

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

    /**
     * 获取arrCouponn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSvcCouponInfo }
     *     
     */
    public ArrayOfSvcCouponInfo getArrCouponn() {
        return arrCouponn;
    }

    /**
     * 设置arrCouponn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSvcCouponInfo }
     *     
     */
    public void setArrCouponn(ArrayOfSvcCouponInfo value) {
        this.arrCouponn = value;
    }

    /**
     * 获取arrSpecialCoupon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialCouponInfo }
     *     
     */
    public ArrayOfSpecialCouponInfo getArrSpecialCoupon() {
        return arrSpecialCoupon;
    }

    /**
     * 设置arrSpecialCoupon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialCouponInfo }
     *     
     */
    public void setArrSpecialCoupon(ArrayOfSpecialCouponInfo value) {
        this.arrSpecialCoupon = value;
    }

    /**
     * 获取memberInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConsigneeInfo }
     *     
     */
    public ConsigneeInfo getMemberInfo() {
        return memberInfo;
    }

    /**
     * 设置memberInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConsigneeInfo }
     *     
     */
    public void setMemberInfo(ConsigneeInfo value) {
        this.memberInfo = value;
    }

}
