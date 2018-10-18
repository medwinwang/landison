
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MessageTemplet complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MessageTemplet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemplateId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemplateContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemplateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageTemplet", propOrder = {
    "templateId",
    "templateName",
    "templateContent",
    "templateType",
    "usageCode"
})
public class MessageTemplet {

    @XmlElement(name = "TemplateId")
    protected int templateId;
    @XmlElement(name = "TemplateName")
    protected String templateName;
    @XmlElement(name = "TemplateContent")
    protected String templateContent;
    @XmlElement(name = "TemplateType")
    protected String templateType;
    @XmlElement(name = "UsageCode")
    protected String usageCode;

    /**
     * ��ȡtemplateId���Ե�ֵ��
     * 
     */
    public int getTemplateId() {
        return templateId;
    }

    /**
     * ����templateId���Ե�ֵ��
     * 
     */
    public void setTemplateId(int value) {
        this.templateId = value;
    }

    /**
     * ��ȡtemplateName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * ����templateName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * ��ȡtemplateContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateContent() {
        return templateContent;
    }

    /**
     * ����templateContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateContent(String value) {
        this.templateContent = value;
    }

    /**
     * ��ȡtemplateType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * ����templateType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateType(String value) {
        this.templateType = value;
    }

    /**
     * ��ȡusageCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageCode() {
        return usageCode;
    }

    /**
     * ����usageCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageCode(String value) {
        this.usageCode = value;
    }

}
