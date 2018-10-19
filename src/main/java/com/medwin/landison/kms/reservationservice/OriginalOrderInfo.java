
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OriginalOrderInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OriginalOrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalBundledRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalIdList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginaStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalTotalRevenue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalRoomNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalOrderInfo", propOrder = {
    "originalFirstName",
    "originalBundledRoomCode",
    "originalIdList",
    "originalId",
    "originaStatus",
    "originalTotalRevenue",
    "originalRoomNum",
    "originalOrderId"
})
public class OriginalOrderInfo {

    @XmlElement(name = "OriginalFirstName")
    protected String originalFirstName;
    @XmlElement(name = "OriginalBundledRoomCode")
    protected String originalBundledRoomCode;
    @XmlElement(name = "OriginalIdList")
    protected String originalIdList;
    @XmlElement(name = "OriginalId")
    protected String originalId;
    @XmlElement(name = "OriginaStatus")
    protected String originaStatus;
    @XmlElement(name = "OriginalTotalRevenue")
    protected String originalTotalRevenue;
    @XmlElement(name = "OriginalRoomNum")
    protected String originalRoomNum;
    @XmlElement(name = "OriginalOrderId")
    protected String originalOrderId;

    /**
     * ��ȡoriginalFirstName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFirstName() {
        return originalFirstName;
    }

    /**
     * ����originalFirstName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFirstName(String value) {
        this.originalFirstName = value;
    }

    /**
     * ��ȡoriginalBundledRoomCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalBundledRoomCode() {
        return originalBundledRoomCode;
    }

    /**
     * ����originalBundledRoomCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalBundledRoomCode(String value) {
        this.originalBundledRoomCode = value;
    }

    /**
     * ��ȡoriginalIdList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalIdList() {
        return originalIdList;
    }

    /**
     * ����originalIdList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalIdList(String value) {
        this.originalIdList = value;
    }

    /**
     * ��ȡoriginalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalId() {
        return originalId;
    }

    /**
     * ����originalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalId(String value) {
        this.originalId = value;
    }

    /**
     * ��ȡoriginaStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginaStatus() {
        return originaStatus;
    }

    /**
     * ����originaStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginaStatus(String value) {
        this.originaStatus = value;
    }

    /**
     * ��ȡoriginalTotalRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTotalRevenue() {
        return originalTotalRevenue;
    }

    /**
     * ����originalTotalRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTotalRevenue(String value) {
        this.originalTotalRevenue = value;
    }

    /**
     * ��ȡoriginalRoomNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRoomNum() {
        return originalRoomNum;
    }

    /**
     * ����originalRoomNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRoomNum(String value) {
        this.originalRoomNum = value;
    }

    /**
     * ��ȡoriginalOrderId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalOrderId() {
        return originalOrderId;
    }

    /**
     * ����originalOrderId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalOrderId(String value) {
        this.originalOrderId = value;
    }

}
