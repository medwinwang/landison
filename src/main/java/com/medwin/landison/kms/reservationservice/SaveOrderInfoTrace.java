
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
 *         &lt;element name="saveOrderInfoTraceIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SaveOrderInfoTraceIn" minOccurs="0"/&gt;
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
    "saveOrderInfoTraceIn"
})
@XmlRootElement(name = "SaveOrderInfoTrace")
public class SaveOrderInfoTrace {

    protected SaveOrderInfoTraceIn saveOrderInfoTraceIn;

    /**
     * ��ȡsaveOrderInfoTraceIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SaveOrderInfoTraceIn }
     *     
     */
    public SaveOrderInfoTraceIn getSaveOrderInfoTraceIn() {
        return saveOrderInfoTraceIn;
    }

    /**
     * ����saveOrderInfoTraceIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SaveOrderInfoTraceIn }
     *     
     */
    public void setSaveOrderInfoTraceIn(SaveOrderInfoTraceIn value) {
        this.saveOrderInfoTraceIn = value;
    }

}
