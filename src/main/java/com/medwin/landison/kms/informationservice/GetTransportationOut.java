
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetTransportationOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetTransportationOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportInfoList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfTransportInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransportationOut", propOrder = {
    "transportInfoList"
})
public class GetTransportationOut {

    @XmlElement(name = "TransportInfoList")
    protected ArrayOfTransportInfo transportInfoList;

    /**
     * ��ȡtransportInfoList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransportInfo }
     *     
     */
    public ArrayOfTransportInfo getTransportInfoList() {
        return transportInfoList;
    }

    /**
     * ����transportInfoList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransportInfo }
     *     
     */
    public void setTransportInfoList(ArrayOfTransportInfo value) {
        this.transportInfoList = value;
    }

}
