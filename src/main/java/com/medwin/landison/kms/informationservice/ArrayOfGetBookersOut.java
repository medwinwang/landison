
package com.medwin.landison.kms.informationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGetBookersOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGetBookersOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetBookersOut" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}GetBookersOut" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetBookersOut", propOrder = {
    "getBookersOut"
})
public class ArrayOfGetBookersOut {

    @XmlElement(name = "GetBookersOut", nillable = true)
    protected List<GetBookersOut> getBookersOut;

    /**
     * Gets the value of the getBookersOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getBookersOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetBookersOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetBookersOut }
     * 
     * 
     */
    public List<GetBookersOut> getGetBookersOut() {
        if (getBookersOut == null) {
            getBookersOut = new ArrayList<GetBookersOut>();
        }
        return this.getBookersOut;
    }

}
