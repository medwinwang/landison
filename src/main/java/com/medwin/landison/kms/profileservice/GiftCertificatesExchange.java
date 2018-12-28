
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GiftCertificatesExchange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GiftCertificatesExchange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Serial_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Points_accrue_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Exchange_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCertificatesExchange", propOrder = {
    "serialNumber",
    "pointsAccrueId",
    "exchangeId"
})
public class GiftCertificatesExchange {

    @XmlElement(name = "Serial_number")
    protected String serialNumber;
    @XmlElement(name = "Points_accrue_id")
    protected String pointsAccrueId;
    @XmlElement(name = "Exchange_id")
    protected String exchangeId;

    /**
     * 获取serialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置serialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * 获取pointsAccrueId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsAccrueId() {
        return pointsAccrueId;
    }

    /**
     * 设置pointsAccrueId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsAccrueId(String value) {
        this.pointsAccrueId = value;
    }

    /**
     * 获取exchangeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeId() {
        return exchangeId;
    }

    /**
     * 设置exchangeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeId(String value) {
        this.exchangeId = value;
    }

}
