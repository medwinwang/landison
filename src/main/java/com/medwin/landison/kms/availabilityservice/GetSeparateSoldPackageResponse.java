
package com.medwin.landison.kms.availabilityservice;

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
 *         &lt;element name="GetSeparateSoldPackageResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SeparateSoldPackageOut" minOccurs="0"/&gt;
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
    "getSeparateSoldPackageResult"
})
@XmlRootElement(name = "GetSeparateSoldPackageResponse")
public class GetSeparateSoldPackageResponse {

    @XmlElement(name = "GetSeparateSoldPackageResult")
    protected SeparateSoldPackageOut getSeparateSoldPackageResult;

    /**
     * ��ȡgetSeparateSoldPackageResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeparateSoldPackageOut }
     *     
     */
    public SeparateSoldPackageOut getGetSeparateSoldPackageResult() {
        return getSeparateSoldPackageResult;
    }

    /**
     * ����getSeparateSoldPackageResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeparateSoldPackageOut }
     *     
     */
    public void setGetSeparateSoldPackageResult(SeparateSoldPackageOut value) {
        this.getSeparateSoldPackageResult = value;
    }

}
