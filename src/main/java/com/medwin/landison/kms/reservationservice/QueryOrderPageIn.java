
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>QueryOrderPageIn complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    @XmlElement(name = "BeginArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String beginArrivalDate;
    @XmlElement(name = "EndArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String endArrivalDate;
    @XmlElement(name = "BeginDepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String beginDepartureDate;
    @XmlElement(name = "EndDepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String endDepartureDate;
    @XmlElement(name = "BeginInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String beginInsertDate;
    @XmlElement(name = "EndInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String endInsertDate;
    @XmlElement(name = "Hotels")
    protected String hotels;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "ProfileId")
    protected int profileId;
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
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * ��ȡbeginArrivalDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginArrivalDate() {
        return beginArrivalDate;
    }

    /**
     * ����beginArrivalDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginArrivalDate(String value) {
        this.beginArrivalDate = value;
    }

    /**
     * ��ȡendArrivalDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndArrivalDate() {
        return endArrivalDate;
    }

    /**
     * ����endArrivalDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndArrivalDate(String value) {
        this.endArrivalDate = value;
    }

    /**
     * ��ȡbeginDepartureDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDepartureDate() {
        return beginDepartureDate;
    }

    /**
     * ����beginDepartureDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDepartureDate(String value) {
        this.beginDepartureDate = value;
    }

    /**
     * ��ȡendDepartureDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDepartureDate() {
        return endDepartureDate;
    }

    /**
     * ����endDepartureDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDepartureDate(String value) {
        this.endDepartureDate = value;
    }

    /**
     * ��ȡbeginInsertDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginInsertDate() {
        return beginInsertDate;
    }

    /**
     * ����beginInsertDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginInsertDate(String value) {
        this.beginInsertDate = value;
    }

    /**
     * ��ȡendInsertDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndInsertDate() {
        return endInsertDate;
    }

    /**
     * ����endInsertDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndInsertDate(String value) {
        this.endInsertDate = value;
    }

    /**
     * ��ȡhotels���Ե�ֵ��
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
     * ����hotels���Ե�ֵ��
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
     * ��ȡfirstName���Ե�ֵ��
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
     * ����firstName���Ե�ֵ��
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
     * ��ȡlastName���Ե�ֵ��
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
     * ����lastName���Ե�ֵ��
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
     * ��ȡprofileId���Ե�ֵ��
     * 
     */
    public int getProfileId() {
        return profileId;
    }

    /**
     * ����profileId���Ե�ֵ��
     * 
     */
    public void setProfileId(int value) {
        this.profileId = value;
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
     * ��ȡcardNumber���Ե�ֵ��
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
     * ����cardNumber���Ե�ֵ��
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
     * ��ȡphoneNumber���Ե�ֵ��
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
     * ����phoneNumber���Ե�ֵ��
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
     * ��ȡparty���Ե�ֵ��
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
     * ����party���Ե�ֵ��
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
     * ��ȡpageInfo���Ե�ֵ��
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
     * ����pageInfo���Ե�ֵ��
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
     * ��ȡblockCode���Ե�ֵ��
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
     * ����blockCode���Ե�ֵ��
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
     * ��ȡchannelConfirmID���Ե�ֵ��
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
     * ����channelConfirmID���Ե�ֵ��
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
     * ��ȡpmsId���Ե�ֵ��
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
     * ����pmsId���Ե�ֵ��
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
     * ��ȡshareCode���Ե�ֵ��
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
     * ����shareCode���Ե�ֵ��
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
     * ��ȡchannel���Ե�ֵ��
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
     * ����channel���Ե�ֵ��
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
     * ��ȡinsertUser���Ե�ֵ��
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
     * ����insertUser���Ե�ֵ��
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
     * ��ȡcancelId���Ե�ֵ��
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
     * ����cancelId���Ե�ֵ��
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
     * ��ȡchannelCancelId���Ե�ֵ��
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
     * ����channelCancelId���Ե�ֵ��
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
     * ��ȡpmsCancelId���Ե�ֵ��
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
     * ����pmsCancelId���Ե�ֵ��
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
     * ��ȡchineseName���Ե�ֵ��
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
     * ����chineseName���Ե�ֵ��
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
     * ��ȡbookerName���Ե�ֵ��
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
     * ����bookerName���Ե�ֵ��
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
     * ��ȡbookerMobile���Ե�ֵ��
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
     * ����bookerMobile���Ե�ֵ��
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
     * ��ȡcompanyType���Ե�ֵ��
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
     * ����companyType���Ե�ֵ��
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
     * ��ȡisRtOrigOrder���Ե�ֵ��
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
     * ����isRtOrigOrder���Ե�ֵ��
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
