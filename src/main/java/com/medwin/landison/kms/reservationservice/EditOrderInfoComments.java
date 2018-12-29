
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Append" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SynchroSplitOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoComments" minOccurs="0"/&gt;
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
    "orderId",
    "hotelCode",
    "append",
    "synchroSplitOrder",
    "comment",
    "comments"
})
@XmlRootElement(name = "EditOrderInfoComments")
public class EditOrderInfoComments {

    @XmlElement(name = "OrderId")
    protected int orderId;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "Append")
    protected int append;
    @XmlElement(name = "SynchroSplitOrder")
    protected String synchroSplitOrder;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Comments")
    protected ArrayOfOrderInfoComments comments;

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
     * 获取append属性的值。
     * 
     */
    public int getAppend() {
        return append;
    }

    /**
     * 设置append属性的值。
     * 
     */
    public void setAppend(int value) {
        this.append = value;
    }

    /**
     * 获取synchroSplitOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchroSplitOrder() {
        return synchroSplitOrder;
    }

    /**
     * 设置synchroSplitOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchroSplitOrder(String value) {
        this.synchroSplitOrder = value;
    }

    /**
     * 获取comment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置comment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoComments }
     *     
     */
    public ArrayOfOrderInfoComments getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoComments }
     *     
     */
    public void setComments(ArrayOfOrderInfoComments value) {
        this.comments = value;
    }

}
