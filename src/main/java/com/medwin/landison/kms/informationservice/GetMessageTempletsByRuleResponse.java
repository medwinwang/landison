
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
 *         &lt;element name="GetMessageTempletsByRuleResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}MessageTemplets" minOccurs="0"/&gt;
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
    "getMessageTempletsByRuleResult"
})
@XmlRootElement(name = "GetMessageTempletsByRuleResponse")
public class GetMessageTempletsByRuleResponse {

    @XmlElement(name = "GetMessageTempletsByRuleResult")
    protected MessageTemplets getMessageTempletsByRuleResult;

    /**
     * ��ȡgetMessageTempletsByRuleResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MessageTemplets }
     *     
     */
    public MessageTemplets getGetMessageTempletsByRuleResult() {
        return getMessageTempletsByRuleResult;
    }

    /**
     * ����getMessageTempletsByRuleResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTemplets }
     *     
     */
    public void setGetMessageTempletsByRuleResult(MessageTemplets value) {
        this.getMessageTempletsByRuleResult = value;
    }

}
