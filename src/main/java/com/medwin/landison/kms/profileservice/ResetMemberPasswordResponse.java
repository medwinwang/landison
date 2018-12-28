
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
 *         &lt;element name="ResetMemberPasswordResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "resetMemberPasswordResult"
})
@XmlRootElement(name = "ResetMemberPasswordResponse")
public class ResetMemberPasswordResponse {

    @XmlElement(name = "ResetMemberPasswordResult")
    protected boolean resetMemberPasswordResult;

    /**
     * 获取resetMemberPasswordResult属性的值。
     * 
     */
    public boolean isResetMemberPasswordResult() {
        return resetMemberPasswordResult;
    }

    /**
     * 设置resetMemberPasswordResult属性的值。
     * 
     */
    public void setResetMemberPasswordResult(boolean value) {
        this.resetMemberPasswordResult = value;
    }

}
