
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
 *         &lt;element name="GetAlertInfoResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetAlertInfoOut" minOccurs="0"/&gt;
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
    "getAlertInfoResult"
})
@XmlRootElement(name = "GetAlertInfoResponse")
public class GetAlertInfoResponse {

    @XmlElement(name = "GetAlertInfoResult")
    protected GetAlertInfoOut getAlertInfoResult;

    /**
     * ��ȡgetAlertInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetAlertInfoOut }
     *     
     */
    public GetAlertInfoOut getGetAlertInfoResult() {
        return getAlertInfoResult;
    }

    /**
     * ����getAlertInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetAlertInfoOut }
     *     
     */
    public void setGetAlertInfoResult(GetAlertInfoOut value) {
        this.getAlertInfoResult = value;
    }

}
