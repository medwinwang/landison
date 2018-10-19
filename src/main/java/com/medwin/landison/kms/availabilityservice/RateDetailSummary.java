
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>RateDetailSummary complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RateDetailSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rate" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Rate" minOccurs="0"/&gt;
 *         &lt;element name="RoomType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Roomtype" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FromDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RoomNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prs1" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Prs2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Prs3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Prs4" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Prs5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Wprs1" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Wprs2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Wprs3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Wprs4" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Wprs5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExtraBed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="WextraBed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Child" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Wchild" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hotel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Hotel" minOccurs="0"/&gt;
 *         &lt;element name="WeekControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SumPrice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Packages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPackage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDetailSummary", propOrder = {
    "id",
    "rate",
    "roomType",
    "price",
    "fromDt",
    "toDt",
    "roomNumbers",
    "prs1",
    "prs2",
    "prs3",
    "prs4",
    "prs5",
    "wprs1",
    "wprs2",
    "wprs3",
    "wprs4",
    "wprs5",
    "extraBed",
    "wextraBed",
    "child",
    "wchild",
    "name",
    "memo",
    "hotel",
    "weekControl",
    "sumPrice",
    "packages"
})
public class RateDetailSummary {

    protected int id;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "RoomType")
    protected Roomtype roomType;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    @XmlElement(name = "FromDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String fromDt;
    @XmlElement(name = "ToDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String toDt;
    @XmlElement(name = "RoomNumbers")
    protected String roomNumbers;
    @XmlElement(name = "Prs1", required = true)
    protected BigDecimal prs1;
    @XmlElement(name = "Prs2", required = true)
    protected BigDecimal prs2;
    @XmlElement(name = "Prs3", required = true)
    protected BigDecimal prs3;
    @XmlElement(name = "Prs4", required = true)
    protected BigDecimal prs4;
    @XmlElement(name = "Prs5", required = true)
    protected BigDecimal prs5;
    @XmlElement(name = "Wprs1", required = true)
    protected BigDecimal wprs1;
    @XmlElement(name = "Wprs2", required = true)
    protected BigDecimal wprs2;
    @XmlElement(name = "Wprs3", required = true)
    protected BigDecimal wprs3;
    @XmlElement(name = "Wprs4", required = true)
    protected BigDecimal wprs4;
    @XmlElement(name = "Wprs5", required = true)
    protected BigDecimal wprs5;
    @XmlElement(name = "ExtraBed", required = true)
    protected BigDecimal extraBed;
    @XmlElement(name = "WextraBed", required = true)
    protected BigDecimal wextraBed;
    @XmlElement(name = "Child", required = true)
    protected BigDecimal child;
    @XmlElement(name = "Wchild", required = true)
    protected BigDecimal wchild;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "Hotel")
    protected Hotel hotel;
    @XmlElement(name = "WeekControl")
    protected String weekControl;
    @XmlElement(name = "SumPrice")
    protected int sumPrice;
    @XmlElement(name = "Packages")
    protected ArrayOfPackage packages;

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
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
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
     * ��ȡprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * ����price���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * ��ȡfromDt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDt() {
        return fromDt;
    }

    /**
     * ����fromDt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDt(String value) {
        this.fromDt = value;
    }

    /**
     * ��ȡtoDt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDt() {
        return toDt;
    }

    /**
     * ����toDt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDt(String value) {
        this.toDt = value;
    }

    /**
     * ��ȡroomNumbers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumbers() {
        return roomNumbers;
    }

    /**
     * ����roomNumbers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumbers(String value) {
        this.roomNumbers = value;
    }

    /**
     * ��ȡprs1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs1() {
        return prs1;
    }

    /**
     * ����prs1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs1(BigDecimal value) {
        this.prs1 = value;
    }

    /**
     * ��ȡprs2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs2() {
        return prs2;
    }

    /**
     * ����prs2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs2(BigDecimal value) {
        this.prs2 = value;
    }

    /**
     * ��ȡprs3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs3() {
        return prs3;
    }

    /**
     * ����prs3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs3(BigDecimal value) {
        this.prs3 = value;
    }

    /**
     * ��ȡprs4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs4() {
        return prs4;
    }

    /**
     * ����prs4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs4(BigDecimal value) {
        this.prs4 = value;
    }

    /**
     * ��ȡprs5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs5() {
        return prs5;
    }

    /**
     * ����prs5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs5(BigDecimal value) {
        this.prs5 = value;
    }

    /**
     * ��ȡwprs1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWprs1() {
        return wprs1;
    }

    /**
     * ����wprs1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWprs1(BigDecimal value) {
        this.wprs1 = value;
    }

    /**
     * ��ȡwprs2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWprs2() {
        return wprs2;
    }

    /**
     * ����wprs2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWprs2(BigDecimal value) {
        this.wprs2 = value;
    }

    /**
     * ��ȡwprs3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWprs3() {
        return wprs3;
    }

    /**
     * ����wprs3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWprs3(BigDecimal value) {
        this.wprs3 = value;
    }

    /**
     * ��ȡwprs4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWprs4() {
        return wprs4;
    }

    /**
     * ����wprs4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWprs4(BigDecimal value) {
        this.wprs4 = value;
    }

    /**
     * ��ȡwprs5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWprs5() {
        return wprs5;
    }

    /**
     * ����wprs5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWprs5(BigDecimal value) {
        this.wprs5 = value;
    }

    /**
     * ��ȡextraBed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraBed() {
        return extraBed;
    }

    /**
     * ����extraBed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraBed(BigDecimal value) {
        this.extraBed = value;
    }

    /**
     * ��ȡwextraBed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWextraBed() {
        return wextraBed;
    }

    /**
     * ����wextraBed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWextraBed(BigDecimal value) {
        this.wextraBed = value;
    }

    /**
     * ��ȡchild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChild() {
        return child;
    }

    /**
     * ����child���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChild(BigDecimal value) {
        this.child = value;
    }

    /**
     * ��ȡwchild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWchild() {
        return wchild;
    }

    /**
     * ����wchild���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWchild(BigDecimal value) {
        this.wchild = value;
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
     * ��ȡmemo���Ե�ֵ��
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
     * ����memo���Ե�ֵ��
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
     * ��ȡweekControl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekControl() {
        return weekControl;
    }

    /**
     * ����weekControl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekControl(String value) {
        this.weekControl = value;
    }

    /**
     * ��ȡsumPrice���Ե�ֵ��
     * 
     */
    public int getSumPrice() {
        return sumPrice;
    }

    /**
     * ����sumPrice���Ե�ֵ��
     * 
     */
    public void setSumPrice(int value) {
        this.sumPrice = value;
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
