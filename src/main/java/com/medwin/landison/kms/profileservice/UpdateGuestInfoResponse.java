
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
 *         &lt;element name="UpdateGuestInfoResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}UpdateGuestInfoOut" minOccurs="0"/&gt;
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
    "updateGuestInfoResult"
})
@XmlRootElement(name = "UpdateGuestInfoResponse")
public class UpdateGuestInfoResponse {

    @XmlElement(name = "UpdateGuestInfoResult")
    protected UpdateGuestInfoOut updateGuestInfoResult;

    /**
     * 获取updateGuestInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpdateGuestInfoOut }
     *     
     */
    public UpdateGuestInfoOut getUpdateGuestInfoResult() {
        return updateGuestInfoResult;
    }

    /**
     * 设置updateGuestInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateGuestInfoOut }
     *     
     */
    public void setUpdateGuestInfoResult(UpdateGuestInfoOut value) {
        this.updateGuestInfoResult = value;
    }

}
