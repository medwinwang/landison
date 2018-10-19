
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SplitOrderId complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SplitOrderId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SplitOrderIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SplitOrderstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitOrderId", propOrder = {
    "splitOrderIds",
    "splitOrderstatus"
})
public class SplitOrderId
    extends BaseInfo
{

    @XmlElement(name = "SplitOrderIds")
    protected String splitOrderIds;
    @XmlElement(name = "SplitOrderstatus")
    protected String splitOrderstatus;

    /**
     * 获取splitOrderIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitOrderIds() {
        return splitOrderIds;
    }

    /**
     * 设置splitOrderIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitOrderIds(String value) {
        this.splitOrderIds = value;
    }

    /**
     * 获取splitOrderstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitOrderstatus() {
        return splitOrderstatus;
    }

    /**
     * 设置splitOrderstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitOrderstatus(String value) {
        this.splitOrderstatus = value;
    }

}
