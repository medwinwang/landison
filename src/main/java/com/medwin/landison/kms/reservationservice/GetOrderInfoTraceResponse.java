
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
 *         &lt;element name="GetOrderInfoTraceResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetOrderInfoTraceOut" minOccurs="0"/&gt;
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
    "getOrderInfoTraceResult"
})
@XmlRootElement(name = "GetOrderInfoTraceResponse")
public class GetOrderInfoTraceResponse {

    @XmlElement(name = "GetOrderInfoTraceResult")
    protected GetOrderInfoTraceOut getOrderInfoTraceResult;

    /**
     * ��ȡgetOrderInfoTraceResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetOrderInfoTraceOut }
     *     
     */
    public GetOrderInfoTraceOut getGetOrderInfoTraceResult() {
        return getOrderInfoTraceResult;
    }

    /**
     * ����getOrderInfoTraceResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrderInfoTraceOut }
     *     
     */
    public void setGetOrderInfoTraceResult(GetOrderInfoTraceOut value) {
        this.getOrderInfoTraceResult = value;
    }

}
