
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MessageTemplets complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MessageTemplets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationEmailModelList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfReservationModel" minOccurs="0"/&gt;
 *         &lt;element name="ReservationFaxModelList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfReservationModel" minOccurs="0"/&gt;
 *         &lt;element name="ReservationSMSModelList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfReservationModel" minOccurs="0"/&gt;
 *         &lt;element name="ProfileEmailModelList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfProfileModel" minOccurs="0"/&gt;
 *         &lt;element name="ProfileSMSModelList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfProfileModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageTemplets", propOrder = {
    "reservationEmailModelList",
    "reservationFaxModelList",
    "reservationSMSModelList",
    "profileEmailModelList",
    "profileSMSModelList"
})
public class MessageTemplets {

    @XmlElement(name = "ReservationEmailModelList")
    protected ArrayOfReservationModel reservationEmailModelList;
    @XmlElement(name = "ReservationFaxModelList")
    protected ArrayOfReservationModel reservationFaxModelList;
    @XmlElement(name = "ReservationSMSModelList")
    protected ArrayOfReservationModel reservationSMSModelList;
    @XmlElement(name = "ProfileEmailModelList")
    protected ArrayOfProfileModel profileEmailModelList;
    @XmlElement(name = "ProfileSMSModelList")
    protected ArrayOfProfileModel profileSMSModelList;

    /**
     * 获取reservationEmailModelList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationModel }
     *     
     */
    public ArrayOfReservationModel getReservationEmailModelList() {
        return reservationEmailModelList;
    }

    /**
     * 设置reservationEmailModelList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationModel }
     *     
     */
    public void setReservationEmailModelList(ArrayOfReservationModel value) {
        this.reservationEmailModelList = value;
    }

    /**
     * 获取reservationFaxModelList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationModel }
     *     
     */
    public ArrayOfReservationModel getReservationFaxModelList() {
        return reservationFaxModelList;
    }

    /**
     * 设置reservationFaxModelList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationModel }
     *     
     */
    public void setReservationFaxModelList(ArrayOfReservationModel value) {
        this.reservationFaxModelList = value;
    }

    /**
     * 获取reservationSMSModelList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationModel }
     *     
     */
    public ArrayOfReservationModel getReservationSMSModelList() {
        return reservationSMSModelList;
    }

    /**
     * 设置reservationSMSModelList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationModel }
     *     
     */
    public void setReservationSMSModelList(ArrayOfReservationModel value) {
        this.reservationSMSModelList = value;
    }

    /**
     * 获取profileEmailModelList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileModel }
     *     
     */
    public ArrayOfProfileModel getProfileEmailModelList() {
        return profileEmailModelList;
    }

    /**
     * 设置profileEmailModelList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileModel }
     *     
     */
    public void setProfileEmailModelList(ArrayOfProfileModel value) {
        this.profileEmailModelList = value;
    }

    /**
     * 获取profileSMSModelList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileModel }
     *     
     */
    public ArrayOfProfileModel getProfileSMSModelList() {
        return profileSMSModelList;
    }

    /**
     * 设置profileSMSModelList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileModel }
     *     
     */
    public void setProfileSMSModelList(ArrayOfProfileModel value) {
        this.profileSMSModelList = value;
    }

}
