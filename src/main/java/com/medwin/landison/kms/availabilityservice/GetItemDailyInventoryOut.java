
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetItemDailyInventoryOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetItemDailyInventoryOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemDailyInventoryInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfItemDailyInventoryInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemDailyInventoryOut", propOrder = {
    "itemDailyInventoryInfos"
})
public class GetItemDailyInventoryOut {

    @XmlElement(name = "ItemDailyInventoryInfos")
    protected ArrayOfItemDailyInventoryInfo itemDailyInventoryInfos;

    /**
     * ��ȡitemDailyInventoryInfos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemDailyInventoryInfo }
     *     
     */
    public ArrayOfItemDailyInventoryInfo getItemDailyInventoryInfos() {
        return itemDailyInventoryInfos;
    }

    /**
     * ����itemDailyInventoryInfos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemDailyInventoryInfo }
     *     
     */
    public void setItemDailyInventoryInfos(ArrayOfItemDailyInventoryInfo value) {
        this.itemDailyInventoryInfos = value;
    }

}
