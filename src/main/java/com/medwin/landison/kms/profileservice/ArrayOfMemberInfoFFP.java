
package com.medwin.landison.kms.profileservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMemberInfoFFP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMemberInfoFFP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberInfoFFP" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}MemberInfoFFP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMemberInfoFFP", propOrder = {
    "memberInfoFFP"
})
public class ArrayOfMemberInfoFFP {

    @XmlElement(name = "MemberInfoFFP", nillable = true)
    protected List<MemberInfoFFP> memberInfoFFP;

    /**
     * Gets the value of the memberInfoFFP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberInfoFFP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberInfoFFP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberInfoFFP }
     * 
     * 
     */
    public List<MemberInfoFFP> getMemberInfoFFP() {
        if (memberInfoFFP == null) {
            memberInfoFFP = new ArrayList<MemberInfoFFP>();
        }
        return this.memberInfoFFP;
    }

}
