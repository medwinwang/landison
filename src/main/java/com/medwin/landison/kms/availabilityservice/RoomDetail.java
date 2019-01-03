
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Roomtype" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeBundled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableRooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomDetail", propOrder = {
    "roomType",
    "roomTypeBundled",
    "availableRooms",
    "sortId"
})
public class RoomDetail {

    @XmlElement(name = "RoomType")
    protected Roomtype roomType;
    @XmlElement(name = "RoomTypeBundled")
    protected String roomTypeBundled;
    @XmlElement(name = "AvailableRooms")
    protected String availableRooms;
    @XmlElement(name = "SortId")
    protected String sortId;

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
     * 获取roomTypeBundled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeBundled() {
        return roomTypeBundled;
    }

    /**
     * 设置roomTypeBundled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeBundled(String value) {
        this.roomTypeBundled = value;
    }

    /**
     * 获取availableRooms属性的值。
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
     * 设置availableRooms属性的值。
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
     * 获取sortId属性的值。
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
     * 设置sortId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortId(String value) {
        this.sortId = value;
    }

}
