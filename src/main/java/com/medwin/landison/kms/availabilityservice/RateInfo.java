
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RateInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Default_Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Rate" minOccurs="0"/&gt;
 *         &lt;element name="RoomRateDetails" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRoomRateDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInfo", propOrder = {
    "defaultRate",
    "rate",
    "roomRateDetails"
})
public class RateInfo {

    @XmlElement(name = "Default_Rate")
    protected String defaultRate;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "RoomRateDetails")
    protected ArrayOfRoomRateDetail roomRateDetails;

    /**
     * ��ȡdefaultRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRate() {
        return defaultRate;
    }

    /**
     * ����defaultRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRate(String value) {
        this.defaultRate = value;
    }

    /**
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * ��ȡroomRateDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomRateDetail }
     *     
     */
    public ArrayOfRoomRateDetail getRoomRateDetails() {
        return roomRateDetails;
    }

    /**
     * ����roomRateDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomRateDetail }
     *     
     */
    public void setRoomRateDetails(ArrayOfRoomRateDetail value) {
        this.roomRateDetails = value;
    }

}
