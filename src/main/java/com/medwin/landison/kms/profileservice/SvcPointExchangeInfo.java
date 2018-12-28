
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SvcPointExchangeInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SvcPointExchangeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeastCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CouponUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ConsigneeInfo" minOccurs="0"/&gt;
 *         &lt;element name="CancelExchange" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UsePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsePlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExchangeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SendFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSearchdispatchInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Hotel_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CouponsType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MemberNo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccrueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcCouponInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SvcCouponInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcPointExchangeInfo", propOrder = {
    "leastCost",
    "couponUse",
    "serialNumber",
    "consigneeInfo",
    "cancelExchange",
    "useEnd",
    "usePlace",
    "usePlaceName",
    "exchangeBegin",
    "exchangeEnd",
    "sendFlag",
    "isSearchdispatchInfo",
    "hotelName",
    "memo",
    "exchangeID",
    "usedDate",
    "used",
    "userCode",
    "subName",
    "dt",
    "couponsType",
    "exchange",
    "points",
    "memberNo",
    "id",
    "couponStatus",
    "accrueType",
    "svcCouponInfo"
})
public class SvcPointExchangeInfo
    extends BaseInfo
{

    @XmlElement(name = "LeastCost", required = true)
    protected BigDecimal leastCost;
    @XmlElement(name = "CouponUse")
    protected String couponUse;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "ConsigneeInfo")
    protected ConsigneeInfo consigneeInfo;
    @XmlElement(name = "CancelExchange")
    protected boolean cancelExchange;
    @XmlElement(name = "UseEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useEnd;
    @XmlElement(name = "UsePlace")
    protected String usePlace;
    @XmlElement(name = "UsePlaceName")
    protected String usePlaceName;
    @XmlElement(name = "ExchangeBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeBegin;
    @XmlElement(name = "ExchangeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeEnd;
    @XmlElement(name = "SendFlag")
    protected boolean sendFlag;
    @XmlElement(name = "IsSearchdispatchInfo")
    protected boolean isSearchdispatchInfo;
    @XmlElement(name = "Hotel_Name")
    protected String hotelName;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "ExchangeID")
    protected String exchangeID;
    @XmlElement(name = "UsedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usedDate;
    @XmlElement(name = "Used")
    protected String used;
    @XmlElement(name = "UserCode")
    protected String userCode;
    @XmlElement(name = "SubName")
    protected String subName;
    @XmlElement(name = "DT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "CouponsType")
    protected CommonInfo couponsType;
    @XmlElement(name = "Exchange")
    protected int exchange;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "MemberNo")
    protected CommonInfo memberNo;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "CouponStatus")
    protected String couponStatus;
    @XmlElement(name = "AccrueType")
    protected String accrueType;
    @XmlElement(name = "SvcCouponInfo")
    protected SvcCouponInfo svcCouponInfo;

    /**
     * 获取leastCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeastCost() {
        return leastCost;
    }

    /**
     * 设置leastCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeastCost(BigDecimal value) {
        this.leastCost = value;
    }

    /**
     * 获取couponUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponUse() {
        return couponUse;
    }

    /**
     * 设置couponUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponUse(String value) {
        this.couponUse = value;
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
     * 获取consigneeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConsigneeInfo }
     *     
     */
    public ConsigneeInfo getConsigneeInfo() {
        return consigneeInfo;
    }

    /**
     * 设置consigneeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConsigneeInfo }
     *     
     */
    public void setConsigneeInfo(ConsigneeInfo value) {
        this.consigneeInfo = value;
    }

    /**
     * 获取cancelExchange属性的值。
     * 
     */
    public boolean isCancelExchange() {
        return cancelExchange;
    }

    /**
     * 设置cancelExchange属性的值。
     * 
     */
    public void setCancelExchange(boolean value) {
        this.cancelExchange = value;
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

    /**
     * 获取usePlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePlace() {
        return usePlace;
    }

    /**
     * 设置usePlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePlace(String value) {
        this.usePlace = value;
    }

    /**
     * 获取usePlaceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePlaceName() {
        return usePlaceName;
    }

    /**
     * 设置usePlaceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePlaceName(String value) {
        this.usePlaceName = value;
    }

    /**
     * 获取exchangeBegin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeBegin() {
        return exchangeBegin;
    }

    /**
     * 设置exchangeBegin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeBegin(XMLGregorianCalendar value) {
        this.exchangeBegin = value;
    }

    /**
     * 获取exchangeEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeEnd() {
        return exchangeEnd;
    }

    /**
     * 设置exchangeEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeEnd(XMLGregorianCalendar value) {
        this.exchangeEnd = value;
    }

    /**
     * 获取sendFlag属性的值。
     * 
     */
    public boolean isSendFlag() {
        return sendFlag;
    }

    /**
     * 设置sendFlag属性的值。
     * 
     */
    public void setSendFlag(boolean value) {
        this.sendFlag = value;
    }

    /**
     * 获取isSearchdispatchInfo属性的值。
     * 
     */
    public boolean isIsSearchdispatchInfo() {
        return isSearchdispatchInfo;
    }

    /**
     * 设置isSearchdispatchInfo属性的值。
     * 
     */
    public void setIsSearchdispatchInfo(boolean value) {
        this.isSearchdispatchInfo = value;
    }

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
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
     * 获取exchangeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeID() {
        return exchangeID;
    }

    /**
     * 设置exchangeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeID(String value) {
        this.exchangeID = value;
    }

    /**
     * 获取usedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsedDate() {
        return usedDate;
    }

    /**
     * 设置usedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsedDate(XMLGregorianCalendar value) {
        this.usedDate = value;
    }

    /**
     * 获取used属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsed() {
        return used;
    }

    /**
     * 设置used属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsed(String value) {
        this.used = value;
    }

    /**
     * 获取userCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置userCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * 获取subName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubName() {
        return subName;
    }

    /**
     * 设置subName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubName(String value) {
        this.subName = value;
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
     * 获取couponsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getCouponsType() {
        return couponsType;
    }

    /**
     * 设置couponsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setCouponsType(CommonInfo value) {
        this.couponsType = value;
    }

    /**
     * 获取exchange属性的值。
     * 
     */
    public int getExchange() {
        return exchange;
    }

    /**
     * 设置exchange属性的值。
     * 
     */
    public void setExchange(int value) {
        this.exchange = value;
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
     * 获取accrueType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrueType() {
        return accrueType;
    }

    /**
     * 设置accrueType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrueType(String value) {
        this.accrueType = value;
    }

    /**
     * 获取svcCouponInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SvcCouponInfo }
     *     
     */
    public SvcCouponInfo getSvcCouponInfo() {
        return svcCouponInfo;
    }

    /**
     * 设置svcCouponInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SvcCouponInfo }
     *     
     */
    public void setSvcCouponInfo(SvcCouponInfo value) {
        this.svcCouponInfo = value;
    }

}
