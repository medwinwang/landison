
package com.medwin.landison.kms.reservationservice;

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
 *         &lt;element name="GetCancelRuleByOrderIdResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CancelRule" minOccurs="0"/&gt;
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
    "getCancelRuleByOrderIdResult"
})
@XmlRootElement(name = "GetCancelRuleByOrderIdResponse")
public class GetCancelRuleByOrderIdResponse {

    @XmlElement(name = "GetCancelRuleByOrderIdResult")
    protected CancelRule getCancelRuleByOrderIdResult;

    /**
     * ��ȡgetCancelRuleByOrderIdResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CancelRule }
     *     
     */
    public CancelRule getGetCancelRuleByOrderIdResult() {
        return getCancelRuleByOrderIdResult;
    }

    /**
     * ����getCancelRuleByOrderIdResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRule }
     *     
     */
    public void setGetCancelRuleByOrderIdResult(CancelRule value) {
        this.getCancelRuleByOrderIdResult = value;
    }

}
