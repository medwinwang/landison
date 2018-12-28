
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SvcMemberHistoryInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SvcMemberHistoryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountPointsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PlaceCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="SweepFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Seriseno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FbType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CreditNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResvNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CheckNoSpend" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CheckNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guests" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OldBookerCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Special" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OtherRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ServiceRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DrinkRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FbRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RoomRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RoomRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RateCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Nights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TableNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HisType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SvcMemberHistoryInfo", propOrder = {
    "countPointsFlag",
    "placeCode",
    "sweepFlag",
    "seriseno",
    "fbType",
    "source",
    "creditNo",
    "dt",
    "operatorID",
    "resvNo",
    "resvStatus",
    "payment",
    "checkNoSpend",
    "checkNo",
    "guests",
    "oldBookerCardNo",
    "bookerCardNo",
    "bookerCardType",
    "special",
    "discount",
    "totalRev",
    "otherRev",
    "serviceRev",
    "drinkRev",
    "fbRev",
    "roomRev",
    "roomRate",
    "rateCode",
    "roomNumber",
    "roomType",
    "nights",
    "tableNo",
    "departureDate",
    "arrivalDate",
    "points",
    "hisType",
    "subName",
    "guestCode",
    "memberNo",
    "id"
})
public class SvcMemberHistoryInfo
    extends BaseInfo
{

    @XmlElement(name = "CountPointsFlag")
    protected boolean countPointsFlag;
    @XmlElement(name = "PlaceCode")
    protected CommonInfo placeCode;
    @XmlElement(name = "SweepFlag")
    protected String sweepFlag;
    @XmlElement(name = "Seriseno")
    protected String seriseno;
    @XmlElement(name = "FbType")
    protected String fbType;
    @XmlElement(name = "Source")
    protected CommonInfo source;
    @XmlElement(name = "CreditNo")
    protected String creditNo;
    @XmlElement(name = "DT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "ResvNo")
    protected String resvNo;
    @XmlElement(name = "ResvStatus")
    protected String resvStatus;
    @XmlElement(name = "Payment")
    protected CommonInfo payment;
    @XmlElement(name = "CheckNoSpend", required = true)
    protected BigDecimal checkNoSpend;
    @XmlElement(name = "CheckNo")
    protected String checkNo;
    @XmlElement(name = "Guests")
    protected int guests;
    @XmlElement(name = "OldBookerCardNo")
    protected String oldBookerCardNo;
    @XmlElement(name = "BookerCardNo")
    protected String bookerCardNo;
    @XmlElement(name = "BookerCardType")
    protected String bookerCardType;
    @XmlElement(name = "Special")
    protected CommonInfo special;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "TotalRev", required = true)
    protected BigDecimal totalRev;
    @XmlElement(name = "OtherRev", required = true)
    protected BigDecimal otherRev;
    @XmlElement(name = "ServiceRev", required = true)
    protected BigDecimal serviceRev;
    @XmlElement(name = "DrinkRev", required = true)
    protected BigDecimal drinkRev;
    @XmlElement(name = "FbRev", required = true)
    protected BigDecimal fbRev;
    @XmlElement(name = "RoomRev", required = true)
    protected BigDecimal roomRev;
    @XmlElement(name = "RoomRate", required = true)
    protected BigDecimal roomRate;
    @XmlElement(name = "RateCode")
    protected CommonInfo rateCode;
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;
    @XmlElement(name = "RoomType")
    protected CommonInfo roomType;
    @XmlElement(name = "Nights")
    protected int nights;
    @XmlElement(name = "TableNo")
    protected String tableNo;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "HisType")
    protected String hisType;
    @XmlElement(name = "SubName")
    protected String subName;
    @XmlElement(name = "GuestCode")
    protected String guestCode;
    @XmlElement(name = "MemberNo")
    protected CommonInfo memberNo;
    @XmlElement(name = "ID")
    protected int id;

    /**
     * 获取countPointsFlag属性的值。
     * 
     */
    public boolean isCountPointsFlag() {
        return countPointsFlag;
    }

    /**
     * 设置countPointsFlag属性的值。
     * 
     */
    public void setCountPointsFlag(boolean value) {
        this.countPointsFlag = value;
    }

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
     * 获取sweepFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSweepFlag() {
        return sweepFlag;
    }

    /**
     * 设置sweepFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSweepFlag(String value) {
        this.sweepFlag = value;
    }

    /**
     * 获取seriseno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriseno() {
        return seriseno;
    }

    /**
     * 设置seriseno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriseno(String value) {
        this.seriseno = value;
    }

    /**
     * 获取fbType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbType() {
        return fbType;
    }

    /**
     * 设置fbType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbType(String value) {
        this.fbType = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setSource(CommonInfo value) {
        this.source = value;
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
     * 获取resvNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResvNo() {
        return resvNo;
    }

    /**
     * 设置resvNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResvNo(String value) {
        this.resvNo = value;
    }

    /**
     * 获取resvStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResvStatus() {
        return resvStatus;
    }

    /**
     * 设置resvStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResvStatus(String value) {
        this.resvStatus = value;
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
     * 获取checkNoSpend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckNoSpend() {
        return checkNoSpend;
    }

    /**
     * 设置checkNoSpend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckNoSpend(BigDecimal value) {
        this.checkNoSpend = value;
    }

    /**
     * 获取checkNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * 设置checkNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNo(String value) {
        this.checkNo = value;
    }

    /**
     * 获取guests属性的值。
     * 
     */
    public int getGuests() {
        return guests;
    }

    /**
     * 设置guests属性的值。
     * 
     */
    public void setGuests(int value) {
        this.guests = value;
    }

    /**
     * 获取oldBookerCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldBookerCardNo() {
        return oldBookerCardNo;
    }

    /**
     * 设置oldBookerCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldBookerCardNo(String value) {
        this.oldBookerCardNo = value;
    }

    /**
     * 获取bookerCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerCardNo() {
        return bookerCardNo;
    }

    /**
     * 设置bookerCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerCardNo(String value) {
        this.bookerCardNo = value;
    }

    /**
     * 获取bookerCardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerCardType() {
        return bookerCardType;
    }

    /**
     * 设置bookerCardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerCardType(String value) {
        this.bookerCardType = value;
    }

    /**
     * 获取special属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getSpecial() {
        return special;
    }

    /**
     * 设置special属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setSpecial(CommonInfo value) {
        this.special = value;
    }

    /**
     * 获取discount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置discount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * 获取totalRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRev() {
        return totalRev;
    }

    /**
     * 设置totalRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRev(BigDecimal value) {
        this.totalRev = value;
    }

    /**
     * 获取otherRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherRev() {
        return otherRev;
    }

    /**
     * 设置otherRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherRev(BigDecimal value) {
        this.otherRev = value;
    }

    /**
     * 获取serviceRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceRev() {
        return serviceRev;
    }

    /**
     * 设置serviceRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceRev(BigDecimal value) {
        this.serviceRev = value;
    }

    /**
     * 获取drinkRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrinkRev() {
        return drinkRev;
    }

    /**
     * 设置drinkRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrinkRev(BigDecimal value) {
        this.drinkRev = value;
    }

    /**
     * 获取fbRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFbRev() {
        return fbRev;
    }

    /**
     * 设置fbRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFbRev(BigDecimal value) {
        this.fbRev = value;
    }

    /**
     * 获取roomRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoomRev() {
        return roomRev;
    }

    /**
     * 设置roomRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoomRev(BigDecimal value) {
        this.roomRev = value;
    }

    /**
     * 获取roomRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoomRate() {
        return roomRate;
    }

    /**
     * 设置roomRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoomRate(BigDecimal value) {
        this.roomRate = value;
    }

    /**
     * 获取rateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getRateCode() {
        return rateCode;
    }

    /**
     * 设置rateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setRateCode(CommonInfo value) {
        this.rateCode = value;
    }

    /**
     * 获取roomNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * 设置roomNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setRoomType(CommonInfo value) {
        this.roomType = value;
    }

    /**
     * 获取nights属性的值。
     * 
     */
    public int getNights() {
        return nights;
    }

    /**
     * 设置nights属性的值。
     * 
     */
    public void setNights(int value) {
        this.nights = value;
    }

    /**
     * 获取tableNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableNo() {
        return tableNo;
    }

    /**
     * 设置tableNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableNo(String value) {
        this.tableNo = value;
    }

    /**
     * 获取departureDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * 设置departureDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * 获取arrivalDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * 设置arrivalDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
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
     * 获取hisType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHisType() {
        return hisType;
    }

    /**
     * 设置hisType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHisType(String value) {
        this.hisType = value;
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
     * 获取guestCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestCode() {
        return guestCode;
    }

    /**
     * 设置guestCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestCode(String value) {
        this.guestCode = value;
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
