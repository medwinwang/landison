
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PotentialMemberMetadata complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PotentialMemberMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Values" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPotentialMemberMetadataValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PotentialMemberMetadata", propOrder = {
    "identity",
    "identityType",
    "values"
})
public class PotentialMemberMetadata {

    @XmlElement(name = "Identity")
    protected String identity;
    @XmlElement(name = "IdentityType")
    protected String identityType;
    @XmlElement(name = "Values")
    protected ArrayOfPotentialMemberMetadataValues values;

    /**
     * 获取identity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置identity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
    }

    /**
     * 获取identityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * 设置identityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityType(String value) {
        this.identityType = value;
    }

    /**
     * 获取values属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPotentialMemberMetadataValues }
     *     
     */
    public ArrayOfPotentialMemberMetadataValues getValues() {
        return values;
    }

    /**
     * 设置values属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPotentialMemberMetadataValues }
     *     
     */
    public void setValues(ArrayOfPotentialMemberMetadataValues value) {
        this.values = value;
    }

}
