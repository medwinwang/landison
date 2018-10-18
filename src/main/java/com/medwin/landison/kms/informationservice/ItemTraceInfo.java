
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemTraceInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ItemTraceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmsDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsDepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTraceInfo", propOrder = {
    "pmsDepartmentCode",
    "pmsDepartmentName",
    "traceText"
})
public class ItemTraceInfo {

    @XmlElement(name = "PmsDepartmentCode")
    protected String pmsDepartmentCode;
    @XmlElement(name = "PmsDepartmentName")
    protected String pmsDepartmentName;
    @XmlElement(name = "TraceText")
    protected String traceText;

    /**
     * ��ȡpmsDepartmentCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsDepartmentCode() {
        return pmsDepartmentCode;
    }

    /**
     * ����pmsDepartmentCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsDepartmentCode(String value) {
        this.pmsDepartmentCode = value;
    }

    /**
     * ��ȡpmsDepartmentName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsDepartmentName() {
        return pmsDepartmentName;
    }

    /**
     * ����pmsDepartmentName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsDepartmentName(String value) {
        this.pmsDepartmentName = value;
    }

    /**
     * ��ȡtraceText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceText() {
        return traceText;
    }

    /**
     * ����traceText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceText(String value) {
        this.traceText = value;
    }

}
