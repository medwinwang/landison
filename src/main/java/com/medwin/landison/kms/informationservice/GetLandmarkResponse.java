
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
 *         &lt;element name="GetLandmarkResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfTagsInfo" minOccurs="0"/&gt;
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
    "getLandmarkResult"
})
@XmlRootElement(name = "GetLandmarkResponse")
public class GetLandmarkResponse {

    @XmlElement(name = "GetLandmarkResult")
    protected ArrayOfTagsInfo getLandmarkResult;

    /**
     * ��ȡgetLandmarkResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTagsInfo }
     *     
     */
    public ArrayOfTagsInfo getGetLandmarkResult() {
        return getLandmarkResult;
    }

    /**
     * ����getLandmarkResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTagsInfo }
     *     
     */
    public void setGetLandmarkResult(ArrayOfTagsInfo value) {
        this.getLandmarkResult = value;
    }

}
