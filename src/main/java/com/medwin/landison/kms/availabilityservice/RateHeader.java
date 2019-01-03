
package com.medwin.landison.kms.availabilityservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>RateHeader complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RateHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlan" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="MinLos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxLos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AdvBookin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxAdvBookin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LongInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Segments" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSegment" minOccurs="0"/&gt;
 *         &lt;element name="Sources" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSource" minOccurs="0"/&gt;
 *         &lt;element name="Packages" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPackage" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateHeader", propOrder = {
    "cateCode",
    "ratePlan",
    "minLos",
    "maxLos",
    "advBookin",
    "maxAdvBookin",
    "des",
    "shortInfo",
    "longInfo",
    "segments",
    "sources",
    "packages",
    "beginDate",
    "endDate",
    "sortId"
})
public class RateHeader {

    @XmlElement(name = "CateCode")
    protected String cateCode;
    @XmlElement(name = "RatePlan")
    protected CommonInfo ratePlan;
    @XmlElement(name = "MinLos")
    protected int minLos;
    @XmlElement(name = "MaxLos")
    protected int maxLos;
    @XmlElement(name = "AdvBookin")
    protected int advBookin;
    @XmlElement(name = "MaxAdvBookin")
    protected int maxAdvBookin;
    @XmlElement(name = "Des")
    protected String des;
    @XmlElement(name = "ShortInfo")
    protected String shortInfo;
    @XmlElement(name = "LongInfo")
    protected String longInfo;
    @XmlElement(name = "Segments")
    protected ArrayOfSegment segments;
    @XmlElement(name = "Sources")
    protected ArrayOfSource sources;
    @XmlElement(name = "Packages")
    protected ArrayOfPackage packages;
    @XmlElement(name = "BeginDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date beginDate;
    @XmlElement(name = "EndDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    @XmlElement(name = "SortId")
    protected String sortId;

    /**
     * 获取cateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCateCode() {
        return cateCode;
    }

    /**
     * 设置cateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCateCode(String value) {
        this.cateCode = value;
    }

    /**
     * 获取ratePlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getRatePlan() {
        return ratePlan;
    }

    /**
     * 设置ratePlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setRatePlan(CommonInfo value) {
        this.ratePlan = value;
    }

    /**
     * 获取minLos属性的值。
     * 
     */
    public int getMinLos() {
        return minLos;
    }

    /**
     * 设置minLos属性的值。
     * 
     */
    public void setMinLos(int value) {
        this.minLos = value;
    }

    /**
     * 获取maxLos属性的值。
     * 
     */
    public int getMaxLos() {
        return maxLos;
    }

    /**
     * 设置maxLos属性的值。
     * 
     */
    public void setMaxLos(int value) {
        this.maxLos = value;
    }

    /**
     * 获取advBookin属性的值。
     * 
     */
    public int getAdvBookin() {
        return advBookin;
    }

    /**
     * 设置advBookin属性的值。
     * 
     */
    public void setAdvBookin(int value) {
        this.advBookin = value;
    }

    /**
     * 获取maxAdvBookin属性的值。
     * 
     */
    public int getMaxAdvBookin() {
        return maxAdvBookin;
    }

    /**
     * 设置maxAdvBookin属性的值。
     * 
     */
    public void setMaxAdvBookin(int value) {
        this.maxAdvBookin = value;
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
     * 获取shortInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortInfo() {
        return shortInfo;
    }

    /**
     * 设置shortInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortInfo(String value) {
        this.shortInfo = value;
    }

    /**
     * 获取longInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongInfo() {
        return longInfo;
    }

    /**
     * 设置longInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongInfo(String value) {
        this.longInfo = value;
    }

    /**
     * 获取segments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegment }
     *     
     */
    public ArrayOfSegment getSegments() {
        return segments;
    }

    /**
     * 设置segments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegment }
     *     
     */
    public void setSegments(ArrayOfSegment value) {
        this.segments = value;
    }

    /**
     * 获取sources属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSource }
     *     
     */
    public ArrayOfSource getSources() {
        return sources;
    }

    /**
     * 设置sources属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSource }
     *     
     */
    public void setSources(ArrayOfSource value) {
        this.sources = value;
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

    /**
     * 获取beginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置beginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(Date value) {
        this.beginDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * 获取sortId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortId() {
        return sortId;
    }

    /**
     * 设置sortId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortId(String value) {
        this.sortId = value;
    }

}
