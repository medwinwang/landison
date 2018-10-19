
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MoreOccupant complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MoreOccupant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccupantFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OccupantLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OccupantChineseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoreOccupant", propOrder = {
    "occupantFirstName",
    "occupantLastName",
    "occupantChineseName"
})
public class MoreOccupant
    extends BaseInfo
{

    @XmlElement(name = "OccupantFirstName")
    protected String occupantFirstName;
    @XmlElement(name = "OccupantLastName")
    protected String occupantLastName;
    @XmlElement(name = "OccupantChineseName")
    protected String occupantChineseName;

    /**
     * 获取occupantFirstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupantFirstName() {
        return occupantFirstName;
    }

    /**
     * 设置occupantFirstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupantFirstName(String value) {
        this.occupantFirstName = value;
    }

    /**
     * 获取occupantLastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupantLastName() {
        return occupantLastName;
    }

    /**
     * 设置occupantLastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupantLastName(String value) {
        this.occupantLastName = value;
    }

    /**
     * 获取occupantChineseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupantChineseName() {
        return occupantChineseName;
    }

    /**
     * 设置occupantChineseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupantChineseName(String value) {
        this.occupantChineseName = value;
    }

}
