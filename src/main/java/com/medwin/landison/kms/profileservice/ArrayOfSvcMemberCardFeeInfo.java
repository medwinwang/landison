
package com.medwin.landison.kms.profileservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSvcMemberCardFeeInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSvcMemberCardFeeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcMemberCardFeeInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SvcMemberCardFeeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSvcMemberCardFeeInfo", propOrder = {
    "svcMemberCardFeeInfo"
})
public class ArrayOfSvcMemberCardFeeInfo {

    @XmlElement(name = "SvcMemberCardFeeInfo", nillable = true)
    protected List<SvcMemberCardFeeInfo> svcMemberCardFeeInfo;

    /**
     * Gets the value of the svcMemberCardFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcMemberCardFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcMemberCardFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcMemberCardFeeInfo }
     * 
     * 
     */
    public List<SvcMemberCardFeeInfo> getSvcMemberCardFeeInfo() {
        if (svcMemberCardFeeInfo == null) {
            svcMemberCardFeeInfo = new ArrayList<SvcMemberCardFeeInfo>();
        }
        return this.svcMemberCardFeeInfo;
    }

}
