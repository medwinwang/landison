
package com.medwin.landison.kms.informationservice;

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
 *         &lt;element name="getTitleByKeyIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetTitleIn" minOccurs="0"/&gt;
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
    "getTitleByKeyIn"
})
@XmlRootElement(name = "GetTitle")
public class GetTitle {

    protected GetTitleIn getTitleByKeyIn;

    /**
     * ��ȡgetTitleByKeyIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetTitleIn }
     *     
     */
    public GetTitleIn getGetTitleByKeyIn() {
        return getTitleByKeyIn;
    }

    /**
     * ����getTitleByKeyIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetTitleIn }
     *     
     */
    public void setGetTitleByKeyIn(GetTitleIn value) {
        this.getTitleByKeyIn = value;
    }

}
