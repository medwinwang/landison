
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RateDetailDaily complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
    protected XMLGregorianCalendar inHouseDate;
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
     * 获取rateCode属性的值。
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
     * 设置rateCode属性的值。
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
     * 获取resvCouponCode属性的值。
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
     * 设置resvCouponCode属性的值。
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
     * 获取resvPoints属性的值。
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
     * 设置resvPoints属性的值。
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
     * 获取status属性的值。
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * 获取inHouseDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInHouseDate() {
        return inHouseDate;
    }

    /**
     * 设置inHouseDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInHouseDate(XMLGregorianCalendar value) {
        this.inHouseDate = value;
    }

    /**
     * 获取price属性的值。
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
     * 设置price属性的值。
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
     * 获取prs1属性的值。
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
     * 设置prs1属性的值。
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
     * 获取prs2属性的值。
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
     * 设置prs2属性的值。
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
     * 获取prs3属性的值。
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
     * 设置prs3属性的值。
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
     * 获取prs4属性的值。
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
     * 设置prs4属性的值。
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
     * 获取prs5属性的值。
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
     * 设置prs5属性的值。
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
     * 获取isWeekend属性的值。
     * 
     */
    public int getIsWeekend() {
        return isWeekend;
    }

    /**
     * 设置isWeekend属性的值。
     * 
     */
    public void setIsWeekend(int value) {
        this.isWeekend = value;
    }

    /**
     * 获取extraBed属性的值。
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
     * 设置extraBed属性的值。
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
     * 获取child属性的值。
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
     * 设置child属性的值。
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
     * 获取tax属性的值。
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
     * 设置tax属性的值。
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
     * 获取taxFlag属性的值。
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
     * 设置taxFlag属性的值。
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
     * 获取serviceCharge属性的值。
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
     * 设置serviceCharge属性的值。
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
     * 获取serviceChargeFlag属性的值。
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
     * 设置serviceChargeFlag属性的值。
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
     * 获取des属性的值。
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
     * 设置des属性的值。
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
     * 获取availableRooms属性的值。
     * 
     */
    public int getAvailableRooms() {
        return availableRooms;
    }

    /**
     * 设置availableRooms属性的值。
     * 
     */
    public void setAvailableRooms(int value) {
        this.availableRooms = value;
    }

    /**
     * 获取packages属性的值。
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
     * 设置packages属性的值。
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
