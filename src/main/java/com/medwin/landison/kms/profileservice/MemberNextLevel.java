
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MemberNextLevel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MemberNextLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleNumberOfRoomRev" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NeedNumberOfRoomRev" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RuleNights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NeedNights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RuleTotalRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NeedTotalRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RulePoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NeedPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RuleRfbRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NeedRfbRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberNextLevel", propOrder = {
    "targetLevel",
    "ruleNumberOfRoomRev",
    "needNumberOfRoomRev",
    "ruleNights",
    "needNights",
    "ruleTotalRev",
    "needTotalRev",
    "rulePoints",
    "needPoints",
    "ruleRfbRev",
    "needRfbRev"
})
public class MemberNextLevel
    extends BaseInfo
{

    @XmlElement(name = "TargetLevel")
    protected String targetLevel;
    @XmlElement(name = "RuleNumberOfRoomRev")
    protected int ruleNumberOfRoomRev;
    @XmlElement(name = "NeedNumberOfRoomRev")
    protected int needNumberOfRoomRev;
    @XmlElement(name = "RuleNights")
    protected int ruleNights;
    @XmlElement(name = "NeedNights")
    protected int needNights;
    @XmlElement(name = "RuleTotalRev", required = true)
    protected BigDecimal ruleTotalRev;
    @XmlElement(name = "NeedTotalRev", required = true)
    protected BigDecimal needTotalRev;
    @XmlElement(name = "RulePoints")
    protected int rulePoints;
    @XmlElement(name = "NeedPoints")
    protected int needPoints;
    @XmlElement(name = "RuleRfbRev", required = true)
    protected BigDecimal ruleRfbRev;
    @XmlElement(name = "NeedRfbRev", required = true)
    protected BigDecimal needRfbRev;

    /**
     * 获取targetLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetLevel() {
        return targetLevel;
    }

    /**
     * 设置targetLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetLevel(String value) {
        this.targetLevel = value;
    }

    /**
     * 获取ruleNumberOfRoomRev属性的值。
     * 
     */
    public int getRuleNumberOfRoomRev() {
        return ruleNumberOfRoomRev;
    }

    /**
     * 设置ruleNumberOfRoomRev属性的值。
     * 
     */
    public void setRuleNumberOfRoomRev(int value) {
        this.ruleNumberOfRoomRev = value;
    }

    /**
     * 获取needNumberOfRoomRev属性的值。
     * 
     */
    public int getNeedNumberOfRoomRev() {
        return needNumberOfRoomRev;
    }

    /**
     * 设置needNumberOfRoomRev属性的值。
     * 
     */
    public void setNeedNumberOfRoomRev(int value) {
        this.needNumberOfRoomRev = value;
    }

    /**
     * 获取ruleNights属性的值。
     * 
     */
    public int getRuleNights() {
        return ruleNights;
    }

    /**
     * 设置ruleNights属性的值。
     * 
     */
    public void setRuleNights(int value) {
        this.ruleNights = value;
    }

    /**
     * 获取needNights属性的值。
     * 
     */
    public int getNeedNights() {
        return needNights;
    }

    /**
     * 设置needNights属性的值。
     * 
     */
    public void setNeedNights(int value) {
        this.needNights = value;
    }

    /**
     * 获取ruleTotalRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRuleTotalRev() {
        return ruleTotalRev;
    }

    /**
     * 设置ruleTotalRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRuleTotalRev(BigDecimal value) {
        this.ruleTotalRev = value;
    }

    /**
     * 获取needTotalRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNeedTotalRev() {
        return needTotalRev;
    }

    /**
     * 设置needTotalRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNeedTotalRev(BigDecimal value) {
        this.needTotalRev = value;
    }

    /**
     * 获取rulePoints属性的值。
     * 
     */
    public int getRulePoints() {
        return rulePoints;
    }

    /**
     * 设置rulePoints属性的值。
     * 
     */
    public void setRulePoints(int value) {
        this.rulePoints = value;
    }

    /**
     * 获取needPoints属性的值。
     * 
     */
    public int getNeedPoints() {
        return needPoints;
    }

    /**
     * 设置needPoints属性的值。
     * 
     */
    public void setNeedPoints(int value) {
        this.needPoints = value;
    }

    /**
     * 获取ruleRfbRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRuleRfbRev() {
        return ruleRfbRev;
    }

    /**
     * 设置ruleRfbRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRuleRfbRev(BigDecimal value) {
        this.ruleRfbRev = value;
    }

    /**
     * 获取needRfbRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNeedRfbRev() {
        return needRfbRev;
    }

    /**
     * 设置needRfbRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNeedRfbRev(BigDecimal value) {
        this.needRfbRev = value;
    }

}
