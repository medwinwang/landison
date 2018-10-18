
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
 *         &lt;element name="getHotelCityIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetHotelCityIn" minOccurs="0"/&gt;
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
    "getHotelCityIn"
})
@XmlRootElement(name = "GetHotelCity")
public class GetHotelCity {

    protected GetHotelCityIn getHotelCityIn;

    /**
     * 获取getHotelCityIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetHotelCityIn }
     *     
     */
    public GetHotelCityIn getGetHotelCityIn() {
        return getHotelCityIn;
    }

    /**
     * 设置getHotelCityIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelCityIn }
     *     
     */
    public void setGetHotelCityIn(GetHotelCityIn value) {
        this.getHotelCityIn = value;
    }

}
