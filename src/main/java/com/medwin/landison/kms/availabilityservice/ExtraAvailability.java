
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExtraAvailability complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExtraAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountNums" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OAvailabilityArr" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfAvailability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraAvailability", propOrder = {
    "countNums",
    "oAvailabilityArr"
})
public class ExtraAvailability {

    @XmlElement(name = "CountNums")
    protected int countNums;
    @XmlElement(name = "OAvailabilityArr")
    protected ArrayOfAvailability oAvailabilityArr;

    /**
     * ��ȡcountNums���Ե�ֵ��
     * 
     */
    public int getCountNums() {
        return countNums;
    }

    /**
     * ����countNums���Ե�ֵ��
     * 
     */
    public void setCountNums(int value) {
        this.countNums = value;
    }

    /**
     * ��ȡoAvailabilityArr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public ArrayOfAvailability getOAvailabilityArr() {
        return oAvailabilityArr;
    }

    /**
     * ����oAvailabilityArr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public void setOAvailabilityArr(ArrayOfAvailability value) {
        this.oAvailabilityArr = value;
    }

}
