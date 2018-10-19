
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SaveOrderInfoAlertIn complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SaveOrderInfoAlertIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaveAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfoAlerts" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoAlerts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOrderInfoAlertIn", propOrder = {
    "saveAction",
    "externalUser",
    "orderInfoAlerts"
})
public class SaveOrderInfoAlertIn {

    @XmlElement(name = "SaveAction")
    protected String saveAction;
    @XmlElement(name = "ExternalUser")
    protected String externalUser;
    @XmlElement(name = "OrderInfoAlerts")
    protected OrderInfoAlerts orderInfoAlerts;

    /**
     * ��ȡsaveAction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveAction() {
        return saveAction;
    }

    /**
     * ����saveAction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveAction(String value) {
        this.saveAction = value;
    }

    /**
     * ��ȡexternalUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUser() {
        return externalUser;
    }

    /**
     * ����externalUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUser(String value) {
        this.externalUser = value;
    }

    /**
     * ��ȡorderInfoAlerts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoAlerts }
     *     
     */
    public OrderInfoAlerts getOrderInfoAlerts() {
        return orderInfoAlerts;
    }

    /**
     * ����orderInfoAlerts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoAlerts }
     *     
     */
    public void setOrderInfoAlerts(OrderInfoAlerts value) {
        this.orderInfoAlerts = value;
    }

}
