
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetHotelsListResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfGetHotelsOut" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getHotelsListResult"
})
@XmlRootElement(name = "GetHotelsListResponse")
public class GetHotelsListResponse {

    @XmlElement(name = "GetHotelsListResult")
    protected ArrayOfGetHotelsOut getHotelsListResult;

    /**
     * 获取getHotelsListResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetHotelsOut }
     *     
     */
    public ArrayOfGetHotelsOut getGetHotelsListResult() {
        return getHotelsListResult;
    }

    /**
     * 设置getHotelsListResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetHotelsOut }
     *     
     */
    public void setGetHotelsListResult(ArrayOfGetHotelsOut value) {
        this.getHotelsListResult = value;
    }

}
