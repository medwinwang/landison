
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="notificationTempateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "orderId",
    "notificationTempateId"
})
@XmlRootElement(name = "PreviewMessageTemplate")
public class PreviewMessageTemplate {

    protected int orderId;
    protected String notificationTempateId;

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
     * ��ȡnotificationTempateId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationTempateId() {
        return notificationTempateId;
    }

    /**
     * ����notificationTempateId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationTempateId(String value) {
        this.notificationTempateId = value;
    }

}
