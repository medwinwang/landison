
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
 *         &lt;element name="GetCountryResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCountry" minOccurs="0"/&gt;
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
    "getCountryResult"
})
@XmlRootElement(name = "GetCountryResponse")
public class GetCountryResponse {

    @XmlElement(name = "GetCountryResult")
    protected ArrayOfCountry getCountryResult;

    /**
     * ��ȡgetCountryResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountry }
     *     
     */
    public ArrayOfCountry getGetCountryResult() {
        return getCountryResult;
    }

    /**
     * ����getCountryResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountry }
     *     
     */
    public void setGetCountryResult(ArrayOfCountry value) {
        this.getCountryResult = value;
    }

}
