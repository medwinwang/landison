
package com.medwin.landison.kms.availabilityservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>RateDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RateDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="WeekControls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Price1" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Price2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Price3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Price4" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Price5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PriceBed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PriceChild" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TaxFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ServiceChargeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RateDetail", propOrder = {
    "roomType",
    "beginDate",
    "endDate",
    "weekControls",
    "price1",
    "price2",
    "price3",
    "price4",
    "price5",
    "priceBed",
    "priceChild",
    "taxFlag",
    "tax",
    "serviceChargeFlag",
    "serviceCharge",
    "des",
    "packages"
})
public class RateDetail {

    @XmlElement(name = "RoomType")
    protected CommonInfo roomType;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String beginDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String endDate;
    @XmlElement(name = "WeekControls")
    protected String weekControls;
    @XmlElement(name = "Price1", required = true)
    protected BigDecimal price1;
    @XmlElement(name = "Price2", required = true)
    protected BigDecimal price2;
    @XmlElement(name = "Price3", required = true)
    protected BigDecimal price3;
    @XmlElement(name = "Price4", required = true)
    protected BigDecimal price4;
    @XmlElement(name = "Price5", required = true)
    protected BigDecimal price5;
    @XmlElement(name = "PriceBed", required = true)
    protected BigDecimal priceBed;
    @XmlElement(name = "PriceChild", required = true)
    protected BigDecimal priceChild;
    @XmlElement(name = "TaxFlag")
    protected String taxFlag;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "ServiceChargeFlag")
    protected String serviceChargeFlag;
    @XmlElement(name = "ServiceCharge", required = true)
    protected BigDecimal serviceCharge;
    @XmlElement(name = "Des")
    protected String des;
    @XmlElement(name = "Packages")
    protected ArrayOfPackage packages;

    /**
     * ��ȡroomType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getRoomType() {
        return roomType;
    }

    /**
     * ����roomType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setRoomType(CommonInfo value) {
        this.roomType = value;
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
     * ��ȡweekControls���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekControls() {
        return weekControls;
    }

    /**
     * ����weekControls���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekControls(String value) {
        this.weekControls = value;
    }

    /**
     * ��ȡprice1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice1() {
        return price1;
    }

    /**
     * ����price1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice1(BigDecimal value) {
        this.price1 = value;
    }

    /**
     * ��ȡprice2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice2() {
        return price2;
    }

    /**
     * ����price2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice2(BigDecimal value) {
        this.price2 = value;
    }

    /**
     * ��ȡprice3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice3() {
        return price3;
    }

    /**
     * ����price3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice3(BigDecimal value) {
        this.price3 = value;
    }

    /**
     * ��ȡprice4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice4() {
        return price4;
    }

    /**
     * ����price4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice4(BigDecimal value) {
        this.price4 = value;
    }

    /**
     * ��ȡprice5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice5() {
        return price5;
    }

    /**
     * ����price5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice5(BigDecimal value) {
        this.price5 = value;
    }

    /**
     * ��ȡpriceBed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceBed() {
        return priceBed;
    }

    /**
     * ����priceBed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceBed(BigDecimal value) {
        this.priceBed = value;
    }

    /**
     * ��ȡpriceChild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceChild() {
        return priceChild;
    }

    /**
     * ����priceChild���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceChild(BigDecimal value) {
        this.priceChild = value;
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
