
package com.medwin.landison.kms.reservationservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>BaseInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInfo", propOrder = {
    "insertUser",
    "insertDate",
    "updateUser",
    "updateDate"
})
@XmlSeeAlso({
    OrderInfo.class,
    OrderInfoPaymentGateway.class,
    MemberInfoFFP.class,
    FfpAttribute.class,
    OrderInfoComments.class,
    MoreOccupant.class,
    SplitOrderId.class,
    OrderInfoDiscount.class,
    OrderRoomStayInfo.class
})
public abstract class BaseInfo {

    @XmlElement(name = "InsertUser")
    protected String insertUser;
    @XmlElement(name = "InsertDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date insertDate;
    @XmlElement(name = "UpdateUser")
    protected String updateUser;
    @XmlElement(name = "UpdateDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date updateDate;

    /**
     * 获取insertUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertUser() {
        return insertUser;
    }

    /**
     * 设置insertUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertUser(String value) {
        this.insertUser = value;
    }

    /**
     * 获取insertDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * 设置insertDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertDate(Date value) {
        this.insertDate = value;
    }

    /**
     * 获取updateUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置updateUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

    /**
     * 获取updateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置updateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(Date value) {
        this.updateDate = value;
    }

}
