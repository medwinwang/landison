
package com.medwin.landison.kms.informationservice;

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
 *         &lt;element name="getAlertInfoIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetAlertInfoIn" minOccurs="0"/&gt;
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
    "getAlertInfoIn"
})
@XmlRootElement(name = "GetAlertInfo")
public class GetAlertInfo {

    protected GetAlertInfoIn getAlertInfoIn;

    /**
     * ��ȡgetAlertInfoIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetAlertInfoIn }
     *     
     */
    public GetAlertInfoIn getGetAlertInfoIn() {
        return getAlertInfoIn;
    }

    /**
     * ����getAlertInfoIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetAlertInfoIn }
     *     
     */
    public void setGetAlertInfoIn(GetAlertInfoIn value) {
        this.getAlertInfoIn = value;
    }

}
