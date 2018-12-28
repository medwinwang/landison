
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SvcMemberNotification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SvcMemberNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usage" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="IsEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsFax" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSms" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcMemberNotification", propOrder = {
    "usage",
    "isEmail",
    "isFax",
    "isSms"
})
public class SvcMemberNotification
    extends BaseInfo
{

    @XmlElement(name = "Usage")
    protected CommonInfo usage;
    @XmlElement(name = "IsEmail")
    protected boolean isEmail;
    @XmlElement(name = "IsFax")
    protected boolean isFax;
    @XmlElement(name = "IsSms")
    protected boolean isSms;

    /**
     * 获取usage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getUsage() {
        return usage;
    }

    /**
     * 设置usage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setUsage(CommonInfo value) {
        this.usage = value;
    }

    /**
     * 获取isEmail属性的值。
     * 
     */
    public boolean isIsEmail() {
        return isEmail;
    }

    /**
     * 设置isEmail属性的值。
     * 
     */
    public void setIsEmail(boolean value) {
        this.isEmail = value;
    }

    /**
     * 获取isFax属性的值。
     * 
     */
    public boolean isIsFax() {
        return isFax;
    }

    /**
     * 设置isFax属性的值。
     * 
     */
    public void setIsFax(boolean value) {
        this.isFax = value;
    }

    /**
     * 获取isSms属性的值。
     * 
     */
    public boolean isIsSms() {
        return isSms;
    }

    /**
     * 设置isSms属性的值。
     * 
     */
    public void setIsSms(boolean value) {
        this.isSms = value;
    }

}
