
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetPmsDepartmentsOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetPmsDepartmentsOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmsDepartmentsList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPmsDepartments" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPmsDepartmentsOut", propOrder = {
    "pmsDepartmentsList"
})
public class GetPmsDepartmentsOut {

    @XmlElement(name = "PmsDepartmentsList")
    protected ArrayOfPmsDepartments pmsDepartmentsList;

    /**
     * ��ȡpmsDepartmentsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPmsDepartments }
     *     
     */
    public ArrayOfPmsDepartments getPmsDepartmentsList() {
        return pmsDepartmentsList;
    }

    /**
     * ����pmsDepartmentsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPmsDepartments }
     *     
     */
    public void setPmsDepartmentsList(ArrayOfPmsDepartments value) {
        this.pmsDepartmentsList = value;
    }

}
