
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSendInfoByKeyOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSendInfoByKeyOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SendInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSendInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSendInfoByKeyOut", propOrder = {
    "sendInfos"
})
public class GetSendInfoByKeyOut {

    @XmlElement(name = "SendInfos")
    protected ArrayOfSendInfo sendInfos;

    /**
     * 获取sendInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSendInfo }
     *     
     */
    public ArrayOfSendInfo getSendInfos() {
        return sendInfos;
    }

    /**
     * 设置sendInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSendInfo }
     *     
     */
    public void setSendInfos(ArrayOfSendInfo value) {
        this.sendInfos = value;
    }

}
