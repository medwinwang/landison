
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
    protected XMLGregorianCalendar expire;
    protected boolean isCancelPayment;

    /**
     * 获取paymentGateway属性的值。
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
     * 设置paymentGateway属性的值。
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
     * 获取id属性的值。
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
     * 设置id属性的值。
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
     * 获取isRequiredCredit属性的值。
     * 
     */
    public boolean isIsRequiredCredit() {
        return isRequiredCredit;
    }

    /**
     * 设置isRequiredCredit属性的值。
     * 
     */
    public void setIsRequiredCredit(boolean value) {
        this.isRequiredCredit = value;
    }

    /**
     * 获取creditId属性的值。
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
     * 设置creditId属性的值。
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
     * 获取cardHolder属性的值。
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
     * 设置cardHolder属性的值。
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
     * 获取expire属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpire() {
        return expire;
    }

    /**
     * 设置expire属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpire(XMLGregorianCalendar value) {
        this.expire = value;
    }

    /**
     * 获取isCancelPayment属性的值。
     * 
     */
    public boolean isIsCancelPayment() {
        return isCancelPayment;
    }

    /**
     * 设置isCancelPayment属性的值。
     * 
     */
    public void setIsCancelPayment(boolean value) {
        this.isCancelPayment = value;
    }

}
