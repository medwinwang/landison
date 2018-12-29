
package com.medwin.landison.kms.reservationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfOrderInfoTraceTexts complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderInfoTraceTexts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderInfoTraceTexts" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoTraceTexts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderInfoTraceTexts", propOrder = {
    "orderInfoTraceTexts"
})
public class ArrayOfOrderInfoTraceTexts {

    @XmlElement(name = "OrderInfoTraceTexts", nillable = true)
    protected List<OrderInfoTraceTexts> orderInfoTraceTexts;

    /**
     * Gets the value of the orderInfoTraceTexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderInfoTraceTexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderInfoTraceTexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderInfoTraceTexts }
     * 
     * 
     */
    public List<OrderInfoTraceTexts> getOrderInfoTraceTexts() {
        if (orderInfoTraceTexts == null) {
            orderInfoTraceTexts = new ArrayList<OrderInfoTraceTexts>();
        }
        return this.orderInfoTraceTexts;
    }

}
