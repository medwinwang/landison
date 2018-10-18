
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>HotelInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HotelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecommendedLevel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="PicPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Map" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelOperationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShowVIPPlanLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Udf_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Stars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EngAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalRoom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalArea" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalMeetingArea" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalFbArea" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Province" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Country" minOccurs="0"/&gt;
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniteHotels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WithGroupHotels" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfo", propOrder = {
    "recommendedLevel",
    "picPath",
    "map",
    "level",
    "cityCode",
    "groupCode",
    "area",
    "tel",
    "currency",
    "hotelOperationType",
    "fullName",
    "internalCode",
    "showVIPPlanLogo",
    "sortId",
    "udf1",
    "udf2",
    "udf3",
    "udf4",
    "udf5",
    "code",
    "name",
    "flag",
    "des",
    "dt",
    "dbName",
    "engName",
    "stars",
    "address",
    "engAddress",
    "totalRoom",
    "totalArea",
    "totalMeetingArea",
    "totalFbArea",
    "remark",
    "province",
    "country",
    "keyword",
    "uniteHotels",
    "salesInfo",
    "city",
    "tags",
    "email",
    "mobile",
    "phone",
    "fax",
    "withGroupHotels",
    "postCode"
})
public class HotelInfo {

    @XmlElement(name = "RecommendedLevel")
    protected CommonInfo recommendedLevel;
    @XmlElement(name = "PicPath")
    protected String picPath;
    @XmlElement(name = "Map")
    protected String map;
    @XmlElement(name = "Level")
    protected int level;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlElement(name = "GroupCode")
    protected String groupCode;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "HotelOperationType")
    protected String hotelOperationType;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "InternalCode")
    protected String internalCode;
    @XmlElement(name = "ShowVIPPlanLogo")
    protected String showVIPPlanLogo;
    @XmlElement(name = "SortId", required = true, type = Integer.class, nillable = true)
    protected Integer sortId;
    @XmlElement(name = "Udf_1")
    protected String udf1;
    @XmlElement(name = "Udf_2")
    protected String udf2;
    @XmlElement(name = "Udf_3")
    protected String udf3;
    @XmlElement(name = "Udf_4")
    protected String udf4;
    @XmlElement(name = "Udf_5")
    protected String udf5;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Flag")
    protected String flag;
    @XmlElement(name = "Des")
    protected String des;
    @XmlElement(name = "Dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "DbName")
    protected String dbName;
    @XmlElement(name = "EngName")
    protected String engName;
    @XmlElement(name = "Stars")
    protected String stars;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "EngAddress")
    protected String engAddress;
    @XmlElement(name = "TotalRoom")
    protected int totalRoom;
    @XmlElement(name = "TotalArea")
    protected int totalArea;
    @XmlElement(name = "TotalMeetingArea")
    protected int totalMeetingArea;
    @XmlElement(name = "TotalFbArea")
    protected int totalFbArea;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "Province")
    protected Province province;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "Keyword")
    protected String keyword;
    @XmlElement(name = "UniteHotels")
    protected String uniteHotels;
    @XmlElement(name = "SalesInfo")
    protected String salesInfo;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Tags")
    protected String tags;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "WithGroupHotels")
    protected CommonInfo withGroupHotels;
    @XmlElement(name = "PostCode")
    protected String postCode;

    /**
     * ��ȡrecommendedLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getRecommendedLevel() {
        return recommendedLevel;
    }

    /**
     * ����recommendedLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setRecommendedLevel(CommonInfo value) {
        this.recommendedLevel = value;
    }

    /**
     * ��ȡpicPath���Ե�ֵ��
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
     * ����picPath���Ե�ֵ��
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
     * ��ȡmap���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMap() {
        return map;
    }

    /**
     * ����map���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMap(String value) {
        this.map = value;
    }

    /**
     * ��ȡlevel���Ե�ֵ��
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * ����level���Ե�ֵ��
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * ��ȡcityCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * ����cityCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * ��ȡgroupCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * ����groupCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * ��ȡarea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * ����area���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * ��ȡtel���Ե�ֵ��
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
     * ����tel���Ե�ֵ��
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
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * ��ȡhotelOperationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelOperationType() {
        return hotelOperationType;
    }

    /**
     * ����hotelOperationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelOperationType(String value) {
        this.hotelOperationType = value;
    }

    /**
     * ��ȡfullName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * ����fullName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * ��ȡinternalCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalCode() {
        return internalCode;
    }

    /**
     * ����internalCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalCode(String value) {
        this.internalCode = value;
    }

    /**
     * ��ȡshowVIPPlanLogo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowVIPPlanLogo() {
        return showVIPPlanLogo;
    }

    /**
     * ����showVIPPlanLogo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowVIPPlanLogo(String value) {
        this.showVIPPlanLogo = value;
    }

    /**
     * ��ȡsortId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortId() {
        return sortId;
    }

    /**
     * ����sortId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortId(Integer value) {
        this.sortId = value;
    }

    /**
     * ��ȡudf1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf1() {
        return udf1;
    }

    /**
     * ����udf1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf1(String value) {
        this.udf1 = value;
    }

    /**
     * ��ȡudf2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf2() {
        return udf2;
    }

    /**
     * ����udf2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf2(String value) {
        this.udf2 = value;
    }

    /**
     * ��ȡudf3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf3() {
        return udf3;
    }

    /**
     * ����udf3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf3(String value) {
        this.udf3 = value;
    }

    /**
     * ��ȡudf4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf4() {
        return udf4;
    }

    /**
     * ����udf4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf4(String value) {
        this.udf4 = value;
    }

    /**
     * ��ȡudf5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf5() {
        return udf5;
    }

    /**
     * ����udf5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf5(String value) {
        this.udf5 = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡflag���Ե�ֵ��
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
     * ����flag���Ե�ֵ��
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
     * ��ȡdes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDes() {
        return des;
    }

    /**
     * ����des���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDes(String value) {
        this.des = value;
    }

    /**
     * ��ȡdt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * ����dt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * ��ȡdbName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * ����dbName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbName(String value) {
        this.dbName = value;
    }

    /**
     * ��ȡengName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngName() {
        return engName;
    }

    /**
     * ����engName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngName(String value) {
        this.engName = value;
    }

    /**
     * ��ȡstars���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStars() {
        return stars;
    }

    /**
     * ����stars���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStars(String value) {
        this.stars = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
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
     * ����address���Ե�ֵ��
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
     * ��ȡengAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngAddress() {
        return engAddress;
    }

    /**
     * ����engAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngAddress(String value) {
        this.engAddress = value;
    }

    /**
     * ��ȡtotalRoom���Ե�ֵ��
     * 
     */
    public int getTotalRoom() {
        return totalRoom;
    }

    /**
     * ����totalRoom���Ե�ֵ��
     * 
     */
    public void setTotalRoom(int value) {
        this.totalRoom = value;
    }

    /**
     * ��ȡtotalArea���Ե�ֵ��
     * 
     */
    public int getTotalArea() {
        return totalArea;
    }

    /**
     * ����totalArea���Ե�ֵ��
     * 
     */
    public void setTotalArea(int value) {
        this.totalArea = value;
    }

    /**
     * ��ȡtotalMeetingArea���Ե�ֵ��
     * 
     */
    public int getTotalMeetingArea() {
        return totalMeetingArea;
    }

    /**
     * ����totalMeetingArea���Ե�ֵ��
     * 
     */
    public void setTotalMeetingArea(int value) {
        this.totalMeetingArea = value;
    }

    /**
     * ��ȡtotalFbArea���Ե�ֵ��
     * 
     */
    public int getTotalFbArea() {
        return totalFbArea;
    }

    /**
     * ����totalFbArea���Ե�ֵ��
     * 
     */
    public void setTotalFbArea(int value) {
        this.totalFbArea = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * ��ȡprovince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Province }
     *     
     */
    public Province getProvince() {
        return province;
    }

    /**
     * ����province���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Province }
     *     
     */
    public void setProvince(Province value) {
        this.province = value;
    }

    /**
     * ��ȡcountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * ����country���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * ��ȡkeyword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * ����keyword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * ��ȡuniteHotels���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniteHotels() {
        return uniteHotels;
    }

    /**
     * ����uniteHotels���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniteHotels(String value) {
        this.uniteHotels = value;
    }

    /**
     * ��ȡsalesInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesInfo() {
        return salesInfo;
    }

    /**
     * ����salesInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesInfo(String value) {
        this.salesInfo = value;
    }

    /**
     * ��ȡcity���Ե�ֵ��
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
     * ����city���Ե�ֵ��
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
     * ��ȡtags���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * ����tags���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
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
     * ����email���Ե�ֵ��
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
     * ��ȡmobile���Ե�ֵ��
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
     * ����mobile���Ե�ֵ��
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
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * ��ȡfax���Ե�ֵ��
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
     * ����fax���Ե�ֵ��
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
     * ��ȡwithGroupHotels���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getWithGroupHotels() {
        return withGroupHotels;
    }

    /**
     * ����withGroupHotels���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setWithGroupHotels(CommonInfo value) {
        this.withGroupHotels = value;
    }

    /**
     * ��ȡpostCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * ����postCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

}
