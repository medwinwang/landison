
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
 *         &lt;element name="HotelAvailResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfHotelInfoSummary" minOccurs="0"/&gt;
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
    "hotelAvailResult"
})
@XmlRootElement(name = "HotelAvailResponse")
public class HotelAvailResponse {

    @XmlElement(name = "HotelAvailResult")
    protected ArrayOfHotelInfoSummary hotelAvailResult;

    /**
     * ��ȡhotelAvailResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoSummary }
     *     
     */
    public ArrayOfHotelInfoSummary getHotelAvailResult() {
        return hotelAvailResult;
    }

    /**
     * ����hotelAvailResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoSummary }
     *     
     */
    public void setHotelAvailResult(ArrayOfHotelInfoSummary value) {
        this.hotelAvailResult = value;
    }

}
