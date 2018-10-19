
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>Package complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Package"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostingRhythm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalculationRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KwsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputQuantityYn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ItemInfoList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfItemInfo" minOccurs="0"/&gt;
 *         &lt;element name="FromFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", propOrder = {
    "groupCode",
    "groupName",
    "price",
    "packageType",
    "postingRhythm",
    "calculationRule",
    "kwsDesc",
    "inputQuantityYn",
    "quantity",
    "rateCode",
    "roomTypeCode",
    "beginDate",
    "endDate",
    "itemInfoList",
    "fromFlag"
})
public class Package
    extends CommonInfo
{

    @XmlElement(name = "GroupCode")
    protected String groupCode;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "Price")
    protected String price;
    @XmlElement(name = "PackageType")
    protected String packageType;
    @XmlElement(name = "PostingRhythm")
    protected String postingRhythm;
    @XmlElement(name = "CalculationRule")
    protected String calculationRule;
    @XmlElement(name = "KwsDesc")
    protected String kwsDesc;
    @XmlElement(name = "InputQuantityYn")
    protected boolean inputQuantityYn;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlElement(name = "BeginDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String beginDate;
    @XmlElement(name = "EndDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String endDate;
    @XmlElement(name = "ItemInfoList")
    protected ArrayOfItemInfo itemInfoList;
    @XmlElement(name = "FromFlag")
    protected String fromFlag;

    /**
     * ��ȡgroupCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * ����groupCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * ��ȡgroupName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * ����groupName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * ��ȡprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * ����price���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * ��ȡpackageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * ����packageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * ��ȡpostingRhythm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingRhythm() {
        return postingRhythm;
    }

    /**
     * ����postingRhythm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingRhythm(String value) {
        this.postingRhythm = value;
    }

    /**
     * ��ȡcalculationRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationRule() {
        return calculationRule;
    }

    /**
     * ����calculationRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationRule(String value) {
        this.calculationRule = value;
    }

    /**
     * ��ȡkwsDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKwsDesc() {
        return kwsDesc;
    }

    /**
     * ����kwsDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKwsDesc(String value) {
        this.kwsDesc = value;
    }

    /**
     * ��ȡinputQuantityYn���Ե�ֵ��
     * 
     */
    public boolean isInputQuantityYn() {
        return inputQuantityYn;
    }

    /**
     * ����inputQuantityYn���Ե�ֵ��
     * 
     */
    public void setInputQuantityYn(boolean value) {
        this.inputQuantityYn = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * ��ȡrateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * ����rateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * ��ȡroomTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * ����roomTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * ��ȡbeginDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * ����beginDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(String value) {
        this.beginDate = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * ��ȡitemInfoList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemInfo }
     *     
     */
    public ArrayOfItemInfo getItemInfoList() {
        return itemInfoList;
    }

    /**
     * ����itemInfoList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemInfo }
     *     
     */
    public void setItemInfoList(ArrayOfItemInfo value) {
        this.itemInfoList = value;
    }

    /**
     * ��ȡfromFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromFlag() {
        return fromFlag;
    }

    /**
     * ����fromFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromFlag(String value) {
        this.fromFlag = value;
    }

}
