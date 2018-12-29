
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FfpAttribute complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FfpAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FfpTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpLevalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FfpAttribute", propOrder = {
    "ffpTypeCode",
    "ffpTypeName",
    "ffpType",
    "ffpLevelName",
    "ffpLevalCode"
})
public class FfpAttribute
    extends BaseInfo
{

    @XmlElement(name = "FfpTypeCode")
    protected String ffpTypeCode;
    @XmlElement(name = "FfpTypeName")
    protected String ffpTypeName;
    @XmlElement(name = "FfpType")
    protected String ffpType;
    @XmlElement(name = "FfpLevelName")
    protected String ffpLevelName;
    @XmlElement(name = "FfpLevalCode")
    protected String ffpLevalCode;

    /**
     * 获取ffpTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpTypeCode() {
        return ffpTypeCode;
    }

    /**
     * 设置ffpTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpTypeCode(String value) {
        this.ffpTypeCode = value;
    }

    /**
     * 获取ffpTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpTypeName() {
        return ffpTypeName;
    }

    /**
     * 设置ffpTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpTypeName(String value) {
        this.ffpTypeName = value;
    }

    /**
     * 获取ffpType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpType() {
        return ffpType;
    }

    /**
     * 设置ffpType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpType(String value) {
        this.ffpType = value;
    }

    /**
     * 获取ffpLevelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpLevelName() {
        return ffpLevelName;
    }

    /**
     * 设置ffpLevelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpLevelName(String value) {
        this.ffpLevelName = value;
    }

    /**
     * 获取ffpLevalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpLevalCode() {
        return ffpLevalCode;
    }

    /**
     * 设置ffpLevalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpLevalCode(String value) {
        this.ffpLevalCode = value;
    }

}
