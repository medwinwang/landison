
package com.medwin.landison.kms.reservationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDailyPackage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDailyPackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyPackage" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}DailyPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDailyPackage", propOrder = {
    "dailyPackage"
})
public class ArrayOfDailyPackage {

    @XmlElement(name = "DailyPackage", nillable = true)
    protected List<DailyPackage> dailyPackage;

    /**
     * Gets the value of the dailyPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailyPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailyPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DailyPackage }
     * 
     * 
     */
    public List<DailyPackage> getDailyPackage() {
        if (dailyPackage == null) {
            dailyPackage = new ArrayList<DailyPackage>();
        }
        return this.dailyPackage;
    }

}
