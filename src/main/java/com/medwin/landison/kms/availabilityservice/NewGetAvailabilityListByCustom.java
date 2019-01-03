
package com.medwin.landison.kms.availabilityservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="departure" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="extra_bed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="adults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="room_num" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="guesttype_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cust_account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hotelArr" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrival",
    "departure",
    "extraBed",
    "adults",
    "roomNum",
    "guesttypeCode",
    "custAccount",
    "cardNo",
    "children",
    "channel",
    "hotelArr"
})
@XmlRootElement(name = "NewGetAvailabilityListByCustom")
public class NewGetAvailabilityListByCustom {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date arrival;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date departure;
    @XmlElement(name = "extra_bed")
    protected int extraBed;
    protected int adults;
    @XmlElement(name = "room_num")
    protected int roomNum;
    @XmlElement(name = "guesttype_code")
    protected String guesttypeCode;
    @XmlElement(name = "cust_account")
    protected String custAccount;
    @XmlElement(name = "card_no")
    protected String cardNo;
    protected int children;
    protected String channel;
    protected ArrayOfString hotelArr;

    /**
     * 获取arrival属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getArrival() {
        return arrival;
    }

    /**
     * 设置arrival属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrival(Date value) {
        this.arrival = value;
    }

    /**
     * 获取departure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDeparture() {
        return departure;
    }

    /**
     * 设置departure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparture(Date value) {
        this.departure = value;
    }

    /**
     * 获取extraBed属性的值。
     * 
     */
    public int getExtraBed() {
        return extraBed;
    }

    /**
     * 设置extraBed属性的值。
     * 
     */
    public void setExtraBed(int value) {
        this.extraBed = value;
    }

    /**
     * 获取adults属性的值。
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * 设置adults属性的值。
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * 获取roomNum属性的值。
     * 
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * 设置roomNum属性的值。
     * 
     */
    public void setRoomNum(int value) {
        this.roomNum = value;
    }

    /**
     * 获取guesttypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuesttypeCode() {
        return guesttypeCode;
    }

    /**
     * 设置guesttypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuesttypeCode(String value) {
        this.guesttypeCode = value;
    }

    /**
     * 获取custAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAccount() {
        return custAccount;
    }

    /**
     * 设置custAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAccount(String value) {
        this.custAccount = value;
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
     * 获取children属性的值。
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * 设置children属性的值。
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * 获取channel属性的值。
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
     * 设置channel属性的值。
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
     * 获取hotelArr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHotelArr() {
        return hotelArr;
    }

    /**
     * 设置hotelArr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHotelArr(ArrayOfString value) {
        this.hotelArr = value;
    }

}
