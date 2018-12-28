
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="cancelUseCouponType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CancelUseCouponType"/&gt;
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cancelUseCouponType",
    "no"
})
@XmlRootElement(name = "CancelUseCoupon")
public class CancelUseCoupon {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CancelUseCouponType cancelUseCouponType;
    protected String no;

    /**
     * 获取cancelUseCouponType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelUseCouponType }
     *     
     */
    public CancelUseCouponType getCancelUseCouponType() {
        return cancelUseCouponType;
    }

    /**
     * 设置cancelUseCouponType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelUseCouponType }
     *     
     */
    public void setCancelUseCouponType(CancelUseCouponType value) {
        this.cancelUseCouponType = value;
    }

    /**
     * 获取no属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置no属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

}
