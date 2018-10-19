
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MoreOccupant complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MoreOccupant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccupantFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OccupantLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OccupantChineseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoreOccupant", propOrder = {
    "occupantFirstName",
    "occupantLastName",
    "occupantChineseName"
})
public class MoreOccupant
    extends BaseInfo
{

    @XmlElement(name = "OccupantFirstName")
    protected String occupantFirstName;
    @XmlElement(name = "OccupantLastName")
    protected String occupantLastName;
    @XmlElement(name = "OccupantChineseName")
    protected String occupantChineseName;

    /**
     * ��ȡoccupantFirstName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupantFirstName() {
        return occupantFirstName;
    }

    /**
     * ����occupantFirstName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupantFirstName(String value) {
        this.occupantFirstName = value;
    }

    /**
     * ��ȡoccupantLastName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupantLastName() {
        return occupantLastName;
    }

    /**
     * ����occupantLastName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupantLastName(String value) {
        this.occupantLastName = value;
    }

    /**
     * ��ȡoccupantChineseName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupantChineseName() {
        return occupantChineseName;
    }

    /**
     * ����occupantChineseName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupantChineseName(String value) {
        this.occupantChineseName = value;
    }

}
