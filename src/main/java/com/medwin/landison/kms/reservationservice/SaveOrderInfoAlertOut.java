
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SaveOrderInfoAlertOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SaveOrderInfoAlertOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OrderInfoAlerts" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoAlerts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOrderInfoAlertOut", propOrder = {
    "result",
    "orderInfoAlerts"
})
public class SaveOrderInfoAlertOut {

    @XmlElement(name = "Result")
    protected boolean result;
    @XmlElement(name = "OrderInfoAlerts")
    protected OrderInfoAlerts orderInfoAlerts;

    /**
     * ��ȡresult���Ե�ֵ��
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * ����result���Ե�ֵ��
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

    /**
     * ��ȡorderInfoAlerts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoAlerts }
     *     
     */
    public OrderInfoAlerts getOrderInfoAlerts() {
        return orderInfoAlerts;
    }

    /**
     * ����orderInfoAlerts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoAlerts }
     *     
     */
    public void setOrderInfoAlerts(OrderInfoAlerts value) {
        this.orderInfoAlerts = value;
    }

}
