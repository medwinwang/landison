
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AvailabilityInventory complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AvailabilityInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}HotelInfoSummary" minOccurs="0"/&gt;
 *         &lt;element name="RoomDetails" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRoomDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityInventory", propOrder = {
    "hotelInfo",
    "roomDetails"
})
public class AvailabilityInventory {

    @XmlElement(name = "HotelInfo")
    protected HotelInfoSummary hotelInfo;
    @XmlElement(name = "RoomDetails")
    protected ArrayOfRoomDetail roomDetails;

    /**
     * ��ȡhotelInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoSummary }
     *     
     */
    public HotelInfoSummary getHotelInfo() {
        return hotelInfo;
    }

    /**
     * ����hotelInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoSummary }
     *     
     */
    public void setHotelInfo(HotelInfoSummary value) {
        this.hotelInfo = value;
    }

    /**
     * ��ȡroomDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomDetail }
     *     
     */
    public ArrayOfRoomDetail getRoomDetails() {
        return roomDetails;
    }

    /**
     * ����roomDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomDetail }
     *     
     */
    public void setRoomDetails(ArrayOfRoomDetail value) {
        this.roomDetails = value;
    }

}
