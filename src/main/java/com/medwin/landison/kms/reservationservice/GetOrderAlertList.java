
package com.medwin.landison.kms.reservationservice;

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
 *         &lt;element name="orderAlertIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderAlertIn" minOccurs="0"/&gt;
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
    "orderAlertIn"
})
@XmlRootElement(name = "GetOrderAlertList")
public class GetOrderAlertList {

    protected OrderAlertIn orderAlertIn;

    /**
     * ��ȡorderAlertIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderAlertIn }
     *     
     */
    public OrderAlertIn getOrderAlertIn() {
        return orderAlertIn;
    }

    /**
     * ����orderAlertIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAlertIn }
     *     
     */
    public void setOrderAlertIn(OrderAlertIn value) {
        this.orderAlertIn = value;
    }

}
