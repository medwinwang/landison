
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
 *         &lt;element name="GetCityListResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCity" minOccurs="0"/&gt;
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
    "getCityListResult"
})
@XmlRootElement(name = "GetCityListResponse")
public class GetCityListResponse {

    @XmlElement(name = "GetCityListResult")
    protected ArrayOfCity getCityListResult;

    /**
     * ��ȡgetCityListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCity }
     *     
     */
    public ArrayOfCity getGetCityListResult() {
        return getCityListResult;
    }

    /**
     * ����getCityListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCity }
     *     
     */
    public void setGetCityListResult(ArrayOfCity value) {
        this.getCityListResult = value;
    }

}
