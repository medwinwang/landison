
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ResvStatus"/&gt;
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="croPermission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "orderId",
    "croPermission"
})
@XmlRootElement(name = "ChangeOrderStatus")
public class ChangeOrderStatus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResvStatus status;
    @XmlElement(name = "order_id")
    protected int orderId;
    protected String croPermission;

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResvStatus }
     *     
     */
    public ResvStatus getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResvStatus }
     *     
     */
    public void setStatus(ResvStatus value) {
        this.status = value;
    }

    /**
     * ��ȡorderId���Ե�ֵ��
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * ����orderId���Ե�ֵ��
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * ��ȡcroPermission���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCroPermission() {
        return croPermission;
    }

    /**
     * ����croPermission���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCroPermission(String value) {
        this.croPermission = value;
    }

}
