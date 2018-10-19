
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExtraOrderInfoSummary complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExtraOrderInfoSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountNums" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OOrderArr" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraOrderInfoSummary", propOrder = {
    "countNums",
    "oOrderArr"
})
public class ExtraOrderInfoSummary {

    @XmlElement(name = "CountNums")
    protected int countNums;
    @XmlElement(name = "OOrderArr")
    protected ArrayOfOrderInfo oOrderArr;

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
     * 获取oOrderArr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfo }
     *     
     */
    public ArrayOfOrderInfo getOOrderArr() {
        return oOrderArr;
    }

    /**
     * 设置oOrderArr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfo }
     *     
     */
    public void setOOrderArr(ArrayOfOrderInfo value) {
        this.oOrderArr = value;
    }

}
