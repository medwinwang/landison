
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetOrderInfoAlertResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetOrderInfoAlertOut" minOccurs="0"/&gt;
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
    "getOrderInfoAlertResult"
})
@XmlRootElement(name = "GetOrderInfoAlertResponse")
public class GetOrderInfoAlertResponse {

    @XmlElement(name = "GetOrderInfoAlertResult")
    protected GetOrderInfoAlertOut getOrderInfoAlertResult;

    /**
     * ��ȡgetOrderInfoAlertResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetOrderInfoAlertOut }
     *     
     */
    public GetOrderInfoAlertOut getGetOrderInfoAlertResult() {
        return getOrderInfoAlertResult;
    }

    /**
     * ����getOrderInfoAlertResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrderInfoAlertOut }
     *     
     */
    public void setGetOrderInfoAlertResult(GetOrderInfoAlertOut value) {
        this.getOrderInfoAlertResult = value;
    }

}
