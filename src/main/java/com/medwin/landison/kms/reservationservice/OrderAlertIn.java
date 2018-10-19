
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>OrderAlertIn complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OrderAlertIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PageInfo" minOccurs="0"/&gt;
 *         &lt;element name="BeginInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BeginArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsShowConfirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAlertIn", propOrder = {
    "pageInfo",
    "beginInsertDate",
    "endInsertDate",
    "beginArrivalDate",
    "endArrivalDate",
    "orderId",
    "phone",
    "hotelCode",
    "isShowConfirm"
})
public class OrderAlertIn {

    @XmlElement(name = "PageInfo")
    protected PageInfo pageInfo;
    @XmlElement(name = "BeginInsertDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String beginInsertDate;
    @XmlElement(name = "EndInsertDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String endInsertDate;
    @XmlElement(name = "BeginArrivalDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String beginArrivalDate;
    @XmlElement(name = "EndArrivalDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String endArrivalDate;
    @XmlElement(name = "OrderId", required = true, type = Integer.class, nillable = true)
    protected Integer orderId;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "IsShowConfirm")
    protected String isShowConfirm;

    /**
     * ��ȡpageInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PageInfo }
     *     
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * ����pageInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PageInfo }
     *     
     */
    public void setPageInfo(PageInfo value) {
        this.pageInfo = value;
    }

    /**
     * ��ȡbeginInsertDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginInsertDate() {
        return beginInsertDate;
    }

    /**
     * ����beginInsertDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginInsertDate(String value) {
        this.beginInsertDate = value;
    }

    /**
     * ��ȡendInsertDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndInsertDate() {
        return endInsertDate;
    }

    /**
     * ����endInsertDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndInsertDate(String value) {
        this.endInsertDate = value;
    }

    /**
     * ��ȡbeginArrivalDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginArrivalDate() {
        return beginArrivalDate;
    }

    /**
     * ����beginArrivalDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginArrivalDate(String value) {
        this.beginArrivalDate = value;
    }

    /**
     * ��ȡendArrivalDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndArrivalDate() {
        return endArrivalDate;
    }

    /**
     * ����endArrivalDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndArrivalDate(String value) {
        this.endArrivalDate = value;
    }

    /**
     * ��ȡorderId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * ����orderId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderId(Integer value) {
        this.orderId = value;
    }

    /**
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * ��ȡhotelCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * ����hotelCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * ��ȡisShowConfirm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowConfirm() {
        return isShowConfirm;
    }

    /**
     * ����isShowConfirm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowConfirm(String value) {
        this.isShowConfirm = value;
    }

}
