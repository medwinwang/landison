
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SvcMemberInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SvcMemberInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CustInfo" minOccurs="0"/&gt;
 *         &lt;element name="SubMemberInfoList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSvcSubMemberInfo" minOccurs="0"/&gt;
 *         &lt;element name="MemberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceFb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceYearroom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceYearfb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Nationality" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="SpouseNameCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpouseNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateWedding" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpire" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Visa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="IDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gh_ex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Special" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="FfpLevel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="MembershipType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="SubType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Deposit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="EnrollDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastRefillDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastVisitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastSpend" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="InitialPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InitialBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CardPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntroducerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Visits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VipLevel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="MemberSource" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="VisitsRoom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HisRoomRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="HisFbRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="HisHealthRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DutyCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="LinkmanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkmanTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreAccredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AccreditDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GuestCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardSn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SendtypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DicInfoFfp" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfFfpAttribute" minOccurs="0"/&gt;
 *         &lt;element name="MemberInfoFfp" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfMemberInfoFFP" minOccurs="0"/&gt;
 *         &lt;element name="MemberInfoVipStatus" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfMemberInfoVipStatus" minOccurs="0"/&gt;
 *         &lt;element name="FfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FFPCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumeRewardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExclusiveServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferenceGroups" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPreferenceGroup" minOccurs="0"/&gt;
 *         &lt;element name="OneYearsAgoPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcMemberInfo", propOrder = {
    "customInfo",
    "subMemberInfoList",
    "memberNo",
    "balanceRoom",
    "balanceFb",
    "balanceYearroom",
    "balanceYearfb",
    "nameCN",
    "nameEn",
    "firstName",
    "lastName",
    "sex",
    "birthday",
    "nationality",
    "spouseNameCN",
    "spouseNameEn",
    "dateWedding",
    "address",
    "telephone",
    "officeTel",
    "postalCode",
    "email",
    "title",
    "creditCardType",
    "creditCardNo",
    "creditCardExpire",
    "memo",
    "visa",
    "idType",
    "idNo",
    "passportNo",
    "faxNo",
    "sales",
    "ghEx",
    "special",
    "cardNo",
    "state",
    "ffpType",
    "ffpLevel",
    "membershipType",
    "subType",
    "points",
    "balance",
    "deposit",
    "enrollDate",
    "expiryDate",
    "lastRefillDate",
    "lastVisitDate",
    "lastSpend",
    "initialPoints",
    "initialBalance",
    "cardPassword",
    "introducerID",
    "visits",
    "vipLevel",
    "memberSource",
    "visitsRoom",
    "nights",
    "hisRoomRev",
    "hisFbRev",
    "hisHealthRev",
    "dutyCode",
    "languageCode",
    "linkmanName",
    "linkmanTel",
    "licenceNo",
    "preAccredit",
    "accreditDt",
    "guestCode",
    "memberDepartmentCode",
    "ruleCode",
    "cardSn",
    "custID",
    "sendtypeCode",
    "city",
    "province",
    "totalPoints",
    "dicInfoFfp",
    "memberInfoFfp",
    "memberInfoVipStatus",
    "ffpId",
    "ffpCardNo",
    "consumeRewardType",
    "exclusiveServer",
    "preferenceGroups",
    "oneYearsAgoPoints"
})
public class SvcMemberInfo
    extends BaseInfo
{

    @XmlElement(name = "CustomInfo")
    protected CustInfo customInfo;
    @XmlElement(name = "SubMemberInfoList")
    protected ArrayOfSvcSubMemberInfo subMemberInfoList;
    @XmlElement(name = "MemberNo")
    protected String memberNo;
    @XmlElement(name = "BalanceRoom")
    protected String balanceRoom;
    @XmlElement(name = "BalanceFb")
    protected String balanceFb;
    @XmlElement(name = "BalanceYearroom")
    protected String balanceYearroom;
    @XmlElement(name = "BalanceYearfb")
    protected String balanceYearfb;
    @XmlElement(name = "NameCN")
    protected String nameCN;
    @XmlElement(name = "NameEn")
    protected String nameEn;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Nationality")
    protected CommonInfo nationality;
    @XmlElement(name = "SpouseNameCN")
    protected String spouseNameCN;
    @XmlElement(name = "SpouseNameEn")
    protected String spouseNameEn;
    @XmlElement(name = "DateWedding", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateWedding;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "OfficeTel")
    protected String officeTel;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Title")
    protected CommonInfo title;
    @XmlElement(name = "CreditCardType")
    protected String creditCardType;
    @XmlElement(name = "CreditCardNo")
    protected String creditCardNo;
    @XmlElement(name = "CreditCardExpire", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditCardExpire;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "Visa")
    protected String visa;
    @XmlElement(name = "IDType")
    protected CommonInfo idType;
    @XmlElement(name = "IDNo")
    protected String idNo;
    @XmlElement(name = "PassportNo")
    protected String passportNo;
    @XmlElement(name = "FaxNo")
    protected String faxNo;
    @XmlElement(name = "Sales")
    protected String sales;
    @XmlElement(name = "Gh_ex")
    protected String ghEx;
    @XmlElement(name = "Special")
    protected String special;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "FfpType")
    protected CommonInfo ffpType;
    @XmlElement(name = "FfpLevel")
    protected CommonInfo ffpLevel;
    @XmlElement(name = "MembershipType")
    protected CommonInfo membershipType;
    @XmlElement(name = "SubType")
    protected CommonInfo subType;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElement(name = "Deposit", required = true)
    protected BigDecimal deposit;
    @XmlElement(name = "EnrollDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enrollDate;
    @XmlElement(name = "ExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "LastRefillDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRefillDate;
    @XmlElement(name = "LastVisitDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastVisitDate;
    @XmlElement(name = "LastSpend", required = true)
    protected BigDecimal lastSpend;
    @XmlElement(name = "InitialPoints")
    protected int initialPoints;
    @XmlElement(name = "InitialBalance", required = true)
    protected BigDecimal initialBalance;
    @XmlElement(name = "CardPassword")
    protected String cardPassword;
    @XmlElement(name = "IntroducerID")
    protected String introducerID;
    @XmlElement(name = "Visits")
    protected int visits;
    @XmlElement(name = "VipLevel")
    protected CommonInfo vipLevel;
    @XmlElement(name = "MemberSource")
    protected CommonInfo memberSource;
    @XmlElement(name = "VisitsRoom")
    protected int visitsRoom;
    @XmlElement(name = "Nights")
    protected int nights;
    @XmlElement(name = "HisRoomRev", required = true)
    protected BigDecimal hisRoomRev;
    @XmlElement(name = "HisFbRev", required = true)
    protected BigDecimal hisFbRev;
    @XmlElement(name = "HisHealthRev", required = true)
    protected BigDecimal hisHealthRev;
    @XmlElement(name = "DutyCode")
    protected CommonInfo dutyCode;
    @XmlElement(name = "LanguageCode")
    protected CommonInfo languageCode;
    @XmlElement(name = "LinkmanName")
    protected String linkmanName;
    @XmlElement(name = "LinkmanTel")
    protected String linkmanTel;
    @XmlElement(name = "LicenceNo")
    protected String licenceNo;
    @XmlElement(name = "PreAccredit", required = true)
    protected BigDecimal preAccredit;
    @XmlElement(name = "AccreditDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accreditDt;
    @XmlElement(name = "GuestCode")
    protected String guestCode;
    @XmlElement(name = "MemberDepartmentCode")
    protected String memberDepartmentCode;
    @XmlElement(name = "RuleCode")
    protected String ruleCode;
    @XmlElement(name = "CardSn")
    protected String cardSn;
    @XmlElement(name = "CustID")
    protected int custID;
    @XmlElement(name = "SendtypeCode")
    protected String sendtypeCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "TotalPoints")
    protected int totalPoints;
    @XmlElement(name = "DicInfoFfp")
    protected ArrayOfFfpAttribute dicInfoFfp;
    @XmlElement(name = "MemberInfoFfp")
    protected ArrayOfMemberInfoFFP memberInfoFfp;
    @XmlElement(name = "MemberInfoVipStatus")
    protected ArrayOfMemberInfoVipStatus memberInfoVipStatus;
    @XmlElement(name = "FfpId")
    protected String ffpId;
    @XmlElement(name = "FFPCardNo")
    protected String ffpCardNo;
    @XmlElement(name = "ConsumeRewardType")
    protected String consumeRewardType;
    @XmlElement(name = "ExclusiveServer")
    protected String exclusiveServer;
    @XmlElement(name = "PreferenceGroups")
    protected ArrayOfPreferenceGroup preferenceGroups;
    @XmlElement(name = "OneYearsAgoPoints")
    protected int oneYearsAgoPoints;

    /**
     * 获取customInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustInfo }
     *     
     */
    public CustInfo getCustomInfo() {
        return customInfo;
    }

    /**
     * 设置customInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfo }
     *     
     */
    public void setCustomInfo(CustInfo value) {
        this.customInfo = value;
    }

    /**
     * 获取subMemberInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSvcSubMemberInfo }
     *     
     */
    public ArrayOfSvcSubMemberInfo getSubMemberInfoList() {
        return subMemberInfoList;
    }

    /**
     * 设置subMemberInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSvcSubMemberInfo }
     *     
     */
    public void setSubMemberInfoList(ArrayOfSvcSubMemberInfo value) {
        this.subMemberInfoList = value;
    }

    /**
     * 获取memberNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNo() {
        return memberNo;
    }

    /**
     * 设置memberNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNo(String value) {
        this.memberNo = value;
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
     * 获取nameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * 设置nameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEn(String value) {
        this.nameEn = value;
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
     * 获取spouseNameCN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseNameCN() {
        return spouseNameCN;
    }

    /**
     * 设置spouseNameCN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseNameCN(String value) {
        this.spouseNameCN = value;
    }

    /**
     * 获取spouseNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseNameEn() {
        return spouseNameEn;
    }

    /**
     * 设置spouseNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseNameEn(String value) {
        this.spouseNameEn = value;
    }

    /**
     * 获取dateWedding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateWedding() {
        return dateWedding;
    }

    /**
     * 设置dateWedding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateWedding(XMLGregorianCalendar value) {
        this.dateWedding = value;
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
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
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
     * 获取creditCardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * 设置creditCardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * 获取creditCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * 设置creditCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNo(String value) {
        this.creditCardNo = value;
    }

    /**
     * 获取creditCardExpire属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditCardExpire() {
        return creditCardExpire;
    }

    /**
     * 设置creditCardExpire属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditCardExpire(XMLGregorianCalendar value) {
        this.creditCardExpire = value;
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
     * 获取visa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisa() {
        return visa;
    }

    /**
     * 设置visa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisa(String value) {
        this.visa = value;
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
     * 获取sales属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales() {
        return sales;
    }

    /**
     * 设置sales属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales(String value) {
        this.sales = value;
    }

    /**
     * 获取ghEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhEx() {
        return ghEx;
    }

    /**
     * 设置ghEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhEx(String value) {
        this.ghEx = value;
    }

    /**
     * 获取special属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecial() {
        return special;
    }

    /**
     * 设置special属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecial(String value) {
        this.special = value;
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
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取ffpType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getFfpType() {
        return ffpType;
    }

    /**
     * 设置ffpType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setFfpType(CommonInfo value) {
        this.ffpType = value;
    }

    /**
     * 获取ffpLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getFfpLevel() {
        return ffpLevel;
    }

    /**
     * 设置ffpLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setFfpLevel(CommonInfo value) {
        this.ffpLevel = value;
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
     * 获取subType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getSubType() {
        return subType;
    }

    /**
     * 设置subType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setSubType(CommonInfo value) {
        this.subType = value;
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
     * 获取deposit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * 设置deposit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeposit(BigDecimal value) {
        this.deposit = value;
    }

    /**
     * 获取enrollDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollDate() {
        return enrollDate;
    }

    /**
     * 设置enrollDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollDate(XMLGregorianCalendar value) {
        this.enrollDate = value;
    }

    /**
     * 获取expiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置expiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * 获取lastRefillDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRefillDate() {
        return lastRefillDate;
    }

    /**
     * 设置lastRefillDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRefillDate(XMLGregorianCalendar value) {
        this.lastRefillDate = value;
    }

    /**
     * 获取lastVisitDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastVisitDate() {
        return lastVisitDate;
    }

    /**
     * 设置lastVisitDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastVisitDate(XMLGregorianCalendar value) {
        this.lastVisitDate = value;
    }

    /**
     * 获取lastSpend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastSpend() {
        return lastSpend;
    }

    /**
     * 设置lastSpend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastSpend(BigDecimal value) {
        this.lastSpend = value;
    }

    /**
     * 获取initialPoints属性的值。
     * 
     */
    public int getInitialPoints() {
        return initialPoints;
    }

    /**
     * 设置initialPoints属性的值。
     * 
     */
    public void setInitialPoints(int value) {
        this.initialPoints = value;
    }

    /**
     * 获取initialBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    /**
     * 设置initialBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialBalance(BigDecimal value) {
        this.initialBalance = value;
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
     * 获取introducerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroducerID() {
        return introducerID;
    }

    /**
     * 设置introducerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroducerID(String value) {
        this.introducerID = value;
    }

    /**
     * 获取visits属性的值。
     * 
     */
    public int getVisits() {
        return visits;
    }

    /**
     * 设置visits属性的值。
     * 
     */
    public void setVisits(int value) {
        this.visits = value;
    }

    /**
     * 获取vipLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getVipLevel() {
        return vipLevel;
    }

    /**
     * 设置vipLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setVipLevel(CommonInfo value) {
        this.vipLevel = value;
    }

    /**
     * 获取memberSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMemberSource() {
        return memberSource;
    }

    /**
     * 设置memberSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMemberSource(CommonInfo value) {
        this.memberSource = value;
    }

    /**
     * 获取visitsRoom属性的值。
     * 
     */
    public int getVisitsRoom() {
        return visitsRoom;
    }

    /**
     * 设置visitsRoom属性的值。
     * 
     */
    public void setVisitsRoom(int value) {
        this.visitsRoom = value;
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
     * 获取hisRoomRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHisRoomRev() {
        return hisRoomRev;
    }

    /**
     * 设置hisRoomRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHisRoomRev(BigDecimal value) {
        this.hisRoomRev = value;
    }

    /**
     * 获取hisFbRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHisFbRev() {
        return hisFbRev;
    }

    /**
     * 设置hisFbRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHisFbRev(BigDecimal value) {
        this.hisFbRev = value;
    }

    /**
     * 获取hisHealthRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHisHealthRev() {
        return hisHealthRev;
    }

    /**
     * 设置hisHealthRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHisHealthRev(BigDecimal value) {
        this.hisHealthRev = value;
    }

    /**
     * 获取dutyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getDutyCode() {
        return dutyCode;
    }

    /**
     * 设置dutyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setDutyCode(CommonInfo value) {
        this.dutyCode = value;
    }

    /**
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setLanguageCode(CommonInfo value) {
        this.languageCode = value;
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
     * 获取linkmanTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanTel() {
        return linkmanTel;
    }

    /**
     * 设置linkmanTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanTel(String value) {
        this.linkmanTel = value;
    }

    /**
     * 获取licenceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceNo() {
        return licenceNo;
    }

    /**
     * 设置licenceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceNo(String value) {
        this.licenceNo = value;
    }

    /**
     * 获取preAccredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreAccredit() {
        return preAccredit;
    }

    /**
     * 设置preAccredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreAccredit(BigDecimal value) {
        this.preAccredit = value;
    }

    /**
     * 获取accreditDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccreditDt() {
        return accreditDt;
    }

    /**
     * 设置accreditDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccreditDt(XMLGregorianCalendar value) {
        this.accreditDt = value;
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
     * 获取memberDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberDepartmentCode() {
        return memberDepartmentCode;
    }

    /**
     * 设置memberDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberDepartmentCode(String value) {
        this.memberDepartmentCode = value;
    }

    /**
     * 获取ruleCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置ruleCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCode(String value) {
        this.ruleCode = value;
    }

    /**
     * 获取cardSn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSn() {
        return cardSn;
    }

    /**
     * 设置cardSn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSn(String value) {
        this.cardSn = value;
    }

    /**
     * 获取custID属性的值。
     * 
     */
    public int getCustID() {
        return custID;
    }

    /**
     * 设置custID属性的值。
     * 
     */
    public void setCustID(int value) {
        this.custID = value;
    }

    /**
     * 获取sendtypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendtypeCode() {
        return sendtypeCode;
    }

    /**
     * 设置sendtypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendtypeCode(String value) {
        this.sendtypeCode = value;
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
     * 获取totalPoints属性的值。
     * 
     */
    public int getTotalPoints() {
        return totalPoints;
    }

    /**
     * 设置totalPoints属性的值。
     * 
     */
    public void setTotalPoints(int value) {
        this.totalPoints = value;
    }

    /**
     * 获取dicInfoFfp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFfpAttribute }
     *     
     */
    public ArrayOfFfpAttribute getDicInfoFfp() {
        return dicInfoFfp;
    }

    /**
     * 设置dicInfoFfp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFfpAttribute }
     *     
     */
    public void setDicInfoFfp(ArrayOfFfpAttribute value) {
        this.dicInfoFfp = value;
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
     * 获取memberInfoVipStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMemberInfoVipStatus }
     *     
     */
    public ArrayOfMemberInfoVipStatus getMemberInfoVipStatus() {
        return memberInfoVipStatus;
    }

    /**
     * 设置memberInfoVipStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMemberInfoVipStatus }
     *     
     */
    public void setMemberInfoVipStatus(ArrayOfMemberInfoVipStatus value) {
        this.memberInfoVipStatus = value;
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
    public String getFFPCardNo() {
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
    public void setFFPCardNo(String value) {
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
     * 获取oneYearsAgoPoints属性的值。
     * 
     */
    public int getOneYearsAgoPoints() {
        return oneYearsAgoPoints;
    }

    /**
     * 设置oneYearsAgoPoints属性的值。
     * 
     */
    public void setOneYearsAgoPoints(int value) {
        this.oneYearsAgoPoints = value;
    }

}
