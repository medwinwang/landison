
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAlertInfoOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAlertInfoOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlertInfoList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfAlertInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAlertInfoOut", propOrder = {
    "alertInfoList"
})
public class GetAlertInfoOut {

    @XmlElement(name = "AlertInfoList")
    protected ArrayOfAlertInfo alertInfoList;

    /**
     * 获取alertInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlertInfo }
     *     
     */
    public ArrayOfAlertInfo getAlertInfoList() {
        return alertInfoList;
    }

    /**
     * 设置alertInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertInfo }
     *     
     */
    public void setAlertInfoList(ArrayOfAlertInfo value) {
        this.alertInfoList = value;
    }

}
