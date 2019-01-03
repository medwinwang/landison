
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AvailabilityPackage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AvailabilityPackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Package" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Package" minOccurs="0"/&gt;
 *         &lt;element name="DailyPackages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfDailyPackage" minOccurs="0"/&gt;
 *         &lt;element name="DailyItems" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfDailyItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityPackage", propOrder = {
    "_package",
    "dailyPackages",
    "dailyItems"
})
public class AvailabilityPackage {

    @XmlElement(name = "Package")
    protected Package _package;
    @XmlElement(name = "DailyPackages")
    protected ArrayOfDailyPackage dailyPackages;
    @XmlElement(name = "DailyItems")
    protected ArrayOfDailyItem dailyItems;

    /**
     * 获取package属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Package }
     *     
     */
    public Package getPackage() {
        return _package;
    }

    /**
     * 设置package属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setPackage(Package value) {
        this._package = value;
    }

    /**
     * 获取dailyPackages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDailyPackage }
     *     
     */
    public ArrayOfDailyPackage getDailyPackages() {
        return dailyPackages;
    }

    /**
     * 设置dailyPackages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDailyPackage }
     *     
     */
    public void setDailyPackages(ArrayOfDailyPackage value) {
        this.dailyPackages = value;
    }

    /**
     * 获取dailyItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDailyItem }
     *     
     */
    public ArrayOfDailyItem getDailyItems() {
        return dailyItems;
    }

    /**
     * 设置dailyItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDailyItem }
     *     
     */
    public void setDailyItems(ArrayOfDailyItem value) {
        this.dailyItems = value;
    }

}
