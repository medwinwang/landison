
package com.medwin.landison.kms.informationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfReservationModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReservationModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationModel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ReservationModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReservationModel", propOrder = {
    "reservationModel"
})
public class ArrayOfReservationModel {

    @XmlElement(name = "ReservationModel", nillable = true)
    protected List<ReservationModel> reservationModel;

    /**
     * Gets the value of the reservationModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationModel }
     * 
     * 
     */
    public List<ReservationModel> getReservationModel() {
        if (reservationModel == null) {
            reservationModel = new ArrayList<ReservationModel>();
        }
        return this.reservationModel;
    }

}
