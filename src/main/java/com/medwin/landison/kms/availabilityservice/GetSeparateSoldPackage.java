
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
 *         &lt;element name="separateSoldPackageIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SeparateSoldPackageIn" minOccurs="0"/&gt;
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
    "separateSoldPackageIn"
})
@XmlRootElement(name = "GetSeparateSoldPackage")
public class GetSeparateSoldPackage {

    protected SeparateSoldPackageIn separateSoldPackageIn;

    /**
     * ��ȡseparateSoldPackageIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeparateSoldPackageIn }
     *     
     */
    public SeparateSoldPackageIn getSeparateSoldPackageIn() {
        return separateSoldPackageIn;
    }

    /**
     * ����separateSoldPackageIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeparateSoldPackageIn }
     *     
     */
    public void setSeparateSoldPackageIn(SeparateSoldPackageIn value) {
        this.separateSoldPackageIn = value;
    }

}
