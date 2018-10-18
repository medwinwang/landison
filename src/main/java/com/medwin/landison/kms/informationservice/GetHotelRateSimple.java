
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getHotelRateSimple" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetHotelRateSimpleIn" minOccurs="0"/&gt;
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
    "getHotelRateSimple"
})
@XmlRootElement(name = "GetHotelRateSimple")
public class GetHotelRateSimple {

    protected GetHotelRateSimpleIn getHotelRateSimple;

    /**
     * 获取getHotelRateSimple属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetHotelRateSimpleIn }
     *     
     */
    public GetHotelRateSimpleIn getGetHotelRateSimple() {
        return getHotelRateSimple;
    }

    /**
     * 设置getHotelRateSimple属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelRateSimpleIn }
     *     
     */
    public void setGetHotelRateSimple(GetHotelRateSimpleIn value) {
        this.getHotelRateSimple = value;
    }

}
