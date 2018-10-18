
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CalculationSeparateSoldPackageOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtotalPrice���Ե�ֵ��
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
     * ����totalPrice���Ե�ֵ��
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
     * ��ȡtotalQuantity���Ե�ֵ��
     * 
     */
    public int getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * ����totalQuantity���Ե�ֵ��
     * 
     */
    public void setTotalQuantity(int value) {
        this.totalQuantity = value;
    }

    /**
     * ��ȡpackageDesc���Ե�ֵ��
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
     * ����packageDesc���Ե�ֵ��
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
     * ��ȡitemInfos���Ե�ֵ��
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
     * ����itemInfos���Ե�ֵ��
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
     * ��ȡdailyPackages���Ե�ֵ��
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
     * ����dailyPackages���Ե�ֵ��
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
     * ��ȡdailyItems���Ե�ֵ��
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
     * ����dailyItems���Ե�ֵ��
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
