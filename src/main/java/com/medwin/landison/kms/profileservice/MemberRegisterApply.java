
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MemberRegisterApply complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MemberRegisterApply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gh_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="card_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spouse_chname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spouse_engname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wedding_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="office_tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credit_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credit_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credit_exp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operator_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gh_ex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="special" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="membership_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sub_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="deposit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="app_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enroll_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="approval_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="expiry_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="last_refill_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="last_visit_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="last_spend" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="initial_points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="initial_balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="introducer_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vip_level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="member_source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visits_room" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="his_room_rev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="his_fb_rev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="his_health_rev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="duty_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkman_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkman_tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licence_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preAccredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Accredit_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="guest_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="member_department_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rule_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="card_sn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sendtype_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IMAGE_DATA" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="IMAGE_CONTENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IMAGE_FILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deposit_points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="main_gh_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cts_group_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="count_introducer_points_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insert_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insert_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="update_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="update_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberRegisterApply", propOrder = {
    "ghNo",
    "cardNo",
    "cardPassword",
    "chname",
    "engname",
    "firstName",
    "lastName",
    "title",
    "sex",
    "birthday",
    "nationality",
    "spouseChname",
    "spouseEngname",
    "weddingDate",
    "tel",
    "officeTel",
    "zip",
    "email",
    "address",
    "creditCode",
    "creditNo",
    "creditExp",
    "memo",
    "visa",
    "idType",
    "idNo",
    "passport",
    "fax",
    "operatorCode",
    "ghEx",
    "special",
    "membershipType",
    "subType",
    "points",
    "balance",
    "deposit",
    "appStatus",
    "state",
    "enrollDate",
    "approvalDate",
    "expiryDate",
    "lastRefillDate",
    "lastVisitDate",
    "lastSpend",
    "initialPoints",
    "initialBalance",
    "introducerId",
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
    "custId",
    "sendtypeCode",
    "imagedata",
    "imagecontenttype",
    "imagefilename",
    "race",
    "religion",
    "depositPoints",
    "mainGhNo",
    "ctsGroupId",
    "countIntroducerPointsFlag",
    "insertUser",
    "insertDate",
    "updateUser",
    "updateDate",
    "city",
    "province"
})
public class MemberRegisterApply {

    @XmlElement(name = "gh_no")
    protected String ghNo;
    @XmlElement(name = "card_no")
    protected String cardNo;
    @XmlElement(name = "card_password")
    protected String cardPassword;
    protected String chname;
    protected String engname;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "last_name")
    protected String lastName;
    protected String title;
    protected String sex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    protected String nationality;
    @XmlElement(name = "spouse_chname")
    protected String spouseChname;
    @XmlElement(name = "spouse_engname")
    protected String spouseEngname;
    @XmlElement(name = "wedding_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weddingDate;
    protected String tel;
    @XmlElement(name = "office_tel")
    protected String officeTel;
    protected String zip;
    protected String email;
    protected String address;
    @XmlElement(name = "credit_code")
    protected String creditCode;
    @XmlElement(name = "credit_no")
    protected String creditNo;
    @XmlElement(name = "credit_exp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditExp;
    protected String memo;
    protected String visa;
    @XmlElement(name = "id_type")
    protected String idType;
    @XmlElement(name = "id_no")
    protected String idNo;
    protected String passport;
    protected String fax;
    @XmlElement(name = "operator_code")
    protected String operatorCode;
    @XmlElement(name = "gh_ex")
    protected String ghEx;
    protected String special;
    @XmlElement(name = "membership_type")
    protected String membershipType;
    @XmlElement(name = "sub_type")
    protected String subType;
    protected int points;
    @XmlElement(required = true)
    protected BigDecimal balance;
    @XmlElement(required = true)
    protected BigDecimal deposit;
    @XmlElement(name = "app_status")
    protected String appStatus;
    protected String state;
    @XmlElement(name = "enroll_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enrollDate;
    @XmlElement(name = "approval_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    @XmlElement(name = "expiry_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "last_refill_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRefillDate;
    @XmlElement(name = "last_visit_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastVisitDate;
    @XmlElement(name = "last_spend", required = true)
    protected BigDecimal lastSpend;
    @XmlElement(name = "initial_points")
    protected int initialPoints;
    @XmlElement(name = "initial_balance", required = true)
    protected BigDecimal initialBalance;
    @XmlElement(name = "introducer_id")
    protected String introducerId;
    protected int visits;
    @XmlElement(name = "vip_level")
    protected String vipLevel;
    @XmlElement(name = "member_source")
    protected String memberSource;
    @XmlElement(name = "visits_room")
    protected int visitsRoom;
    protected int nights;
    @XmlElement(name = "his_room_rev", required = true)
    protected BigDecimal hisRoomRev;
    @XmlElement(name = "his_fb_rev", required = true)
    protected BigDecimal hisFbRev;
    @XmlElement(name = "his_health_rev", required = true)
    protected BigDecimal hisHealthRev;
    @XmlElement(name = "duty_code")
    protected String dutyCode;
    @XmlElement(name = "language_code")
    protected String languageCode;
    @XmlElement(name = "linkman_name")
    protected String linkmanName;
    @XmlElement(name = "linkman_tel")
    protected String linkmanTel;
    @XmlElement(name = "licence_no")
    protected String licenceNo;
    @XmlElement(required = true)
    protected BigDecimal preAccredit;
    @XmlElement(name = "Accredit_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accreditDt;
    @XmlElement(name = "guest_code")
    protected String guestCode;
    @XmlElement(name = "member_department_code")
    protected String memberDepartmentCode;
    @XmlElement(name = "rule_code")
    protected String ruleCode;
    @XmlElement(name = "card_sn")
    protected String cardSn;
    @XmlElement(name = "cust_id")
    protected int custId;
    @XmlElement(name = "sendtype_code")
    protected String sendtypeCode;
    @XmlElement(name = "IMAGE_DATA")
    protected byte[] imagedata;
    @XmlElement(name = "IMAGE_CONTENT_TYPE")
    protected String imagecontenttype;
    @XmlElement(name = "IMAGE_FILE_NAME")
    protected String imagefilename;
    protected String race;
    protected String religion;
    @XmlElement(name = "deposit_points")
    protected int depositPoints;
    @XmlElement(name = "main_gh_no")
    protected String mainGhNo;
    @XmlElement(name = "cts_group_id")
    protected int ctsGroupId;
    @XmlElement(name = "count_introducer_points_flag")
    protected String countIntroducerPointsFlag;
    @XmlElement(name = "insert_user")
    protected String insertUser;
    @XmlElement(name = "insert_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insertDate;
    @XmlElement(name = "update_user")
    protected String updateUser;
    @XmlElement(name = "update_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    protected String city;
    protected String province;

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
     * 获取chname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChname() {
        return chname;
    }

    /**
     * 设置chname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChname(String value) {
        this.chname = value;
    }

    /**
     * 获取engname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngname() {
        return engname;
    }

    /**
     * 设置engname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngname(String value) {
        this.engname = value;
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
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置nationality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * 获取spouseChname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseChname() {
        return spouseChname;
    }

    /**
     * 设置spouseChname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseChname(String value) {
        this.spouseChname = value;
    }

    /**
     * 获取spouseEngname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseEngname() {
        return spouseEngname;
    }

    /**
     * 设置spouseEngname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseEngname(String value) {
        this.spouseEngname = value;
    }

    /**
     * 获取weddingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeddingDate() {
        return weddingDate;
    }

    /**
     * 设置weddingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeddingDate(XMLGregorianCalendar value) {
        this.weddingDate = value;
    }

    /**
     * 获取tel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置tel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
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
     * 获取zip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * 设置zip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
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
     * 获取creditCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * 设置creditCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCode(String value) {
        this.creditCode = value;
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
     * 获取creditExp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditExp() {
        return creditExp;
    }

    /**
     * 设置creditExp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditExp(XMLGregorianCalendar value) {
        this.creditExp = value;
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
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 设置idType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
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
    public String getIdNo() {
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
    public void setIdNo(String value) {
        this.idNo = value;
    }

    /**
     * 获取passport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassport() {
        return passport;
    }

    /**
     * 设置passport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassport(String value) {
        this.passport = value;
    }

    /**
     * 获取fax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置fax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * 获取operatorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * 设置operatorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
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
     * 获取membershipType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * 设置membershipType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipType(String value) {
        this.membershipType = value;
    }

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
     * 获取appStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * 设置appStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStatus(String value) {
        this.appStatus = value;
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
     * 获取approvalDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDate() {
        return approvalDate;
    }

    /**
     * 设置approvalDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDate(XMLGregorianCalendar value) {
        this.approvalDate = value;
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
     * 获取introducerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroducerId() {
        return introducerId;
    }

    /**
     * 设置introducerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroducerId(String value) {
        this.introducerId = value;
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
     *     {@link String }
     *     
     */
    public String getVipLevel() {
        return vipLevel;
    }

    /**
     * 设置vipLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipLevel(String value) {
        this.vipLevel = value;
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
     *     {@link String }
     *     
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * 设置dutyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
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
     * 获取custId属性的值。
     * 
     */
    public int getCustId() {
        return custId;
    }

    /**
     * 设置custId属性的值。
     * 
     */
    public void setCustId(int value) {
        this.custId = value;
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
     * 获取imagedata属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIMAGEDATA() {
        return imagedata;
    }

    /**
     * 设置imagedata属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIMAGEDATA(byte[] value) {
        this.imagedata = value;
    }

    /**
     * 获取imagecontenttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMAGECONTENTTYPE() {
        return imagecontenttype;
    }

    /**
     * 设置imagecontenttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMAGECONTENTTYPE(String value) {
        this.imagecontenttype = value;
    }

    /**
     * 获取imagefilename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMAGEFILENAME() {
        return imagefilename;
    }

    /**
     * 设置imagefilename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMAGEFILENAME(String value) {
        this.imagefilename = value;
    }

    /**
     * 获取race属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * 设置race属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * 获取religion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * 设置religion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    /**
     * 获取depositPoints属性的值。
     * 
     */
    public int getDepositPoints() {
        return depositPoints;
    }

    /**
     * 设置depositPoints属性的值。
     * 
     */
    public void setDepositPoints(int value) {
        this.depositPoints = value;
    }

    /**
     * 获取mainGhNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainGhNo() {
        return mainGhNo;
    }

    /**
     * 设置mainGhNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainGhNo(String value) {
        this.mainGhNo = value;
    }

    /**
     * 获取ctsGroupId属性的值。
     * 
     */
    public int getCtsGroupId() {
        return ctsGroupId;
    }

    /**
     * 设置ctsGroupId属性的值。
     * 
     */
    public void setCtsGroupId(int value) {
        this.ctsGroupId = value;
    }

    /**
     * 获取countIntroducerPointsFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountIntroducerPointsFlag() {
        return countIntroducerPointsFlag;
    }

    /**
     * 设置countIntroducerPointsFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountIntroducerPointsFlag(String value) {
        this.countIntroducerPointsFlag = value;
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
     * 获取insertDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsertDate() {
        return insertDate;
    }

    /**
     * 设置insertDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsertDate(XMLGregorianCalendar value) {
        this.insertDate = value;
    }

    /**
     * 获取updateUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置updateUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

    /**
     * 获取updateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置updateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
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

}
