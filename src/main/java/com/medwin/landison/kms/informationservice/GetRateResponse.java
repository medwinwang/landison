
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
 *         &lt;element name="GetRateResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Rate" minOccurs="0"/&gt;
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
    "getRateResult"
})
@XmlRootElement(name = "GetRateResponse")
public class GetRateResponse {

    @XmlElement(name = "GetRateResult")
    protected Rate getRateResult;

    /**
     * 获取getRateResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getGetRateResult() {
        return getRateResult;
    }

    /**
     * 设置getRateResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setGetRateResult(Rate value) {
        this.getRateResult = value;
    }

}
