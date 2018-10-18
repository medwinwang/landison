
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Specials complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Specials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hotel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Hotel" minOccurs="0"/&gt;
 *         &lt;element name="SpecialsType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SpecialsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specials", propOrder = {
    "hotel",
    "specialsType"
})
public class Specials
    extends CommonInfo
{

    @XmlElement(name = "Hotel")
    protected Hotel hotel;
    @XmlElement(name = "SpecialsType")
    protected SpecialsType specialsType;

    /**
     * 获取hotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * 设置hotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * 获取specialsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialsType }
     *     
     */
    public SpecialsType getSpecialsType() {
        return specialsType;
    }

    /**
     * 设置specialsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialsType }
     *     
     */
    public void setSpecialsType(SpecialsType value) {
        this.specialsType = value;
    }

}
