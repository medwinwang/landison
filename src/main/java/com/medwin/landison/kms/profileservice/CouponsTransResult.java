
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CouponsTransResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponsTransResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CouponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValidDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ValidDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CouponsTransDetail" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCouponsTransDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponsTransResult", propOrder = {
    "couponCode",
    "couponNumber",
    "validDateBegin",
    "validDateEnd",
    "couponsTransDetail"
})
public class CouponsTransResult {

    @XmlElement(name = "CouponCode")
    protected String couponCode;
    @XmlElement(name = "CouponNumber")
    protected int couponNumber;
    @XmlElement(name = "ValidDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDateBegin;
    @XmlElement(name = "ValidDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDateEnd;
    @XmlElement(name = "CouponsTransDetail")
    protected ArrayOfCouponsTransDetail couponsTransDetail;

    /**
     * 获取couponCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * 设置couponCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
    }

    /**
     * 获取couponNumber属性的值。
     * 
     */
    public int getCouponNumber() {
        return couponNumber;
    }

    /**
     * 设置couponNumber属性的值。
     * 
     */
    public void setCouponNumber(int value) {
        this.couponNumber = value;
    }

    /**
     * 获取validDateBegin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDateBegin() {
        return validDateBegin;
    }

    /**
     * 设置validDateBegin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDateBegin(XMLGregorianCalendar value) {
        this.validDateBegin = value;
    }

    /**
     * 获取validDateEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDateEnd() {
        return validDateEnd;
    }

    /**
     * 设置validDateEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDateEnd(XMLGregorianCalendar value) {
        this.validDateEnd = value;
    }

    /**
     * 获取couponsTransDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCouponsTransDetail }
     *     
     */
    public ArrayOfCouponsTransDetail getCouponsTransDetail() {
        return couponsTransDetail;
    }

    /**
     * 设置couponsTransDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCouponsTransDetail }
     *     
     */
    public void setCouponsTransDetail(ArrayOfCouponsTransDetail value) {
        this.couponsTransDetail = value;
    }

}
