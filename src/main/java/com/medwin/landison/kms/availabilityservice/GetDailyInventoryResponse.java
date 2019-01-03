
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取getDailyInventoryResult属性的值。
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
     * 设置getDailyInventoryResult属性的值。
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
