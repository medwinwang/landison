
package com.medwin.landison.kms.availabilityservice;

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
 *         &lt;element name="CheckItemIsEnoughResult" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCheckItemIsEnoughOut" minOccurs="0"/&gt;
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
    "checkItemIsEnoughResult"
})
@XmlRootElement(name = "CheckItemIsEnoughResponse")
public class CheckItemIsEnoughResponse {

    @XmlElement(name = "CheckItemIsEnoughResult")
    protected ArrayOfCheckItemIsEnoughOut checkItemIsEnoughResult;

    /**
     * ��ȡcheckItemIsEnoughResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCheckItemIsEnoughOut }
     *     
     */
    public ArrayOfCheckItemIsEnoughOut getCheckItemIsEnoughResult() {
        return checkItemIsEnoughResult;
    }

    /**
     * ����checkItemIsEnoughResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCheckItemIsEnoughOut }
     *     
     */
    public void setCheckItemIsEnoughResult(ArrayOfCheckItemIsEnoughOut value) {
        this.checkItemIsEnoughResult = value;
    }

}
