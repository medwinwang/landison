
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
 *         &lt;element name="GetGuaranteeRuleResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GuaranteeRule" minOccurs="0"/&gt;
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
    "getGuaranteeRuleResult"
})
@XmlRootElement(name = "GetGuaranteeRuleResponse")
public class GetGuaranteeRuleResponse {

    @XmlElement(name = "GetGuaranteeRuleResult")
    protected GuaranteeRule getGuaranteeRuleResult;

    /**
     * ��ȡgetGuaranteeRuleResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeRule }
     *     
     */
    public GuaranteeRule getGetGuaranteeRuleResult() {
        return getGuaranteeRuleResult;
    }

    /**
     * ����getGuaranteeRuleResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeRule }
     *     
     */
    public void setGetGuaranteeRuleResult(GuaranteeRule value) {
        this.getGuaranteeRuleResult = value;
    }

}
