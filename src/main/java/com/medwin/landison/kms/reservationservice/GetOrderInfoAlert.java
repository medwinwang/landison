
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
 *         &lt;element name="getOrderInfoAlertIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetOrderInfoAlertIn" minOccurs="0"/&gt;
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
    "getOrderInfoAlertIn"
})
@XmlRootElement(name = "GetOrderInfoAlert")
public class GetOrderInfoAlert {

    protected GetOrderInfoAlertIn getOrderInfoAlertIn;

    /**
     * ��ȡgetOrderInfoAlertIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetOrderInfoAlertIn }
     *     
     */
    public GetOrderInfoAlertIn getGetOrderInfoAlertIn() {
        return getOrderInfoAlertIn;
    }

    /**
     * ����getOrderInfoAlertIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrderInfoAlertIn }
     *     
     */
    public void setGetOrderInfoAlertIn(GetOrderInfoAlertIn value) {
        this.getOrderInfoAlertIn = value;
    }

}
