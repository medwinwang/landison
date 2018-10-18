
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CancelRule complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CancelRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="day_before_arrival" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cancel_before_time" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="penalty_fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="reservation_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelRuleDetails" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCancelRuleDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRule", propOrder = {
    "remark",
    "type",
    "dayBeforeArrival",
    "cancelBeforeTime",
    "inactive",
    "penaltyFee",
    "reservationType",
    "cancelRuleDetails"
})
public class CancelRule
    extends CommonInfo
{

    @XmlElement(name = "Remark")
    protected String remark;
    protected String type;
    @XmlElement(name = "day_before_arrival")
    protected int dayBeforeArrival;
    @XmlElement(name = "cancel_before_time")
    protected int cancelBeforeTime;
    protected String inactive;
    @XmlElement(name = "penalty_fee", required = true)
    protected BigDecimal penaltyFee;
    @XmlElement(name = "reservation_type")
    protected String reservationType;
    @XmlElement(name = "CancelRuleDetails")
    protected ArrayOfCancelRuleDetail cancelRuleDetails;

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

    /**
     * ��ȡreservationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationType() {
        return reservationType;
    }

    /**
     * ����reservationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationType(String value) {
        this.reservationType = value;
    }

    /**
     * ��ȡcancelRuleDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelRuleDetail }
     *     
     */
    public ArrayOfCancelRuleDetail getCancelRuleDetails() {
        return cancelRuleDetails;
    }

    /**
     * ����cancelRuleDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelRuleDetail }
     *     
     */
    public void setCancelRuleDetails(ArrayOfCancelRuleDetail value) {
        this.cancelRuleDetails = value;
    }

}
