
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
 *         &lt;element name="calculationSeparateSoldPackageIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CalculationSeparateSoldPackageIn" minOccurs="0"/&gt;
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
    "calculationSeparateSoldPackageIn"
})
@XmlRootElement(name = "CalculateSeparateSoldPackage")
public class CalculateSeparateSoldPackage {

    protected CalculationSeparateSoldPackageIn calculationSeparateSoldPackageIn;

    /**
     * ��ȡcalculationSeparateSoldPackageIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CalculationSeparateSoldPackageIn }
     *     
     */
    public CalculationSeparateSoldPackageIn getCalculationSeparateSoldPackageIn() {
        return calculationSeparateSoldPackageIn;
    }

    /**
     * ����calculationSeparateSoldPackageIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSeparateSoldPackageIn }
     *     
     */
    public void setCalculationSeparateSoldPackageIn(CalculationSeparateSoldPackageIn value) {
        this.calculationSeparateSoldPackageIn = value;
    }

}
