
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RatePlan complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RatePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateHeader" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}RateHeader" minOccurs="0"/&gt;
 *         &lt;element name="RateDetail" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRateDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlan", propOrder = {
    "rateHeader",
    "rateDetail"
})
public class RatePlan {

    @XmlElement(name = "RateHeader")
    protected RateHeader rateHeader;
    @XmlElement(name = "RateDetail")
    protected ArrayOfRateDetail rateDetail;

    /**
     * 获取rateHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateHeader }
     *     
     */
    public RateHeader getRateHeader() {
        return rateHeader;
    }

    /**
     * 设置rateHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateHeader }
     *     
     */
    public void setRateHeader(RateHeader value) {
        this.rateHeader = value;
    }

    /**
     * 获取rateDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateDetail }
     *     
     */
    public ArrayOfRateDetail getRateDetail() {
        return rateDetail;
    }

    /**
     * 设置rateDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateDetail }
     *     
     */
    public void setRateDetail(ArrayOfRateDetail value) {
        this.rateDetail = value;
    }

}
