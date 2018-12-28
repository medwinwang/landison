
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SvcMemberPointInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SvcMemberPointInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AccrueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccrueType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MemberNo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcMemberPointInfo", propOrder = {
    "memo",
    "placeName",
    "points",
    "accrueID",
    "accrueType",
    "dt",
    "memberNo",
    "id"
})
public class SvcMemberPointInfo
    extends BaseInfo
{

    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "PlaceName")
    protected String placeName;
    @XmlElement(name = "Points")
    protected int points;
    @XmlElement(name = "AccrueID")
    protected String accrueID;
    @XmlElement(name = "AccrueType")
    protected CommonInfo accrueType;
    @XmlElement(name = "DT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "MemberNo")
    protected CommonInfo memberNo;
    @XmlElement(name = "ID")
    protected int id;

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取placeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * 设置placeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * 获取points属性的值。
     * 
     */
    public int getPoints() {
        return points;
    }

    /**
     * 设置points属性的值。
     * 
     */
    public void setPoints(int value) {
        this.points = value;
    }

    /**
     * 获取accrueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrueID() {
        return accrueID;
    }

    /**
     * 设置accrueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrueID(String value) {
        this.accrueID = value;
    }

    /**
     * 获取accrueType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getAccrueType() {
        return accrueType;
    }

    /**
     * 设置accrueType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setAccrueType(CommonInfo value) {
        this.accrueType = value;
    }

    /**
     * 获取dt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDT() {
        return dt;
    }

    /**
     * 设置dt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDT(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * 获取memberNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMemberNo() {
        return memberNo;
    }

    /**
     * 设置memberNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMemberNo(CommonInfo value) {
        this.memberNo = value;
    }

    /**
     * 获取id属性的值。
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

}
