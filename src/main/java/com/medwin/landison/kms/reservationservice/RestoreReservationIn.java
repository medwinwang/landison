
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RestoreReservationIn complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RestoreReservationIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RestoreReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CroPermissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestoreReservationIn", propOrder = {
    "orderId",
    "restoreReason",
    "externalUser",
    "croPermissionName"
})
public class RestoreReservationIn {

    @XmlElement(name = "OrderId")
    protected int orderId;
    @XmlElement(name = "RestoreReason")
    protected String restoreReason;
    @XmlElement(name = "ExternalUser")
    protected String externalUser;
    @XmlElement(name = "CroPermissionName")
    protected String croPermissionName;

    /**
     * ��ȡorderId���Ե�ֵ��
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * ����orderId���Ե�ֵ��
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * ��ȡrestoreReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestoreReason() {
        return restoreReason;
    }

    /**
     * ����restoreReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestoreReason(String value) {
        this.restoreReason = value;
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
     * ��ȡcroPermissionName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCroPermissionName() {
        return croPermissionName;
    }

    /**
     * ����croPermissionName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCroPermissionName(String value) {
        this.croPermissionName = value;
    }

}
