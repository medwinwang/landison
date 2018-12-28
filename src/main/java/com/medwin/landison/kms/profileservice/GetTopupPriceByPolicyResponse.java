
package com.medwin.landison.kms.profileservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetTopupPriceByPolicyResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTopupPriceByPolicyResult"
})
@XmlRootElement(name = "GetTopupPriceByPolicyResponse")
public class GetTopupPriceByPolicyResponse {

    @XmlElement(name = "GetTopupPriceByPolicyResult", required = true)
    protected BigDecimal getTopupPriceByPolicyResult;

    /**
     * 获取getTopupPriceByPolicyResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGetTopupPriceByPolicyResult() {
        return getTopupPriceByPolicyResult;
    }

    /**
     * 设置getTopupPriceByPolicyResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGetTopupPriceByPolicyResult(BigDecimal value) {
        this.getTopupPriceByPolicyResult = value;
    }

}
