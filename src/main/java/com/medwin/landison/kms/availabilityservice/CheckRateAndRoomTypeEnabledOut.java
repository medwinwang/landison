
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckRateAndRoomTypeEnabledOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckRateAndRoomTypeEnabledOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateAndRoomTypeEnabledList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRateAndRoomTypeEnabled" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OrderRoomStays" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderRoomStayInfo" minOccurs="0"/&gt;
 *         &lt;element name="PackageOut" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CalculationSeparateSoldPackageOut" minOccurs="0"/&gt;
 *         &lt;element name="OGuaranteeRule" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfGuaranteeRule" minOccurs="0"/&gt;
 *         &lt;element name="RatePackages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfAvailabilityPackage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRateAndRoomTypeEnabledOut", propOrder = {
    "rateAndRoomTypeEnabledList",
    "totalPrice",
    "orderRoomStays",
    "packageOut",
    "oGuaranteeRule",
    "ratePackages"
})
public class CheckRateAndRoomTypeEnabledOut {

    @XmlElement(name = "RateAndRoomTypeEnabledList")
    protected ArrayOfRateAndRoomTypeEnabled rateAndRoomTypeEnabledList;
    @XmlElement(name = "TotalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlElement(name = "OrderRoomStays")
    protected ArrayOfOrderRoomStayInfo orderRoomStays;
    @XmlElement(name = "PackageOut")
    protected CalculationSeparateSoldPackageOut packageOut;
    @XmlElement(name = "OGuaranteeRule")
    protected ArrayOfGuaranteeRule oGuaranteeRule;
    @XmlElement(name = "RatePackages")
    protected ArrayOfAvailabilityPackage ratePackages;

    /**
     * 获取rateAndRoomTypeEnabledList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateAndRoomTypeEnabled }
     *     
     */
    public ArrayOfRateAndRoomTypeEnabled getRateAndRoomTypeEnabledList() {
        return rateAndRoomTypeEnabledList;
    }

    /**
     * 设置rateAndRoomTypeEnabledList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateAndRoomTypeEnabled }
     *     
     */
    public void setRateAndRoomTypeEnabledList(ArrayOfRateAndRoomTypeEnabled value) {
        this.rateAndRoomTypeEnabledList = value;
    }

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
     * 获取orderRoomStays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderRoomStayInfo }
     *     
     */
    public ArrayOfOrderRoomStayInfo getOrderRoomStays() {
        return orderRoomStays;
    }

    /**
     * 设置orderRoomStays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderRoomStayInfo }
     *     
     */
    public void setOrderRoomStays(ArrayOfOrderRoomStayInfo value) {
        this.orderRoomStays = value;
    }

    /**
     * 获取packageOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalculationSeparateSoldPackageOut }
     *     
     */
    public CalculationSeparateSoldPackageOut getPackageOut() {
        return packageOut;
    }

    /**
     * 设置packageOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSeparateSoldPackageOut }
     *     
     */
    public void setPackageOut(CalculationSeparateSoldPackageOut value) {
        this.packageOut = value;
    }

    /**
     * 获取oGuaranteeRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuaranteeRule }
     *     
     */
    public ArrayOfGuaranteeRule getOGuaranteeRule() {
        return oGuaranteeRule;
    }

    /**
     * 设置oGuaranteeRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuaranteeRule }
     *     
     */
    public void setOGuaranteeRule(ArrayOfGuaranteeRule value) {
        this.oGuaranteeRule = value;
    }

    /**
     * 获取ratePackages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailabilityPackage }
     *     
     */
    public ArrayOfAvailabilityPackage getRatePackages() {
        return ratePackages;
    }

    /**
     * 设置ratePackages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailabilityPackage }
     *     
     */
    public void setRatePackages(ArrayOfAvailabilityPackage value) {
        this.ratePackages = value;
    }

}
