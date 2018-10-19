
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>SelfCheckInAllowedInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    protected String allowedTime;

    /**
     * ��ȡallowed���Ե�ֵ��
     * 
     */
    public boolean isAllowed() {
        return allowed;
    }

    /**
     * ����allowed���Ե�ֵ��
     * 
     */
    public void setAllowed(boolean value) {
        this.allowed = value;
    }

    /**
     * ��ȡallowedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedTime() {
        return allowedTime;
    }

    /**
     * ����allowedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedTime(String value) {
        this.allowedTime = value;
    }

}
