
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
 *         &lt;element name="ConfirmOrderAlertResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "confirmOrderAlertResult"
})
@XmlRootElement(name = "ConfirmOrderAlertResponse")
public class ConfirmOrderAlertResponse {

    @XmlElement(name = "ConfirmOrderAlertResult")
    protected boolean confirmOrderAlertResult;

    /**
     * ��ȡconfirmOrderAlertResult���Ե�ֵ��
     * 
     */
    public boolean isConfirmOrderAlertResult() {
        return confirmOrderAlertResult;
    }

    /**
     * ����confirmOrderAlertResult���Ե�ֵ��
     * 
     */
    public void setConfirmOrderAlertResult(boolean value) {
        this.confirmOrderAlertResult = value;
    }

}
