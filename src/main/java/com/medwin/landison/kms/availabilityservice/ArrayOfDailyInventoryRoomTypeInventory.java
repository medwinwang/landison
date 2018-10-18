
package com.medwin.landison.kms.availabilityservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDailyInventoryRoomTypeInventory complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDailyInventoryRoomTypeInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyInventoryRoomTypeInventory" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}DailyInventoryRoomTypeInventory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDailyInventoryRoomTypeInventory", propOrder = {
    "dailyInventoryRoomTypeInventory"
})
public class ArrayOfDailyInventoryRoomTypeInventory {

    @XmlElement(name = "DailyInventoryRoomTypeInventory", nillable = true)
    protected List<DailyInventoryRoomTypeInventory> dailyInventoryRoomTypeInventory;

    /**
     * Gets the value of the dailyInventoryRoomTypeInventory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailyInventoryRoomTypeInventory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailyInventoryRoomTypeInventory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DailyInventoryRoomTypeInventory }
     * 
     * 
     */
    public List<DailyInventoryRoomTypeInventory> getDailyInventoryRoomTypeInventory() {
        if (dailyInventoryRoomTypeInventory == null) {
            dailyInventoryRoomTypeInventory = new ArrayList<DailyInventoryRoomTypeInventory>();
        }
        return this.dailyInventoryRoomTypeInventory;
    }

}