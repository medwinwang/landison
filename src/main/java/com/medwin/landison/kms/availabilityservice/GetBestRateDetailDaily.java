
package com.medwin.landison.kms.availabilityservice;

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
 *         &lt;element name="rateDetailRequest" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}RateDetailRequest" minOccurs="0"/&gt;
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
    "rateDetailRequest"
})
@XmlRootElement(name = "GetBestRateDetailDaily")
public class GetBestRateDetailDaily {

    protected RateDetailRequest rateDetailRequest;

    /**
     * ��ȡrateDetailRequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RateDetailRequest }
     *     
     */
    public RateDetailRequest getRateDetailRequest() {
        return rateDetailRequest;
    }

    /**
     * ����rateDetailRequest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RateDetailRequest }
     *     
     */
    public void setRateDetailRequest(RateDetailRequest value) {
        this.rateDetailRequest = value;
    }

}
