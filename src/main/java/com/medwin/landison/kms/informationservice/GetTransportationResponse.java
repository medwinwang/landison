
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
 *         &lt;element name="GetTransportationResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetTransportationOut" minOccurs="0"/&gt;
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
    "getTransportationResult"
})
@XmlRootElement(name = "GetTransportationResponse")
public class GetTransportationResponse {

    @XmlElement(name = "GetTransportationResult")
    protected GetTransportationOut getTransportationResult;

    /**
     * ��ȡgetTransportationResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetTransportationOut }
     *     
     */
    public GetTransportationOut getGetTransportationResult() {
        return getTransportationResult;
    }

    /**
     * ����getTransportationResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransportationOut }
     *     
     */
    public void setGetTransportationResult(GetTransportationOut value) {
        this.getTransportationResult = value;
    }

}
