
package com.medwin.landison.kms.reservationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMoreOccupant complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMoreOccupant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MoreOccupant" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}MoreOccupant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMoreOccupant", propOrder = {
    "moreOccupant"
})
public class ArrayOfMoreOccupant {

    @XmlElement(name = "MoreOccupant", nillable = true)
    protected List<MoreOccupant> moreOccupant;

    /**
     * Gets the value of the moreOccupant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moreOccupant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoreOccupant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoreOccupant }
     * 
     * 
     */
    public List<MoreOccupant> getMoreOccupant() {
        if (moreOccupant == null) {
            moreOccupant = new ArrayList<MoreOccupant>();
        }
        return this.moreOccupant;
    }

}
