
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
 *         &lt;element name="rateRequest" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetAvailabilitybyRateCodeIn" minOccurs="0"/&gt;
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
    "rateRequest"
})
@XmlRootElement(name = "GetAvailabilitybyRateCode")
public class GetAvailabilitybyRateCode {

    protected GetAvailabilitybyRateCodeIn rateRequest;

    /**
     * ��ȡrateRequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetAvailabilitybyRateCodeIn }
     *     
     */
    public GetAvailabilitybyRateCodeIn getRateRequest() {
        return rateRequest;
    }

    /**
     * ����rateRequest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetAvailabilitybyRateCodeIn }
     *     
     */
    public void setRateRequest(GetAvailabilitybyRateCodeIn value) {
        this.rateRequest = value;
    }

}
