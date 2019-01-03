
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Availability complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Availability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}HotelInfoSummary" minOccurs="0"/&gt;
 *         &lt;element name="RateInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRateInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Availability", propOrder = {
    "hotelInfo",
    "rateInfos"
})
public class Availability {

    @XmlElement(name = "HotelInfo")
    protected HotelInfoSummary hotelInfo;
    @XmlElement(name = "RateInfos")
    protected ArrayOfRateInfo rateInfos;

    /**
     * 获取hotelInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoSummary }
     *     
     */
    public HotelInfoSummary getHotelInfo() {
        return hotelInfo;
    }

    /**
     * 设置hotelInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoSummary }
     *     
     */
    public void setHotelInfo(HotelInfoSummary value) {
        this.hotelInfo = value;
    }

    /**
     * 获取rateInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateInfo }
     *     
     */
    public ArrayOfRateInfo getRateInfos() {
        return rateInfos;
    }

    /**
     * 设置rateInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateInfo }
     *     
     */
    public void setRateInfos(ArrayOfRateInfo value) {
        this.rateInfos = value;
    }

}
