
package com.medwin.landison.kms.reservationservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>OrderLog complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderLog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsertUser" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="InserDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExternalUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLog", propOrder = {
    "content",
    "insertUser",
    "inserDate",
    "externalUser"
})
public class OrderLog {

    @XmlElement(name = "Content")
    protected String content;
    @XmlElement(name = "InsertUser")
    protected CommonInfo insertUser;
    @XmlElement(name = "InserDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date inserDate;
    @XmlElement(name = "ExternalUser")
    protected String externalUser;

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * 获取insertUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getInsertUser() {
        return insertUser;
    }

    /**
     * 设置insertUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setInsertUser(CommonInfo value) {
        this.insertUser = value;
    }

    /**
     * 获取inserDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getInserDate() {
        return inserDate;
    }

    /**
     * 设置inserDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInserDate(Date value) {
        this.inserDate = value;
    }

    /**
     * 获取externalUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUser() {
        return externalUser;
    }

    /**
     * 设置externalUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUser(String value) {
        this.externalUser = value;
    }

}
