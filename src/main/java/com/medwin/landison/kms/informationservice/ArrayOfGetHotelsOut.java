
package com.medwin.landison.kms.informationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGetHotelsOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGetHotelsOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetHotelsOut" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetHotelsOut" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetHotelsOut", propOrder = {
    "getHotelsOut"
})
public class ArrayOfGetHotelsOut {

    @XmlElement(name = "GetHotelsOut", nillable = true)
    protected List<GetHotelsOut> getHotelsOut;

    /**
     * Gets the value of the getHotelsOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getHotelsOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetHotelsOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetHotelsOut }
     * 
     * 
     */
    public List<GetHotelsOut> getGetHotelsOut() {
        if (getHotelsOut == null) {
            getHotelsOut = new ArrayList<GetHotelsOut>();
        }
        return this.getHotelsOut;
    }

}
