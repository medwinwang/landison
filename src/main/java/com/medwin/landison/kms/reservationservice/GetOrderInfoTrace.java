
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
 *         &lt;element name="getOrderInfoTraceIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetOrderInfoTraceIn" minOccurs="0"/&gt;
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
    "getOrderInfoTraceIn"
})
@XmlRootElement(name = "GetOrderInfoTrace")
public class GetOrderInfoTrace {

    protected GetOrderInfoTraceIn getOrderInfoTraceIn;

    /**
     * ��ȡgetOrderInfoTraceIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetOrderInfoTraceIn }
     *     
     */
    public GetOrderInfoTraceIn getGetOrderInfoTraceIn() {
        return getOrderInfoTraceIn;
    }

    /**
     * ����getOrderInfoTraceIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrderInfoTraceIn }
     *     
     */
    public void setGetOrderInfoTraceIn(GetOrderInfoTraceIn value) {
        this.getOrderInfoTraceIn = value;
    }

}
