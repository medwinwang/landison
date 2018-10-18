
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PublishRateAndRoomtype complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PublishRateAndRoomtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Roomtypes" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRoomtype" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishRateAndRoomtype", propOrder = {
    "rateCode",
    "rateName",
    "roomtypes"
})
public class PublishRateAndRoomtype {

    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "RateName")
    protected String rateName;
    @XmlElement(name = "Roomtypes")
    protected ArrayOfRoomtype roomtypes;

    /**
     * ��ȡrateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * ����rateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * ��ȡrateName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateName() {
        return rateName;
    }

    /**
     * ����rateName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateName(String value) {
        this.rateName = value;
    }

    /**
     * ��ȡroomtypes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomtype }
     *     
     */
    public ArrayOfRoomtype getRoomtypes() {
        return roomtypes;
    }

    /**
     * ����roomtypes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomtype }
     *     
     */
    public void setRoomtypes(ArrayOfRoomtype value) {
        this.roomtypes = value;
    }

}
