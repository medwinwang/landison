
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
 *         &lt;element name="GetInformationResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCommonInfo" minOccurs="0"/&gt;
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
    "getInformationResult"
})
@XmlRootElement(name = "GetInformationResponse")
public class GetInformationResponse {

    @XmlElement(name = "GetInformationResult")
    protected ArrayOfCommonInfo getInformationResult;

    /**
     * ��ȡgetInformationResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public ArrayOfCommonInfo getGetInformationResult() {
        return getInformationResult;
    }

    /**
     * ����getInformationResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public void setGetInformationResult(ArrayOfCommonInfo value) {
        this.getInformationResult = value;
    }

}
