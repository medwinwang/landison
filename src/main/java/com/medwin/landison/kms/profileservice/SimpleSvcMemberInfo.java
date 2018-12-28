
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SimpleSvcMemberInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SimpleSvcMemberInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntroducerCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceFb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceYearroom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceYearfb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MembershipType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CardPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HandselPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NameCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkmanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="IDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="MemberSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GhNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CardLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExclusiveServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcMemberNotificationList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSvcMemberNotification" minOccurs="0"/&gt;
 *         &lt;element name="FfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumeRewardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpCardLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberInfoFfp" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfMemberInfoFFP" minOccurs="0"/&gt;
 *         &lt;element name="PreferenceGroups" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPreferenceGroup" minOccurs="0"/&gt;
 *         &lt;element name="MemberInfoVipStatus" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}MemberInfoVipStatus" minOccurs="0"/&gt;
 *         &lt;element name="IsReservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleSvcMemberInfo", propOrder = {
    "subType",
    "cardNo",
    "introducerCardNo",
    "balanceRoom",
    "balanceFb",
    "balanceYearroom",
    "balanceYearfb",
    "membershipType",
    "cardPassword",
    "handselPoints",
    "nameCN",
    "firstName",
    "lastName",
    "linkmanName",
    "idType",
    "idNo",
    "address",
    "sex",
    "homePhone",
    "officeTel",
    "mobile",
    "faxNo",
    "email",
    "birthday",
    "passportNo",
    "postalCode",
    "title",
    "nationality",
    "language",
    "memberSource",
    "memo",
    "ghNo",
    "city",
    "province",
    "cardType",
    "entryDate",
    "cardLevel",
    "exclusiveServer",
    "svcMemberNotificationList",
    "ffpId",
    "ffpCardNo",
    "consumeRewardType",
    "ffpCardType",
    "ffpCardLevel",
    "memberInfoFfp",
    "preferenceGroups",
    "memberInfoVipStatus",
    "isReservation"
})
public class SimpleSvcMemberInfo
    extends BaseInfo
{

    @XmlElement(name = "SubType")
    protected String subType;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "IntroducerCardNo")
    protected String introducerCardNo;
    @XmlElement(name = "BalanceRoom")
    protected String balanceRoom;
    @XmlElement(name = "BalanceFb")
    protected String balanceFb;
    @XmlElement(name = "BalanceYearroom")
    protected String balanceYearroom;
    @XmlElement(name = "BalanceYearfb")
    protected String balanceYearfb;
    @XmlElement(name = "MembershipType")
    protected CommonInfo membershipType;
    @XmlElement(name = "CardPassword")
    protected String cardPassword;
    @XmlElement(name = "HandselPoints")
    protected int handselPoints;
    @XmlElement(name = "NameCN")
    protected String nameCN;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "LinkmanName")
    protected String linkmanName;
    @XmlElement(name = "IDType")
    protected CommonInfo idType;
    @XmlElement(name = "IDNo")
    protected String idNo;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "OfficeTel")
    protected String officeTel;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "FaxNo")
    protected String faxNo;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "PassportNo")
    protected String passportNo;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Title")
    protected CommonInfo title;
    @XmlElement(name = "Nationality")
    protected CommonInfo nationality;
    @XmlElement(name = "Language")
    protected CommonInfo language;
    @XmlElement(name = "MemberSource")
    protected String memberSource;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "GhNo")
    protected String ghNo;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "EntryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "CardLevel")
    protected String cardLevel;
    @XmlElement(name = "ExclusiveServer")
    protected String exclusiveServer;
    @XmlElement(name = "SvcMemberNotificationList")
    protected ArrayOfSvcMemberNotification svcMemberNotificationList;
    @XmlElement(name = "FfpId")
    protected String ffpId;
    @XmlElement(name = "FfpCardNo")
    protected String ffpCardNo;
    @XmlElement(name = "ConsumeRewardType")
    protected String consumeRewardType;
    @XmlElement(name = "FfpCardType")
    protected String ffpCardType;
    @XmlElement(name = "FfpCardLevel")
    protected String ffpCardLevel;
    @XmlElement(name = "MemberInfoFfp")
    protected ArrayOfMemberInfoFFP memberInfoFfp;
    @XmlElement(name = "PreferenceGroups")
    protected ArrayOfPreferenceGroup preferenceGroups;
    @XmlElement(name = "MemberInfoVipStatus")
    protected MemberInfoVipStatus memberInfoVipStatus;
    @XmlElement(name = "IsReservation")
    protected String isReservation;

    /**
     * 获取subType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * 设置subType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取introducerCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroducerCardNo() {
        return introducerCardNo;
    }

    /**
     * 设置introducerCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroducerCardNo(String value) {
        this.introducerCardNo = value;
    }

    /**
     * 获取balanceRoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceRoom() {
        return balanceRoom;
    }

    /**
     * 设置balanceRoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceRoom(String value) {
        this.balanceRoom = value;
    }

    /**
     * 获取balanceFb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceFb() {
        return balanceFb;
    }

    /**
     * 设置balanceFb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceFb(String value) {
        this.balanceFb = value;
    }

    /**
     * 获取balanceYearroom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceYearroom() {
        return balanceYearroom;
    }

    /**
     * 设置balanceYearroom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceYearroom(String value) {
        this.balanceYearroom = value;
    }

    /**
     * 获取balanceYearfb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceYearfb() {
        return balanceYearfb;
    }

    /**
     * 设置balanceYearfb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceYearfb(String value) {
        this.balanceYearfb = value;
    }

    /**
     * 获取membershipType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMembershipType() {
        return membershipType;
    }

    /**
     * 设置membershipType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMembershipType(CommonInfo value) {
        this.membershipType = value;
    }

    /**
     * 获取cardPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPassword() {
        return cardPassword;
    }

    /**
     * 设置cardPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPassword(String value) {
        this.cardPassword = value;
    }

    /**
     * 获取handselPoints属性的值。
     * 
     */
    public int getHandselPoints() {
        return handselPoints;
    }

    /**
     * 设置handselPoints属性的值。
     * 
     */
    public void setHandselPoints(int value) {
        this.handselPoints = value;
    }

    /**
     * 获取nameCN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCN() {
        return nameCN;
    }

    /**
     * 设置nameCN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCN(String value) {
        this.nameCN = value;
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
     * 获取linkmanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanName() {
        return linkmanName;
    }

    /**
     * 设置linkmanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanName(String value) {
        this.linkmanName = value;
    }

    /**
     * 获取idType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getIDType() {
        return idType;
    }

    /**
     * 设置idType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setIDType(CommonInfo value) {
        this.idType = value;
    }

    /**
     * 获取idNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNo() {
        return idNo;
    }

    /**
     * 设置idNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNo(String value) {
        this.idNo = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * 获取homePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * 设置homePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * 获取officeTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeTel() {
        return officeTel;
    }

    /**
     * 设置officeTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeTel(String value) {
        this.officeTel = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * 获取faxNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * 设置faxNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNo(String value) {
        this.faxNo = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * 获取passportNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * 设置passportNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNo(String value) {
        this.passportNo = value;
    }

    /**
     * 获取postalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置postalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setTitle(CommonInfo value) {
        this.title = value;
    }

    /**
     * 获取nationality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getNationality() {
        return nationality;
    }

    /**
     * 设置nationality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setNationality(CommonInfo value) {
        this.nationality = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setLanguage(CommonInfo value) {
        this.language = value;
    }

    /**
     * 获取memberSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberSource() {
        return memberSource;
    }

    /**
     * 设置memberSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberSource(String value) {
        this.memberSource = value;
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
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取province属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置province属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * 获取cardType属性的值。
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
     * 设置cardType属性的值。
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
     * 获取entryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * 设置entryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * 获取cardLevel属性的值。
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
     * 设置cardLevel属性的值。
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
     * 获取exclusiveServer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusiveServer() {
        return exclusiveServer;
    }

    /**
     * 设置exclusiveServer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusiveServer(String value) {
        this.exclusiveServer = value;
    }

    /**
     * 获取svcMemberNotificationList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSvcMemberNotification }
     *     
     */
    public ArrayOfSvcMemberNotification getSvcMemberNotificationList() {
        return svcMemberNotificationList;
    }

    /**
     * 设置svcMemberNotificationList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSvcMemberNotification }
     *     
     */
    public void setSvcMemberNotificationList(ArrayOfSvcMemberNotification value) {
        this.svcMemberNotificationList = value;
    }

    /**
     * 获取ffpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpId() {
        return ffpId;
    }

    /**
     * 设置ffpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpId(String value) {
        this.ffpId = value;
    }

    /**
     * 获取ffpCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpCardNo() {
        return ffpCardNo;
    }

    /**
     * 设置ffpCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpCardNo(String value) {
        this.ffpCardNo = value;
    }

    /**
     * 获取consumeRewardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumeRewardType() {
        return consumeRewardType;
    }

    /**
     * 设置consumeRewardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumeRewardType(String value) {
        this.consumeRewardType = value;
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
     * 获取ffpCardLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpCardLevel() {
        return ffpCardLevel;
    }

    /**
     * 设置ffpCardLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpCardLevel(String value) {
        this.ffpCardLevel = value;
    }

    /**
     * 获取memberInfoFfp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMemberInfoFFP }
     *     
     */
    public ArrayOfMemberInfoFFP getMemberInfoFfp() {
        return memberInfoFfp;
    }

    /**
     * 设置memberInfoFfp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMemberInfoFFP }
     *     
     */
    public void setMemberInfoFfp(ArrayOfMemberInfoFFP value) {
        this.memberInfoFfp = value;
    }

    /**
     * 获取preferenceGroups属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPreferenceGroup }
     *     
     */
    public ArrayOfPreferenceGroup getPreferenceGroups() {
        return preferenceGroups;
    }

    /**
     * 设置preferenceGroups属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPreferenceGroup }
     *     
     */
    public void setPreferenceGroups(ArrayOfPreferenceGroup value) {
        this.preferenceGroups = value;
    }

    /**
     * 获取memberInfoVipStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemberInfoVipStatus }
     *     
     */
    public MemberInfoVipStatus getMemberInfoVipStatus() {
        return memberInfoVipStatus;
    }

    /**
     * 设置memberInfoVipStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemberInfoVipStatus }
     *     
     */
    public void setMemberInfoVipStatus(MemberInfoVipStatus value) {
        this.memberInfoVipStatus = value;
    }

    /**
     * 获取isReservation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReservation() {
        return isReservation;
    }

    /**
     * 设置isReservation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReservation(String value) {
        this.isReservation = value;
    }

}
