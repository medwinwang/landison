
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelDailyInventory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelDailyInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DailyInventories" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfDailyInventory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDailyInventory", propOrder = {
    "hotelCode",
    "dailyInventories"
})
public class HotelDailyInventory {

    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "DailyInventories")
    protected ArrayOfDailyInventory dailyInventories;

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * 获取dailyInventories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDailyInventory }
     *     
     */
    public ArrayOfDailyInventory getDailyInventories() {
        return dailyInventories;
    }

    /**
     * 设置dailyInventories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDailyInventory }
     *     
     */
    public void setDailyInventories(ArrayOfDailyInventory value) {
        this.dailyInventories = value;
    }

}
