
package com.medwin.landison.kms.availabilityservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfRateAndRoomTypeEnabled complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRateAndRoomTypeEnabled"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateAndRoomTypeEnabled" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}RateAndRoomTypeEnabled" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRateAndRoomTypeEnabled", propOrder = {
    "rateAndRoomTypeEnabled"
})
public class ArrayOfRateAndRoomTypeEnabled {

    @XmlElement(name = "RateAndRoomTypeEnabled", nillable = true)
    protected List<RateAndRoomTypeEnabled> rateAndRoomTypeEnabled;

    /**
     * Gets the value of the rateAndRoomTypeEnabled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateAndRoomTypeEnabled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateAndRoomTypeEnabled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndRoomTypeEnabled }
     * 
     * 
     */
    public List<RateAndRoomTypeEnabled> getRateAndRoomTypeEnabled() {
        if (rateAndRoomTypeEnabled == null) {
            rateAndRoomTypeEnabled = new ArrayList<RateAndRoomTypeEnabled>();
        }
        return this.rateAndRoomTypeEnabled;
    }

}
