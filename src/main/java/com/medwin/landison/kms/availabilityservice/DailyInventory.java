
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>DailyInventory complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DailyInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="HouseOverBook" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomTypeInventories" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfDailyInventoryRoomTypeInventory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyInventory", propOrder = {
    "datum",
    "houseOverBook",
    "roomTypeInventories"
})
public class DailyInventory {

    @XmlElement(name = "Datum", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String datum;
    @XmlElement(name = "HouseOverBook")
    protected int houseOverBook;
    @XmlElement(name = "RoomTypeInventories")
    protected ArrayOfDailyInventoryRoomTypeInventory roomTypeInventories;

    /**
     * ��ȡdatum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * ����datum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * ��ȡhouseOverBook���Ե�ֵ��
     * 
     */
    public int getHouseOverBook() {
        return houseOverBook;
    }

    /**
     * ����houseOverBook���Ե�ֵ��
     * 
     */
    public void setHouseOverBook(int value) {
        this.houseOverBook = value;
    }

    /**
     * ��ȡroomTypeInventories���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDailyInventoryRoomTypeInventory }
     *     
     */
    public ArrayOfDailyInventoryRoomTypeInventory getRoomTypeInventories() {
        return roomTypeInventories;
    }

    /**
     * ����roomTypeInventories���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDailyInventoryRoomTypeInventory }
     *     
     */
    public void setRoomTypeInventories(ArrayOfDailyInventoryRoomTypeInventory value) {
        this.roomTypeInventories = value;
    }

}
