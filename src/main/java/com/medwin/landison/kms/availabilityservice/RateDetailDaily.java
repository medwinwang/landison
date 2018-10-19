
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>RateDetailDaily complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RateDetailDaily"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Resv_coupon_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Resv_points" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InHouseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="prs_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="prs_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="prs_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="prs_4" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="prs_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="isWeekend" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExtraBed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Child" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TaxFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ServiceChargeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableRooms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Packages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPackage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDetailDaily", propOrder = {
    "rateCode",
    "resvCouponCode",
    "resvPoints",
    "status",
    "inHouseDate",
    "price",
    "prs1",
    "prs2",
    "prs3",
    "prs4",
    "prs5",
    "isWeekend",
    "extraBed",
    "child",
    "tax",
    "taxFlag",
    "serviceCharge",
    "serviceChargeFlag",
    "des",
    "availableRooms",
    "packages"
})
public class RateDetailDaily {

    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "Resv_coupon_Code")
    protected String resvCouponCode;
    @XmlElement(name = "Resv_points", required = true)
    protected BigDecimal resvPoints;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "InHouseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String inHouseDate;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(name = "prs_1", required = true)
    protected BigDecimal prs1;
    @XmlElement(name = "prs_2", required = true)
    protected BigDecimal prs2;
    @XmlElement(name = "prs_3", required = true)
    protected BigDecimal prs3;
    @XmlElement(name = "prs_4", required = true)
    protected BigDecimal prs4;
    @XmlElement(name = "prs_5", required = true)
    protected BigDecimal prs5;
    protected int isWeekend;
    @XmlElement(name = "ExtraBed", required = true)
    protected BigDecimal extraBed;
    @XmlElement(name = "Child", required = true)
    protected BigDecimal child;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "TaxFlag")
    protected String taxFlag;
    @XmlElement(name = "ServiceCharge", required = true)
    protected BigDecimal serviceCharge;
    @XmlElement(name = "ServiceChargeFlag")
    protected String serviceChargeFlag;
    @XmlElement(name = "Des")
    protected String des;
    @XmlElement(name = "AvailableRooms")
    protected int availableRooms;
    @XmlElement(name = "Packages")
    protected ArrayOfPackage packages;

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
     * ��ȡresvCouponCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResvCouponCode() {
        return resvCouponCode;
    }

    /**
     * ����resvCouponCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResvCouponCode(String value) {
        this.resvCouponCode = value;
    }

    /**
     * ��ȡresvPoints���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResvPoints() {
        return resvPoints;
    }

    /**
     * ����resvPoints���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResvPoints(BigDecimal value) {
        this.resvPoints = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * ��ȡinHouseDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHouseDate() {
        return inHouseDate;
    }

    /**
     * ����inHouseDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHouseDate(String value) {
        this.inHouseDate = value;
    }

    /**
     * ��ȡprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * ����price���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * ��ȡprs1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs1() {
        return prs1;
    }

    /**
     * ����prs1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs1(BigDecimal value) {
        this.prs1 = value;
    }

    /**
     * ��ȡprs2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs2() {
        return prs2;
    }

    /**
     * ����prs2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs2(BigDecimal value) {
        this.prs2 = value;
    }

    /**
     * ��ȡprs3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs3() {
        return prs3;
    }

    /**
     * ����prs3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs3(BigDecimal value) {
        this.prs3 = value;
    }

    /**
     * ��ȡprs4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs4() {
        return prs4;
    }

    /**
     * ����prs4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs4(BigDecimal value) {
        this.prs4 = value;
    }

    /**
     * ��ȡprs5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrs5() {
        return prs5;
    }

    /**
     * ����prs5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrs5(BigDecimal value) {
        this.prs5 = value;
    }

    /**
     * ��ȡisWeekend���Ե�ֵ��
     * 
     */
    public int getIsWeekend() {
        return isWeekend;
    }

    /**
     * ����isWeekend���Ե�ֵ��
     * 
     */
    public void setIsWeekend(int value) {
        this.isWeekend = value;
    }

    /**
     * ��ȡextraBed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraBed() {
        return extraBed;
    }

    /**
     * ����extraBed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraBed(BigDecimal value) {
        this.extraBed = value;
    }

    /**
     * ��ȡchild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChild() {
        return child;
    }

    /**
     * ����child���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChild(BigDecimal value) {
        this.child = value;
    }

    /**
     * ��ȡtax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * ����tax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * ��ȡtaxFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFlag() {
        return taxFlag;
    }

    /**
     * ����taxFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFlag(String value) {
        this.taxFlag = value;
    }

    /**
     * ��ȡserviceCharge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * ����serviceCharge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceCharge(BigDecimal value) {
        this.serviceCharge = value;
    }

    /**
     * ��ȡserviceChargeFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceChargeFlag() {
        return serviceChargeFlag;
    }

    /**
     * ����serviceChargeFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceChargeFlag(String value) {
        this.serviceChargeFlag = value;
    }

    /**
     * ��ȡdes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDes() {
        return des;
    }

    /**
     * ����des���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDes(String value) {
        this.des = value;
    }

    /**
     * ��ȡavailableRooms���Ե�ֵ��
     * 
     */
    public int getAvailableRooms() {
        return availableRooms;
    }

    /**
     * ����availableRooms���Ե�ֵ��
     * 
     */
    public void setAvailableRooms(int value) {
        this.availableRooms = value;
    }

    /**
     * ��ȡpackages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackage }
     *     
     */
    public ArrayOfPackage getPackages() {
        return packages;
    }

    /**
     * ����packages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackage }
     *     
     */
    public void setPackages(ArrayOfPackage value) {
        this.packages = value;
    }

}
