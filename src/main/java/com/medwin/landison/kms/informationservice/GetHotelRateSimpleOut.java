
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetHotelRateSimpleOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetHotelRateSimpleOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHotelRateSimpleOut", propOrder = {
    "rateList"
})
public class GetHotelRateSimpleOut {

    @XmlElement(name = "RateList")
    protected ArrayOfRate rateList;

    /**
     * ��ȡrateList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRate }
     *     
     */
    public ArrayOfRate getRateList() {
        return rateList;
    }

    /**
     * ����rateList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRate }
     *     
     */
    public void setRateList(ArrayOfRate value) {
        this.rateList = value;
    }

}
