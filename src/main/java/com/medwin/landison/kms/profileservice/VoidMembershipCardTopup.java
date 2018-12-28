
package com.medwin.landison.kms.profileservice;

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
 *         &lt;element name="svcCardtTopUpInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SvcCardTopUpInfo" minOccurs="0"/&gt;
 *         &lt;element name="placeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "svcCardtTopUpInfo",
    "placeCode"
})
@XmlRootElement(name = "VoidMembershipCardTopup")
public class VoidMembershipCardTopup {

    protected SvcCardTopUpInfo svcCardtTopUpInfo;
    protected String placeCode;

    /**
     * 获取svcCardtTopUpInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SvcCardTopUpInfo }
     *     
     */
    public SvcCardTopUpInfo getSvcCardtTopUpInfo() {
        return svcCardtTopUpInfo;
    }

    /**
     * 设置svcCardtTopUpInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SvcCardTopUpInfo }
     *     
     */
    public void setSvcCardtTopUpInfo(SvcCardTopUpInfo value) {
        this.svcCardtTopUpInfo = value;
    }

    /**
     * 获取placeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCode() {
        return placeCode;
    }

    /**
     * 设置placeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCode(String value) {
        this.placeCode = value;
    }

}
