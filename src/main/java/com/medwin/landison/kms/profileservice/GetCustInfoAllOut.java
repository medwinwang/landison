
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetCustInfoAllOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetCustInfoAllOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustInfoList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCustInfo" minOccurs="0"/&gt;
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
@XmlType(name = "GetCustInfoAllOut", propOrder = {
    "custInfoList",
    "pageInfo"
})
public class GetCustInfoAllOut {

    @XmlElement(name = "CustInfoList")
    protected ArrayOfCustInfo custInfoList;
    @XmlElement(name = "PageInfo")
    protected PageInfo pageInfo;

    /**
     * 获取custInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustInfo }
     *     
     */
    public ArrayOfCustInfo getCustInfoList() {
        return custInfoList;
    }

    /**
     * 设置custInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustInfo }
     *     
     */
    public void setCustInfoList(ArrayOfCustInfo value) {
        this.custInfoList = value;
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
