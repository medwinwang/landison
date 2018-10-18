
package com.medwin.landison.kms.availabilityservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSeparateSoldPackages complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSeparateSoldPackages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeparateSoldPackages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SeparateSoldPackages" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSeparateSoldPackages", propOrder = {
    "separateSoldPackages"
})
public class ArrayOfSeparateSoldPackages {

    @XmlElement(name = "SeparateSoldPackages", nillable = true)
    protected List<SeparateSoldPackages> separateSoldPackages;

    /**
     * Gets the value of the separateSoldPackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separateSoldPackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparateSoldPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeparateSoldPackages }
     * 
     * 
     */
    public List<SeparateSoldPackages> getSeparateSoldPackages() {
        if (separateSoldPackages == null) {
            separateSoldPackages = new ArrayList<SeparateSoldPackages>();
        }
        return this.separateSoldPackages;
    }

}
