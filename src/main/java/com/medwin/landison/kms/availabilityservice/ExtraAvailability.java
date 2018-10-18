
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExtraAvailability complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExtraAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountNums" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OAvailabilityArr" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfAvailability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraAvailability", propOrder = {
    "countNums",
    "oAvailabilityArr"
})
public class ExtraAvailability {

    @XmlElement(name = "CountNums")
    protected int countNums;
    @XmlElement(name = "OAvailabilityArr")
    protected ArrayOfAvailability oAvailabilityArr;

    /**
     * 获取countNums属性的值。
     * 
     */
    public int getCountNums() {
        return countNums;
    }

    /**
     * 设置countNums属性的值。
     * 
     */
    public void setCountNums(int value) {
        this.countNums = value;
    }

    /**
     * 获取oAvailabilityArr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public ArrayOfAvailability getOAvailabilityArr() {
        return oAvailabilityArr;
    }

    /**
     * 设置oAvailabilityArr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public void setOAvailabilityArr(ArrayOfAvailability value) {
        this.oAvailabilityArr = value;
    }

}
