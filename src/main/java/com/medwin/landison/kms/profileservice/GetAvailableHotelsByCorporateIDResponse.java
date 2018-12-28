
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
 *         &lt;element name="GetAvailableHotelsByCorporateIDResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCorporateHotel" minOccurs="0"/&gt;
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
    "getAvailableHotelsByCorporateIDResult"
})
@XmlRootElement(name = "GetAvailableHotelsByCorporateIDResponse")
public class GetAvailableHotelsByCorporateIDResponse {

    @XmlElement(name = "GetAvailableHotelsByCorporateIDResult")
    protected ArrayOfCorporateHotel getAvailableHotelsByCorporateIDResult;

    /**
     * 获取getAvailableHotelsByCorporateIDResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCorporateHotel }
     *     
     */
    public ArrayOfCorporateHotel getGetAvailableHotelsByCorporateIDResult() {
        return getAvailableHotelsByCorporateIDResult;
    }

    /**
     * 设置getAvailableHotelsByCorporateIDResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCorporateHotel }
     *     
     */
    public void setGetAvailableHotelsByCorporateIDResult(ArrayOfCorporateHotel value) {
        this.getAvailableHotelsByCorporateIDResult = value;
    }

}
