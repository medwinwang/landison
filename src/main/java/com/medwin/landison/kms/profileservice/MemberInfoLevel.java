
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MemberInfoLevel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MemberInfoLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignUpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CurrentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RuleToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CurrentNumberOfRoomRev" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CurrentNights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CurrentTotalRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CurrentPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CurrentRfbRev" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LifeTimePoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LifeTimeNights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MemberNextLevelList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfMemberNextLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberInfoLevel", propOrder = {
    "signUpDate",
    "expireDate",
    "currentLevel",
    "assessmentYear",
    "ruleFromDate",
    "ruleToDate",
    "currentNumberOfRoomRev",
    "currentNights",
    "currentTotalRev",
    "currentPoints",
    "currentRfbRev",
    "lifeTimePoints",
    "lifeTimeNights",
    "memberNextLevelList"
})
public class MemberInfoLevel
    extends BaseInfo
{

    @XmlElement(name = "SignUpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signUpDate;
    @XmlElement(name = "ExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(name = "CurrentLevel")
    protected String currentLevel;
    @XmlElement(name = "AssessmentYear")
    protected String assessmentYear;
    @XmlElement(name = "RuleFromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ruleFromDate;
    @XmlElement(name = "RuleToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ruleToDate;
    @XmlElement(name = "CurrentNumberOfRoomRev")
    protected int currentNumberOfRoomRev;
    @XmlElement(name = "CurrentNights")
    protected int currentNights;
    @XmlElement(name = "CurrentTotalRev", required = true)
    protected BigDecimal currentTotalRev;
    @XmlElement(name = "CurrentPoints")
    protected int currentPoints;
    @XmlElement(name = "CurrentRfbRev", required = true)
    protected BigDecimal currentRfbRev;
    @XmlElement(name = "LifeTimePoints")
    protected int lifeTimePoints;
    @XmlElement(name = "LifeTimeNights")
    protected int lifeTimeNights;
    @XmlElement(name = "MemberNextLevelList")
    protected ArrayOfMemberNextLevel memberNextLevelList;

    /**
     * 获取signUpDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignUpDate() {
        return signUpDate;
    }

    /**
     * 设置signUpDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignUpDate(XMLGregorianCalendar value) {
        this.signUpDate = value;
    }

    /**
     * 获取expireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * 设置expireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * 获取currentLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLevel() {
        return currentLevel;
    }

    /**
     * 设置currentLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLevel(String value) {
        this.currentLevel = value;
    }

    /**
     * 获取assessmentYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentYear() {
        return assessmentYear;
    }

    /**
     * 设置assessmentYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentYear(String value) {
        this.assessmentYear = value;
    }

    /**
     * 获取ruleFromDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRuleFromDate() {
        return ruleFromDate;
    }

    /**
     * 设置ruleFromDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRuleFromDate(XMLGregorianCalendar value) {
        this.ruleFromDate = value;
    }

    /**
     * 获取ruleToDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRuleToDate() {
        return ruleToDate;
    }

    /**
     * 设置ruleToDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRuleToDate(XMLGregorianCalendar value) {
        this.ruleToDate = value;
    }

    /**
     * 获取currentNumberOfRoomRev属性的值。
     * 
     */
    public int getCurrentNumberOfRoomRev() {
        return currentNumberOfRoomRev;
    }

    /**
     * 设置currentNumberOfRoomRev属性的值。
     * 
     */
    public void setCurrentNumberOfRoomRev(int value) {
        this.currentNumberOfRoomRev = value;
    }

    /**
     * 获取currentNights属性的值。
     * 
     */
    public int getCurrentNights() {
        return currentNights;
    }

    /**
     * 设置currentNights属性的值。
     * 
     */
    public void setCurrentNights(int value) {
        this.currentNights = value;
    }

    /**
     * 获取currentTotalRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentTotalRev() {
        return currentTotalRev;
    }

    /**
     * 设置currentTotalRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentTotalRev(BigDecimal value) {
        this.currentTotalRev = value;
    }

    /**
     * 获取currentPoints属性的值。
     * 
     */
    public int getCurrentPoints() {
        return currentPoints;
    }

    /**
     * 设置currentPoints属性的值。
     * 
     */
    public void setCurrentPoints(int value) {
        this.currentPoints = value;
    }

    /**
     * 获取currentRfbRev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRfbRev() {
        return currentRfbRev;
    }

    /**
     * 设置currentRfbRev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRfbRev(BigDecimal value) {
        this.currentRfbRev = value;
    }

    /**
     * 获取lifeTimePoints属性的值。
     * 
     */
    public int getLifeTimePoints() {
        return lifeTimePoints;
    }

    /**
     * 设置lifeTimePoints属性的值。
     * 
     */
    public void setLifeTimePoints(int value) {
        this.lifeTimePoints = value;
    }

    /**
     * 获取lifeTimeNights属性的值。
     * 
     */
    public int getLifeTimeNights() {
        return lifeTimeNights;
    }

    /**
     * 设置lifeTimeNights属性的值。
     * 
     */
    public void setLifeTimeNights(int value) {
        this.lifeTimeNights = value;
    }

    /**
     * 获取memberNextLevelList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMemberNextLevel }
     *     
     */
    public ArrayOfMemberNextLevel getMemberNextLevelList() {
        return memberNextLevelList;
    }

    /**
     * 设置memberNextLevelList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMemberNextLevel }
     *     
     */
    public void setMemberNextLevelList(ArrayOfMemberNextLevel value) {
        this.memberNextLevelList = value;
    }

}
