
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MemberGetPointsByWay complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MemberGetPointsByWay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GhNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GatewayReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PayMentStatus"/&gt;
 *         &lt;element name="PlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberGetPointsByWay", propOrder = {
    "id",
    "ghNo",
    "cardNo",
    "dt",
    "fee",
    "currency",
    "remark",
    "points",
    "gatewayReferenceNo",
    "payment",
    "paymentStatus",
    "placeCode"
})
public class MemberGetPointsByWay
    extends BaseInfo
{

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "GhNo")
    protected String ghNo;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "Dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Fee", required = true)
    protected BigDecimal fee;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "GatewayReferenceNo")
    protected String gatewayReferenceNo;
    @XmlElement(name = "Payment")
    protected String payment;
    @XmlElement(name = "PaymentStatus", required = true)
    @XmlSchemaType(name = "string")
    protected PayMentStatus paymentStatus;
    @XmlElement(name = "PlaceCode")
    protected String placeCode;

    /**
     * 获取id属性的值。
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * 获取dt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * 设置dt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * 获取fee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置fee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取points属性的值。
     * 
     */
    public int getPoints() {
        return points;
    }

    /**
     * 设置points属性的值。
     * 
     */
    public void setPoints(int value) {
        this.points = value;
    }

    /**
     * 获取gatewayReferenceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayReferenceNo() {
        return gatewayReferenceNo;
    }

    /**
     * 设置gatewayReferenceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayReferenceNo(String value) {
        this.gatewayReferenceNo = value;
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
     * 获取paymentStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayMentStatus }
     *     
     */
    public PayMentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 设置paymentStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayMentStatus }
     *     
     */
    public void setPaymentStatus(PayMentStatus value) {
        this.paymentStatus = value;
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

}
