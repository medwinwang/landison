
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
 *         &lt;element name="GetItemDailyInventoryResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetItemDailyInventoryOut" minOccurs="0"/&gt;
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
    "getItemDailyInventoryResult"
})
@XmlRootElement(name = "GetItemDailyInventoryResponse")
public class GetItemDailyInventoryResponse {

    @XmlElement(name = "GetItemDailyInventoryResult")
    protected GetItemDailyInventoryOut getItemDailyInventoryResult;

    /**
     * ��ȡgetItemDailyInventoryResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetItemDailyInventoryOut }
     *     
     */
    public GetItemDailyInventoryOut getGetItemDailyInventoryResult() {
        return getItemDailyInventoryResult;
    }

    /**
     * ����getItemDailyInventoryResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetItemDailyInventoryOut }
     *     
     */
    public void setGetItemDailyInventoryResult(GetItemDailyInventoryOut value) {
        this.getItemDailyInventoryResult = value;
    }

}
