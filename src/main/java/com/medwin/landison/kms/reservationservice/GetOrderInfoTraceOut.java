
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetOrderInfoTraceOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetOrderInfoTraceOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderInfoTraceList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoTraceTexts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderInfoTraceOut", propOrder = {
    "orderInfoTraceList"
})
public class GetOrderInfoTraceOut {

    @XmlElement(name = "OrderInfoTraceList")
    protected ArrayOfOrderInfoTraceTexts orderInfoTraceList;

    /**
     * ��ȡorderInfoTraceList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoTraceTexts }
     *     
     */
    public ArrayOfOrderInfoTraceTexts getOrderInfoTraceList() {
        return orderInfoTraceList;
    }

    /**
     * ����orderInfoTraceList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoTraceTexts }
     *     
     */
    public void setOrderInfoTraceList(ArrayOfOrderInfoTraceTexts value) {
        this.orderInfoTraceList = value;
    }

}
