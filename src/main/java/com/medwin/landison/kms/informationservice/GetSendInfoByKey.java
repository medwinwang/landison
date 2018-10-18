
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getSendInfoByKeyIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetSendInfoByKeyIn" minOccurs="0"/&gt;
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
    "getSendInfoByKeyIn"
})
@XmlRootElement(name = "GetSendInfoByKey")
public class GetSendInfoByKey {

    protected GetSendInfoByKeyIn getSendInfoByKeyIn;

    /**
     * 获取getSendInfoByKeyIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSendInfoByKeyIn }
     *     
     */
    public GetSendInfoByKeyIn getGetSendInfoByKeyIn() {
        return getSendInfoByKeyIn;
    }

    /**
     * 设置getSendInfoByKeyIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSendInfoByKeyIn }
     *     
     */
    public void setGetSendInfoByKeyIn(GetSendInfoByKeyIn value) {
        this.getSendInfoByKeyIn = value;
    }

}
