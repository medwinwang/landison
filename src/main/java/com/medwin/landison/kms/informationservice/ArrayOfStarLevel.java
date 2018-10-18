
package com.medwin.landison.kms.informationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfStarLevel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStarLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StarLevel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}StarLevel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStarLevel", propOrder = {
    "starLevel"
})
public class ArrayOfStarLevel {

    @XmlElement(name = "StarLevel", nillable = true)
    protected List<StarLevel> starLevel;

    /**
     * Gets the value of the starLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the starLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStarLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StarLevel }
     * 
     * 
     */
    public List<StarLevel> getStarLevel() {
        if (starLevel == null) {
            starLevel = new ArrayList<StarLevel>();
        }
        return this.starLevel;
    }

}
