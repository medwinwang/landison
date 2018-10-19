
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
    @XmlElement(name = "AllowedTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar allowedTime;

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAllowedTime() {
        return allowedTime;
    }

    /**
     * 设置allowedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAllowedTime(XMLGregorianCalendar value) {
        this.allowedTime = value;
    }

}
