
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
     * ��ȡaddorderInfoPaymentGatewayResult���Ե�ֵ��
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
     * ����addorderInfoPaymentGatewayResult���Ե�ֵ��
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
