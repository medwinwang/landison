
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetTraceTextsResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetTraceTextsOut" minOccurs="0"/&gt;
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
    "getTraceTextsResult"
})
@XmlRootElement(name = "GetTraceTextsResponse")
public class GetTraceTextsResponse {

    @XmlElement(name = "GetTraceTextsResult")
    protected GetTraceTextsOut getTraceTextsResult;

    /**
     * ��ȡgetTraceTextsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetTraceTextsOut }
     *     
     */
    public GetTraceTextsOut getGetTraceTextsResult() {
        return getTraceTextsResult;
    }

    /**
     * ����getTraceTextsResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetTraceTextsOut }
     *     
     */
    public void setGetTraceTextsResult(GetTraceTextsOut value) {
        this.getTraceTextsResult = value;
    }

}
