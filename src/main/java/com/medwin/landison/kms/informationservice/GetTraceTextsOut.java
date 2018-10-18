
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetTraceTextsOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetTraceTextsOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TraceTextsList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfTraceTexts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTraceTextsOut", propOrder = {
    "traceTextsList"
})
public class GetTraceTextsOut {

    @XmlElement(name = "TraceTextsList")
    protected ArrayOfTraceTexts traceTextsList;

    /**
     * 获取traceTextsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTraceTexts }
     *     
     */
    public ArrayOfTraceTexts getTraceTextsList() {
        return traceTextsList;
    }

    /**
     * 设置traceTextsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTraceTexts }
     *     
     */
    public void setTraceTextsList(ArrayOfTraceTexts value) {
        this.traceTextsList = value;
    }

}
