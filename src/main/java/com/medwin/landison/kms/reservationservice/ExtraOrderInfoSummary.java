
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExtraOrderInfoSummary complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExtraOrderInfoSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountNums" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OOrderArr" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraOrderInfoSummary", propOrder = {
    "countNums",
    "oOrderArr"
})
public class ExtraOrderInfoSummary {

    @XmlElement(name = "CountNums")
    protected int countNums;
    @XmlElement(name = "OOrderArr")
    protected ArrayOfOrderInfo oOrderArr;

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
     * ��ȡoOrderArr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfo }
     *     
     */
    public ArrayOfOrderInfo getOOrderArr() {
        return oOrderArr;
    }

    /**
     * ����oOrderArr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfo }
     *     
     */
    public void setOOrderArr(ArrayOfOrderInfo value) {
        this.oOrderArr = value;
    }

}
