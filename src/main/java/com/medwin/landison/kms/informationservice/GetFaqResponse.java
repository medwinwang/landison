
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
 *         &lt;element name="GetFaqResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetFaqOut" minOccurs="0"/&gt;
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
    "getFaqResult"
})
@XmlRootElement(name = "GetFaqResponse")
public class GetFaqResponse {

    @XmlElement(name = "GetFaqResult")
    protected GetFaqOut getFaqResult;

    /**
     * ��ȡgetFaqResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetFaqOut }
     *     
     */
    public GetFaqOut getGetFaqResult() {
        return getFaqResult;
    }

    /**
     * ����getFaqResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetFaqOut }
     *     
     */
    public void setGetFaqResult(GetFaqOut value) {
        this.getFaqResult = value;
    }

}
