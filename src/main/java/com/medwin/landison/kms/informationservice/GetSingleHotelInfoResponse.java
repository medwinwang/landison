
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
 *         &lt;element name="GetSingleHotelInfoResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}HotelInfo" minOccurs="0"/&gt;
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
    "getSingleHotelInfoResult"
})
@XmlRootElement(name = "GetSingleHotelInfoResponse")
public class GetSingleHotelInfoResponse {

    @XmlElement(name = "GetSingleHotelInfoResult")
    protected HotelInfo getSingleHotelInfoResult;

    /**
     * ��ȡgetSingleHotelInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HotelInfo }
     *     
     */
    public HotelInfo getGetSingleHotelInfoResult() {
        return getSingleHotelInfoResult;
    }

    /**
     * ����getSingleHotelInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfo }
     *     
     */
    public void setGetSingleHotelInfoResult(HotelInfo value) {
        this.getSingleHotelInfoResult = value;
    }

}
