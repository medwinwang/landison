
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="list" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfMemberInfoFFP" minOccurs="0"/&gt;
 *         &lt;element name="card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}MemberFFPOperationType"/&gt;
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
    "list",
    "cardNo",
    "operationType"
})
@XmlRootElement(name = "MemberInfoFFPOpration")
public class MemberInfoFFPOpration {

    protected ArrayOfMemberInfoFFP list;
    @XmlElement(name = "card_no")
    protected String cardNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MemberFFPOperationType operationType;

    /**
     * 获取list属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMemberInfoFFP }
     *     
     */
    public ArrayOfMemberInfoFFP getList() {
        return list;
    }

    /**
     * 设置list属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMemberInfoFFP }
     *     
     */
    public void setList(ArrayOfMemberInfoFFP value) {
        this.list = value;
    }

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取operationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemberFFPOperationType }
     *     
     */
    public MemberFFPOperationType getOperationType() {
        return operationType;
    }

    /**
     * 设置operationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemberFFPOperationType }
     *     
     */
    public void setOperationType(MemberFFPOperationType value) {
        this.operationType = value;
    }

}
