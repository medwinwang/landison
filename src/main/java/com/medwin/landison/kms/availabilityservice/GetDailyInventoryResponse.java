
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetDailyInventoryResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}HotelDailyInventory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDailyInventoryResult"
})
@XmlRootElement(name = "GetDailyInventoryResponse")
public class GetDailyInventoryResponse {

    @XmlElement(name = "GetDailyInventoryResult")
    protected HotelDailyInventory getDailyInventoryResult;

    /**
     * ��ȡgetDailyInventoryResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HotelDailyInventory }
     *     
     */
    public HotelDailyInventory getGetDailyInventoryResult() {
        return getDailyInventoryResult;
    }

    /**
     * ����getDailyInventoryResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDailyInventory }
     *     
     */
    public void setGetDailyInventoryResult(HotelDailyInventory value) {
        this.getDailyInventoryResult = value;
    }

}
