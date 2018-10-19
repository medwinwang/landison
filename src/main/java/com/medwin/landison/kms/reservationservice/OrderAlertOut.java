
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderAlertOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OrderAlertOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderAlertList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderAlert" minOccurs="0"/&gt;
 *         &lt;element name="PageInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PageInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAlertOut", propOrder = {
    "orderAlertList",
    "pageInfo"
})
public class OrderAlertOut {

    @XmlElement(name = "OrderAlertList")
    protected ArrayOfOrderAlert orderAlertList;
    @XmlElement(name = "PageInfo")
    protected PageInfo pageInfo;

    /**
     * ��ȡorderAlertList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderAlert }
     *     
     */
    public ArrayOfOrderAlert getOrderAlertList() {
        return orderAlertList;
    }

    /**
     * ����orderAlertList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderAlert }
     *     
     */
    public void setOrderAlertList(ArrayOfOrderAlert value) {
        this.orderAlertList = value;
    }

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

}
