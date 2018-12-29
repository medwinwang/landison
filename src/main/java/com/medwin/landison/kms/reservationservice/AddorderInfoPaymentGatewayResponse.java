
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
 *         &lt;element name="AddorderInfoPaymentGatewayResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoPaymentGateway" minOccurs="0"/&gt;
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
    "addorderInfoPaymentGatewayResult"
})
@XmlRootElement(name = "AddorderInfoPaymentGatewayResponse")
public class AddorderInfoPaymentGatewayResponse {

    @XmlElement(name = "AddorderInfoPaymentGatewayResult")
    protected OrderInfoPaymentGateway addorderInfoPaymentGatewayResult;

    /**
     * 获取addorderInfoPaymentGatewayResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoPaymentGateway }
     *     
     */
    public OrderInfoPaymentGateway getAddorderInfoPaymentGatewayResult() {
        return addorderInfoPaymentGatewayResult;
    }

    /**
     * 设置addorderInfoPaymentGatewayResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoPaymentGateway }
     *     
     */
    public void setAddorderInfoPaymentGatewayResult(OrderInfoPaymentGateway value) {
        this.addorderInfoPaymentGatewayResult = value;
    }

}
