
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
 *         &lt;element name="ModifyMemberStateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "modifyMemberStateResult"
})
@XmlRootElement(name = "ModifyMemberStateResponse")
public class ModifyMemberStateResponse {

    @XmlElement(name = "ModifyMemberStateResult")
    protected boolean modifyMemberStateResult;

    /**
     * 获取modifyMemberStateResult属性的值。
     * 
     */
    public boolean isModifyMemberStateResult() {
        return modifyMemberStateResult;
    }

    /**
     * 设置modifyMemberStateResult属性的值。
     * 
     */
    public void setModifyMemberStateResult(boolean value) {
        this.modifyMemberStateResult = value;
    }

}
