
package com.medwin.landison.kms.reservationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Party complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Party"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartyAction" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}PartyAction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", propOrder = {
    "partyNo",
    "partyAction"
})
public class Party {

    @XmlElement(name = "PartyNo")
    protected String partyNo;
    @XmlElement(name = "PartyAction", required = true)
    @XmlSchemaType(name = "string")
    protected PartyAction partyAction;

    /**
     * 获取partyNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNo() {
        return partyNo;
    }

    /**
     * 设置partyNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNo(String value) {
        this.partyNo = value;
    }

    /**
     * 获取partyAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyAction }
     *     
     */
    public PartyAction getPartyAction() {
        return partyAction;
    }

    /**
     * 设置partyAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAction }
     *     
     */
    public void setPartyAction(PartyAction value) {
        this.partyAction = value;
    }

}
