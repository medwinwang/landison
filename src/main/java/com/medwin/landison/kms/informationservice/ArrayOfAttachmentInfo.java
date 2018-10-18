
package com.medwin.landison.kms.informationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAttachmentInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAttachmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}AttachmentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAttachmentInfo", propOrder = {
    "attachmentInfo"
})
public class ArrayOfAttachmentInfo {

    @XmlElement(name = "AttachmentInfo", nillable = true)
    protected List<AttachmentInfo> attachmentInfo;

    /**
     * Gets the value of the attachmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentInfo }
     * 
     * 
     */
    public List<AttachmentInfo> getAttachmentInfo() {
        if (attachmentInfo == null) {
            attachmentInfo = new ArrayList<AttachmentInfo>();
        }
        return this.attachmentInfo;
    }

}