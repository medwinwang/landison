
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MemberInfoFFP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MemberInfoFFP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpCardLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FfpCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsBinding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mileages" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberInfoFFP", propOrder = {
    "memberNo",
    "ffpId",
    "ffpCardType",
    "ffpCardLevel",
    "ffpCardNo",
    "remark",
    "cardStatus",
    "isBinding",
    "mileages"
})
public class MemberInfoFFP
    extends BaseInfo
{

    @XmlElement(name = "MemberNo")
    protected String memberNo;
    @XmlElement(name = "FfpId")
    protected String ffpId;
    @XmlElement(name = "FfpCardType")
    protected String ffpCardType;
    @XmlElement(name = "FfpCardLevel")
    protected String ffpCardLevel;
    @XmlElement(name = "FfpCardNo")
    protected String ffpCardNo;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "CardStatus")
    protected String cardStatus;
    @XmlElement(name = "IsBinding")
    protected String isBinding;
    @XmlElement(name = "Mileages", required = true)
    protected BigDecimal mileages;

    /**
     * 获取memberNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNo() {
        return memberNo;
    }

    /**
     * 设置memberNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNo(String value) {
        this.memberNo = value;
    }

    /**
     * 获取ffpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpId() {
        return ffpId;
    }

    /**
     * 设置ffpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpId(String value) {
        this.ffpId = value;
    }

    /**
     * 获取ffpCardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpCardType() {
        return ffpCardType;
    }

    /**
     * 设置ffpCardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpCardType(String value) {
        this.ffpCardType = value;
    }

    /**
     * 获取ffpCardLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpCardLevel() {
        return ffpCardLevel;
    }

    /**
     * 设置ffpCardLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpCardLevel(String value) {
        this.ffpCardLevel = value;
    }

    /**
     * 获取ffpCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpCardNo() {
        return ffpCardNo;
    }

    /**
     * 设置ffpCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpCardNo(String value) {
        this.ffpCardNo = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取cardStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * 设置cardStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * 获取isBinding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBinding() {
        return isBinding;
    }

    /**
     * 设置isBinding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBinding(String value) {
        this.isBinding = value;
    }

    /**
     * 获取mileages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMileages() {
        return mileages;
    }

    /**
     * 设置mileages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMileages(BigDecimal value) {
        this.mileages = value;
    }

}
