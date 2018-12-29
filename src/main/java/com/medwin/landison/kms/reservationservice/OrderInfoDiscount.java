
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
 * <p>OrderInfoDiscount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderInfoDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DiscountDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DiscountMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecordNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountReasonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfoDiscount", propOrder = {
    "id",
    "orderID",
    "discountDt",
    "discountMethod",
    "discountAmount",
    "serialNumber",
    "recordNumber",
    "discountReasonCode",
    "discountReasonName",
    "discountPercentage"
})
public class OrderInfoDiscount
    extends BaseInfo
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "OrderID")
    protected int orderID;
    @XmlElement(name = "DiscountDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date discountDt;
    @XmlElement(name = "DiscountMethod")
    protected String discountMethod;
    @XmlElement(name = "DiscountAmount", required = true)
    protected BigDecimal discountAmount;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "RecordNumber")
    protected String recordNumber;
    @XmlElement(name = "DiscountReasonCode")
    protected String discountReasonCode;
    @XmlElement(name = "DiscountReasonName")
    protected String discountReasonName;
    @XmlElement(name = "DiscountPercentage")
    protected String discountPercentage;

    /**
     * 获取id属性的值。
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * 获取orderID属性的值。
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * 设置orderID属性的值。
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * 获取discountDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDiscountDt() {
        return discountDt;
    }

    /**
     * 设置discountDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountDt(Date value) {
        this.discountDt = value;
    }

    /**
     * 获取discountMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountMethod() {
        return discountMethod;
    }

    /**
     * 设置discountMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountMethod(String value) {
        this.discountMethod = value;
    }

    /**
     * 获取discountAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置discountAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * 获取serialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置serialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * 获取recordNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /**
     * 设置recordNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordNumber(String value) {
        this.recordNumber = value;
    }

    /**
     * 获取discountReasonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountReasonCode() {
        return discountReasonCode;
    }

    /**
     * 设置discountReasonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountReasonCode(String value) {
        this.discountReasonCode = value;
    }

    /**
     * 获取discountReasonName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountReasonName() {
        return discountReasonName;
    }

    /**
     * 设置discountReasonName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountReasonName(String value) {
        this.discountReasonName = value;
    }

    /**
     * 获取discountPercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * 设置discountPercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercentage(String value) {
        this.discountPercentage = value;
    }

}
