
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderDispatchInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderDispatchInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerOderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Refound" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DespatchDetailInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfDespatchDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDispatchInfo", propOrder = {
    "id",
    "customerOderId",
    "status",
    "description",
    "refound",
    "despatchDetailInfos"
})
public class OrderDispatchInfo {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "CustomerOderId")
    protected String customerOderId;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Refound")
    protected boolean refound;
    @XmlElement(name = "DespatchDetailInfos")
    protected ArrayOfDespatchDetail despatchDetailInfos;

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
     * 获取customerOderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOderId() {
        return customerOderId;
    }

    /**
     * 设置customerOderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOderId(String value) {
        this.customerOderId = value;
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
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取refound属性的值。
     * 
     */
    public boolean isRefound() {
        return refound;
    }

    /**
     * 设置refound属性的值。
     * 
     */
    public void setRefound(boolean value) {
        this.refound = value;
    }

    /**
     * 获取despatchDetailInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDespatchDetail }
     *     
     */
    public ArrayOfDespatchDetail getDespatchDetailInfos() {
        return despatchDetailInfos;
    }

    /**
     * 设置despatchDetailInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDespatchDetail }
     *     
     */
    public void setDespatchDetailInfos(ArrayOfDespatchDetail value) {
        this.despatchDetailInfos = value;
    }

}
