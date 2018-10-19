
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotel_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "hotelCode",
    "arrival",
    "departure",
    "extraBed",
    "adults",
    "roomNum",
    "guesttypeCode",
    "custAccount",
    "cardNo",
    "children",
    "channel"
})
@XmlRootElement(name = "GetAvailability")
public class GetAvailability {

    @XmlElement(name = "hotel_code")
    protected String hotelCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected String arrival;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected String departure;
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

    /**
     * ��ȡhotelCode���Ե�ֵ��
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
     * ����hotelCode���Ե�ֵ��
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
     * ��ȡarrival���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * ����arrival���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrival(String value) {
        this.arrival = value;
    }

    /**
     * ��ȡdeparture���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * ����departure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparture(String value) {
        this.departure = value;
    }

    /**
     * ��ȡextraBed���Ե�ֵ��
     * 
     */
    public int getExtraBed() {
        return extraBed;
    }

    /**
     * ����extraBed���Ե�ֵ��
     * 
     */
    public void setExtraBed(int value) {
        this.extraBed = value;
    }

    /**
     * ��ȡadults���Ե�ֵ��
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * ����adults���Ե�ֵ��
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * ��ȡroomNum���Ե�ֵ��
     * 
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * ����roomNum���Ե�ֵ��
     * 
     */
    public void setRoomNum(int value) {
        this.roomNum = value;
    }

    /**
     * ��ȡguesttypeCode���Ե�ֵ��
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
     * ����guesttypeCode���Ե�ֵ��
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
     * ��ȡcustAccount���Ե�ֵ��
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
     * ����custAccount���Ե�ֵ��
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
     * ��ȡcardNo���Ե�ֵ��
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
     * ����cardNo���Ե�ֵ��
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
     * ��ȡchildren���Ե�ֵ��
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * ����children���Ե�ֵ��
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * ��ȡchannel���Ե�ֵ��
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
     * ����channel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

}
