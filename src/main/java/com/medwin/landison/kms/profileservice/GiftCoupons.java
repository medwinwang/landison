
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
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrCoupon" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCouponsTransRequest" minOccurs="0"/&gt;
 *         &lt;element name="accrueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "arrCoupon",
    "accrueType"
})
@XmlRootElement(name = "GiftCoupons")
public class GiftCoupons {

    protected String cardNo;
    protected ArrayOfCouponsTransRequest arrCoupon;
    protected String accrueType;

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
     * 获取arrCoupon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCouponsTransRequest }
     *     
     */
    public ArrayOfCouponsTransRequest getArrCoupon() {
        return arrCoupon;
    }

    /**
     * 设置arrCoupon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCouponsTransRequest }
     *     
     */
    public void setArrCoupon(ArrayOfCouponsTransRequest value) {
        this.arrCoupon = value;
    }

    /**
     * 获取accrueType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrueType() {
        return accrueType;
    }

    /**
     * 设置accrueType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrueType(String value) {
        this.accrueType = value;
    }

}
