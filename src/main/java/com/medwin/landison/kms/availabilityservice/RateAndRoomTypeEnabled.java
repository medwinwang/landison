
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateAndRoomTypeEnabled complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡorderRoomStayInfo���Ե�ֵ��
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
     * ����orderRoomStayInfo���Ե�ֵ��
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
     * ��ȡcheckItem���Ե�ֵ��
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
     * ����checkItem���Ե�ֵ��
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
     * ��ȡdescription���Ե�ֵ��
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
     * ����description���Ե�ֵ��
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
     * ��ȡresult���Ե�ֵ��
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * ����result���Ե�ֵ��
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

}
