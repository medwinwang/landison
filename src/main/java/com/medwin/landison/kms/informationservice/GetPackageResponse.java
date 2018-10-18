
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
 *         &lt;element name="GetPackageResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Package" minOccurs="0"/&gt;
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
    "getPackageResult"
})
@XmlRootElement(name = "GetPackageResponse")
public class GetPackageResponse {

    @XmlElement(name = "GetPackageResult")
    protected Package getPackageResult;

    /**
     * 获取getPackageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Package }
     *     
     */
    public Package getGetPackageResult() {
        return getPackageResult;
    }

    /**
     * 设置getPackageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setGetPackageResult(Package value) {
        this.getPackageResult = value;
    }

}
