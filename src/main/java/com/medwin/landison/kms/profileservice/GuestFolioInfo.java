
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>GuestFolioInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuestFolioInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolioNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Nights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rooms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Adult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Child" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RateReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ta1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ta2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Geo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Geo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnexpDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnexpStay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoShow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reinstated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WalkIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarlyCi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelayCo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CxlDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TtlRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RoomRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FbRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OtherRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ShareNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SalesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GhNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guests" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hotel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="GAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BookerPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestFolioInfo", propOrder = {
    "folioNo",
    "guestCode",
    "guestName",
    "arrival",
    "departure",
    "nights",
    "rooms",
    "roomType",
    "roomNo",
    "rateCode",
    "groupID",
    "language",
    "adult",
    "child",
    "rateReason",
    "ta1",
    "ta2",
    "companyName",
    "geo1",
    "geo2",
    "origin",
    "building",
    "market",
    "folioType",
    "unexpDep",
    "unexpStay",
    "noShow",
    "reinstated",
    "walkIn",
    "earlyCi",
    "delayCo",
    "resDate",
    "cxlDate",
    "ttlRev",
    "roomRev",
    "fbRev",
    "otherRev",
    "shareNo",
    "rate",
    "salesCode",
    "balance",
    "sex",
    "ghNo",
    "bookerNo",
    "flag",
    "payment",
    "channel",
    "cAccount",
    "tAccount",
    "sAccount",
    "guests",
    "source",
    "nonRev",
    "hotelCode",
    "hotel",
    "gAccount",
    "countPoints",
    "points",
    "bookerPoints"
})
public class GuestFolioInfo
    extends BaseInfo
{

    @XmlElement(name = "FolioNo")
    protected String folioNo;
    @XmlElement(name = "GuestCode")
    protected String guestCode;
    @XmlElement(name = "GuestName")
    protected String guestName;
    @XmlElement(name = "Arrival", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrival;
    @XmlElement(name = "Departure", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departure;
    @XmlElement(name = "Nights")
    protected int nights;
    @XmlElement(name = "Rooms")
    protected int rooms;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "RoomNo")
    protected String roomNo;
    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "GroupID")
    protected String groupID;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Adult")
    protected int adult;
    @XmlElement(name = "Child")
    protected int child;
    @XmlElement(name = "RateReason")
    protected String rateReason;
    @XmlElement(name = "Ta1")
    protected String ta1;
    @XmlElement(name = "Ta2")
    protected String ta2;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "Geo1")
    protected String geo1;
    @XmlElement(name = "Geo2")
    protected String geo2;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Market")
    protected String market;
    @XmlElement(name = "FolioType")
    protected String folioType;
    @XmlElement(name = "UnexpDep")
    protected String unexpDep;
    @XmlElement(name = "UnexpStay")
    protected String unexpStay;
    @XmlElement(name = "NoShow")
    protected String noShow;
    @XmlElement(name = "Reinstated")
    protected String reinstated;
    @XmlElement(name = "WalkIn")
    protected String walkIn;
    @XmlElement(name = "EarlyCi")
    protected String earlyCi;
    @XmlElement(name = "DelayCo")
    protected String delayCo;
    @XmlElement(name = "ResDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resDate;
    @XmlElement(name = "CxlDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cxlDate;
    @XmlElement(name = "TtlRev", required = true)
    protected BigDecimal ttlRev;
    @XmlElement(name = "RoomRev", required = true)
    protected BigDecimal roomRev;
    @XmlElement(name = "FbRev", required = true)
    protected BigDecimal fbRev;
    @XmlElement(name = "OtherRev", required = true)
    protected BigDecimal otherRev;
    @XmlElement(name = "ShareNo")
    protected String shareNo;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "SalesCode")
    protected String salesCode;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "GhNo")
    protected String ghNo;
    @XmlElement(name = "BookerNo")
    protected String bookerNo;
    @XmlElement(name = "Flag")
    protected String flag;
    @XmlElement(name = "Payment")
    protected String payment;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "CAccount")
    protected String cAccount;
    @XmlElement(name = "TAccount")
    protected String tAccount;
    @XmlElement(name = "SAccount")
    protected String sAccount;
    @XmlElement(name = "Guests")
    protected int guests;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "NonRev", required = true)
    protected BigDecimal nonRev;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "Hotel")
    protected CommonInfo hotel;
    @XmlElement(name = "GAccount")
    protected String gAccount;
    @XmlElement(name = "CountPoints")
    protected String countPoints;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "BookerPoints")
    protected int bookerPoints;

    /**
     * 获取folioNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioNo() {
        return folioNo;
    }

    /**
     * 设置folioNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioNo(String value) {
        this.folioNo = value;
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
     * 获取guestName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * 设置guestName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
    }

    /**
     * 获取arrival属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrival() {
        return arrival;
    }

    /**
     * 设置arrival属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrival(XMLGregorianCalendar value) {
        this.arrival = value;
    }

    /**
     * 获取departure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeparture() {
        return departure;
    }

    /**
     * 设置departure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeparture(XMLGregorianCalendar value) {
        this.departure = value;
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
     * 获取rooms属性的值。
     * 
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * 设置rooms属性的值。
     * 
     */
    public void setRooms(int value) {
        this.rooms = value;
    }

    /**
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * 获取roomNo属性的值。
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
     * 设置roomNo属性的值。
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
     * 获取rateCode属性的值。
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
     * 设置rateCode属性的值。
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
     * 获取groupID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * 设置groupID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * 获取adult属性的值。
     * 
     */
    public int getAdult() {
        return adult;
    }

    /**
     * 设置adult属性的值。
     * 
     */
    public void setAdult(int value) {
        this.adult = value;
    }

    /**
     * 获取child属性的值。
     * 
     */
    public int getChild() {
        return child;
    }

    /**
     * 设置child属性的值。
     * 
     */
    public void setChild(int value) {
        this.child = value;
    }

    /**
     * 获取rateReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateReason() {
        return rateReason;
    }

    /**
     * 设置rateReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateReason(String value) {
        this.rateReason = value;
    }

    /**
     * 获取ta1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTa1() {
        return ta1;
    }

    /**
     * 设置ta1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTa1(String value) {
        this.ta1 = value;
    }

    /**
     * 获取ta2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTa2() {
        return ta2;
    }

    /**
     * 设置ta2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTa2(String value) {
        this.ta2 = value;
    }

    /**
     * 获取companyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * 获取geo1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo1() {
        return geo1;
    }

    /**
     * 设置geo1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo1(String value) {
        this.geo1 = value;
    }

    /**
     * 获取geo2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo2() {
        return geo2;
    }

    /**
     * 设置geo2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo2(String value) {
        this.geo2 = value;
    }

    /**
     * 获取origin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 设置origin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * 获取building属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * 设置building属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * 获取market属性的值。
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
     * 设置market属性的值。
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
     * 获取folioType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioType() {
        return folioType;
    }

    /**
     * 设置folioType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioType(String value) {
        this.folioType = value;
    }

    /**
     * 获取unexpDep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnexpDep() {
        return unexpDep;
    }

    /**
     * 设置unexpDep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnexpDep(String value) {
        this.unexpDep = value;
    }

    /**
     * 获取unexpStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnexpStay() {
        return unexpStay;
    }

    /**
     * 设置unexpStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnexpStay(String value) {
        this.unexpStay = value;
    }

    /**
     * 获取noShow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoShow() {
        return noShow;
    }

    /**
     * 设置noShow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoShow(String value) {
        this.noShow = value;
    }

    /**
     * 获取reinstated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReinstated() {
        return reinstated;
    }

    /**
     * 设置reinstated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReinstated(String value) {
        this.reinstated = value;
    }

    /**
     * 获取walkIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalkIn() {
        return walkIn;
    }

    /**
     * 设置walkIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalkIn(String value) {
        this.walkIn = value;
    }

    /**
     * 获取earlyCi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyCi() {
        return earlyCi;
    }

    /**
     * 设置earlyCi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyCi(String value) {
        this.earlyCi = value;
    }

    /**
     * 获取delayCo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayCo() {
        return delayCo;
    }

    /**
     * 设置delayCo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayCo(String value) {
        this.delayCo = value;
    }

    /**
     * 获取resDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResDate() {
        return resDate;
    }

    /**
     * 设置resDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResDate(XMLGregorianCalendar value) {
        this.resDate = value;
    }

    /**
     * 获取cxlDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCxlDate() {
        return cxlDate;
    }

    /**
     * 设置cxlDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCxlDate(XMLGregorianCalendar value) {
        this.cxlDate = value;
    }

    /**
     * 获取ttlRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlRev() {
        return ttlRev;
    }

    /**
     * 设置ttlRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlRev(BigDecimal value) {
        this.ttlRev = value;
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
     * 获取shareNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareNo() {
        return shareNo;
    }

    /**
     * 设置shareNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareNo(String value) {
        this.shareNo = value;
    }

    /**
     * 获取rate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置rate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * 获取salesCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCode() {
        return salesCode;
    }

    /**
     * 设置salesCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCode(String value) {
        this.salesCode = value;
    }

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * 获取ghNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhNo() {
        return ghNo;
    }

    /**
     * 设置ghNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhNo(String value) {
        this.ghNo = value;
    }

    /**
     * 获取bookerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerNo() {
        return bookerNo;
    }

    /**
     * 设置bookerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerNo(String value) {
        this.bookerNo = value;
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
     * 获取payment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 设置payment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayment(String value) {
        this.payment = value;
    }

    /**
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * 获取cAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAccount() {
        return cAccount;
    }

    /**
     * 设置cAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAccount(String value) {
        this.cAccount = value;
    }

    /**
     * 获取tAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAccount() {
        return tAccount;
    }

    /**
     * 设置tAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAccount(String value) {
        this.tAccount = value;
    }

    /**
     * 获取sAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAccount() {
        return sAccount;
    }

    /**
     * 设置sAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAccount(String value) {
        this.sAccount = value;
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
     * 获取source属性的值。
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
     * 设置source属性的值。
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
     * 获取nonRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonRev() {
        return nonRev;
    }

    /**
     * 设置nonRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonRev(BigDecimal value) {
        this.nonRev = value;
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
     * 获取gAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGAccount() {
        return gAccount;
    }

    /**
     * 设置gAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGAccount(String value) {
        this.gAccount = value;
    }

    /**
     * 获取countPoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountPoints() {
        return countPoints;
    }

    /**
     * 设置countPoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountPoints(String value) {
        this.countPoints = value;
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
     * 获取bookerPoints属性的值。
     * 
     */
    public int getBookerPoints() {
        return bookerPoints;
    }

    /**
     * 设置bookerPoints属性的值。
     * 
     */
    public void setBookerPoints(int value) {
        this.bookerPoints = value;
    }

}
