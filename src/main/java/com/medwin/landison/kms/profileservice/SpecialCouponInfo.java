
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SpecialCouponInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpecialCouponInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberDigits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UseEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialCouponInfo", propOrder = {
    "code",
    "points",
    "couponNumber",
    "memo",
    "couponStatus",
    "useMethod",
    "numberPrefix",
    "numberDigits",
    "useBegin",
    "useEnd"
})
public class SpecialCouponInfo {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "CouponNumber")
    protected int couponNumber;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "CouponStatus")
    protected String couponStatus;
    @XmlElement(name = "UseMethod")
    protected String useMethod;
    @XmlElement(name = "NumberPrefix")
    protected String numberPrefix;
    @XmlElement(name = "NumberDigits")
    protected String numberDigits;
    @XmlElement(name = "UseBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useBegin;
    @XmlElement(name = "UseEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useEnd;

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取couponStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStatus() {
        return couponStatus;
    }

    /**
     * 设置couponStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStatus(String value) {
        this.couponStatus = value;
    }

    /**
     * 获取useMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseMethod() {
        return useMethod;
    }

    /**
     * 设置useMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseMethod(String value) {
        this.useMethod = value;
    }

    /**
     * 获取numberPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPrefix() {
        return numberPrefix;
    }

    /**
     * 设置numberPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPrefix(String value) {
        this.numberPrefix = value;
    }

    /**
     * 获取numberDigits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberDigits() {
        return numberDigits;
    }

    /**
     * 设置numberDigits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberDigits(String value) {
        this.numberDigits = value;
    }

    /**
     * 获取useBegin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUseBegin() {
        return useBegin;
    }

    /**
     * 设置useBegin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUseBegin(XMLGregorianCalendar value) {
        this.useBegin = value;
    }

    /**
     * 获取useEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUseEnd() {
        return useEnd;
    }

    /**
     * 设置useEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUseEnd(XMLGregorianCalendar value) {
        this.useEnd = value;
    }

}
