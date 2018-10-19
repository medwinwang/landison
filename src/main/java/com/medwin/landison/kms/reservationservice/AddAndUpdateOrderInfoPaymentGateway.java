
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentGateway" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoPaymentGateway" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isRequiredCredit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="creditId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expire" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="isCancelPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "paymentGateway",
    "id",
    "isRequiredCredit",
    "creditId",
    "cardHolder",
    "expire",
    "isCancelPayment"
})
@XmlRootElement(name = "AddAndUpdateOrderInfoPaymentGateway")
public class AddAndUpdateOrderInfoPaymentGateway {

    protected OrderInfoPaymentGateway paymentGateway;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    protected boolean isRequiredCredit;
    protected String creditId;
    protected String cardHolder;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected String expire;
    protected boolean isCancelPayment;

    /**
     * ��ȡpaymentGateway���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoPaymentGateway }
     *     
     */
    public OrderInfoPaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    /**
     * ����paymentGateway���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoPaymentGateway }
     *     
     */
    public void setPaymentGateway(OrderInfoPaymentGateway value) {
        this.paymentGateway = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * ��ȡisRequiredCredit���Ե�ֵ��
     * 
     */
    public boolean isIsRequiredCredit() {
        return isRequiredCredit;
    }

    /**
     * ����isRequiredCredit���Ե�ֵ��
     * 
     */
    public void setIsRequiredCredit(boolean value) {
        this.isRequiredCredit = value;
    }

    /**
     * ��ȡcreditId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditId() {
        return creditId;
    }

    /**
     * ����creditId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditId(String value) {
        this.creditId = value;
    }

    /**
     * ��ȡcardHolder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * ����cardHolder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * ��ȡexpire���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpire() {
        return expire;
    }

    /**
     * ����expire���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpire(String value) {
        this.expire = value;
    }

    /**
     * ��ȡisCancelPayment���Ե�ֵ��
     * 
     */
    public boolean isIsCancelPayment() {
        return isCancelPayment;
    }

    /**
     * ����isCancelPayment���Ե�ֵ��
     * 
     */
    public void setIsCancelPayment(boolean value) {
        this.isCancelPayment = value;
    }

}
