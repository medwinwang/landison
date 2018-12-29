
package com.medwin.landison.kms.reservationservice;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>OrderInfoPaymentGateway complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderInfoPaymentGateway"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Amount_type" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Amount_type"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="GatewayReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GatewayIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpirePayment" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CardHolderPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PayMentStatus"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}DataType"/&gt;
 *         &lt;element name="Update_status" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PayMentStatus"/&gt;
 *         &lt;element name="UseCouponIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}UseCouponIn" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfoPaymentGateway", propOrder = {
    "id",
    "orderId",
    "paymentDate",
    "amountType",
    "currency",
    "amount",
    "gatewayReferenceNo",
    "gatewayIdentification",
    "expirePayment",
    "cardHolderPayment",
    "category",
    "status",
    "remark",
    "points",
    "paymentCode",
    "orderType",
    "updateStatus",
    "useCouponIn",
    "isCancelRule"
})
public class OrderInfoPaymentGateway
    extends BaseInfo
{

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "PaymentDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date paymentDate;
    @XmlElement(name = "Amount_type", required = true)
    @XmlSchemaType(name = "string")
    protected AmountType amountType;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "GatewayReferenceNo")
    protected String gatewayReferenceNo;
    @XmlElement(name = "GatewayIdentification")
    protected String gatewayIdentification;
    @XmlElement(name = "ExpirePayment", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date expirePayment;
    @XmlElement(name = "CardHolderPayment")
    protected String cardHolderPayment;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected PayMentStatus status;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "Points")
    protected String points;
    @XmlElement(name = "PaymentCode")
    protected String paymentCode;
    @XmlElement(name = "OrderType", required = true)
    @XmlSchemaType(name = "string")
    protected DataType orderType;
    @XmlElement(name = "Update_status", required = true)
    @XmlSchemaType(name = "string")
    protected PayMentStatus updateStatus;
    @XmlElement(name = "UseCouponIn")
    protected UseCouponIn useCouponIn;
    @XmlElement(name = "IsCancelRule")
    protected boolean isCancelRule;

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
     * 获取orderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * 获取paymentDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * 设置paymentDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(Date value) {
        this.paymentDate = value;
    }

    /**
     * 获取amountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountType() {
        return amountType;
    }

    /**
     * 设置amountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountType(AmountType value) {
        this.amountType = value;
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
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
     * 获取gatewayIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayIdentification() {
        return gatewayIdentification;
    }

    /**
     * 设置gatewayIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayIdentification(String value) {
        this.gatewayIdentification = value;
    }

    /**
     * 获取expirePayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpirePayment() {
        return expirePayment;
    }

    /**
     * 设置expirePayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirePayment(Date value) {
        this.expirePayment = value;
    }

    /**
     * 获取cardHolderPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderPayment() {
        return cardHolderPayment;
    }

    /**
     * 设置cardHolderPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderPayment(String value) {
        this.cardHolderPayment = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayMentStatus }
     *     
     */
    public PayMentStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayMentStatus }
     *     
     */
    public void setStatus(PayMentStatus value) {
        this.status = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoints() {
        return points;
    }

    /**
     * 设置points属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoints(String value) {
        this.points = value;
    }

    /**
     * 获取paymentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * 设置paymentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCode(String value) {
        this.paymentCode = value;
    }

    /**
     * 获取orderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getOrderType() {
        return orderType;
    }

    /**
     * 设置orderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setOrderType(DataType value) {
        this.orderType = value;
    }

    /**
     * 获取updateStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayMentStatus }
     *     
     */
    public PayMentStatus getUpdateStatus() {
        return updateStatus;
    }

    /**
     * 设置updateStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayMentStatus }
     *     
     */
    public void setUpdateStatus(PayMentStatus value) {
        this.updateStatus = value;
    }

    /**
     * 获取useCouponIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UseCouponIn }
     *     
     */
    public UseCouponIn getUseCouponIn() {
        return useCouponIn;
    }

    /**
     * 设置useCouponIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UseCouponIn }
     *     
     */
    public void setUseCouponIn(UseCouponIn value) {
        this.useCouponIn = value;
    }

    /**
     * 获取isCancelRule属性的值。
     * 
     */
    public boolean isIsCancelRule() {
        return isCancelRule;
    }

    /**
     * 设置isCancelRule属性的值。
     * 
     */
    public void setIsCancelRule(boolean value) {
        this.isCancelRule = value;
    }

}
