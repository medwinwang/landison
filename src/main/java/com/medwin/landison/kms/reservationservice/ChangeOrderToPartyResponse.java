
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
 *         &lt;element name="ChangeOrderToPartyResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ChangeOrderToPartyOut" minOccurs="0"/&gt;
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
    "changeOrderToPartyResult"
})
@XmlRootElement(name = "ChangeOrderToPartyResponse")
public class ChangeOrderToPartyResponse {

    @XmlElement(name = "ChangeOrderToPartyResult")
    protected ChangeOrderToPartyOut changeOrderToPartyResult;

    /**
     * ��ȡchangeOrderToPartyResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChangeOrderToPartyOut }
     *     
     */
    public ChangeOrderToPartyOut getChangeOrderToPartyResult() {
        return changeOrderToPartyResult;
    }

    /**
     * ����changeOrderToPartyResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOrderToPartyOut }
     *     
     */
    public void setChangeOrderToPartyResult(ChangeOrderToPartyOut value) {
        this.changeOrderToPartyResult = value;
    }

}