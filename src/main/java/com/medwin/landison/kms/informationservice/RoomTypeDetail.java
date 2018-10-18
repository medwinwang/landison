
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomTypeDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RoomTypeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelInstallations" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Hotel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Hotel" minOccurs="0"/&gt;
 *         &lt;element name="RoomType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Roomtype" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsHurdle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstNightPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableRooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Installations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeCate" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Packages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPackage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypeDetail", propOrder = {
    "maxOccupancy",
    "hotelInstallations",
    "status",
    "hotel",
    "roomType",
    "number",
    "sortId",
    "isHurdle",
    "firstNightPrice",
    "totalPrice",
    "availableRooms",
    "des",
    "address",
    "pic",
    "installations",
    "roomTypeCate",
    "area",
    "packages"
})
public class RoomTypeDetail
    extends CommonInfo
{

    @XmlElement(name = "MaxOccupancy")
    protected int maxOccupancy;
    @XmlElement(name = "HotelInstallations")
    protected ArrayOfCommonInfo hotelInstallations;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "Hotel")
    protected Hotel hotel;
    @XmlElement(name = "RoomType")
    protected Roomtype roomType;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "SortId")
    protected String sortId;
    @XmlElement(name = "IsHurdle")
    protected String isHurdle;
    @XmlElement(name = "FirstNightPrice")
    protected String firstNightPrice;
    @XmlElement(name = "TotalPrice")
    protected String totalPrice;
    @XmlElement(name = "AvailableRooms")
    protected String availableRooms;
    @XmlElement(name = "Des")
    protected String des;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Pic")
    protected String pic;
    @XmlElement(name = "Installations")
    protected String installations;
    @XmlElement(name = "RoomTypeCate")
    protected CommonInfo roomTypeCate;
    @XmlElement(name = "Area")
    protected int area;
    @XmlElement(name = "Packages")
    protected ArrayOfPackage packages;

    /**
     * ��ȡmaxOccupancy���Ե�ֵ��
     * 
     */
    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * ����maxOccupancy���Ե�ֵ��
     * 
     */
    public void setMaxOccupancy(int value) {
        this.maxOccupancy = value;
    }

    /**
     * ��ȡhotelInstallations���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public ArrayOfCommonInfo getHotelInstallations() {
        return hotelInstallations;
    }

    /**
     * ����hotelInstallations���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public void setHotelInstallations(ArrayOfCommonInfo value) {
        this.hotelInstallations = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * ��ȡhotel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * ����hotel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * ��ȡroomType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Roomtype }
     *     
     */
    public Roomtype getRoomType() {
        return roomType;
    }

    /**
     * ����roomType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Roomtype }
     *     
     */
    public void setRoomType(Roomtype value) {
        this.roomType = value;
    }

    /**
     * ��ȡnumber���Ե�ֵ��
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * ����number���Ե�ֵ��
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * ��ȡsortId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortId() {
        return sortId;
    }

    /**
     * ����sortId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortId(String value) {
        this.sortId = value;
    }

    /**
     * ��ȡisHurdle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHurdle() {
        return isHurdle;
    }

    /**
     * ����isHurdle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHurdle(String value) {
        this.isHurdle = value;
    }

    /**
     * ��ȡfirstNightPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNightPrice() {
        return firstNightPrice;
    }

    /**
     * ����firstNightPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNightPrice(String value) {
        this.firstNightPrice = value;
    }

    /**
     * ��ȡtotalPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * ����totalPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * ��ȡavailableRooms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableRooms() {
        return availableRooms;
    }

    /**
     * ����availableRooms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableRooms(String value) {
        this.availableRooms = value;
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
     * ��ȡpic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPic() {
        return pic;
    }

    /**
     * ����pic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPic(String value) {
        this.pic = value;
    }

    /**
     * ��ȡinstallations���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallations() {
        return installations;
    }

    /**
     * ����installations���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallations(String value) {
        this.installations = value;
    }

    /**
     * ��ȡroomTypeCate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getRoomTypeCate() {
        return roomTypeCate;
    }

    /**
     * ����roomTypeCate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setRoomTypeCate(CommonInfo value) {
        this.roomTypeCate = value;
    }

    /**
     * ��ȡarea���Ե�ֵ��
     * 
     */
    public int getArea() {
        return area;
    }

    /**
     * ����area���Ե�ֵ��
     * 
     */
    public void setArea(int value) {
        this.area = value;
    }

    /**
     * ��ȡpackages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackage }
     *     
     */
    public ArrayOfPackage getPackages() {
        return packages;
    }

    /**
     * ����packages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackage }
     *     
     */
    public void setPackages(ArrayOfPackage value) {
        this.packages = value;
    }

}
