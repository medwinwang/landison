
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetFaqOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetFaqOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FaqList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfFaq" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFaqOut", propOrder = {
    "faqList"
})
public class GetFaqOut {

    @XmlElement(name = "FaqList")
    protected ArrayOfFaq faqList;

    /**
     * 获取faqList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFaq }
     *     
     */
    public ArrayOfFaq getFaqList() {
        return faqList;
    }

    /**
     * 设置faqList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFaq }
     *     
     */
    public void setFaqList(ArrayOfFaq value) {
        this.faqList = value;
    }

}
