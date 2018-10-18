
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetItemClassOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetItemClassOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemClassInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfItemClassInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemClassOut", propOrder = {
    "itemClassInfo"
})
public class GetItemClassOut {

    @XmlElement(name = "ItemClassInfo")
    protected ArrayOfItemClassInfo itemClassInfo;

    /**
     * 获取itemClassInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemClassInfo }
     *     
     */
    public ArrayOfItemClassInfo getItemClassInfo() {
        return itemClassInfo;
    }

    /**
     * 设置itemClassInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemClassInfo }
     *     
     */
    public void setItemClassInfo(ArrayOfItemClassInfo value) {
        this.itemClassInfo = value;
    }

}
