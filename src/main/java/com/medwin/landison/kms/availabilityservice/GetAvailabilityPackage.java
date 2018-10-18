
package com.medwin.landison.kms.availabilityservice;

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
 *         &lt;element name="getAvailabilityPackageIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetAvailabilityPackageIn" minOccurs="0"/&gt;
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
    "getAvailabilityPackageIn"
})
@XmlRootElement(name = "GetAvailabilityPackage")
public class GetAvailabilityPackage {

    protected GetAvailabilityPackageIn getAvailabilityPackageIn;

    /**
     * 获取getAvailabilityPackageIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetAvailabilityPackageIn }
     *     
     */
    public GetAvailabilityPackageIn getGetAvailabilityPackageIn() {
        return getAvailabilityPackageIn;
    }

    /**
     * 设置getAvailabilityPackageIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetAvailabilityPackageIn }
     *     
     */
    public void setGetAvailabilityPackageIn(GetAvailabilityPackageIn value) {
        this.getAvailabilityPackageIn = value;
    }

}
