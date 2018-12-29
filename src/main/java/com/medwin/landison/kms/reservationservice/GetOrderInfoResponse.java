
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetOrderInfoResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfo" minOccurs="0"/&gt;
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
    "getOrderInfoResult"
})
@XmlRootElement(name = "GetOrderInfoResponse")
public class GetOrderInfoResponse {

    @XmlElement(name = "GetOrderInfoResult")
    protected OrderInfo getOrderInfoResult;

    /**
     * 获取getOrderInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderInfo }
     *     
     */
    public OrderInfo getGetOrderInfoResult() {
        return getOrderInfoResult;
    }

    /**
     * 设置getOrderInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfo }
     *     
     */
    public void setGetOrderInfoResult(OrderInfo value) {
        this.getOrderInfoResult = value;
    }

}
