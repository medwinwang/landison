
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MessageTemplets complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡreservationEmailModelList���Ե�ֵ��
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
     * ����reservationEmailModelList���Ե�ֵ��
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
     * ��ȡreservationFaxModelList���Ե�ֵ��
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
     * ����reservationFaxModelList���Ե�ֵ��
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
     * ��ȡreservationSMSModelList���Ե�ֵ��
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
     * ����reservationSMSModelList���Ե�ֵ��
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
     * ��ȡprofileEmailModelList���Ե�ֵ��
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
     * ����profileEmailModelList���Ե�ֵ��
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
     * ��ȡprofileSMSModelList���Ե�ֵ��
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
     * ����profileSMSModelList���Ե�ֵ��
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
