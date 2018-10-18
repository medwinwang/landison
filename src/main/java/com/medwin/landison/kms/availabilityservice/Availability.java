
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Availability complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Availability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}HotelInfoSummary" minOccurs="0"/&gt;
 *         &lt;element name="RateInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRateInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Availability", propOrder = {
    "hotelInfo",
    "rateInfos"
})
public class Availability {

    @XmlElement(name = "HotelInfo")
    protected HotelInfoSummary hotelInfo;
    @XmlElement(name = "RateInfos")
    protected ArrayOfRateInfo rateInfos;

    /**
     * ��ȡhotelInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoSummary }
     *     
     */
    public HotelInfoSummary getHotelInfo() {
        return hotelInfo;
    }

    /**
     * ����hotelInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoSummary }
     *     
     */
    public void setHotelInfo(HotelInfoSummary value) {
        this.hotelInfo = value;
    }

    /**
     * ��ȡrateInfos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateInfo }
     *     
     */
    public ArrayOfRateInfo getRateInfos() {
        return rateInfos;
    }

    /**
     * ����rateInfos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateInfo }
     *     
     */
    public void setRateInfos(ArrayOfRateInfo value) {
        this.rateInfos = value;
    }

}
