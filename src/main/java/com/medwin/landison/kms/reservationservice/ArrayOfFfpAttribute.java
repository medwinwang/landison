
package com.medwin.landison.kms.reservationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFfpAttribute complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFfpAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FfpAttribute" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}FfpAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFfpAttribute", propOrder = {
    "ffpAttribute"
})
public class ArrayOfFfpAttribute {

    @XmlElement(name = "FfpAttribute", nillable = true)
    protected List<FfpAttribute> ffpAttribute;

    /**
     * Gets the value of the ffpAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ffpAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFfpAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FfpAttribute }
     * 
     * 
     */
    public List<FfpAttribute> getFfpAttribute() {
        if (ffpAttribute == null) {
            ffpAttribute = new ArrayList<FfpAttribute>();
        }
        return this.ffpAttribute;
    }

}
