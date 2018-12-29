
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
 *         &lt;element name="AddAndUpdateOrderInfoPaymentGatewayResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoPaymentGateway" minOccurs="0"/&gt;
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
    "addAndUpdateOrderInfoPaymentGatewayResult"
})
@XmlRootElement(name = "AddAndUpdateOrderInfoPaymentGatewayResponse")
public class AddAndUpdateOrderInfoPaymentGatewayResponse {

    @XmlElement(name = "AddAndUpdateOrderInfoPaymentGatewayResult")
    protected OrderInfoPaymentGateway addAndUpdateOrderInfoPaymentGatewayResult;

    /**
     * 获取addAndUpdateOrderInfoPaymentGatewayResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoPaymentGateway }
     *     
     */
    public OrderInfoPaymentGateway getAddAndUpdateOrderInfoPaymentGatewayResult() {
        return addAndUpdateOrderInfoPaymentGatewayResult;
    }

    /**
     * 设置addAndUpdateOrderInfoPaymentGatewayResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoPaymentGateway }
     *     
     */
    public void setAddAndUpdateOrderInfoPaymentGatewayResult(OrderInfoPaymentGateway value) {
        this.addAndUpdateOrderInfoPaymentGatewayResult = value;
    }

}
