
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetOrderInfoAlertOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取orderInfoAlertsList属性的值。
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
     * 设置orderInfoAlertsList属性的值。
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
