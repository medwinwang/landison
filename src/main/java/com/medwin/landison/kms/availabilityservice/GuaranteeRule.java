
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GuaranteeRule complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡoCancelRule���Ե�ֵ��
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
     * ����oCancelRule���Ե�ֵ��
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
     * ��ȡoDepositRule���Ե�ֵ��
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
     * ����oDepositRule���Ե�ֵ��
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
     * ��ȡisRelatedPoints���Ե�ֵ��
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
     * ����isRelatedPoints���Ե�ֵ��
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
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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
     * ��ȡarrivalTimeRequired���Ե�ֵ��
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
     * ����arrivalTimeRequired���Ե�ֵ��
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
     * ��ȡarrivalTime���Ե�ֵ��
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
     * ����arrivalTime���Ե�ֵ��
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
     * ��ȡcreditCardRequired���Ե�ֵ��
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
     * ����creditCardRequired���Ե�ֵ��
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
     * ��ȡdeduct���Ե�ֵ��
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
     * ����deduct���Ե�ֵ��
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
     * ��ȡdepositRequired���Ե�ֵ��
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
     * ����depositRequired���Ե�ֵ��
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
     * ��ȡisPrepay���Ե�ֵ��
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
     * ����isPrepay���Ե�ֵ��
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
     * ��ȡinactive���Ե�ֵ��
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
     * ����inactive���Ե�ֵ��
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
     * ��ȡisRelatedCardValue���Ե�ֵ��
     * 
     */
    public boolean isIsRelatedCardValue() {
        return isRelatedCardValue;
    }

    /**
     * ����isRelatedCardValue���Ե�ֵ��
     * 
     */
    public void setIsRelatedCardValue(boolean value) {
        this.isRelatedCardValue = value;
    }

    /**
     * ��ȡrateCode���Ե�ֵ��
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
     * ����rateCode���Ե�ֵ��
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
