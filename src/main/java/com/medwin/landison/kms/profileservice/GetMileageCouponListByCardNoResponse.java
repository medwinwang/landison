
package com.medwin.landison.kms.profileservice;

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
 *         &lt;element name="GetMileageCouponListByCardNoResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSvcCouponInfo" minOccurs="0"/&gt;
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
    "getMileageCouponListByCardNoResult"
})
@XmlRootElement(name = "GetMileageCouponListByCardNoResponse")
public class GetMileageCouponListByCardNoResponse {

    @XmlElement(name = "GetMileageCouponListByCardNoResult")
    protected ArrayOfSvcCouponInfo getMileageCouponListByCardNoResult;

    /**
     * 获取getMileageCouponListByCardNoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSvcCouponInfo }
     *     
     */
    public ArrayOfSvcCouponInfo getGetMileageCouponListByCardNoResult() {
        return getMileageCouponListByCardNoResult;
    }

    /**
     * 设置getMileageCouponListByCardNoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSvcCouponInfo }
     *     
     */
    public void setGetMileageCouponListByCardNoResult(ArrayOfSvcCouponInfo value) {
        this.getMileageCouponListByCardNoResult = value;
    }

}
