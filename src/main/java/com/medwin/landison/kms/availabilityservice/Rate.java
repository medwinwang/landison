
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Rate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Rate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OGuaranteeRule" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfGuaranteeRule" minOccurs="0"/&gt;
 *         &lt;element name="GroupType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Isfixedrate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinLos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxLos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AdvBookin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxAdvBookin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AvailableLimitRooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Packages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPackage" minOccurs="0"/&gt;
 *         &lt;element name="Market" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Segment" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Source" minOccurs="0"/&gt;
 *         &lt;element name="ShortInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LongInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsStandard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Promotion" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Promotion" minOccurs="0"/&gt;
 *         &lt;element name="RoomtypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarBaseRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DbarRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DbarBaseRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DbarGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DayUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="BasePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseRounding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BasePrecise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseDigitsFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseDigitsTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Yieldable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TaxFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate", propOrder = {
    "oGuaranteeRule",
    "groupType",
    "isfixedrate",
    "cateCode",
    "minLos",
    "maxLos",
    "advBookin",
    "maxAdvBookin",
    "availableLimitRooms",
    "des",
    "basePrice",
    "packages",
    "market",
    "source",
    "shortInfo",
    "longInfo",
    "isStandard",
    "isDiscount",
    "hotelCode",
    "sortId",
    "promotion",
    "roomtypeCode",
    "barRate",
    "barBaseRate",
    "dbarRate",
    "dbarBaseRate",
    "barGroup",
    "dbarGroup",
    "dayUse",
    "baseAmount",
    "basePercent",
    "baseRounding",
    "basePrecise",
    "baseDigitsFrom",
    "baseDigitsTo",
    "yieldable",
    "taxFlag",
    "taxCharge",
    "serviceFlag",
    "serviceCharge"
})
public class Rate
    extends CommonInfo
{

    @XmlElement(name = "OGuaranteeRule")
    protected ArrayOfGuaranteeRule oGuaranteeRule;
    @XmlElement(name = "GroupType")
    protected CommonInfo groupType;
    @XmlElement(name = "Isfixedrate")
    protected boolean isfixedrate;
    @XmlElement(name = "CateCode")
    protected String cateCode;
    @XmlElement(name = "MinLos")
    protected int minLos;
    @XmlElement(name = "MaxLos")
    protected int maxLos;
    @XmlElement(name = "AdvBookin")
    protected int advBookin;
    @XmlElement(name = "MaxAdvBookin")
    protected int maxAdvBookin;
    @XmlElement(name = "AvailableLimitRooms")
    protected String availableLimitRooms;
    @XmlElement(name = "Des")
    protected String des;
    @XmlElement(name = "BasePrice", required = true)
    protected BigDecimal basePrice;
    @XmlElement(name = "Packages")
    protected ArrayOfPackage packages;
    @XmlElement(name = "Market")
    protected Segment market;
    @XmlElement(name = "Source")
    protected Source source;
    @XmlElement(name = "ShortInfo")
    protected String shortInfo;
    @XmlElement(name = "LongInfo")
    protected String longInfo;
    @XmlElement(name = "IsStandard")
    protected String isStandard;
    @XmlElement(name = "IsDiscount")
    protected String isDiscount;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "SortId")
    protected String sortId;
    @XmlElement(name = "Promotion")
    protected Promotion promotion;
    @XmlElement(name = "RoomtypeCode")
    protected String roomtypeCode;
    @XmlElement(name = "BarRate")
    protected String barRate;
    @XmlElement(name = "BarBaseRate")
    protected String barBaseRate;
    @XmlElement(name = "DbarRate")
    protected String dbarRate;
    @XmlElement(name = "DbarBaseRate")
    protected String dbarBaseRate;
    @XmlElement(name = "BarGroup")
    protected String barGroup;
    @XmlElement(name = "DbarGroup")
    protected String dbarGroup;
    @XmlElement(name = "DayUse")
    protected String dayUse;
    @XmlElement(name = "BaseAmount", required = true)
    protected BigDecimal baseAmount;
    @XmlElement(name = "BasePercent")
    protected String basePercent;
    @XmlElement(name = "BaseRounding")
    protected String baseRounding;
    @XmlElement(name = "BasePrecise")
    protected String basePrecise;
    @XmlElement(name = "BaseDigitsFrom")
    protected String baseDigitsFrom;
    @XmlElement(name = "BaseDigitsTo")
    protected String baseDigitsTo;
    @XmlElement(name = "Yieldable")
    protected boolean yieldable;
    @XmlElement(name = "TaxFlag")
    protected String taxFlag;
    @XmlElement(name = "TaxCharge", required = true)
    protected BigDecimal taxCharge;
    @XmlElement(name = "ServiceFlag")
    protected String serviceFlag;
    @XmlElement(name = "ServiceCharge", required = true)
    protected BigDecimal serviceCharge;

    /**
     * 获取oGuaranteeRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuaranteeRule }
     *     
     */
    public ArrayOfGuaranteeRule getOGuaranteeRule() {
        return oGuaranteeRule;
    }

    /**
     * 设置oGuaranteeRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuaranteeRule }
     *     
     */
    public void setOGuaranteeRule(ArrayOfGuaranteeRule value) {
        this.oGuaranteeRule = value;
    }

    /**
     * 获取groupType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getGroupType() {
        return groupType;
    }

    /**
     * 设置groupType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setGroupType(CommonInfo value) {
        this.groupType = value;
    }

    /**
     * 获取isfixedrate属性的值。
     * 
     */
    public boolean isIsfixedrate() {
        return isfixedrate;
    }

    /**
     * 设置isfixedrate属性的值。
     * 
     */
    public void setIsfixedrate(boolean value) {
        this.isfixedrate = value;
    }

    /**
     * 获取cateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCateCode() {
        return cateCode;
    }

    /**
     * 设置cateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCateCode(String value) {
        this.cateCode = value;
    }

    /**
     * 获取minLos属性的值。
     * 
     */
    public int getMinLos() {
        return minLos;
    }

    /**
     * 设置minLos属性的值。
     * 
     */
    public void setMinLos(int value) {
        this.minLos = value;
    }

    /**
     * 获取maxLos属性的值。
     * 
     */
    public int getMaxLos() {
        return maxLos;
    }

    /**
     * 设置maxLos属性的值。
     * 
     */
    public void setMaxLos(int value) {
        this.maxLos = value;
    }

    /**
     * 获取advBookin属性的值。
     * 
     */
    public int getAdvBookin() {
        return advBookin;
    }

    /**
     * 设置advBookin属性的值。
     * 
     */
    public void setAdvBookin(int value) {
        this.advBookin = value;
    }

    /**
     * 获取maxAdvBookin属性的值。
     * 
     */
    public int getMaxAdvBookin() {
        return maxAdvBookin;
    }

    /**
     * 设置maxAdvBookin属性的值。
     * 
     */
    public void setMaxAdvBookin(int value) {
        this.maxAdvBookin = value;
    }

    /**
     * 获取availableLimitRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableLimitRooms() {
        return availableLimitRooms;
    }

    /**
     * 设置availableLimitRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableLimitRooms(String value) {
        this.availableLimitRooms = value;
    }

    /**
     * 获取des属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDes() {
        return des;
    }

    /**
     * 设置des属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDes(String value) {
        this.des = value;
    }

    /**
     * 获取basePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * 设置basePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePrice(BigDecimal value) {
        this.basePrice = value;
    }

    /**
     * 获取packages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackage }
     *     
     */
    public ArrayOfPackage getPackages() {
        return packages;
    }

    /**
     * 设置packages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackage }
     *     
     */
    public void setPackages(ArrayOfPackage value) {
        this.packages = value;
    }

    /**
     * 获取market属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Segment }
     *     
     */
    public Segment getMarket() {
        return market;
    }

    /**
     * 设置market属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Segment }
     *     
     */
    public void setMarket(Segment value) {
        this.market = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * 获取shortInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortInfo() {
        return shortInfo;
    }

    /**
     * 设置shortInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortInfo(String value) {
        this.shortInfo = value;
    }

    /**
     * 获取longInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongInfo() {
        return longInfo;
    }

    /**
     * 设置longInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongInfo(String value) {
        this.longInfo = value;
    }

    /**
     * 获取isStandard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStandard() {
        return isStandard;
    }

    /**
     * 设置isStandard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStandard(String value) {
        this.isStandard = value;
    }

    /**
     * 获取isDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDiscount() {
        return isDiscount;
    }

    /**
     * 设置isDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDiscount(String value) {
        this.isDiscount = value;
    }

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * 获取sortId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortId() {
        return sortId;
    }

    /**
     * 设置sortId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortId(String value) {
        this.sortId = value;
    }

    /**
     * 获取promotion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * 设置promotion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setPromotion(Promotion value) {
        this.promotion = value;
    }

    /**
     * 获取roomtypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomtypeCode() {
        return roomtypeCode;
    }

    /**
     * 设置roomtypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomtypeCode(String value) {
        this.roomtypeCode = value;
    }

    /**
     * 获取barRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarRate() {
        return barRate;
    }

    /**
     * 设置barRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarRate(String value) {
        this.barRate = value;
    }

    /**
     * 获取barBaseRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarBaseRate() {
        return barBaseRate;
    }

    /**
     * 设置barBaseRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarBaseRate(String value) {
        this.barBaseRate = value;
    }

    /**
     * 获取dbarRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbarRate() {
        return dbarRate;
    }

    /**
     * 设置dbarRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbarRate(String value) {
        this.dbarRate = value;
    }

    /**
     * 获取dbarBaseRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbarBaseRate() {
        return dbarBaseRate;
    }

    /**
     * 设置dbarBaseRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbarBaseRate(String value) {
        this.dbarBaseRate = value;
    }

    /**
     * 获取barGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarGroup() {
        return barGroup;
    }

    /**
     * 设置barGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarGroup(String value) {
        this.barGroup = value;
    }

    /**
     * 获取dbarGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbarGroup() {
        return dbarGroup;
    }

    /**
     * 设置dbarGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbarGroup(String value) {
        this.dbarGroup = value;
    }

    /**
     * 获取dayUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayUse() {
        return dayUse;
    }

    /**
     * 设置dayUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayUse(String value) {
        this.dayUse = value;
    }

    /**
     * 获取baseAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    /**
     * 设置baseAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseAmount(BigDecimal value) {
        this.baseAmount = value;
    }

    /**
     * 获取basePercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePercent() {
        return basePercent;
    }

    /**
     * 设置basePercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePercent(String value) {
        this.basePercent = value;
    }

    /**
     * 获取baseRounding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRounding() {
        return baseRounding;
    }

    /**
     * 设置baseRounding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRounding(String value) {
        this.baseRounding = value;
    }

    /**
     * 获取basePrecise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrecise() {
        return basePrecise;
    }

    /**
     * 设置basePrecise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrecise(String value) {
        this.basePrecise = value;
    }

    /**
     * 获取baseDigitsFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDigitsFrom() {
        return baseDigitsFrom;
    }

    /**
     * 设置baseDigitsFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDigitsFrom(String value) {
        this.baseDigitsFrom = value;
    }

    /**
     * 获取baseDigitsTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDigitsTo() {
        return baseDigitsTo;
    }

    /**
     * 设置baseDigitsTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDigitsTo(String value) {
        this.baseDigitsTo = value;
    }

    /**
     * 获取yieldable属性的值。
     * 
     */
    public boolean isYieldable() {
        return yieldable;
    }

    /**
     * 设置yieldable属性的值。
     * 
     */
    public void setYieldable(boolean value) {
        this.yieldable = value;
    }

    /**
     * 获取taxFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFlag() {
        return taxFlag;
    }

    /**
     * 设置taxFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFlag(String value) {
        this.taxFlag = value;
    }

    /**
     * 获取taxCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxCharge() {
        return taxCharge;
    }

    /**
     * 设置taxCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxCharge(BigDecimal value) {
        this.taxCharge = value;
    }

    /**
     * 获取serviceFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFlag() {
        return serviceFlag;
    }

    /**
     * 设置serviceFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFlag(String value) {
        this.serviceFlag = value;
    }

    /**
     * 获取serviceCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * 设置serviceCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceCharge(BigDecimal value) {
        this.serviceCharge = value;
    }

}
