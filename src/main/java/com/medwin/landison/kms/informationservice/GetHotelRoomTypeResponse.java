
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
 *         &lt;element name="GetHotelRoomTypeResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRoomTypeDetail" minOccurs="0"/&gt;
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
    "getHotelRoomTypeResult"
})
@XmlRootElement(name = "GetHotelRoomTypeResponse")
public class GetHotelRoomTypeResponse {

    @XmlElement(name = "GetHotelRoomTypeResult")
    protected ArrayOfRoomTypeDetail getHotelRoomTypeResult;

    /**
     * ��ȡgetHotelRoomTypeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomTypeDetail }
     *     
     */
    public ArrayOfRoomTypeDetail getGetHotelRoomTypeResult() {
        return getHotelRoomTypeResult;
    }

    /**
     * ����getHotelRoomTypeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomTypeDetail }
     *     
     */
    public void setGetHotelRoomTypeResult(ArrayOfRoomTypeDetail value) {
        this.getHotelRoomTypeResult = value;
    }

}
