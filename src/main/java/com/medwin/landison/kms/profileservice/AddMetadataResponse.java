
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
 *         &lt;element name="AddMetadataResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PotentialMemberMetadata" minOccurs="0"/&gt;
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
    "addMetadataResult"
})
@XmlRootElement(name = "AddMetadataResponse")
public class AddMetadataResponse {

    @XmlElement(name = "AddMetadataResult")
    protected PotentialMemberMetadata addMetadataResult;

    /**
     * 获取addMetadataResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PotentialMemberMetadata }
     *     
     */
    public PotentialMemberMetadata getAddMetadataResult() {
        return addMetadataResult;
    }

    /**
     * 设置addMetadataResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PotentialMemberMetadata }
     *     
     */
    public void setAddMetadataResult(PotentialMemberMetadata value) {
        this.addMetadataResult = value;
    }

}
