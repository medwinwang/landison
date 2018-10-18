
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateAndRoomTypeEnabled complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RateAndRoomTypeEnabled"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderRoomStayInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderRoomStayInfo" minOccurs="0"/&gt;
 *         &lt;element name="CheckItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateAndRoomTypeEnabled", propOrder = {
    "orderRoomStayInfo",
    "checkItem",
    "description",
    "result"
})
public class RateAndRoomTypeEnabled {

    @XmlElement(name = "OrderRoomStayInfo")
    protected OrderRoomStayInfo orderRoomStayInfo;
    @XmlElement(name = "CheckItem")
    protected String checkItem;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Result")
    protected boolean result;

    /**
     * 获取orderRoomStayInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderRoomStayInfo }
     *     
     */
    public OrderRoomStayInfo getOrderRoomStayInfo() {
        return orderRoomStayInfo;
    }

    /**
     * 设置orderRoomStayInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRoomStayInfo }
     *     
     */
    public void setOrderRoomStayInfo(OrderRoomStayInfo value) {
        this.orderRoomStayInfo = value;
    }

    /**
     * 获取checkItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckItem() {
        return checkItem;
    }

    /**
     * 设置checkItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckItem(String value) {
        this.checkItem = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取result属性的值。
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

}
