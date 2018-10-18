
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetPaymentOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetPaymentOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Payments" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPayment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPaymentOut", propOrder = {
    "payments"
})
public class GetPaymentOut {

    @XmlElement(name = "Payments")
    protected ArrayOfPayment payments;

    /**
     * ��ȡpayments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPayment }
     *     
     */
    public ArrayOfPayment getPayments() {
        return payments;
    }

    /**
     * ����payments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPayment }
     *     
     */
    public void setPayments(ArrayOfPayment value) {
        this.payments = value;
    }

}
