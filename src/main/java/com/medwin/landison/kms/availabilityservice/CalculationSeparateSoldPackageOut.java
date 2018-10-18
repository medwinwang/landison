
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CalculationSeparateSoldPackageOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CalculationSeparateSoldPackageOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PackageDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfItemInfo" minOccurs="0"/&gt;
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
@XmlType(name = "CalculationSeparateSoldPackageOut", propOrder = {
    "totalPrice",
    "totalQuantity",
    "packageDesc",
    "itemInfos",
    "dailyPackages",
    "dailyItems"
})
public class CalculationSeparateSoldPackageOut {

    @XmlElement(name = "TotalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlElement(name = "TotalQuantity")
    protected int totalQuantity;
    @XmlElement(name = "PackageDesc")
    protected String packageDesc;
    @XmlElement(name = "ItemInfos")
    protected ArrayOfItemInfo itemInfos;
    @XmlElement(name = "DailyPackages")
    protected ArrayOfDailyPackage dailyPackages;
    @XmlElement(name = "DailyItems")
    protected ArrayOfDailyItem dailyItems;

    /**
     * 获取totalPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置totalPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * 获取totalQuantity属性的值。
     * 
     */
    public int getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * 设置totalQuantity属性的值。
     * 
     */
    public void setTotalQuantity(int value) {
        this.totalQuantity = value;
    }

    /**
     * 获取packageDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDesc() {
        return packageDesc;
    }

    /**
     * 设置packageDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDesc(String value) {
        this.packageDesc = value;
    }

    /**
     * 获取itemInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemInfo }
     *     
     */
    public ArrayOfItemInfo getItemInfos() {
        return itemInfos;
    }

    /**
     * 设置itemInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemInfo }
     *     
     */
    public void setItemInfos(ArrayOfItemInfo value) {
        this.itemInfos = value;
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
