
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DailyInventoryRoomTypeInventory complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    @XmlElement(name = "RoomTypeName")
    protected String roomTypeName;
    @XmlElement(name = "Definite")
    protected RoomTypeInventoryDefinite definite;
    @XmlElement(name = "Tentative")
    protected RoomTypeInventoryTentative tentative;

    /**
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡroomType���Ե�ֵ��
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
     * ����roomType���Ե�ֵ��
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
     * ��ȡgeneric���Ե�ֵ��
     * 
     */
    public int getGeneric() {
        return generic;
    }

    /**
     * ����generic���Ե�ֵ��
     * 
     */
    public void setGeneric(int value) {
        this.generic = value;
    }

    /**
     * ��ȡphysicalRooms���Ե�ֵ��
     * 
     */
    public int getPhysicalRooms() {
        return physicalRooms;
    }

    /**
     * ����physicalRooms���Ե�ֵ��
     * 
     */
    public void setPhysicalRooms(int value) {
        this.physicalRooms = value;
    }

    /**
     * ��ȡroomTypeOverbook���Ե�ֵ��
     * 
     */
    public int getRoomTypeOverbook() {
        return roomTypeOverbook;
    }

    /**
     * ����roomTypeOverbook���Ե�ֵ��
     * 
     */
    public void setRoomTypeOverbook(int value) {
        this.roomTypeOverbook = value;
    }

    /**
     * ��ȡoutOfOrder���Ե�ֵ��
     * 
     */
    public int getOutOfOrder() {
        return outOfOrder;
    }

    /**
     * ����outOfOrder���Ե�ֵ��
     * 
     */
    public void setOutOfOrder(int value) {
        this.outOfOrder = value;
    }

    /**
     * ��ȡavailableRooms���Ե�ֵ��
     * 
     */
    public int getAvailableRooms() {
        return availableRooms;
    }

    /**
     * ����availableRooms���Ե�ֵ��
     * 
     */
    public void setAvailableRooms(int value) {
        this.availableRooms = value;
    }

    /**
     * ��ȡroomTypeColor���Ե�ֵ��
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
     * ����roomTypeColor���Ե�ֵ��
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
     * ��ȡroomTypeName���Ե�ֵ��
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
     * ����roomTypeName���Ե�ֵ��
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
     * ��ȡdefinite���Ե�ֵ��
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
     * ����definite���Ե�ֵ��
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
     * ��ȡtentative���Ե�ֵ��
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
     * ����tentative���Ե�ֵ��
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
