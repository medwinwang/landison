
package com.medwin.landison.kms.reservationservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>SelfCheckInAllowedInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SelfCheckInAllowedInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Allowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AllowedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelfCheckInAllowedInfo", propOrder = {
    "allowed",
    "allowedTime"
})
public class SelfCheckInAllowedInfo {

    @XmlElement(name = "Allowed")
    protected boolean allowed;
    @XmlElement(name = "AllowedTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date allowedTime;

    /**
     * 获取allowed属性的值。
     * 
     */
    public boolean isAllowed() {
        return allowed;
    }

    /**
     * 设置allowed属性的值。
     * 
     */
    public void setAllowed(boolean value) {
        this.allowed = value;
    }

    /**
     * 获取allowedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAllowedTime() {
        return allowedTime;
    }

    /**
     * 设置allowedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedTime(Date value) {
        this.allowedTime = value;
    }

}
