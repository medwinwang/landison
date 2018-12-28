
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MembershipCardTopupNewOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MembershipCardTopupNewOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExchageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardFeeRecordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Money" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CardFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PresentCouponInfoList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCouponsTransResult" minOccurs="0"/&gt;
 *         &lt;element name="PresentPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GhNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RealFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipCardTopupNewOut", propOrder = {
    "exchageId",
    "cardFeeRecordId",
    "cardNo",
    "money",
    "cardFee",
    "presentCouponInfoList",
    "presentPoints",
    "payment",
    "ghNo",
    "realFee"
})
public class MembershipCardTopupNewOut {

    @XmlElement(name = "ExchageId")
    protected String exchageId;
    @XmlElement(name = "CardFeeRecordId")
    protected String cardFeeRecordId;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "Money", required = true)
    protected BigDecimal money;
    @XmlElement(name = "CardFee", required = true)
    protected BigDecimal cardFee;
    @XmlElement(name = "PresentCouponInfoList")
    protected ArrayOfCouponsTransResult presentCouponInfoList;
    @XmlElement(name = "PresentPoints")
    protected int presentPoints;
    @XmlElement(name = "Payment")
    protected String payment;
    @XmlElement(name = "GhNo")
    protected String ghNo;
    @XmlElement(name = "RealFee", required = true)
    protected BigDecimal realFee;

    /**
     * 获取exchageId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchageId() {
        return exchageId;
    }

    /**
     * 设置exchageId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchageId(String value) {
        this.exchageId = value;
    }

    /**
     * 获取cardFeeRecordId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardFeeRecordId() {
        return cardFeeRecordId;
    }

    /**
     * 设置cardFeeRecordId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardFeeRecordId(String value) {
        this.cardFeeRecordId = value;
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

    /**
     * 获取money属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置money属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoney(BigDecimal value) {
        this.money = value;
    }

    /**
     * 获取cardFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardFee() {
        return cardFee;
    }

    /**
     * 设置cardFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardFee(BigDecimal value) {
        this.cardFee = value;
    }

    /**
     * 获取presentCouponInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCouponsTransResult }
     *     
     */
    public ArrayOfCouponsTransResult getPresentCouponInfoList() {
        return presentCouponInfoList;
    }

    /**
     * 设置presentCouponInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCouponsTransResult }
     *     
     */
    public void setPresentCouponInfoList(ArrayOfCouponsTransResult value) {
        this.presentCouponInfoList = value;
    }

    /**
     * 获取presentPoints属性的值。
     * 
     */
    public int getPresentPoints() {
        return presentPoints;
    }

    /**
     * 设置presentPoints属性的值。
     * 
     */
    public void setPresentPoints(int value) {
        this.presentPoints = value;
    }

    /**
     * 获取payment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 设置payment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayment(String value) {
        this.payment = value;
    }

    /**
     * 获取ghNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhNo() {
        return ghNo;
    }

    /**
     * 设置ghNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhNo(String value) {
        this.ghNo = value;
    }

    /**
     * 获取realFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRealFee() {
        return realFee;
    }

    /**
     * 设置realFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRealFee(BigDecimal value) {
        this.realFee = value;
    }

}
