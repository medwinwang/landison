
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryOrderPageOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryOrderPageOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfo" minOccurs="0"/&gt;
 *         &lt;element name="PageInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PageInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOrderPageOut", propOrder = {
    "orderInfos",
    "pageInfo"
})
public class QueryOrderPageOut {

    @XmlElement(name = "OrderInfos")
    protected ArrayOfOrderInfo orderInfos;
    @XmlElement(name = "PageInfo")
    protected PageInfo pageInfo;

    /**
     * 获取orderInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfo }
     *     
     */
    public ArrayOfOrderInfo getOrderInfos() {
        return orderInfos;
    }

    /**
     * 设置orderInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfo }
     *     
     */
    public void setOrderInfos(ArrayOfOrderInfo value) {
        this.orderInfos = value;
    }

    /**
     * 获取pageInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PageInfo }
     *     
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * 设置pageInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PageInfo }
     *     
     */
    public void setPageInfo(PageInfo value) {
        this.pageInfo = value;
    }

}
