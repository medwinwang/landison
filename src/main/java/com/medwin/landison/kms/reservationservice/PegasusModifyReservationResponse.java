
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
 *         &lt;element name="PegasusModifyReservationResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfo" minOccurs="0"/&gt;
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
    "pegasusModifyReservationResult"
})
@XmlRootElement(name = "PegasusModifyReservationResponse")
public class PegasusModifyReservationResponse {

    @XmlElement(name = "PegasusModifyReservationResult")
    protected OrderInfo pegasusModifyReservationResult;

    /**
     * ��ȡpegasusModifyReservationResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderInfo }
     *     
     */
    public OrderInfo getPegasusModifyReservationResult() {
        return pegasusModifyReservationResult;
    }

    /**
     * ����pegasusModifyReservationResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfo }
     *     
     */
    public void setPegasusModifyReservationResult(OrderInfo value) {
        this.pegasusModifyReservationResult = value;
    }

}
