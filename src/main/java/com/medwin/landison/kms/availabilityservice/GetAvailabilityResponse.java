
package com.medwin.landison.kms.availabilityservice;

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
 *         &lt;element name="GetAvailabilityResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Availability" minOccurs="0"/&gt;
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
    "getAvailabilityResult"
})
@XmlRootElement(name = "GetAvailabilityResponse")
public class GetAvailabilityResponse {

    @XmlElement(name = "GetAvailabilityResult")
    protected Availability getAvailabilityResult;

    /**
     * 获取getAvailabilityResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Availability }
     *     
     */
    public Availability getGetAvailabilityResult() {
        return getAvailabilityResult;
    }

    /**
     * 设置getAvailabilityResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Availability }
     *     
     */
    public void setGetAvailabilityResult(Availability value) {
        this.getAvailabilityResult = value;
    }

}
