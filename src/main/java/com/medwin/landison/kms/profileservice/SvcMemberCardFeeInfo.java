
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SvcMemberCardFeeInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SvcMemberCardFeeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlaceCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RealFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CreditNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThisBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OperType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Entry" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Membership" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ToDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FromDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MemberNo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcMemberCardFeeInfo", propOrder = {
    "placeCode",
    "remark",
    "realFee",
    "creditNo",
    "licenceNo",
    "fromType",
    "fromID",
    "confirmFlag",
    "payment",
    "operatorID",
    "thisBalance",
    "lastBalance",
    "operType",
    "entry",
    "membership",
    "fee",
    "toDT",
    "fromDT",
    "dt",
    "memberNo",
    "id"
})
public class SvcMemberCardFeeInfo
    extends BaseInfo
{

    @XmlElement(name = "PlaceCode")
    protected CommonInfo placeCode;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "RealFee", required = true)
    protected BigDecimal realFee;
    @XmlElement(name = "CreditNo")
    protected String creditNo;
    @XmlElement(name = "LicenceNo")
    protected String licenceNo;
    @XmlElement(name = "FromType")
    protected String fromType;
    @XmlElement(name = "FromID")
    protected String fromID;
    @XmlElement(name = "ConfirmFlag")
    protected String confirmFlag;
    @XmlElement(name = "Payment")
    protected CommonInfo payment;
    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "ThisBalance", required = true)
    protected BigDecimal thisBalance;
    @XmlElement(name = "LastBalance", required = true)
    protected BigDecimal lastBalance;
    @XmlElement(name = "OperType")
    protected CommonInfo operType;
    @XmlElement(name = "Entry")
    protected CommonInfo entry;
    @XmlElement(name = "Membership")
    protected CommonInfo membership;
    @XmlElement(name = "Fee", required = true)
    protected BigDecimal fee;
    @XmlElement(name = "ToDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDT;
    @XmlElement(name = "FromDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDT;
    @XmlElement(name = "DT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "MemberNo")
    protected CommonInfo memberNo;
    @XmlElement(name = "ID")
    protected int id;

    /**
     * 获取placeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getPlaceCode() {
        return placeCode;
    }

    /**
     * 设置placeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setPlaceCode(CommonInfo value) {
        this.placeCode = value;
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

    /**
     * 获取creditNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditNo() {
        return creditNo;
    }

    /**
     * 设置creditNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditNo(String value) {
        this.creditNo = value;
    }

    /**
     * 获取licenceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceNo() {
        return licenceNo;
    }

    /**
     * 设置licenceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceNo(String value) {
        this.licenceNo = value;
    }

    /**
     * 获取fromType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromType() {
        return fromType;
    }

    /**
     * 设置fromType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromType(String value) {
        this.fromType = value;
    }

    /**
     * 获取fromID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromID() {
        return fromID;
    }

    /**
     * 设置fromID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromID(String value) {
        this.fromID = value;
    }

    /**
     * 获取confirmFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmFlag() {
        return confirmFlag;
    }

    /**
     * 设置confirmFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmFlag(String value) {
        this.confirmFlag = value;
    }

    /**
     * 获取payment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getPayment() {
        return payment;
    }

    /**
     * 设置payment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setPayment(CommonInfo value) {
        this.payment = value;
    }

    /**
     * 获取operatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorID() {
        return operatorID;
    }

    /**
     * 设置operatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }

    /**
     * 获取thisBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThisBalance() {
        return thisBalance;
    }

    /**
     * 设置thisBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThisBalance(BigDecimal value) {
        this.thisBalance = value;
    }

    /**
     * 获取lastBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastBalance() {
        return lastBalance;
    }

    /**
     * 设置lastBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastBalance(BigDecimal value) {
        this.lastBalance = value;
    }

    /**
     * 获取operType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getOperType() {
        return operType;
    }

    /**
     * 设置operType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setOperType(CommonInfo value) {
        this.operType = value;
    }

    /**
     * 获取entry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getEntry() {
        return entry;
    }

    /**
     * 设置entry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setEntry(CommonInfo value) {
        this.entry = value;
    }

    /**
     * 获取membership属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMembership() {
        return membership;
    }

    /**
     * 设置membership属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMembership(CommonInfo value) {
        this.membership = value;
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
     * 获取toDT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDT() {
        return toDT;
    }

    /**
     * 设置toDT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDT(XMLGregorianCalendar value) {
        this.toDT = value;
    }

    /**
     * 获取fromDT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDT() {
        return fromDT;
    }

    /**
     * 设置fromDT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDT(XMLGregorianCalendar value) {
        this.fromDT = value;
    }

    /**
     * 获取dt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDT() {
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
    public void setDT(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * 获取memberNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMemberNo() {
        return memberNo;
    }

    /**
     * 设置memberNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMemberNo(CommonInfo value) {
        this.memberNo = value;
    }

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

}
