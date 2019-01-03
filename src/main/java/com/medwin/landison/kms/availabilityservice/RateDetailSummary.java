
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>RateDetailSummary complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
    @XmlElement(name = "FromDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date fromDt;
    @XmlElement(name = "ToDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date toDt;
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
     * 获取rate属性的值。
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
     * 设置rate属性的值。
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
     * 获取roomType属性的值。
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
     * 设置roomType属性的值。
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
     * 获取price属性的值。
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
     * 设置price属性的值。
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
     * 获取fromDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFromDt() {
        return fromDt;
    }

    /**
     * 设置fromDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDt(Date value) {
        this.fromDt = value;
    }

    /**
     * 获取toDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getToDt() {
        return toDt;
    }

    /**
     * 设置toDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDt(Date value) {
        this.toDt = value;
    }

    /**
     * 获取roomNumbers属性的值。
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
     * 设置roomNumbers属性的值。
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
     * 获取prs1属性的值。
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
     * 设置prs1属性的值。
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
     * 获取prs2属性的值。
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
     * 设置prs2属性的值。
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
     * 获取prs3属性的值。
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
     * 设置prs3属性的值。
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
     * 获取prs4属性的值。
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
     * 设置prs4属性的值。
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
     * 获取prs5属性的值。
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
     * 设置prs5属性的值。
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
     * 获取wprs1属性的值。
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
     * 设置wprs1属性的值。
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
     * 获取wprs2属性的值。
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
     * 设置wprs2属性的值。
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
     * 获取wprs3属性的值。
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
     * 设置wprs3属性的值。
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
     * 获取wprs4属性的值。
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
     * 设置wprs4属性的值。
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
     * 获取wprs5属性的值。
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
     * 设置wprs5属性的值。
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
     * 获取extraBed属性的值。
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
     * 设置extraBed属性的值。
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
     * 获取wextraBed属性的值。
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
     * 设置wextraBed属性的值。
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
     * 获取child属性的值。
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
     * 设置child属性的值。
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
     * 获取wchild属性的值。
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
     * 设置wchild属性的值。
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
     * 获取name属性的值。
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
     * 设置name属性的值。
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
     * 获取hotel属性的值。
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
     * 设置hotel属性的值。
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
     * 获取weekControl属性的值。
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
     * 设置weekControl属性的值。
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
     * 获取sumPrice属性的值。
     * 
     */
    public int getSumPrice() {
        return sumPrice;
    }

    /**
     * 设置sumPrice属性的值。
     * 
     */
    public void setSumPrice(int value) {
        this.sumPrice = value;
    }

    /**
     * 获取packages属性的值。
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
     * 设置packages属性的值。
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
