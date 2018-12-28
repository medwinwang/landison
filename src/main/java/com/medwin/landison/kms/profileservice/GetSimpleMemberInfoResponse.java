
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
 *         &lt;element name="GetSimpleMemberInfoResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SimpleSvcMemberInfo" minOccurs="0"/&gt;
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
    "getSimpleMemberInfoResult"
})
@XmlRootElement(name = "GetSimpleMemberInfoResponse")
public class GetSimpleMemberInfoResponse {

    @XmlElement(name = "GetSimpleMemberInfoResult")
    protected SimpleSvcMemberInfo getSimpleMemberInfoResult;

    /**
     * 获取getSimpleMemberInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SimpleSvcMemberInfo }
     *     
     */
    public SimpleSvcMemberInfo getGetSimpleMemberInfoResult() {
        return getSimpleMemberInfoResult;
    }

    /**
     * 设置getSimpleMemberInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleSvcMemberInfo }
     *     
     */
    public void setGetSimpleMemberInfoResult(SimpleSvcMemberInfo value) {
        this.getSimpleMemberInfoResult = value;
    }

}
