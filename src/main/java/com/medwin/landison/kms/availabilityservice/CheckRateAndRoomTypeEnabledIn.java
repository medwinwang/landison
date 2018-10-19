
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>CheckRateAndRoomTypeEnabledIn complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CheckRateAndRoomTypeEnabledIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Packages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSeparateSoldPackages" minOccurs="0"/&gt;
 *         &lt;element name="ChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Adult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExtraBed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BarType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BarType"/&gt;
 *         &lt;element name="GuestTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRateAndRoomTypeEnabledIn", propOrder = {
    "packages",
    "channelCode",
    "hotelCode",
    "rateCode",
    "roomTypeCode",
    "arrival",
    "departure",
    "adult",
    "children",
    "extraBed",
    "roomNumber",
    "barType",
    "guestTypeCode",
    "memberID",
    "account",
    "cardType",
    "cardLevel",
    "groupType"
})
public class CheckRateAndRoomTypeEnabledIn {

    @XmlElement(name = "Packages")
    protected ArrayOfSeparateSoldPackages packages;
    @XmlElement(name = "ChannelCode")
    protected String channelCode;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlElement(name = "Arrival", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String arrival;
    @XmlElement(name = "Departure", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String departure;
    @XmlElement(name = "Adult")
    protected int adult;
    @XmlElement(name = "Children")
    protected int children;
    @XmlElement(name = "ExtraBed")
    protected int extraBed;
    @XmlElement(name = "RoomNumber")
    protected int roomNumber;
    @XmlElement(name = "BarType", required = true)
    @XmlSchemaType(name = "string")
    protected BarType barType;
    @XmlElement(name = "GuestTypeCode")
    protected String guestTypeCode;
    @XmlElement(name = "MemberID")
    protected String memberID;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "CardLevel")
    protected String cardLevel;
    @XmlElement(name = "GroupType")
    protected String groupType;

    /**
     * ��ȡpackages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeparateSoldPackages }
     *     
     */
    public ArrayOfSeparateSoldPackages getPackages() {
        return packages;
    }

    /**
     * ����packages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeparateSoldPackages }
     *     
     */
    public void setPackages(ArrayOfSeparateSoldPackages value) {
        this.packages = value;
    }

    /**
     * ��ȡchannelCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * ����channelCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
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
     * ��ȡarrival���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * ����arrival���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrival(String value) {
        this.arrival = value;
    }

    /**
     * ��ȡdeparture���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * ����departure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparture(String value) {
        this.departure = value;
    }

    /**
     * ��ȡadult���Ե�ֵ��
     * 
     */
    public int getAdult() {
        return adult;
    }

    /**
     * ����adult���Ե�ֵ��
     * 
     */
    public void setAdult(int value) {
        this.adult = value;
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
     * ��ȡroomNumber���Ե�ֵ��
     * 
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * ����roomNumber���Ե�ֵ��
     * 
     */
    public void setRoomNumber(int value) {
        this.roomNumber = value;
    }

    /**
     * ��ȡbarType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BarType }
     *     
     */
    public BarType getBarType() {
        return barType;
    }

    /**
     * ����barType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BarType }
     *     
     */
    public void setBarType(BarType value) {
        this.barType = value;
    }

    /**
     * ��ȡguestTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestTypeCode() {
        return guestTypeCode;
    }

    /**
     * ����guestTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestTypeCode(String value) {
        this.guestTypeCode = value;
    }

    /**
     * ��ȡmemberID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * ����memberID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberID(String value) {
        this.memberID = value;
    }

    /**
     * ��ȡaccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * ����account���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * ��ȡcardType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * ����cardType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * ��ȡcardLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLevel() {
        return cardLevel;
    }

    /**
     * ����cardLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLevel(String value) {
        this.cardLevel = value;
    }

    /**
     * ��ȡgroupType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * ����groupType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

}
