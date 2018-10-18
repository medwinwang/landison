
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Rate complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡoGuaranteeRule���Ե�ֵ��
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
     * ����oGuaranteeRule���Ե�ֵ��
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
     * ��ȡgroupType���Ե�ֵ��
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
     * ����groupType���Ե�ֵ��
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
     * ��ȡisfixedrate���Ե�ֵ��
     * 
     */
    public boolean isIsfixedrate() {
        return isfixedrate;
    }

    /**
     * ����isfixedrate���Ե�ֵ��
     * 
     */
    public void setIsfixedrate(boolean value) {
        this.isfixedrate = value;
    }

    /**
     * ��ȡcateCode���Ե�ֵ��
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
     * ����cateCode���Ե�ֵ��
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
     * ��ȡminLos���Ե�ֵ��
     * 
     */
    public int getMinLos() {
        return minLos;
    }

    /**
     * ����minLos���Ե�ֵ��
     * 
     */
    public void setMinLos(int value) {
        this.minLos = value;
    }

    /**
     * ��ȡmaxLos���Ե�ֵ��
     * 
     */
    public int getMaxLos() {
        return maxLos;
    }

    /**
     * ����maxLos���Ե�ֵ��
     * 
     */
    public void setMaxLos(int value) {
        this.maxLos = value;
    }

    /**
     * ��ȡadvBookin���Ե�ֵ��
     * 
     */
    public int getAdvBookin() {
        return advBookin;
    }

    /**
     * ����advBookin���Ե�ֵ��
     * 
     */
    public void setAdvBookin(int value) {
        this.advBookin = value;
    }

    /**
     * ��ȡmaxAdvBookin���Ե�ֵ��
     * 
     */
    public int getMaxAdvBookin() {
        return maxAdvBookin;
    }

    /**
     * ����maxAdvBookin���Ե�ֵ��
     * 
     */
    public void setMaxAdvBookin(int value) {
        this.maxAdvBookin = value;
    }

    /**
     * ��ȡavailableLimitRooms���Ե�ֵ��
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
     * ����availableLimitRooms���Ե�ֵ��
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
     * ��ȡdes���Ե�ֵ��
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
     * ����des���Ե�ֵ��
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
     * ��ȡbasePrice���Ե�ֵ��
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
     * ����basePrice���Ե�ֵ��
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
     * ��ȡpackages���Ե�ֵ��
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
     * ����packages���Ե�ֵ��
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
     * ��ȡmarket���Ե�ֵ��
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
     * ����market���Ե�ֵ��
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
     * ��ȡsource���Ե�ֵ��
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
     * ����source���Ե�ֵ��
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
     * ��ȡshortInfo���Ե�ֵ��
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
     * ����shortInfo���Ե�ֵ��
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
     * ��ȡlongInfo���Ե�ֵ��
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
     * ����longInfo���Ե�ֵ��
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
     * ��ȡisStandard���Ե�ֵ��
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
     * ����isStandard���Ե�ֵ��
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
     * ��ȡisDiscount���Ե�ֵ��
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
     * ����isDiscount���Ե�ֵ��
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
     * ��ȡhotelCode���Ե�ֵ��
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
     * ����hotelCode���Ե�ֵ��
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
     * ��ȡsortId���Ե�ֵ��
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
     * ����sortId���Ե�ֵ��
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
     * ��ȡpromotion���Ե�ֵ��
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
     * ����promotion���Ե�ֵ��
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
     * ��ȡroomtypeCode���Ե�ֵ��
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
     * ����roomtypeCode���Ե�ֵ��
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
     * ��ȡbarRate���Ե�ֵ��
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
     * ����barRate���Ե�ֵ��
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
     * ��ȡbarBaseRate���Ե�ֵ��
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
     * ����barBaseRate���Ե�ֵ��
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
     * ��ȡdbarRate���Ե�ֵ��
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
     * ����dbarRate���Ե�ֵ��
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
     * ��ȡdbarBaseRate���Ե�ֵ��
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
     * ����dbarBaseRate���Ե�ֵ��
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
     * ��ȡbarGroup���Ե�ֵ��
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
     * ����barGroup���Ե�ֵ��
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
     * ��ȡdbarGroup���Ե�ֵ��
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
     * ����dbarGroup���Ե�ֵ��
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
     * ��ȡdayUse���Ե�ֵ��
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
     * ����dayUse���Ե�ֵ��
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
     * ��ȡbaseAmount���Ե�ֵ��
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
     * ����baseAmount���Ե�ֵ��
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
     * ��ȡbasePercent���Ե�ֵ��
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
     * ����basePercent���Ե�ֵ��
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
     * ��ȡbaseRounding���Ե�ֵ��
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
     * ����baseRounding���Ե�ֵ��
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
     * ��ȡbasePrecise���Ե�ֵ��
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
     * ����basePrecise���Ե�ֵ��
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
     * ��ȡbaseDigitsFrom���Ե�ֵ��
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
     * ����baseDigitsFrom���Ե�ֵ��
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
     * ��ȡbaseDigitsTo���Ե�ֵ��
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
     * ����baseDigitsTo���Ե�ֵ��
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
     * ��ȡyieldable���Ե�ֵ��
     * 
     */
    public boolean isYieldable() {
        return yieldable;
    }

    /**
     * ����yieldable���Ե�ֵ��
     * 
     */
    public void setYieldable(boolean value) {
        this.yieldable = value;
    }

    /**
     * ��ȡtaxFlag���Ե�ֵ��
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
     * ����taxFlag���Ե�ֵ��
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
     * ��ȡtaxCharge���Ե�ֵ��
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
     * ����taxCharge���Ե�ֵ��
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
     * ��ȡserviceFlag���Ե�ֵ��
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
     * ����serviceFlag���Ե�ֵ��
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
     * ��ȡserviceCharge���Ե�ֵ��
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
     * ����serviceCharge���Ե�ֵ��
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
