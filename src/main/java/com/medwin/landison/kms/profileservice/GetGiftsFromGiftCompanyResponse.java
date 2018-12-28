
package com.medwin.landison.kms.profileservice;

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
 *         &lt;element name="GetGiftsFromGiftCompanyResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfGiftInfoInterface" minOccurs="0"/&gt;
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
    "getGiftsFromGiftCompanyResult"
})
@XmlRootElement(name = "GetGiftsFromGiftCompanyResponse")
public class GetGiftsFromGiftCompanyResponse {

    @XmlElement(name = "GetGiftsFromGiftCompanyResult")
    protected ArrayOfGiftInfoInterface getGiftsFromGiftCompanyResult;

    /**
     * 获取getGiftsFromGiftCompanyResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGiftInfoInterface }
     *     
     */
    public ArrayOfGiftInfoInterface getGetGiftsFromGiftCompanyResult() {
        return getGiftsFromGiftCompanyResult;
    }

    /**
     * 设置getGiftsFromGiftCompanyResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGiftInfoInterface }
     *     
     */
    public void setGetGiftsFromGiftCompanyResult(ArrayOfGiftInfoInterface value) {
        this.getGiftsFromGiftCompanyResult = value;
    }

}
