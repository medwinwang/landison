
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DepositRules complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DepositRules"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deposit_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="day_before_arrival" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="day_after_booking" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositRules", propOrder = {
    "remark",
    "type",
    "depositAmount",
    "dayBeforeArrival",
    "dayAfterBooking",
    "inactive"
})
public class DepositRules
    extends CommonInfo
{

    @XmlElement(name = "Remark")
    protected String remark;
    protected String type;
    @XmlElement(name = "deposit_amount", required = true)
    protected BigDecimal depositAmount;
    @XmlElement(name = "day_before_arrival")
    protected int dayBeforeArrival;
    @XmlElement(name = "day_after_booking")
    protected int dayAfterBooking;
    protected String inactive;

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
     * ��ȡdepositAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    /**
     * ����depositAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmount(BigDecimal value) {
        this.depositAmount = value;
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
     * ��ȡdayAfterBooking���Ե�ֵ��
     * 
     */
    public int getDayAfterBooking() {
        return dayAfterBooking;
    }

    /**
     * ����dayAfterBooking���Ե�ֵ��
     * 
     */
    public void setDayAfterBooking(int value) {
        this.dayAfterBooking = value;
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

}
