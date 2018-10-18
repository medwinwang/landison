
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AvailableFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellSeparate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemTrace" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ItemTraceInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInfo", propOrder = {
    "hotelCode",
    "description",
    "inactive",
    "itemClassCode",
    "defaultQuantity",
    "availableFrom",
    "availableTo",
    "sellSeparate",
    "itemTrace"
})
public class ItemInfo
    extends CommonInfo
{

    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Inactive")
    protected String inactive;
    @XmlElement(name = "ItemClassCode")
    protected String itemClassCode;
    @XmlElement(name = "DefaultQuantity")
    protected int defaultQuantity;
    @XmlElement(name = "AvailableFrom")
    protected String availableFrom;
    @XmlElement(name = "AvailableTo")
    protected String availableTo;
    @XmlElement(name = "SellSeparate")
    protected String sellSeparate;
    @XmlElement(name = "ItemTrace")
    protected ItemTraceInfo itemTrace;

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
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取inactive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactive() {
        return inactive;
    }

    /**
     * 设置inactive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactive(String value) {
        this.inactive = value;
    }

    /**
     * 获取itemClassCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemClassCode() {
        return itemClassCode;
    }

    /**
     * 设置itemClassCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemClassCode(String value) {
        this.itemClassCode = value;
    }

    /**
     * 获取defaultQuantity属性的值。
     * 
     */
    public int getDefaultQuantity() {
        return defaultQuantity;
    }

    /**
     * 设置defaultQuantity属性的值。
     * 
     */
    public void setDefaultQuantity(int value) {
        this.defaultQuantity = value;
    }

    /**
     * 获取availableFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableFrom() {
        return availableFrom;
    }

    /**
     * 设置availableFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableFrom(String value) {
        this.availableFrom = value;
    }

    /**
     * 获取availableTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableTo() {
        return availableTo;
    }

    /**
     * 设置availableTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableTo(String value) {
        this.availableTo = value;
    }

    /**
     * 获取sellSeparate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellSeparate() {
        return sellSeparate;
    }

    /**
     * 设置sellSeparate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellSeparate(String value) {
        this.sellSeparate = value;
    }

    /**
     * 获取itemTrace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemTraceInfo }
     *     
     */
    public ItemTraceInfo getItemTrace() {
        return itemTrace;
    }

    /**
     * 设置itemTrace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTraceInfo }
     *     
     */
    public void setItemTrace(ItemTraceInfo value) {
        this.itemTrace = value;
    }

}
