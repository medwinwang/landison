
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetItemInfoOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetItemInfoOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfItemInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemInfoOut", propOrder = {
    "itemInfos"
})
public class GetItemInfoOut {

    @XmlElement(name = "ItemInfos")
    protected ArrayOfItemInfo itemInfos;

    /**
     * 获取itemInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemInfo }
     *     
     */
    public ArrayOfItemInfo getItemInfos() {
        return itemInfos;
    }

    /**
     * 设置itemInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemInfo }
     *     
     */
    public void setItemInfos(ArrayOfItemInfo value) {
        this.itemInfos = value;
    }

}
