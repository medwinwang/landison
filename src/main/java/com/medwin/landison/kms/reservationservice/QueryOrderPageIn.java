
package com.medwin.landison.kms.reservationservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>QueryOrderPageIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryOrderPageIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BeginArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BeginDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BeginInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Hotels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Party" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Party" minOccurs="0"/&gt;
 *         &lt;element name="PageInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PageInfo" minOccurs="0"/&gt;
 *         &lt;element name="BlockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelConfirmID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShareCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelCancelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsCancelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChineseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsRtOrigOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOrderPageIn", propOrder = {
    "id",
    "beginArrivalDate",
    "endArrivalDate",
    "beginDepartureDate",
    "endDepartureDate",
    "beginInsertDate",
    "endInsertDate",
    "hotels",
    "firstName",
    "lastName",
    "profileId",
    "account",
    "cardNumber",
    "phoneNumber",
    "party",
    "pageInfo",
    "blockCode",
    "channelConfirmID",
    "pmsId",
    "shareCode",
    "channel",
    "insertUser",
    "cancelId",
    "channelCancelId",
    "pmsCancelId",
    "chineseName",
    "bookerName",
    "bookerMobile",
    "statusCode",
    "companyType",
    "roomNo",
    "isRtOrigOrder"
})
public class QueryOrderPageIn {

    protected int id;
    @XmlElement(name = "BeginArrivalDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date beginArrivalDate;
    @XmlElement(name = "EndArrivalDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endArrivalDate;
    @XmlElement(name = "BeginDepartureDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date beginDepartureDate;
    @XmlElement(name = "EndDepartureDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDepartureDate;
    @XmlElement(name = "BeginInsertDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date beginInsertDate;
    @XmlElement(name = "EndInsertDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endInsertDate;
    @XmlElement(name = "Hotels")
    protected String hotels;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "ProfileId")
    protected Integer profileId;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "Party")
    protected Party party;
    @XmlElement(name = "PageInfo")
    protected PageInfo pageInfo;
    @XmlElement(name = "BlockCode")
    protected String blockCode;
    @XmlElement(name = "ChannelConfirmID")
    protected String channelConfirmID;
    @XmlElement(name = "PmsId")
    protected String pmsId;
    @XmlElement(name = "ShareCode")
    protected String shareCode;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "InsertUser")
    protected String insertUser;
    @XmlElement(name = "CancelId")
    protected String cancelId;
    @XmlElement(name = "ChannelCancelId")
    protected String channelCancelId;
    @XmlElement(name = "PmsCancelId")
    protected String pmsCancelId;
    @XmlElement(name = "ChineseName")
    protected String chineseName;
    @XmlElement(name = "BookerName")
    protected String bookerName;
    @XmlElement(name = "BookerMobile")
    protected String bookerMobile;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "CompanyType")
    protected String companyType;
    @XmlElement(name = "RoomNo")
    protected String roomNo;
    @XmlElement(name = "IsRtOrigOrder")
    protected String isRtOrigOrder;

    /**
     * 获取id属性的值。
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * 获取beginArrivalDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBeginArrivalDate() {
        return beginArrivalDate;
    }

    /**
     * 设置beginArrivalDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginArrivalDate(Date value) {
        this.beginArrivalDate = value;
    }

    /**
     * 获取endArrivalDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndArrivalDate() {
        return endArrivalDate;
    }

    /**
     * 设置endArrivalDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndArrivalDate(Date value) {
        this.endArrivalDate = value;
    }

    /**
     * 获取beginDepartureDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBeginDepartureDate() {
        return beginDepartureDate;
    }

    /**
     * 设置beginDepartureDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDepartureDate(Date value) {
        this.beginDepartureDate = value;
    }

    /**
     * 获取endDepartureDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDepartureDate() {
        return endDepartureDate;
    }

    /**
     * 设置endDepartureDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDepartureDate(Date value) {
        this.endDepartureDate = value;
    }

    /**
     * 获取beginInsertDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBeginInsertDate() {
        return beginInsertDate;
    }

    /**
     * 设置beginInsertDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginInsertDate(Date value) {
        this.beginInsertDate = value;
    }

    /**
     * 获取endInsertDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndInsertDate() {
        return endInsertDate;
    }

    /**
     * 设置endInsertDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndInsertDate(Date value) {
        this.endInsertDate = value;
    }

    /**
     * 获取hotels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotels() {
        return hotels;
    }

    /**
     * 设置hotels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotels(String value) {
        this.hotels = value;
    }

    /**
     * 获取firstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * 获取lastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置lastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * 获取profileId属性的值。
     * 
     */
    public Integer getProfileId() {
        return profileId;
    }

    /**
     * 设置profileId属性的值。
     * 
     */
    public void setProfileId(Integer value) {
        this.profileId = value;
    }

    /**
     * 获取account属性的值。
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
     * 设置account属性的值。
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
     * 获取cardNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置cardNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * 获取phoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置phoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * 获取party属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * 设置party属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

    /**
     * 获取pageInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PageInfo }
     *     
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * 设置pageInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PageInfo }
     *     
     */
    public void setPageInfo(PageInfo value) {
        this.pageInfo = value;
    }

    /**
     * 获取blockCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockCode() {
        return blockCode;
    }

    /**
     * 设置blockCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockCode(String value) {
        this.blockCode = value;
    }

    /**
     * 获取channelConfirmID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelConfirmID() {
        return channelConfirmID;
    }

    /**
     * 设置channelConfirmID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelConfirmID(String value) {
        this.channelConfirmID = value;
    }

    /**
     * 获取pmsId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsId() {
        return pmsId;
    }

    /**
     * 设置pmsId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsId(String value) {
        this.pmsId = value;
    }

    /**
     * 获取shareCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareCode() {
        return shareCode;
    }

    /**
     * 设置shareCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareCode(String value) {
        this.shareCode = value;
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
     * 获取insertUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertUser() {
        return insertUser;
    }

    /**
     * 设置insertUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertUser(String value) {
        this.insertUser = value;
    }

    /**
     * 获取cancelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelId() {
        return cancelId;
    }

    /**
     * 设置cancelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelId(String value) {
        this.cancelId = value;
    }

    /**
     * 获取channelCancelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCancelId() {
        return channelCancelId;
    }

    /**
     * 设置channelCancelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCancelId(String value) {
        this.channelCancelId = value;
    }

    /**
     * 获取pmsCancelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsCancelId() {
        return pmsCancelId;
    }

    /**
     * 设置pmsCancelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsCancelId(String value) {
        this.pmsCancelId = value;
    }

    /**
     * 获取chineseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * 设置chineseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChineseName(String value) {
        this.chineseName = value;
    }

    /**
     * 获取bookerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerName() {
        return bookerName;
    }

    /**
     * 设置bookerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerName(String value) {
        this.bookerName = value;
    }

    /**
     * 获取bookerMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerMobile() {
        return bookerMobile;
    }

    /**
     * 设置bookerMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerMobile(String value) {
        this.bookerMobile = value;
    }

    /**
     * 获取statusCode属性的值。
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
     * 设置statusCode属性的值。
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
     * 获取companyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 设置companyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
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
     * 获取isRtOrigOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRtOrigOrder() {
        return isRtOrigOrder;
    }

    /**
     * 设置isRtOrigOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRtOrigOrder(String value) {
        this.isRtOrigOrder = value;
    }

}
