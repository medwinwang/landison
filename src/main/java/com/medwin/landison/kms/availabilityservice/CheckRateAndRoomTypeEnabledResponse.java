
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
 *         &lt;element name="CheckRateAndRoomTypeEnabledResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CheckRateAndRoomTypeEnabledOut" minOccurs="0"/&gt;
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
    "checkRateAndRoomTypeEnabledResult"
})
@XmlRootElement(name = "CheckRateAndRoomTypeEnabledResponse")
public class CheckRateAndRoomTypeEnabledResponse {

    @XmlElement(name = "CheckRateAndRoomTypeEnabledResult")
    protected CheckRateAndRoomTypeEnabledOut checkRateAndRoomTypeEnabledResult;

    /**
     * 获取checkRateAndRoomTypeEnabledResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckRateAndRoomTypeEnabledOut }
     *     
     */
    public CheckRateAndRoomTypeEnabledOut getCheckRateAndRoomTypeEnabledResult() {
        return checkRateAndRoomTypeEnabledResult;
    }

    /**
     * 设置checkRateAndRoomTypeEnabledResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRateAndRoomTypeEnabledOut }
     *     
     */
    public void setCheckRateAndRoomTypeEnabledResult(CheckRateAndRoomTypeEnabledOut value) {
        this.checkRateAndRoomTypeEnabledResult = value;
    }

}
