
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DailyInventoryRoomTypeInventory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DailyInventoryRoomTypeInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Generic" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PhysicalRooms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomTypeOverbook" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OutOfOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AvailableRooms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomTypeColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Definite" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}RoomTypeInventoryDefinite" minOccurs="0"/&gt;
 *         &lt;element name="Tentative" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}RoomTypeInventoryTentative" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyInventoryRoomTypeInventory", propOrder = {
    "status",
    "roomType",
    "generic",
    "physicalRooms",
    "roomTypeOverbook",
    "outOfOrder",
    "availableRooms",
    "roomTypeColor",
    "roomTypeDes",
    "roomTypeName",
    "definite",
    "tentative"
})
public class DailyInventoryRoomTypeInventory {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "Generic")
    protected int generic;
    @XmlElement(name = "PhysicalRooms")
    protected int physicalRooms;
    @XmlElement(name = "RoomTypeOverbook")
    protected int roomTypeOverbook;
    @XmlElement(name = "OutOfOrder")
    protected int outOfOrder;
    @XmlElement(name = "AvailableRooms")
    protected int availableRooms;
    @XmlElement(name = "RoomTypeColor")
    protected String roomTypeColor;
    @XmlElement(name = "RoomTypeDes")
    protected String roomTypeDes;
    @XmlElement(name = "RoomTypeName")
    protected String roomTypeName;
    @XmlElement(name = "Definite")
    protected RoomTypeInventoryDefinite definite;
    @XmlElement(name = "Tentative")
    protected RoomTypeInventoryTentative tentative;

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * 获取generic属性的值。
     * 
     */
    public int getGeneric() {
        return generic;
    }

    /**
     * 设置generic属性的值。
     * 
     */
    public void setGeneric(int value) {
        this.generic = value;
    }

    /**
     * 获取physicalRooms属性的值。
     * 
     */
    public int getPhysicalRooms() {
        return physicalRooms;
    }

    /**
     * 设置physicalRooms属性的值。
     * 
     */
    public void setPhysicalRooms(int value) {
        this.physicalRooms = value;
    }

    /**
     * 获取roomTypeOverbook属性的值。
     * 
     */
    public int getRoomTypeOverbook() {
        return roomTypeOverbook;
    }

    /**
     * 设置roomTypeOverbook属性的值。
     * 
     */
    public void setRoomTypeOverbook(int value) {
        this.roomTypeOverbook = value;
    }

    /**
     * 获取outOfOrder属性的值。
     * 
     */
    public int getOutOfOrder() {
        return outOfOrder;
    }

    /**
     * 设置outOfOrder属性的值。
     * 
     */
    public void setOutOfOrder(int value) {
        this.outOfOrder = value;
    }

    /**
     * 获取availableRooms属性的值。
     * 
     */
    public int getAvailableRooms() {
        return availableRooms;
    }

    /**
     * 设置availableRooms属性的值。
     * 
     */
    public void setAvailableRooms(int value) {
        this.availableRooms = value;
    }

    /**
     * 获取roomTypeColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeColor() {
        return roomTypeColor;
    }

    /**
     * 设置roomTypeColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeColor(String value) {
        this.roomTypeColor = value;
    }

    /**
     * 获取roomTypeDes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeDes() {
        return roomTypeDes;
    }

    /**
     * 设置roomTypeDes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeDes(String value) {
        this.roomTypeDes = value;
    }

    /**
     * 获取roomTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * 设置roomTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    /**
     * 获取definite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomTypeInventoryDefinite }
     *     
     */
    public RoomTypeInventoryDefinite getDefinite() {
        return definite;
    }

    /**
     * 设置definite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypeInventoryDefinite }
     *     
     */
    public void setDefinite(RoomTypeInventoryDefinite value) {
        this.definite = value;
    }

    /**
     * 获取tentative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomTypeInventoryTentative }
     *     
     */
    public RoomTypeInventoryTentative getTentative() {
        return tentative;
    }

    /**
     * 设置tentative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypeInventoryTentative }
     *     
     */
    public void setTentative(RoomTypeInventoryTentative value) {
        this.tentative = value;
    }

}
