
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
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrGetPoints" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfGetPoints" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cardNo",
    "arrGetPoints",
    "exchangeNumber"
})
@XmlRootElement(name = "GetPointsMultiple")
public class GetPointsMultiple {

    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "ArrGetPoints")
    protected ArrayOfGetPoints arrGetPoints;
    @XmlElement(name = "ExchangeNumber")
    protected String exchangeNumber;

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取arrGetPoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetPoints }
     *     
     */
    public ArrayOfGetPoints getArrGetPoints() {
        return arrGetPoints;
    }

    /**
     * 设置arrGetPoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetPoints }
     *     
     */
    public void setArrGetPoints(ArrayOfGetPoints value) {
        this.arrGetPoints = value;
    }

    /**
     * 获取exchangeNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeNumber() {
        return exchangeNumber;
    }

    /**
     * 设置exchangeNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeNumber(String value) {
        this.exchangeNumber = value;
    }

}
