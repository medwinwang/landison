
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MembershipCardTopupNewIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MembershipCardTopupNewIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Card_fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Real_fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipCardTopupNewIn", propOrder = {
    "cardNo",
    "cardFee",
    "payment",
    "realFee"
})
public class MembershipCardTopupNewIn {

    @XmlElement(name = "Card_no")
    protected String cardNo;
    @XmlElement(name = "Card_fee", required = true)
    protected BigDecimal cardFee;
    @XmlElement(name = "Payment")
    protected String payment;
    @XmlElement(name = "Real_fee", required = true)
    protected BigDecimal realFee;

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
