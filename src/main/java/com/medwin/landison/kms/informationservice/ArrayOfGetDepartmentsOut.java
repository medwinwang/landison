
package com.medwin.landison.kms.informationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGetDepartmentsOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGetDepartmentsOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetDepartmentsOut" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetDepartmentsOut" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetDepartmentsOut", propOrder = {
    "getDepartmentsOut"
})
public class ArrayOfGetDepartmentsOut {

    @XmlElement(name = "GetDepartmentsOut", nillable = true)
    protected List<GetDepartmentsOut> getDepartmentsOut;

    /**
     * Gets the value of the getDepartmentsOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getDepartmentsOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetDepartmentsOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetDepartmentsOut }
     * 
     * 
     */
    public List<GetDepartmentsOut> getGetDepartmentsOut() {
        if (getDepartmentsOut == null) {
            getDepartmentsOut = new ArrayList<GetDepartmentsOut>();
        }
        return this.getDepartmentsOut;
    }

}
