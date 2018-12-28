
package com.medwin.landison.kms.profileservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPotentialMemberMetadata complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPotentialMemberMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PotentialMemberMetadata" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PotentialMemberMetadata" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPotentialMemberMetadata", propOrder = {
    "potentialMemberMetadata"
})
public class ArrayOfPotentialMemberMetadata {

    @XmlElement(name = "PotentialMemberMetadata", nillable = true)
    protected List<PotentialMemberMetadata> potentialMemberMetadata;

    /**
     * Gets the value of the potentialMemberMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the potentialMemberMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPotentialMemberMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PotentialMemberMetadata }
     * 
     * 
     */
    public List<PotentialMemberMetadata> getPotentialMemberMetadata() {
        if (potentialMemberMetadata == null) {
            potentialMemberMetadata = new ArrayList<PotentialMemberMetadata>();
        }
        return this.potentialMemberMetadata;
    }

}
