
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getHotelCityIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetHotelCityIn" minOccurs="0"/&gt;
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
    "getHotelCityIn"
})
@XmlRootElement(name = "GetHotelCity")
public class GetHotelCity {

    protected GetHotelCityIn getHotelCityIn;

    /**
     * ��ȡgetHotelCityIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetHotelCityIn }
     *     
     */
    public GetHotelCityIn getGetHotelCityIn() {
        return getHotelCityIn;
    }

    /**
     * ����getHotelCityIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelCityIn }
     *     
     */
    public void setGetHotelCityIn(GetHotelCityIn value) {
        this.getHotelCityIn = value;
    }

}
