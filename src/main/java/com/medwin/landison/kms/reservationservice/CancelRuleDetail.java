
package com.medwin.landison.kms.reservationservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CancelRuleDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡdayBeforeArrival���Ե�ֵ��
     * 
     */
    public int getDayBeforeArrival() {
        return dayBeforeArrival;
    }

    /**
     * ����dayBeforeArrival���Ե�ֵ��
     * 
     */
    public void setDayBeforeArrival(int value) {
        this.dayBeforeArrival = value;
    }

    /**
     * ��ȡcancelBeforeTime���Ե�ֵ��
     * 
     */
    public int getCancelBeforeTime() {
        return cancelBeforeTime;
    }

    /**
     * ����cancelBeforeTime���Ե�ֵ��
     * 
     */
    public void setCancelBeforeTime(int value) {
        this.cancelBeforeTime = value;
    }

    /**
     * ��ȡcancelBeforeTimeMinit���Ե�ֵ��
     * 
     */
    public int getCancelBeforeTimeMinit() {
        return cancelBeforeTimeMinit;
    }

    /**
     * ����cancelBeforeTimeMinit���Ե�ֵ��
     * 
     */
    public void setCancelBeforeTimeMinit(int value) {
        this.cancelBeforeTimeMinit = value;
    }

    /**
     * ��ȡcancelBeforeTimeStr���Ե�ֵ��
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
     * ����cancelBeforeTimeStr���Ե�ֵ��
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
     * ��ȡpenaltyFee���Ե�ֵ��
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
     * ����penaltyFee���Ե�ֵ��
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
