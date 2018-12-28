
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetCustInfoAllIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetCustInfoAllIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PageInfo" minOccurs="0"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QueryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfoBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustInfoAllIn", propOrder = {
    "pageInfo",
    "hotelCode",
    "custType",
    "queryMsg",
    "custAccount",
    "orderInfoBeginDate"
})
public class GetCustInfoAllIn {

    @XmlElement(name = "PageInfo")
    protected PageInfo pageInfo;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "QueryMsg")
    protected String queryMsg;
    @XmlElement(name = "CustAccount")
    protected String custAccount;
    @XmlElement(name = "OrderInfoBeginDate")
    protected String orderInfoBeginDate;

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

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * 获取custType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * 设置custType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * 获取queryMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryMsg() {
        return queryMsg;
    }

    /**
     * 设置queryMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryMsg(String value) {
        this.queryMsg = value;
    }

    /**
     * 获取custAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAccount() {
        return custAccount;
    }

    /**
     * 设置custAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAccount(String value) {
        this.custAccount = value;
    }

    /**
     * 获取orderInfoBeginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoBeginDate() {
        return orderInfoBeginDate;
    }

    /**
     * 设置orderInfoBeginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoBeginDate(String value) {
        this.orderInfoBeginDate = value;
    }

}
