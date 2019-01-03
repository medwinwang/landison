
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GuaranteeRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuaranteeRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OCancelRule" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CancelRule" minOccurs="0"/&gt;
 *         &lt;element name="ODepositRule" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}DepositRules" minOccurs="0"/&gt;
 *         &lt;element name="Is_related_points" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrival_time_required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrival_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credit_card_required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deposit_required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPrepay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsRelatedCardValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rate_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeRule", propOrder = {
    "oCancelRule",
    "oDepositRule",
    "isRelatedPoints",
    "remark",
    "arrivalTimeRequired",
    "arrivalTime",
    "creditCardRequired",
    "deduct",
    "depositRequired",
    "isPrepay",
    "inactive",
    "isRelatedCardValue",
    "rateCode"
})
public class GuaranteeRule
    extends CommonInfo
{

    @XmlElement(name = "OCancelRule")
    protected CancelRule oCancelRule;
    @XmlElement(name = "ODepositRule")
    protected DepositRules oDepositRule;
    @XmlElement(name = "Is_related_points")
    protected String isRelatedPoints;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "arrival_time_required")
    protected String arrivalTimeRequired;
    @XmlElement(name = "arrival_time")
    protected String arrivalTime;
    @XmlElement(name = "credit_card_required")
    protected String creditCardRequired;
    protected String deduct;
    @XmlElement(name = "deposit_required")
    protected String depositRequired;
    @XmlElement(name = "IsPrepay")
    protected String isPrepay;
    protected String inactive;
    @XmlElement(name = "IsRelatedCardValue")
    protected boolean isRelatedCardValue;
    @XmlElement(name = "rate_code")
    protected String rateCode;

    /**
     * 获取oCancelRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelRule }
     *     
     */
    public CancelRule getOCancelRule() {
        return oCancelRule;
    }

    /**
     * 设置oCancelRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRule }
     *     
     */
    public void setOCancelRule(CancelRule value) {
        this.oCancelRule = value;
    }

    /**
     * 获取oDepositRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DepositRules }
     *     
     */
    public DepositRules getODepositRule() {
        return oDepositRule;
    }

    /**
     * 设置oDepositRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DepositRules }
     *     
     */
    public void setODepositRule(DepositRules value) {
        this.oDepositRule = value;
    }

    /**
     * 获取isRelatedPoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRelatedPoints() {
        return isRelatedPoints;
    }

    /**
     * 设置isRelatedPoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRelatedPoints(String value) {
        this.isRelatedPoints = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取arrivalTimeRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTimeRequired() {
        return arrivalTimeRequired;
    }

    /**
     * 设置arrivalTimeRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTimeRequired(String value) {
        this.arrivalTimeRequired = value;
    }

    /**
     * 获取arrivalTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 设置arrivalTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * 获取creditCardRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardRequired() {
        return creditCardRequired;
    }

    /**
     * 设置creditCardRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardRequired(String value) {
        this.creditCardRequired = value;
    }

    /**
     * 获取deduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeduct() {
        return deduct;
    }

    /**
     * 设置deduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeduct(String value) {
        this.deduct = value;
    }

    /**
     * 获取depositRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositRequired() {
        return depositRequired;
    }

    /**
     * 设置depositRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositRequired(String value) {
        this.depositRequired = value;
    }

    /**
     * 获取isPrepay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrepay() {
        return isPrepay;
    }

    /**
     * 设置isPrepay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrepay(String value) {
        this.isPrepay = value;
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
     * 获取isRelatedCardValue属性的值。
     * 
     */
    public boolean isIsRelatedCardValue() {
        return isRelatedCardValue;
    }

    /**
     * 设置isRelatedCardValue属性的值。
     * 
     */
    public void setIsRelatedCardValue(boolean value) {
        this.isRelatedCardValue = value;
    }

    /**
     * 获取rateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * 设置rateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

}
