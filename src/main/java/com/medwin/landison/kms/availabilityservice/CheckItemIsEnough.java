
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="checkItemIsEnoughIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CheckItemIsEnoughIn" minOccurs="0"/&gt;
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
    "checkItemIsEnoughIn"
})
@XmlRootElement(name = "CheckItemIsEnough")
public class CheckItemIsEnough {

    protected CheckItemIsEnoughIn checkItemIsEnoughIn;

    /**
     * ��ȡcheckItemIsEnoughIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CheckItemIsEnoughIn }
     *     
     */
    public CheckItemIsEnoughIn getCheckItemIsEnoughIn() {
        return checkItemIsEnoughIn;
    }

    /**
     * ����checkItemIsEnoughIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CheckItemIsEnoughIn }
     *     
     */
    public void setCheckItemIsEnoughIn(CheckItemIsEnoughIn value) {
        this.checkItemIsEnoughIn = value;
    }

}
