
package com.medwin.landison.kms.reservationservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>OrderInfoTraceTexts complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderInfoTraceTexts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PmsDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsDepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceTexts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResolveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ResolveUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfoTraceTexts", propOrder = {
    "id",
    "orderId",
    "itemCode",
    "traceDate",
    "pmsDepartmentCode",
    "pmsDepartmentName",
    "traceTexts",
    "resolveDate",
    "resolveUser"
})
public class OrderInfoTraceTexts {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "OrderId")
    protected int orderId;
    @XmlElement(name = "ItemCode")
    protected String itemCode;
    @XmlElement(name = "TraceDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date traceDate;
    @XmlElement(name = "PmsDepartmentCode")
    protected String pmsDepartmentCode;
    @XmlElement(name = "PmsDepartmentName")
    protected String pmsDepartmentName;
    @XmlElement(name = "TraceTexts")
    protected String traceTexts;
    @XmlElement(name = "ResolveDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date resolveDate;
    @XmlElement(name = "ResolveUser")
    protected String resolveUser;

    /**
     * 获取id属性的值。
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * 获取orderId属性的值。
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId属性的值。
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * 获取itemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置itemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * 获取traceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTraceDate() {
        return traceDate;
    }

    /**
     * 设置traceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceDate(Date value) {
        this.traceDate = value;
    }

    /**
     * 获取pmsDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsDepartmentCode() {
        return pmsDepartmentCode;
    }

    /**
     * 设置pmsDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsDepartmentCode(String value) {
        this.pmsDepartmentCode = value;
    }

    /**
     * 获取pmsDepartmentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsDepartmentName() {
        return pmsDepartmentName;
    }

    /**
     * 设置pmsDepartmentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsDepartmentName(String value) {
        this.pmsDepartmentName = value;
    }

    /**
     * 获取traceTexts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceTexts() {
        return traceTexts;
    }

    /**
     * 设置traceTexts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceTexts(String value) {
        this.traceTexts = value;
    }

    /**
     * 获取resolveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getResolveDate() {
        return resolveDate;
    }

    /**
     * 设置resolveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolveDate(Date value) {
        this.resolveDate = value;
    }

    /**
     * 获取resolveUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolveUser() {
        return resolveUser;
    }

    /**
     * 设置resolveUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolveUser(String value) {
        this.resolveUser = value;
    }

}
