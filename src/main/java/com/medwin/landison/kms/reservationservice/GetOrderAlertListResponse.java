
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
 *         &lt;element name="GetOrderAlertListResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderAlertOut" minOccurs="0"/&gt;
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
    "getOrderAlertListResult"
})
@XmlRootElement(name = "GetOrderAlertListResponse")
public class GetOrderAlertListResponse {

    @XmlElement(name = "GetOrderAlertListResult")
    protected OrderAlertOut getOrderAlertListResult;

    /**
     * ��ȡgetOrderAlertListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderAlertOut }
     *     
     */
    public OrderAlertOut getGetOrderAlertListResult() {
        return getOrderAlertListResult;
    }

    /**
     * ����getOrderAlertListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAlertOut }
     *     
     */
    public void setGetOrderAlertListResult(OrderAlertOut value) {
        this.getOrderAlertListResult = value;
    }

}
