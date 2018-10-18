
package com.medwin.landison.kms.informationservice;

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
 *         &lt;element name="CheckIsCorporationResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "checkIsCorporationResult"
})
@XmlRootElement(name = "CheckIsCorporationResponse")
public class CheckIsCorporationResponse {

    @XmlElement(name = "CheckIsCorporationResult")
    protected boolean checkIsCorporationResult;

    /**
     * 获取checkIsCorporationResult属性的值。
     * 
     */
    public boolean isCheckIsCorporationResult() {
        return checkIsCorporationResult;
    }

    /**
     * 设置checkIsCorporationResult属性的值。
     * 
     */
    public void setCheckIsCorporationResult(boolean value) {
        this.checkIsCorporationResult = value;
    }

}
