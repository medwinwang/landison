
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>RateHeader complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String beginDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String endDate;
    @XmlElement(name = "SortId")
    protected String sortId;

    /**
     * ��ȡcateCode���Ե�ֵ��
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
     * ����cateCode���Ե�ֵ��
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
     * ��ȡratePlan���Ե�ֵ��
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
     * ����ratePlan���Ե�ֵ��
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
     * ��ȡminLos���Ե�ֵ��
     * 
     */
    public int getMinLos() {
        return minLos;
    }

    /**
     * ����minLos���Ե�ֵ��
     * 
     */
    public void setMinLos(int value) {
        this.minLos = value;
    }

    /**
     * ��ȡmaxLos���Ե�ֵ��
     * 
     */
    public int getMaxLos() {
        return maxLos;
    }

    /**
     * ����maxLos���Ե�ֵ��
     * 
     */
    public void setMaxLos(int value) {
        this.maxLos = value;
    }

    /**
     * ��ȡadvBookin���Ե�ֵ��
     * 
     */
    public int getAdvBookin() {
        return advBookin;
    }

    /**
     * ����advBookin���Ե�ֵ��
     * 
     */
    public void setAdvBookin(int value) {
        this.advBookin = value;
    }

    /**
     * ��ȡmaxAdvBookin���Ե�ֵ��
     * 
     */
    public int getMaxAdvBookin() {
        return maxAdvBookin;
    }

    /**
     * ����maxAdvBookin���Ե�ֵ��
     * 
     */
    public void setMaxAdvBookin(int value) {
        this.maxAdvBookin = value;
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
     * ��ȡshortInfo���Ե�ֵ��
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
     * ����shortInfo���Ե�ֵ��
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
     * ��ȡlongInfo���Ե�ֵ��
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
     * ����longInfo���Ե�ֵ��
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
     * ��ȡsegments���Ե�ֵ��
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
     * ����segments���Ե�ֵ��
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
     * ��ȡsources���Ե�ֵ��
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
     * ����sources���Ե�ֵ��
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
     * ��ȡsortId���Ե�ֵ��
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
     * ����sortId���Ե�ֵ��
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
