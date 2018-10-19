
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RemovePartyOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RemovePartyOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovePartyOut", propOrder = {
    "orderInfos"
})
public class RemovePartyOut {

    @XmlElement(name = "OrderInfos")
    protected ArrayOfOrderInfo orderInfos;

    /**
     * ��ȡorderInfos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfo }
     *     
     */
    public ArrayOfOrderInfo getOrderInfos() {
        return orderInfos;
    }

    /**
     * ����orderInfos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfo }
     *     
     */
    public void setOrderInfos(ArrayOfOrderInfo value) {
        this.orderInfos = value;
    }

}
