
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddOrderToPartyIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddOrderToPartyIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AttachOrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExternalUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderToPartyIn", propOrder = {
    "orderId",
    "attachOrderId",
    "externalUser"
})
public class AddOrderToPartyIn {

    @XmlElement(name = "OrderId")
    protected int orderId;
    @XmlElement(name = "AttachOrderId")
    protected int attachOrderId;
    @XmlElement(name = "ExternalUser")
    protected String externalUser;

    /**
     * 获取orderId属性的值。
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId属性的值。
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * 获取attachOrderId属性的值。
     * 
     */
    public int getAttachOrderId() {
        return attachOrderId;
    }

    /**
     * 设置attachOrderId属性的值。
     * 
     */
    public void setAttachOrderId(int value) {
        this.attachOrderId = value;
    }

    /**
     * 获取externalUser属性的值。
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
     * 设置externalUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUser(String value) {
        this.externalUser = value;
    }

}
