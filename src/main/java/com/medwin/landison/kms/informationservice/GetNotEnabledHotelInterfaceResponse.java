
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
 *         &lt;element name="GetNotEnabledHotelInterfaceResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCommonInfo" minOccurs="0"/&gt;
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
    "getNotEnabledHotelInterfaceResult"
})
@XmlRootElement(name = "GetNotEnabledHotelInterfaceResponse")
public class GetNotEnabledHotelInterfaceResponse {

    @XmlElement(name = "GetNotEnabledHotelInterfaceResult")
    protected ArrayOfCommonInfo getNotEnabledHotelInterfaceResult;

    /**
     * ��ȡgetNotEnabledHotelInterfaceResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public ArrayOfCommonInfo getGetNotEnabledHotelInterfaceResult() {
        return getNotEnabledHotelInterfaceResult;
    }

    /**
     * ����getNotEnabledHotelInterfaceResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public void setGetNotEnabledHotelInterfaceResult(ArrayOfCommonInfo value) {
        this.getNotEnabledHotelInterfaceResult = value;
    }

}
