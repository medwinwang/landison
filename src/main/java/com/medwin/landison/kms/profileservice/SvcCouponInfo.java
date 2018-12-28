
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SvcCouponInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SvcCouponInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Places" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Hotels" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Inventory_switch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExchangeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UsedVlid" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}UsedValid"/&gt;
 *         &lt;element name="DelayDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UseBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UseEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InitPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MembershipCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Cash" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CashFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hotel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CouponType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="EngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mileages" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Udf_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LeastCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcCouponInfo", propOrder = {
    "couponNumber",
    "places",
    "hotels",
    "inventorySwitch",
    "inventory",
    "memo",
    "exchangeBegin",
    "exchangeEnd",
    "usedVlid",
    "delayDate",
    "useBegin",
    "useEnd",
    "flag",
    "limitType",
    "initPoints",
    "membershipCode",
    "cash",
    "cashFlag",
    "hotel",
    "couponType",
    "engName",
    "sortID",
    "points",
    "name",
    "code",
    "ffpCardType",
    "mileages",
    "udf1",
    "udf2",
    "udf3",
    "udf4",
    "udf5",
    "leastCost",
    "quantity"
})
public class SvcCouponInfo
    extends BaseInfo
{

    @XmlElement(name = "CouponNumber")
    protected int couponNumber;
    @XmlElement(name = "Places")
    protected ArrayOfCommonInfo places;
    @XmlElement(name = "Hotels")
    protected ArrayOfCommonInfo hotels;
    @XmlElement(name = "Inventory_switch")
    protected boolean inventorySwitch;
    @XmlElement(name = "Inventory")
    protected int inventory;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "ExchangeBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeBegin;
    @XmlElement(name = "ExchangeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeEnd;
    @XmlElement(name = "UsedVlid", required = true)
    @XmlSchemaType(name = "string")
    protected UsedValid usedVlid;
    @XmlElement(name = "DelayDate")
    protected int delayDate;
    @XmlElement(name = "UseBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useBegin;
    @XmlElement(name = "UseEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useEnd;
    @XmlElement(name = "Flag")
    protected String flag;
    @XmlElement(name = "LimitType")
    protected String limitType;
    @XmlElement(name = "InitPoints")
    protected int initPoints;
    @XmlElement(name = "MembershipCode")
    protected CommonInfo membershipCode;
    @XmlElement(name = "Cash", required = true)
    protected BigDecimal cash;
    @XmlElement(name = "CashFlag")
    protected String cashFlag;
    @XmlElement(name = "Hotel")
    protected CommonInfo hotel;
    @XmlElement(name = "CouponType")
    protected CommonInfo couponType;
    @XmlElement(name = "EngName")
    protected String engName;
    @XmlElement(name = "SortID")
    protected int sortID;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "FfpCardType")
    protected String ffpCardType;
    @XmlElement(name = "Mileages")
    protected float mileages;
    @XmlElement(name = "Udf_1")
    protected String udf1;
    @XmlElement(name = "Udf_2")
    protected String udf2;
    @XmlElement(name = "Udf_3")
    protected String udf3;
    @XmlElement(name = "Udf_4")
    protected String udf4;
    @XmlElement(name = "Udf_5")
    protected String udf5;
    @XmlElement(name = "LeastCost", required = true)
    protected BigDecimal leastCost;
    @XmlElement(name = "Quantity")
    protected int quantity;

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
     * 获取places属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public ArrayOfCommonInfo getPlaces() {
        return places;
    }

    /**
     * 设置places属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public void setPlaces(ArrayOfCommonInfo value) {
        this.places = value;
    }

    /**
     * 获取hotels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public ArrayOfCommonInfo getHotels() {
        return hotels;
    }

    /**
     * 设置hotels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public void setHotels(ArrayOfCommonInfo value) {
        this.hotels = value;
    }

    /**
     * 获取inventorySwitch属性的值。
     * 
     */
    public boolean isInventorySwitch() {
        return inventorySwitch;
    }

    /**
     * 设置inventorySwitch属性的值。
     * 
     */
    public void setInventorySwitch(boolean value) {
        this.inventorySwitch = value;
    }

    /**
     * 获取inventory属性的值。
     * 
     */
    public int getInventory() {
        return inventory;
    }

    /**
     * 设置inventory属性的值。
     * 
     */
    public void setInventory(int value) {
        this.inventory = value;
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
     * 获取usedVlid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UsedValid }
     *     
     */
    public UsedValid getUsedVlid() {
        return usedVlid;
    }

    /**
     * 设置usedVlid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UsedValid }
     *     
     */
    public void setUsedVlid(UsedValid value) {
        this.usedVlid = value;
    }

    /**
     * 获取delayDate属性的值。
     * 
     */
    public int getDelayDate() {
        return delayDate;
    }

    /**
     * 设置delayDate属性的值。
     * 
     */
    public void setDelayDate(int value) {
        this.delayDate = value;
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

    /**
     * 获取flag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 设置flag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * 获取limitType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * 设置limitType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

    /**
     * 获取initPoints属性的值。
     * 
     */
    public int getInitPoints() {
        return initPoints;
    }

    /**
     * 设置initPoints属性的值。
     * 
     */
    public void setInitPoints(int value) {
        this.initPoints = value;
    }

    /**
     * 获取membershipCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMembershipCode() {
        return membershipCode;
    }

    /**
     * 设置membershipCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMembershipCode(CommonInfo value) {
        this.membershipCode = value;
    }

    /**
     * 获取cash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCash() {
        return cash;
    }

    /**
     * 设置cash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCash(BigDecimal value) {
        this.cash = value;
    }

    /**
     * 获取cashFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashFlag() {
        return cashFlag;
    }

    /**
     * 设置cashFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashFlag(String value) {
        this.cashFlag = value;
    }

    /**
     * 获取hotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getHotel() {
        return hotel;
    }

    /**
     * 设置hotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setHotel(CommonInfo value) {
        this.hotel = value;
    }

    /**
     * 获取couponType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getCouponType() {
        return couponType;
    }

    /**
     * 设置couponType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setCouponType(CommonInfo value) {
        this.couponType = value;
    }

    /**
     * 获取engName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngName() {
        return engName;
    }

    /**
     * 设置engName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngName(String value) {
        this.engName = value;
    }

    /**
     * 获取sortID属性的值。
     * 
     */
    public int getSortID() {
        return sortID;
    }

    /**
     * 设置sortID属性的值。
     * 
     */
    public void setSortID(int value) {
        this.sortID = value;
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
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * 获取ffpCardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpCardType() {
        return ffpCardType;
    }

    /**
     * 设置ffpCardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpCardType(String value) {
        this.ffpCardType = value;
    }

    /**
     * 获取mileages属性的值。
     * 
     */
    public float getMileages() {
        return mileages;
    }

    /**
     * 设置mileages属性的值。
     * 
     */
    public void setMileages(float value) {
        this.mileages = value;
    }

    /**
     * 获取udf1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf1() {
        return udf1;
    }

    /**
     * 设置udf1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf1(String value) {
        this.udf1 = value;
    }

    /**
     * 获取udf2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf2() {
        return udf2;
    }

    /**
     * 设置udf2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf2(String value) {
        this.udf2 = value;
    }

    /**
     * 获取udf3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf3() {
        return udf3;
    }

    /**
     * 设置udf3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf3(String value) {
        this.udf3 = value;
    }

    /**
     * 获取udf4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf4() {
        return udf4;
    }

    /**
     * 设置udf4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf4(String value) {
        this.udf4 = value;
    }

    /**
     * 获取udf5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf5() {
        return udf5;
    }

    /**
     * 设置udf5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf5(String value) {
        this.udf5 = value;
    }

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
     * 获取quantity属性的值。
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
