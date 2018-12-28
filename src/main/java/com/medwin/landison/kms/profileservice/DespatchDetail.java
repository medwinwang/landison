
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>DespatchDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DespatchDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispatchCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispatchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespatchDetail", propOrder = {
    "id",
    "dispatchId",
    "dispatchCompany",
    "dispatchDate",
    "status",
    "orderStatusDesc",
    "signText",
    "signDate"
})
public class DespatchDetail {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DispatchId")
    protected String dispatchId;
    @XmlElement(name = "DispatchCompany")
    protected String dispatchCompany;
    @XmlElement(name = "DispatchDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dispatchDate;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "OrderStatusDesc")
    protected String orderStatusDesc;
    @XmlElement(name = "SignText")
    protected String signText;
    @XmlElement(name = "SignDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取dispatchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchId() {
        return dispatchId;
    }

    /**
     * 设置dispatchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchId(String value) {
        this.dispatchId = value;
    }

    /**
     * 获取dispatchCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchCompany() {
        return dispatchCompany;
    }

    /**
     * 设置dispatchCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchCompany(String value) {
        this.dispatchCompany = value;
    }

    /**
     * 获取dispatchDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchDate() {
        return dispatchDate;
    }

    /**
     * 设置dispatchDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchDate(XMLGregorianCalendar value) {
        this.dispatchDate = value;
    }

    /**
     * 获取status属性的值。
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * 获取orderStatusDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusDesc() {
        return orderStatusDesc;
    }

    /**
     * 设置orderStatusDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusDesc(String value) {
        this.orderStatusDesc = value;
    }

    /**
     * 获取signText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignText() {
        return signText;
    }

    /**
     * 设置signText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignText(String value) {
        this.signText = value;
    }

    /**
     * 获取signDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * 设置signDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

}
