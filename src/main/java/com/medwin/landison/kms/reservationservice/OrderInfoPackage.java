
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderInfoPackage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OrderInfoPackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Package" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Package" minOccurs="0"/&gt;
 *         &lt;element name="DailyPackages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfDailyPackage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfoPackage", propOrder = {
    "_package",
    "dailyPackages"
})
public class OrderInfoPackage {

    @XmlElement(name = "Package")
    protected Package _package;
    @XmlElement(name = "DailyPackages")
    protected ArrayOfDailyPackage dailyPackages;

    /**
     * ��ȡpackage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Package }
     *     
     */
    public Package getPackage() {
        return _package;
    }

    /**
     * ����package���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setPackage(Package value) {
        this._package = value;
    }

    /**
     * ��ȡdailyPackages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDailyPackage }
     *     
     */
    public ArrayOfDailyPackage getDailyPackages() {
        return dailyPackages;
    }

    /**
     * ����dailyPackages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDailyPackage }
     *     
     */
    public void setDailyPackages(ArrayOfDailyPackage value) {
        this.dailyPackages = value;
    }

}
