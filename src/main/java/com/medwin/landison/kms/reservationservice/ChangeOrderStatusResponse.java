
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
 *         &lt;element name="ChangeOrderStatusResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "changeOrderStatusResult"
})
@XmlRootElement(name = "ChangeOrderStatusResponse")
public class ChangeOrderStatusResponse {

    @XmlElement(name = "ChangeOrderStatusResult")
    protected boolean changeOrderStatusResult;

    /**
     * ��ȡchangeOrderStatusResult���Ե�ֵ��
     * 
     */
    public boolean isChangeOrderStatusResult() {
        return changeOrderStatusResult;
    }

    /**
     * ����changeOrderStatusResult���Ե�ֵ��
     * 
     */
    public void setChangeOrderStatusResult(boolean value) {
        this.changeOrderStatusResult = value;
    }

}
