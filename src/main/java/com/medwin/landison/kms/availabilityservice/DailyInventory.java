
package com.medwin.landison.kms.availabilityservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>DailyInventory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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

    @XmlElement(name = "Datum", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date datum;
    @XmlElement(name = "HouseOverBook")
    protected int houseOverBook;
    @XmlElement(name = "RoomTypeInventories")
    protected ArrayOfDailyInventoryRoomTypeInventory roomTypeInventories;

    /**
     * 获取datum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * 设置datum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(Date value) {
        this.datum = value;
    }

    /**
     * 获取houseOverBook属性的值。
     * 
     */
    public int getHouseOverBook() {
        return houseOverBook;
    }

    /**
     * 设置houseOverBook属性的值。
     * 
     */
    public void setHouseOverBook(int value) {
        this.houseOverBook = value;
    }

    /**
     * 获取roomTypeInventories属性的值。
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
     * 设置roomTypeInventories属性的值。
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
