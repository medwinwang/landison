
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAvailabilityPackageOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAvailabilityPackageOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailabilityPackages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfAvailabilityPackage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAvailabilityPackageOut", propOrder = {
    "availabilityPackages"
})
public class GetAvailabilityPackageOut {

    @XmlElement(name = "AvailabilityPackages")
    protected ArrayOfAvailabilityPackage availabilityPackages;

    /**
     * 获取availabilityPackages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailabilityPackage }
     *     
     */
    public ArrayOfAvailabilityPackage getAvailabilityPackages() {
        return availabilityPackages;
    }

    /**
     * 设置availabilityPackages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailabilityPackage }
     *     
     */
    public void setAvailabilityPackages(ArrayOfAvailabilityPackage value) {
        this.availabilityPackages = value;
    }

}
