
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateGuestInfoIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateGuestInfoIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GuestInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGuestInfoIn", propOrder = {
    "guestInfo"
})
public class UpdateGuestInfoIn {

    @XmlElement(name = "GuestInfo")
    protected GuestInfo guestInfo;

    /**
     * 获取guestInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestInfo }
     *     
     */
    public GuestInfo getGuestInfo() {
        return guestInfo;
    }

    /**
     * 设置guestInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestInfo }
     *     
     */
    public void setGuestInfo(GuestInfo value) {
        this.guestInfo = value;
    }

}
