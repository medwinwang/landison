
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetMemberInfoByCardNoResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SvcMemberInfo" minOccurs="0"/&gt;
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
    "getMemberInfoByCardNoResult"
})
@XmlRootElement(name = "GetMemberInfoByCardNoResponse")
public class GetMemberInfoByCardNoResponse {

    @XmlElement(name = "GetMemberInfoByCardNoResult")
    protected SvcMemberInfo getMemberInfoByCardNoResult;

    /**
     * 获取getMemberInfoByCardNoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SvcMemberInfo }
     *     
     */
    public SvcMemberInfo getGetMemberInfoByCardNoResult() {
        return getMemberInfoByCardNoResult;
    }

    /**
     * 设置getMemberInfoByCardNoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SvcMemberInfo }
     *     
     */
    public void setGetMemberInfoByCardNoResult(SvcMemberInfo value) {
        this.getMemberInfoByCardNoResult = value;
    }

}
