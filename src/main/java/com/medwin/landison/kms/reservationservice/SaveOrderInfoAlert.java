
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
 *         &lt;element name="saveOrderInfoAlertIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SaveOrderInfoAlertIn" minOccurs="0"/&gt;
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
    "saveOrderInfoAlertIn"
})
@XmlRootElement(name = "SaveOrderInfoAlert")
public class SaveOrderInfoAlert {

    protected SaveOrderInfoAlertIn saveOrderInfoAlertIn;

    /**
     * ��ȡsaveOrderInfoAlertIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SaveOrderInfoAlertIn }
     *     
     */
    public SaveOrderInfoAlertIn getSaveOrderInfoAlertIn() {
        return saveOrderInfoAlertIn;
    }

    /**
     * ����saveOrderInfoAlertIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SaveOrderInfoAlertIn }
     *     
     */
    public void setSaveOrderInfoAlertIn(SaveOrderInfoAlertIn value) {
        this.saveOrderInfoAlertIn = value;
    }

}
