
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetDepartmentsListResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfGetDepartmentsOut" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDepartmentsListResult"
})
@XmlRootElement(name = "GetDepartmentsListResponse")
public class GetDepartmentsListResponse {

    @XmlElement(name = "GetDepartmentsListResult")
    protected ArrayOfGetDepartmentsOut getDepartmentsListResult;

    /**
     * ��ȡgetDepartmentsListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetDepartmentsOut }
     *     
     */
    public ArrayOfGetDepartmentsOut getGetDepartmentsListResult() {
        return getDepartmentsListResult;
    }

    /**
     * ����getDepartmentsListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetDepartmentsOut }
     *     
     */
    public void setGetDepartmentsListResult(ArrayOfGetDepartmentsOut value) {
        this.getDepartmentsListResult = value;
    }

}
