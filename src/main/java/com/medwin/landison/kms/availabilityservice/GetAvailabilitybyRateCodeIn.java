
package com.medwin.landison.kms.availabilityservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>GetAvailabilitybyRateCodeIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAvailabilitybyRateCodeIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GuesttypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BarType"/&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAvailabilitybyRateCodeIn", propOrder = {
    "hotelCode",
    "arrival",
    "departure",
    "adults",
    "roomNum",
    "guesttypeCode",
    "custAccount",
    "cardNo",
    "cardType",
    "cardLevel",
    "children",
    "channel",
    "barType",
    "rateCode",
    "groupType"
})
public class GetAvailabilitybyRateCodeIn {

    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "Arrival", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date arrival;
    @XmlElement(name = "Departure", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date departure;
    @XmlElement(name = "Adults")
    protected int adults;
    @XmlElement(name = "RoomNum")
    protected int roomNum;
    @XmlElement(name = "GuesttypeCode")
    protected String guesttypeCode;
    @XmlElement(name = "CustAccount")
    protected String custAccount;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "CardLevel")
    protected String cardLevel;
    @XmlElement(name = "Children")
    protected int children;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "BarType", required = true)
    @XmlSchemaType(name = "string")
    protected BarType barType;
    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "GroupType")
    protected String groupType;

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
     * 获取barType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BarType }
     *     
     */
    public BarType getBarType() {
        return barType;
    }

    /**
     * 设置barType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BarType }
     *     
     */
    public void setBarType(BarType value) {
        this.barType = value;
    }

    /**
     * 获取rateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * 设置rateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * 获取groupType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * 设置groupType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

}
