
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SvcSubMemberInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SvcSubMemberInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Nationality" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="SpouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeddingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Office_tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="IdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Passport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LikeSubCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositionCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="ValidFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeSpend" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalSpend" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="WeeksFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimesFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlacesFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponsFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PicPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FilterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverdraftSpend" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="GuestCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberDepartmentCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardSn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcSubMemberInfo", propOrder = {
    "memberNo",
    "subName",
    "sex",
    "title",
    "birthday",
    "nationality",
    "spouseName",
    "weddingDate",
    "address",
    "zip",
    "tel",
    "officeTel",
    "mobile",
    "fax",
    "email",
    "idType",
    "idNo",
    "passport",
    "remarks",
    "createDate",
    "likeSubCodes",
    "positionCode",
    "languageCode",
    "validFlag",
    "timeSpend",
    "totalSpend",
    "weeksFilter",
    "timesFilter",
    "placesFilter",
    "exchangeFlag",
    "couponsFilter",
    "picPath",
    "filterFlag",
    "mainFlag",
    "linkCode",
    "overdraftSpend",
    "guestCode",
    "memberDepartmentCode",
    "cardNo",
    "cardSn"
})
public class SvcSubMemberInfo
    extends BaseInfo
{

    @XmlElement(name = "MemberNo")
    protected String memberNo;
    @XmlElement(name = "SubName")
    protected String subName;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "Title")
    protected CommonInfo title;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Nationality")
    protected CommonInfo nationality;
    @XmlElement(name = "SpouseName")
    protected String spouseName;
    @XmlElement(name = "WeddingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weddingDate;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Office_tel")
    protected String officeTel;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "IdType")
    protected CommonInfo idType;
    @XmlElement(name = "IdNo")
    protected String idNo;
    @XmlElement(name = "Passport")
    protected String passport;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "LikeSubCodes")
    protected String likeSubCodes;
    @XmlElement(name = "PositionCode")
    protected CommonInfo positionCode;
    @XmlElement(name = "LanguageCode")
    protected CommonInfo languageCode;
    @XmlElement(name = "ValidFlag")
    protected String validFlag;
    @XmlElement(name = "TimeSpend", required = true)
    protected BigDecimal timeSpend;
    @XmlElement(name = "TotalSpend", required = true)
    protected BigDecimal totalSpend;
    @XmlElement(name = "WeeksFilter")
    protected String weeksFilter;
    @XmlElement(name = "TimesFilter")
    protected String timesFilter;
    @XmlElement(name = "PlacesFilter")
    protected String placesFilter;
    @XmlElement(name = "ExchangeFlag")
    protected String exchangeFlag;
    @XmlElement(name = "CouponsFilter")
    protected String couponsFilter;
    @XmlElement(name = "PicPath")
    protected String picPath;
    @XmlElement(name = "FilterFlag")
    protected String filterFlag;
    @XmlElement(name = "MainFlag")
    protected String mainFlag;
    @XmlElement(name = "LinkCode")
    protected String linkCode;
    @XmlElement(name = "OverdraftSpend", required = true)
    protected BigDecimal overdraftSpend;
    @XmlElement(name = "GuestCode")
    protected String guestCode;
    @XmlElement(name = "MemberDepartmentCode")
    protected CommonInfo memberDepartmentCode;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "CardSn")
    protected String cardSn;

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
     * 获取spouseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * 设置spouseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
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
     * 获取idType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getIdType() {
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
    public void setIdType(CommonInfo value) {
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
     * 获取remarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * 获取createDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * 获取likeSubCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLikeSubCodes() {
        return likeSubCodes;
    }

    /**
     * 设置likeSubCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLikeSubCodes(String value) {
        this.likeSubCodes = value;
    }

    /**
     * 获取positionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getPositionCode() {
        return positionCode;
    }

    /**
     * 设置positionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setPositionCode(CommonInfo value) {
        this.positionCode = value;
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
     * 获取validFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFlag() {
        return validFlag;
    }

    /**
     * 设置validFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFlag(String value) {
        this.validFlag = value;
    }

    /**
     * 获取timeSpend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeSpend() {
        return timeSpend;
    }

    /**
     * 设置timeSpend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeSpend(BigDecimal value) {
        this.timeSpend = value;
    }

    /**
     * 获取totalSpend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSpend() {
        return totalSpend;
    }

    /**
     * 设置totalSpend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSpend(BigDecimal value) {
        this.totalSpend = value;
    }

    /**
     * 获取weeksFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeksFilter() {
        return weeksFilter;
    }

    /**
     * 设置weeksFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeksFilter(String value) {
        this.weeksFilter = value;
    }

    /**
     * 获取timesFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimesFilter() {
        return timesFilter;
    }

    /**
     * 设置timesFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimesFilter(String value) {
        this.timesFilter = value;
    }

    /**
     * 获取placesFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacesFilter() {
        return placesFilter;
    }

    /**
     * 设置placesFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacesFilter(String value) {
        this.placesFilter = value;
    }

    /**
     * 获取exchangeFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeFlag() {
        return exchangeFlag;
    }

    /**
     * 设置exchangeFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeFlag(String value) {
        this.exchangeFlag = value;
    }

    /**
     * 获取couponsFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponsFilter() {
        return couponsFilter;
    }

    /**
     * 设置couponsFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponsFilter(String value) {
        this.couponsFilter = value;
    }

    /**
     * 获取picPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 设置picPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicPath(String value) {
        this.picPath = value;
    }

    /**
     * 获取filterFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterFlag() {
        return filterFlag;
    }

    /**
     * 设置filterFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterFlag(String value) {
        this.filterFlag = value;
    }

    /**
     * 获取mainFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainFlag() {
        return mainFlag;
    }

    /**
     * 设置mainFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainFlag(String value) {
        this.mainFlag = value;
    }

    /**
     * 获取linkCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkCode() {
        return linkCode;
    }

    /**
     * 设置linkCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkCode(String value) {
        this.linkCode = value;
    }

    /**
     * 获取overdraftSpend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdraftSpend() {
        return overdraftSpend;
    }

    /**
     * 设置overdraftSpend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdraftSpend(BigDecimal value) {
        this.overdraftSpend = value;
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
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMemberDepartmentCode() {
        return memberDepartmentCode;
    }

    /**
     * 设置memberDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMemberDepartmentCode(CommonInfo value) {
        this.memberDepartmentCode = value;
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

}
