
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
 *         &lt;element name="AddGiveUpOrderReserveReasonResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GiveUpOrderReserveReasonOut" minOccurs="0"/&gt;
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
    "addGiveUpOrderReserveReasonResult"
})
@XmlRootElement(name = "AddGiveUpOrderReserveReasonResponse")
public class AddGiveUpOrderReserveReasonResponse {

    @XmlElement(name = "AddGiveUpOrderReserveReasonResult")
    protected GiveUpOrderReserveReasonOut addGiveUpOrderReserveReasonResult;

    /**
     * ��ȡaddGiveUpOrderReserveReasonResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GiveUpOrderReserveReasonOut }
     *     
     */
    public GiveUpOrderReserveReasonOut getAddGiveUpOrderReserveReasonResult() {
        return addGiveUpOrderReserveReasonResult;
    }

    /**
     * ����addGiveUpOrderReserveReasonResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GiveUpOrderReserveReasonOut }
     *     
     */
    public void setAddGiveUpOrderReserveReasonResult(GiveUpOrderReserveReasonOut value) {
        this.addGiveUpOrderReserveReasonResult = value;
    }

}
