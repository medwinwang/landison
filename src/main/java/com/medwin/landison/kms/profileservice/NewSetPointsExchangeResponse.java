
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
 *         &lt;element name="NewSetPointsExchangeResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfGiftCertificatesExchange" minOccurs="0"/&gt;
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
    "newSetPointsExchangeResult"
})
@XmlRootElement(name = "NewSetPointsExchangeResponse")
public class NewSetPointsExchangeResponse {

    @XmlElement(name = "NewSetPointsExchangeResult")
    protected ArrayOfGiftCertificatesExchange newSetPointsExchangeResult;

    /**
     * 获取newSetPointsExchangeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGiftCertificatesExchange }
     *     
     */
    public ArrayOfGiftCertificatesExchange getNewSetPointsExchangeResult() {
        return newSetPointsExchangeResult;
    }

    /**
     * 设置newSetPointsExchangeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGiftCertificatesExchange }
     *     
     */
    public void setNewSetPointsExchangeResult(ArrayOfGiftCertificatesExchange value) {
        this.newSetPointsExchangeResult = value;
    }

}
