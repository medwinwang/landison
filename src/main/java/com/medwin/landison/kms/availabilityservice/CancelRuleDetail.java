
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CancelRuleDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CancelRuleDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="day_before_arrival" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cancel_before_time" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cancel_before_time_minit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cancel_before_time_str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="penalty_fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRuleDetail", propOrder = {
    "remark",
    "type",
    "dayBeforeArrival",
    "cancelBeforeTime",
    "cancelBeforeTimeMinit",
    "cancelBeforeTimeStr",
    "penaltyFee"
})
public class CancelRuleDetail {

    @XmlElement(name = "Remark")
    protected String remark;
    protected String type;
    @XmlElement(name = "day_before_arrival")
    protected int dayBeforeArrival;
    @XmlElement(name = "cancel_before_time")
    protected int cancelBeforeTime;
    @XmlElement(name = "cancel_before_time_minit")
    protected int cancelBeforeTimeMinit;
    @XmlElement(name = "cancel_before_time_str")
    protected String cancelBeforeTimeStr;
    @XmlElement(name = "penalty_fee", required = true)
    protected BigDecimal penaltyFee;

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
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取dayBeforeArrival属性的值。
     * 
     */
    public int getDayBeforeArrival() {
        return dayBeforeArrival;
    }

    /**
     * 设置dayBeforeArrival属性的值。
     * 
     */
    public void setDayBeforeArrival(int value) {
        this.dayBeforeArrival = value;
    }

    /**
     * 获取cancelBeforeTime属性的值。
     * 
     */
    public int getCancelBeforeTime() {
        return cancelBeforeTime;
    }

    /**
     * 设置cancelBeforeTime属性的值。
     * 
     */
    public void setCancelBeforeTime(int value) {
        this.cancelBeforeTime = value;
    }

    /**
     * 获取cancelBeforeTimeMinit属性的值。
     * 
     */
    public int getCancelBeforeTimeMinit() {
        return cancelBeforeTimeMinit;
    }

    /**
     * 设置cancelBeforeTimeMinit属性的值。
     * 
     */
    public void setCancelBeforeTimeMinit(int value) {
        this.cancelBeforeTimeMinit = value;
    }

    /**
     * 获取cancelBeforeTimeStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelBeforeTimeStr() {
        return cancelBeforeTimeStr;
    }

    /**
     * 设置cancelBeforeTimeStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelBeforeTimeStr(String value) {
        this.cancelBeforeTimeStr = value;
    }

    /**
     * 获取penaltyFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    /**
     * 设置penaltyFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyFee(BigDecimal value) {
        this.penaltyFee = value;
    }

}
