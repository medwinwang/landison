
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddGuestInfoOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddGuestInfoOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestInfoId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGuestInfoOut", propOrder = {
    "guestInfoId"
})
public class AddGuestInfoOut {

    @XmlElement(name = "GuestInfoId")
    protected int guestInfoId;

    /**
     * 获取guestInfoId属性的值。
     * 
     */
    public int getGuestInfoId() {
        return guestInfoId;
    }

    /**
     * 设置guestInfoId属性的值。
     * 
     */
    public void setGuestInfoId(int value) {
        this.guestInfoId = value;
    }

}
