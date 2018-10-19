
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetOrderInfoAlertOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetOrderInfoAlertOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderInfoAlertsList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoAlerts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderInfoAlertOut", propOrder = {
    "orderInfoAlertsList"
})
public class GetOrderInfoAlertOut {

    @XmlElement(name = "OrderInfoAlertsList")
    protected ArrayOfOrderInfoAlerts orderInfoAlertsList;

    /**
     * ��ȡorderInfoAlertsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoAlerts }
     *     
     */
    public ArrayOfOrderInfoAlerts getOrderInfoAlertsList() {
        return orderInfoAlertsList;
    }

    /**
     * ����orderInfoAlertsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoAlerts }
     *     
     */
    public void setOrderInfoAlertsList(ArrayOfOrderInfoAlerts value) {
        this.orderInfoAlertsList = value;
    }

}
