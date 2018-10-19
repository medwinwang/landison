
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>OrderInfoTraceTexts complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    @XmlElement(name = "TraceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String traceDate;
    @XmlElement(name = "PmsDepartmentCode")
    protected String pmsDepartmentCode;
    @XmlElement(name = "PmsDepartmentName")
    protected String pmsDepartmentName;
    @XmlElement(name = "TraceTexts")
    protected String traceTexts;
    @XmlElement(name = "ResolveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String resolveDate;
    @XmlElement(name = "ResolveUser")
    protected String resolveUser;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * ��ȡorderId���Ե�ֵ��
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * ����orderId���Ե�ֵ��
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * ��ȡitemCode���Ե�ֵ��
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
     * ����itemCode���Ե�ֵ��
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
     * ��ȡtraceDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceDate() {
        return traceDate;
    }

    /**
     * ����traceDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceDate(String value) {
        this.traceDate = value;
    }

    /**
     * ��ȡpmsDepartmentCode���Ե�ֵ��
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
     * ����pmsDepartmentCode���Ե�ֵ��
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
     * ��ȡpmsDepartmentName���Ե�ֵ��
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
     * ����pmsDepartmentName���Ե�ֵ��
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
     * ��ȡtraceTexts���Ե�ֵ��
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
     * ����traceTexts���Ե�ֵ��
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
     * ��ȡresolveDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolveDate() {
        return resolveDate;
    }

    /**
     * ����resolveDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolveDate(String value) {
        this.resolveDate = value;
    }

    /**
     * ��ȡresolveUser���Ե�ֵ��
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
     * ����resolveUser���Ե�ֵ��
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
