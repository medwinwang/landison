
package com.medwin.landison.kms.reservationservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>OrderRoomStayInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OrderRoomStayInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CurrencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DiscountReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraBed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Couponcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CouponNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AavailableRooms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsInverse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRoomStayInfo", propOrder = {
    "id",
    "orderID",
    "dt",
    "roomTypeCode",
    "rateAmount",
    "tax",
    "discountPercentage",
    "serviceCharge",
    "currencyType",
    "discountAmount",
    "discountPercent",
    "discountReason",
    "statusCode",
    "roomNum",
    "adults",
    "comments",
    "lastOperator",
    "extraBed",
    "roomNo",
    "children",
    "rateCode",
    "fixedRate",
    "source",
    "market",
    "rtc",
    "couponcode",
    "points",
    "couponNum",
    "aavailableRooms",
    "serialNumber",
    "isInverse"
})
public class OrderRoomStayInfo
    extends BaseInfo
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "OrderID")
    protected int orderID;
    @XmlElement(name = "DT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String dt;
    @XmlElement(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlElement(name = "RateAmount", required = true)
    protected BigDecimal rateAmount;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "DiscountPercentage")
    protected String discountPercentage;
    @XmlElement(name = "ServiceCharge", required = true)
    protected BigDecimal serviceCharge;
    @XmlElement(name = "CurrencyType")
    protected String currencyType;
    @XmlElement(name = "DiscountAmount", required = true)
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountPercent", required = true)
    protected BigDecimal discountPercent;
    @XmlElement(name = "DiscountReason")
    protected String discountReason;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "RoomNum")
    protected int roomNum;
    @XmlElement(name = "Adults")
    protected int adults;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "LastOperator")
    protected String lastOperator;
    @XmlElement(name = "ExtraBed")
    protected int extraBed;
    @XmlElement(name = "RoomNo")
    protected String roomNo;
    @XmlElement(name = "Children")
    protected int children;
    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "FixedRate")
    protected String fixedRate;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Market")
    protected String market;
    @XmlElement(name = "RTC")
    protected String rtc;
    @XmlElement(name = "Couponcode")
    protected String couponcode;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "CouponNum")
    protected int couponNum;
    @XmlElement(name = "AavailableRooms")
    protected int aavailableRooms;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "IsInverse")
    protected boolean isInverse;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * ��ȡorderID���Ե�ֵ��
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * ����orderID���Ե�ֵ��
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * ��ȡdt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDT() {
        return dt;
    }

    /**
     * ����dt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDT(String value) {
        this.dt = value;
    }

    /**
     * ��ȡroomTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * ����roomTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * ��ȡrateAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateAmount() {
        return rateAmount;
    }

    /**
     * ����rateAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateAmount(BigDecimal value) {
        this.rateAmount = value;
    }

    /**
     * ��ȡtax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * ����tax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * ��ȡdiscountPercentage���Ե�ֵ��
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
     * ����discountPercentage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercentage(String value) {
        this.discountPercentage = value;
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

    /**
     * ��ȡcurrencyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * ����currencyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * ��ȡdiscountAmount���Ե�ֵ��
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
     * ����discountAmount���Ե�ֵ��
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
     * ��ȡdiscountPercent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * ����discountPercent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * ��ȡdiscountReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountReason() {
        return discountReason;
    }

    /**
     * ����discountReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountReason(String value) {
        this.discountReason = value;
    }

    /**
     * ��ȡstatusCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * ����statusCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * ��ȡroomNum���Ե�ֵ��
     * 
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * ����roomNum���Ե�ֵ��
     * 
     */
    public void setRoomNum(int value) {
        this.roomNum = value;
    }

    /**
     * ��ȡadults���Ե�ֵ��
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * ����adults���Ե�ֵ��
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * ��ȡlastOperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastOperator() {
        return lastOperator;
    }

    /**
     * ����lastOperator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOperator(String value) {
        this.lastOperator = value;
    }

    /**
     * ��ȡextraBed���Ե�ֵ��
     * 
     */
    public int getExtraBed() {
        return extraBed;
    }

    /**
     * ����extraBed���Ե�ֵ��
     * 
     */
    public void setExtraBed(int value) {
        this.extraBed = value;
    }

    /**
     * ��ȡroomNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * ����roomNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

    /**
     * ��ȡchildren���Ե�ֵ��
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * ����children���Ե�ֵ��
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * ��ȡrateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * ����rateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * ��ȡfixedRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedRate() {
        return fixedRate;
    }

    /**
     * ����fixedRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedRate(String value) {
        this.fixedRate = value;
    }

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * ��ȡmarket���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * ����market���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * ��ȡrtc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTC() {
        return rtc;
    }

    /**
     * ����rtc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTC(String value) {
        this.rtc = value;
    }

    /**
     * ��ȡcouponcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponcode() {
        return couponcode;
    }

    /**
     * ����couponcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponcode(String value) {
        this.couponcode = value;
    }

    /**
     * ��ȡpoints���Ե�ֵ��
     * 
     */
    public int getPoints() {
        return points;
    }

    /**
     * ����points���Ե�ֵ��
     * 
     */
    public void setPoints(int value) {
        this.points = value;
    }

    /**
     * ��ȡcouponNum���Ե�ֵ��
     * 
     */
    public int getCouponNum() {
        return couponNum;
    }

    /**
     * ����couponNum���Ե�ֵ��
     * 
     */
    public void setCouponNum(int value) {
        this.couponNum = value;
    }

    /**
     * ��ȡaavailableRooms���Ե�ֵ��
     * 
     */
    public int getAavailableRooms() {
        return aavailableRooms;
    }

    /**
     * ����aavailableRooms���Ե�ֵ��
     * 
     */
    public void setAavailableRooms(int value) {
        this.aavailableRooms = value;
    }

    /**
     * ��ȡserialNumber���Ե�ֵ��
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
     * ����serialNumber���Ե�ֵ��
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
     * ��ȡisInverse���Ե�ֵ��
     * 
     */
    public boolean isIsInverse() {
        return isInverse;
    }

    /**
     * ����isInverse���Ե�ֵ��
     * 
     */
    public void setIsInverse(boolean value) {
        this.isInverse = value;
    }

}
