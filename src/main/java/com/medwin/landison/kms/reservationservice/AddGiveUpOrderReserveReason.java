
package com.medwin.landison.kms.reservationservice;

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
 *         &lt;element name="cOrderReason" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GiveUpOrderReserveReasonIn" minOccurs="0"/&gt;
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
    "cOrderReason"
})
@XmlRootElement(name = "AddGiveUpOrderReserveReason")
public class AddGiveUpOrderReserveReason {

    protected GiveUpOrderReserveReasonIn cOrderReason;

    /**
     * ��ȡcOrderReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GiveUpOrderReserveReasonIn }
     *     
     */
    public GiveUpOrderReserveReasonIn getCOrderReason() {
        return cOrderReason;
    }

    /**
     * ����cOrderReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GiveUpOrderReserveReasonIn }
     *     
     */
    public void setCOrderReason(GiveUpOrderReserveReasonIn value) {
        this.cOrderReason = value;
    }

}
