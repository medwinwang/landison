
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Specials complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Specials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hotel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Hotel" minOccurs="0"/&gt;
 *         &lt;element name="SpecialsType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SpecialsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specials", propOrder = {
    "hotel",
    "specialsType"
})
public class Specials
    extends CommonInfo
{

    @XmlElement(name = "Hotel")
    protected Hotel hotel;
    @XmlElement(name = "SpecialsType")
    protected SpecialsType specialsType;

    /**
     * ��ȡhotel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * ����hotel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * ��ȡspecialsType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SpecialsType }
     *     
     */
    public SpecialsType getSpecialsType() {
        return specialsType;
    }

    /**
     * ����specialsType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialsType }
     *     
     */
    public void setSpecialsType(SpecialsType value) {
        this.specialsType = value;
    }

}
