
package com.medwin.landison.kms.informationservice;

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
 *         &lt;element name="GetPaymentResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetPaymentOut" minOccurs="0"/&gt;
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
    "getPaymentResult"
})
@XmlRootElement(name = "GetPaymentResponse")
public class GetPaymentResponse {

    @XmlElement(name = "GetPaymentResult")
    protected GetPaymentOut getPaymentResult;

    /**
     * ��ȡgetPaymentResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetPaymentOut }
     *     
     */
    public GetPaymentOut getGetPaymentResult() {
        return getPaymentResult;
    }

    /**
     * ����getPaymentResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetPaymentOut }
     *     
     */
    public void setGetPaymentResult(GetPaymentOut value) {
        this.getPaymentResult = value;
    }

}
