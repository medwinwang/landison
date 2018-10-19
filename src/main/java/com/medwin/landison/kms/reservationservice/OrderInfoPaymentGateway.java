
package com.medwin.landison.kms.reservationservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>OrderInfoPaymentGateway complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String paymentDate;
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
    @XmlElement(name = "ExpirePayment", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String expirePayment;
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
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * ��ȡorderId���Ե�ֵ��
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
     * ����orderId���Ե�ֵ��
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
     * ��ȡpaymentDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * ����paymentDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * ��ȡamountType���Ե�ֵ��
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
     * ����amountType���Ե�ֵ��
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
     * ��ȡcurrency���Ե�ֵ��
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
     * ����currency���Ե�ֵ��
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
     * ��ȡamount���Ե�ֵ��
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
     * ����amount���Ե�ֵ��
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
     * ��ȡgatewayReferenceNo���Ե�ֵ��
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
     * ����gatewayReferenceNo���Ե�ֵ��
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
     * ��ȡgatewayIdentification���Ե�ֵ��
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
     * ����gatewayIdentification���Ե�ֵ��
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
     * ��ȡexpirePayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirePayment() {
        return expirePayment;
    }

    /**
     * ����expirePayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirePayment(String value) {
        this.expirePayment = value;
    }

    /**
     * ��ȡcardHolderPayment���Ե�ֵ��
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
     * ����cardHolderPayment���Ե�ֵ��
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
     * ��ȡcategory���Ե�ֵ��
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
     * ����category���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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
     * ��ȡpoints���Ե�ֵ��
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
     * ����points���Ե�ֵ��
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
     * ��ȡpaymentCode���Ե�ֵ��
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
     * ����paymentCode���Ե�ֵ��
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
     * ��ȡorderType���Ե�ֵ��
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
     * ����orderType���Ե�ֵ��
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
     * ��ȡupdateStatus���Ե�ֵ��
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
     * ����updateStatus���Ե�ֵ��
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
     * ��ȡuseCouponIn���Ե�ֵ��
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
     * ����useCouponIn���Ե�ֵ��
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
     * ��ȡisCancelRule���Ե�ֵ��
     * 
     */
    public boolean isIsCancelRule() {
        return isCancelRule;
    }

    /**
     * ����isCancelRule���Ե�ֵ��
     * 
     */
    public void setIsCancelRule(boolean value) {
        this.isCancelRule = value;
    }

}
