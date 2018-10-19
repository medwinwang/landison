
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>GetAvailabilitybyRateCodeIn complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    @XmlElement(name = "Arrival", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String arrival;
    @XmlElement(name = "Departure", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String departure;
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
     * ��ȡcardType���Ե�ֵ��
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
     * ����cardType���Ե�ֵ��
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
     * ��ȡcardLevel���Ե�ֵ��
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
     * ����cardLevel���Ե�ֵ��
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

    /**
     * ��ȡbarType���Ե�ֵ��
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
     * ����barType���Ե�ֵ��
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
     * ��ȡrateCode���Ե�ֵ��
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
     * ����rateCode���Ե�ֵ��
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
     * ��ȡgroupType���Ե�ֵ��
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
     * ����groupType���Ե�ֵ��
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
