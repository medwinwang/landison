
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SaveOrderInfoTraceIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SaveOrderInfoTraceIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaveAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfoTraceTexts" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoTraceTexts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOrderInfoTraceIn", propOrder = {
    "saveAction",
    "externalUser",
    "orderInfoTraceTexts"
})
public class SaveOrderInfoTraceIn {

    @XmlElement(name = "SaveAction")
    protected String saveAction;
    @XmlElement(name = "ExternalUser")
    protected String externalUser;
    @XmlElement(name = "OrderInfoTraceTexts")
    protected OrderInfoTraceTexts orderInfoTraceTexts;

    /**
     * 获取saveAction属性的值。
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
     * 设置saveAction属性的值。
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

    /**
     * 获取orderInfoTraceTexts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoTraceTexts }
     *     
     */
    public OrderInfoTraceTexts getOrderInfoTraceTexts() {
        return orderInfoTraceTexts;
    }

    /**
     * 设置orderInfoTraceTexts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoTraceTexts }
     *     
     */
    public void setOrderInfoTraceTexts(OrderInfoTraceTexts value) {
        this.orderInfoTraceTexts = value;
    }

}
