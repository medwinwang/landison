
package com.medwin.landison.kms.availabilityservice;

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
 *         &lt;element name="GetRateRestrictionsIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetRateRestrictionsIn" minOccurs="0"/&gt;
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
    "getRateRestrictionsIn"
})
@XmlRootElement(name = "GetRateRestrictions")
public class GetRateRestrictions {

    @XmlElement(name = "GetRateRestrictionsIn")
    protected GetRateRestrictionsIn getRateRestrictionsIn;

    /**
     * ��ȡgetRateRestrictionsIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetRateRestrictionsIn }
     *     
     */
    public GetRateRestrictionsIn getGetRateRestrictionsIn() {
        return getRateRestrictionsIn;
    }

    /**
     * ����getRateRestrictionsIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetRateRestrictionsIn }
     *     
     */
    public void setGetRateRestrictionsIn(GetRateRestrictionsIn value) {
        this.getRateRestrictionsIn = value;
    }

}
