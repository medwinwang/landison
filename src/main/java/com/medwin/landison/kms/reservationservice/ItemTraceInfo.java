
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemTraceInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemTraceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmsDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsDepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTraceInfo", propOrder = {
    "pmsDepartmentCode",
    "pmsDepartmentName",
    "traceText"
})
public class ItemTraceInfo {

    @XmlElement(name = "PmsDepartmentCode")
    protected String pmsDepartmentCode;
    @XmlElement(name = "PmsDepartmentName")
    protected String pmsDepartmentName;
    @XmlElement(name = "TraceText")
    protected String traceText;

    /**
     * 获取pmsDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsDepartmentCode() {
        return pmsDepartmentCode;
    }

    /**
     * 设置pmsDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsDepartmentCode(String value) {
        this.pmsDepartmentCode = value;
    }

    /**
     * 获取pmsDepartmentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsDepartmentName() {
        return pmsDepartmentName;
    }

    /**
     * 设置pmsDepartmentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsDepartmentName(String value) {
        this.pmsDepartmentName = value;
    }

    /**
     * 获取traceText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceText() {
        return traceText;
    }

    /**
     * 设置traceText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceText(String value) {
        this.traceText = value;
    }

}
