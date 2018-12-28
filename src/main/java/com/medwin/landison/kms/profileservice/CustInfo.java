
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CustInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Engname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Chname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Cata" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Subcata" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Segment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Extracode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Freq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Potential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prefered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Creatdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LostReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAccountX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeeAboutDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PmsSalesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInfo", propOrder = {
    "id",
    "engname",
    "chname",
    "fAccount",
    "account",
    "custType",
    "companyType",
    "cata",
    "subcata",
    "department",
    "depCode",
    "salesCode",
    "source",
    "segment",
    "industry",
    "extracode",
    "address",
    "zip",
    "tel",
    "fax",
    "email",
    "website",
    "freq",
    "potential",
    "prefered",
    "payment",
    "status",
    "creatdate",
    "creator",
    "lostReason",
    "memo",
    "statFlag",
    "fAccountX",
    "telExt",
    "corCode",
    "seeAboutDate",
    "pmsSalesCode",
    "profileType",
    "address1",
    "grandCode",
    "hotelCode",
    "hotelName",
    "custTypeName",
    "contract"
})
public class CustInfo {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Engname")
    protected String engname;
    @XmlElement(name = "Chname")
    protected String chname;
    @XmlElement(name = "FAccount")
    protected String fAccount;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "CompanyType")
    protected CommonInfo companyType;
    @XmlElement(name = "Cata")
    protected int cata;
    @XmlElement(name = "Subcata")
    protected int subcata;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "DepCode")
    protected String depCode;
    @XmlElement(name = "SalesCode")
    protected String salesCode;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Segment")
    protected String segment;
    @XmlElement(name = "Industry")
    protected String industry;
    @XmlElement(name = "Extracode")
    protected String extracode;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "Freq")
    protected String freq;
    @XmlElement(name = "Potential")
    protected String potential;
    @XmlElement(name = "Prefered")
    protected String prefered;
    @XmlElement(name = "Payment")
    protected String payment;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Creatdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creatdate;
    @XmlElement(name = "Creator")
    protected String creator;
    @XmlElement(name = "LostReason")
    protected String lostReason;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "StatFlag")
    protected String statFlag;
    @XmlElement(name = "FAccountX")
    protected String fAccountX;
    @XmlElement(name = "TelExt")
    protected String telExt;
    @XmlElement(name = "CorCode")
    protected String corCode;
    @XmlElement(name = "SeeAboutDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seeAboutDate;
    @XmlElement(name = "PmsSalesCode")
    protected String pmsSalesCode;
    @XmlElement(name = "ProfileType")
    protected String profileType;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "GrandCode")
    protected String grandCode;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "CustTypeName")
    protected String custTypeName;
    @XmlElement(name = "Contract")
    protected String contract;

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
     * 获取fAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAccount() {
        return fAccount;
    }

    /**
     * 设置fAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAccount(String value) {
        this.fAccount = value;
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
     * 获取custType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * 设置custType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * 获取companyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getCompanyType() {
        return companyType;
    }

    /**
     * 设置companyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setCompanyType(CommonInfo value) {
        this.companyType = value;
    }

    /**
     * 获取cata属性的值。
     * 
     */
    public int getCata() {
        return cata;
    }

    /**
     * 设置cata属性的值。
     * 
     */
    public void setCata(int value) {
        this.cata = value;
    }

    /**
     * 获取subcata属性的值。
     * 
     */
    public int getSubcata() {
        return subcata;
    }

    /**
     * 设置subcata属性的值。
     * 
     */
    public void setSubcata(int value) {
        this.subcata = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * 获取depCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepCode() {
        return depCode;
    }

    /**
     * 设置depCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepCode(String value) {
        this.depCode = value;
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
     * 获取segment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * 设置segment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * 获取industry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 设置industry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * 获取extracode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtracode() {
        return extracode;
    }

    /**
     * 设置extracode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtracode(String value) {
        this.extracode = value;
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
     * 获取website属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置website属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * 获取freq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreq() {
        return freq;
    }

    /**
     * 设置freq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreq(String value) {
        this.freq = value;
    }

    /**
     * 获取potential属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotential() {
        return potential;
    }

    /**
     * 设置potential属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotential(String value) {
        this.potential = value;
    }

    /**
     * 获取prefered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefered() {
        return prefered;
    }

    /**
     * 设置prefered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefered(String value) {
        this.prefered = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取creatdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatdate() {
        return creatdate;
    }

    /**
     * 设置creatdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatdate(XMLGregorianCalendar value) {
        this.creatdate = value;
    }

    /**
     * 获取creator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * 获取lostReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostReason() {
        return lostReason;
    }

    /**
     * 设置lostReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostReason(String value) {
        this.lostReason = value;
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
     * 获取statFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatFlag() {
        return statFlag;
    }

    /**
     * 设置statFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatFlag(String value) {
        this.statFlag = value;
    }

    /**
     * 获取fAccountX属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAccountX() {
        return fAccountX;
    }

    /**
     * 设置fAccountX属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAccountX(String value) {
        this.fAccountX = value;
    }

    /**
     * 获取telExt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelExt() {
        return telExt;
    }

    /**
     * 设置telExt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelExt(String value) {
        this.telExt = value;
    }

    /**
     * 获取corCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorCode() {
        return corCode;
    }

    /**
     * 设置corCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorCode(String value) {
        this.corCode = value;
    }

    /**
     * 获取seeAboutDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeeAboutDate() {
        return seeAboutDate;
    }

    /**
     * 设置seeAboutDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeeAboutDate(XMLGregorianCalendar value) {
        this.seeAboutDate = value;
    }

    /**
     * 获取pmsSalesCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsSalesCode() {
        return pmsSalesCode;
    }

    /**
     * 设置pmsSalesCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsSalesCode(String value) {
        this.pmsSalesCode = value;
    }

    /**
     * 获取profileType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * 设置profileType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * 获取address1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 设置address1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * 获取grandCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandCode() {
        return grandCode;
    }

    /**
     * 设置grandCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandCode(String value) {
        this.grandCode = value;
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
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取custTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustTypeName() {
        return custTypeName;
    }

    /**
     * 设置custTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustTypeName(String value) {
        this.custTypeName = value;
    }

    /**
     * 获取contract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract() {
        return contract;
    }

    /**
     * 设置contract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract(String value) {
        this.contract = value;
    }

}
