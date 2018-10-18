
package com.medwin.landison.kms.availabilityservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfItemDailyInventoryInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfItemDailyInventoryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemDailyInventoryInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ItemDailyInventoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfItemDailyInventoryInfo", propOrder = {
    "itemDailyInventoryInfo"
})
public class ArrayOfItemDailyInventoryInfo {

    @XmlElement(name = "ItemDailyInventoryInfo", nillable = true)
    protected List<ItemDailyInventoryInfo> itemDailyInventoryInfo;

    /**
     * Gets the value of the itemDailyInventoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDailyInventoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDailyInventoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDailyInventoryInfo }
     * 
     * 
     */
    public List<ItemDailyInventoryInfo> getItemDailyInventoryInfo() {
        if (itemDailyInventoryInfo == null) {
            itemDailyInventoryInfo = new ArrayList<ItemDailyInventoryInfo>();
        }
        return this.itemDailyInventoryInfo;
    }

}
