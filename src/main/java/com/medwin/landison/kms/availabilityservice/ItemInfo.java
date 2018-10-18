
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AvailableFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellSeparate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemTrace" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ItemTraceInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInfo", propOrder = {
    "hotelCode",
    "description",
    "inactive",
    "itemClassCode",
    "defaultQuantity",
    "availableFrom",
    "availableTo",
    "sellSeparate",
    "itemTrace"
})
public class ItemInfo
    extends CommonInfo
{

    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Inactive")
    protected String inactive;
    @XmlElement(name = "ItemClassCode")
    protected String itemClassCode;
    @XmlElement(name = "DefaultQuantity")
    protected int defaultQuantity;
    @XmlElement(name = "AvailableFrom")
    protected String availableFrom;
    @XmlElement(name = "AvailableTo")
    protected String availableTo;
    @XmlElement(name = "SellSeparate")
    protected String sellSeparate;
    @XmlElement(name = "ItemTrace")
    protected ItemTraceInfo itemTrace;

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
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡinactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactive() {
        return inactive;
    }

    /**
     * ����inactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactive(String value) {
        this.inactive = value;
    }

    /**
     * ��ȡitemClassCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemClassCode() {
        return itemClassCode;
    }

    /**
     * ����itemClassCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemClassCode(String value) {
        this.itemClassCode = value;
    }

    /**
     * ��ȡdefaultQuantity���Ե�ֵ��
     * 
     */
    public int getDefaultQuantity() {
        return defaultQuantity;
    }

    /**
     * ����defaultQuantity���Ե�ֵ��
     * 
     */
    public void setDefaultQuantity(int value) {
        this.defaultQuantity = value;
    }

    /**
     * ��ȡavailableFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableFrom() {
        return availableFrom;
    }

    /**
     * ����availableFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableFrom(String value) {
        this.availableFrom = value;
    }

    /**
     * ��ȡavailableTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableTo() {
        return availableTo;
    }

    /**
     * ����availableTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableTo(String value) {
        this.availableTo = value;
    }

    /**
     * ��ȡsellSeparate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellSeparate() {
        return sellSeparate;
    }

    /**
     * ����sellSeparate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellSeparate(String value) {
        this.sellSeparate = value;
    }

    /**
     * ��ȡitemTrace���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemTraceInfo }
     *     
     */
    public ItemTraceInfo getItemTrace() {
        return itemTrace;
    }

    /**
     * ����itemTrace���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTraceInfo }
     *     
     */
    public void setItemTrace(ItemTraceInfo value) {
        this.itemTrace = value;
    }

}
