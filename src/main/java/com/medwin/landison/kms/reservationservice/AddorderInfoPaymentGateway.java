
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
 *         &lt;element name="paymentGateway" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoPaymentGateway" minOccurs="0"/&gt;
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
    "paymentGateway"
})
@XmlRootElement(name = "AddorderInfoPaymentGateway")
public class AddorderInfoPaymentGateway {

    protected OrderInfoPaymentGateway paymentGateway;

    /**
     * ��ȡpaymentGateway���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoPaymentGateway }
     *     
     */
    public OrderInfoPaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    /**
     * ����paymentGateway���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoPaymentGateway }
     *     
     */
    public void setPaymentGateway(OrderInfoPaymentGateway value) {
        this.paymentGateway = value;
    }

}
