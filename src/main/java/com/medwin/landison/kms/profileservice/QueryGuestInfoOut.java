
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryGuestInfoOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryGuestInfoOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestInfoList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfGuestInfo" minOccurs="0"/&gt;
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
@XmlType(name = "QueryGuestInfoOut", propOrder = {
    "guestInfoList",
    "pageInfo"
})
public class QueryGuestInfoOut {

    @XmlElement(name = "GuestInfoList")
    protected ArrayOfGuestInfo guestInfoList;
    @XmlElement(name = "PageInfo")
    protected PageInfo pageInfo;

    /**
     * 获取guestInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuestInfo }
     *     
     */
    public ArrayOfGuestInfo getGuestInfoList() {
        return guestInfoList;
    }

    /**
     * 设置guestInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuestInfo }
     *     
     */
    public void setGuestInfoList(ArrayOfGuestInfo value) {
        this.guestInfoList = value;
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
