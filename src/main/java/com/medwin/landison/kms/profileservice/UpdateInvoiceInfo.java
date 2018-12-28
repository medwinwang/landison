
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}InvoiceInfo" minOccurs="0"/&gt;
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
    "invoiceTitle",
    "invoiceInfo"
})
@XmlRootElement(name = "UpdateInvoiceInfo")
public class UpdateInvoiceInfo {

    protected String invoiceTitle;
    protected InvoiceInfo invoiceInfo;

    /**
     * 获取invoiceTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * 设置invoiceTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceTitle(String value) {
        this.invoiceTitle = value;
    }

    /**
     * 获取invoiceInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInfo }
     *     
     */
    public InvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * 设置invoiceInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInfo }
     *     
     */
    public void setInvoiceInfo(InvoiceInfo value) {
        this.invoiceInfo = value;
    }

}
