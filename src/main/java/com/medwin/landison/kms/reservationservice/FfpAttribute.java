
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FfpAttribute complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FfpAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FfpTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpLevalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FfpAttribute", propOrder = {
    "ffpTypeCode",
    "ffpTypeName",
    "ffpType",
    "ffpLevelName",
    "ffpLevalCode"
})
public class FfpAttribute
    extends BaseInfo
{

    @XmlElement(name = "FfpTypeCode")
    protected String ffpTypeCode;
    @XmlElement(name = "FfpTypeName")
    protected String ffpTypeName;
    @XmlElement(name = "FfpType")
    protected String ffpType;
    @XmlElement(name = "FfpLevelName")
    protected String ffpLevelName;
    @XmlElement(name = "FfpLevalCode")
    protected String ffpLevalCode;

    /**
     * ��ȡffpTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpTypeCode() {
        return ffpTypeCode;
    }

    /**
     * ����ffpTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpTypeCode(String value) {
        this.ffpTypeCode = value;
    }

    /**
     * ��ȡffpTypeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpTypeName() {
        return ffpTypeName;
    }

    /**
     * ����ffpTypeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpTypeName(String value) {
        this.ffpTypeName = value;
    }

    /**
     * ��ȡffpType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpType() {
        return ffpType;
    }

    /**
     * ����ffpType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpType(String value) {
        this.ffpType = value;
    }

    /**
     * ��ȡffpLevelName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpLevelName() {
        return ffpLevelName;
    }

    /**
     * ����ffpLevelName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpLevelName(String value) {
        this.ffpLevelName = value;
    }

    /**
     * ��ȡffpLevalCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpLevalCode() {
        return ffpLevalCode;
    }

    /**
     * ����ffpLevalCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpLevalCode(String value) {
        this.ffpLevalCode = value;
    }

}
