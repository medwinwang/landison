
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OriginalOrderInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OriginalOrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalBundledRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalIdList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginaStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalTotalRevenue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalRoomNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalOrderInfo", propOrder = {
    "originalFirstName",
    "originalBundledRoomCode",
    "originalIdList",
    "originalId",
    "originaStatus",
    "originalTotalRevenue",
    "originalRoomNum",
    "originalOrderId"
})
public class OriginalOrderInfo {

    @XmlElement(name = "OriginalFirstName")
    protected String originalFirstName;
    @XmlElement(name = "OriginalBundledRoomCode")
    protected String originalBundledRoomCode;
    @XmlElement(name = "OriginalIdList")
    protected String originalIdList;
    @XmlElement(name = "OriginalId")
    protected String originalId;
    @XmlElement(name = "OriginaStatus")
    protected String originaStatus;
    @XmlElement(name = "OriginalTotalRevenue")
    protected String originalTotalRevenue;
    @XmlElement(name = "OriginalRoomNum")
    protected String originalRoomNum;
    @XmlElement(name = "OriginalOrderId")
    protected String originalOrderId;

    /**
     * 获取originalFirstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFirstName() {
        return originalFirstName;
    }

    /**
     * 设置originalFirstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFirstName(String value) {
        this.originalFirstName = value;
    }

    /**
     * 获取originalBundledRoomCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalBundledRoomCode() {
        return originalBundledRoomCode;
    }

    /**
     * 设置originalBundledRoomCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalBundledRoomCode(String value) {
        this.originalBundledRoomCode = value;
    }

    /**
     * 获取originalIdList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalIdList() {
        return originalIdList;
    }

    /**
     * 设置originalIdList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalIdList(String value) {
        this.originalIdList = value;
    }

    /**
     * 获取originalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalId() {
        return originalId;
    }

    /**
     * 设置originalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalId(String value) {
        this.originalId = value;
    }

    /**
     * 获取originaStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginaStatus() {
        return originaStatus;
    }

    /**
     * 设置originaStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginaStatus(String value) {
        this.originaStatus = value;
    }

    /**
     * 获取originalTotalRevenue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTotalRevenue() {
        return originalTotalRevenue;
    }

    /**
     * 设置originalTotalRevenue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTotalRevenue(String value) {
        this.originalTotalRevenue = value;
    }

    /**
     * 获取originalRoomNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRoomNum() {
        return originalRoomNum;
    }

    /**
     * 设置originalRoomNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRoomNum(String value) {
        this.originalRoomNum = value;
    }

    /**
     * 获取originalOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalOrderId() {
        return originalOrderId;
    }

    /**
     * 设置originalOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalOrderId(String value) {
        this.originalOrderId = value;
    }

}
