
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RateInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Default_Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Rate" minOccurs="0"/&gt;
 *         &lt;element name="RoomRateDetails" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRoomRateDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInfo", propOrder = {
    "defaultRate",
    "rate",
    "roomRateDetails"
})
public class RateInfo {

    @XmlElement(name = "Default_Rate")
    protected String defaultRate;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "RoomRateDetails")
    protected ArrayOfRoomRateDetail roomRateDetails;

    /**
     * 获取defaultRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRate() {
        return defaultRate;
    }

    /**
     * 设置defaultRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRate(String value) {
        this.defaultRate = value;
    }

    /**
     * 获取rate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * 设置rate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * 获取roomRateDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomRateDetail }
     *     
     */
    public ArrayOfRoomRateDetail getRoomRateDetails() {
        return roomRateDetails;
    }

    /**
     * 设置roomRateDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomRateDetail }
     *     
     */
    public void setRoomRateDetails(ArrayOfRoomRateDetail value) {
        this.roomRateDetails = value;
    }

}
