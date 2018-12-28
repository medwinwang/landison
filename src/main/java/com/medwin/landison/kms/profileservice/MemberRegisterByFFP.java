
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="simpleSvcMemberInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SimpleSvcMemberInfo" minOccurs="0"/&gt;
 *         &lt;element name="ffpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ffpNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simpleSvcMemberInfo",
    "ffpType",
    "ffpNo"
})
@XmlRootElement(name = "MemberRegisterByFFP")
public class MemberRegisterByFFP {

    protected SimpleSvcMemberInfo simpleSvcMemberInfo;
    protected String ffpType;
    protected String ffpNo;

    /**
     * 获取simpleSvcMemberInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SimpleSvcMemberInfo }
     *     
     */
    public SimpleSvcMemberInfo getSimpleSvcMemberInfo() {
        return simpleSvcMemberInfo;
    }

    /**
     * 设置simpleSvcMemberInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleSvcMemberInfo }
     *     
     */
    public void setSimpleSvcMemberInfo(SimpleSvcMemberInfo value) {
        this.simpleSvcMemberInfo = value;
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
     * 获取ffpNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpNo() {
        return ffpNo;
    }

    /**
     * 设置ffpNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpNo(String value) {
        this.ffpNo = value;
    }

}
