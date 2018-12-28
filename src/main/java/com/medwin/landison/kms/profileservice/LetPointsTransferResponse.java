
package com.medwin.landison.kms.profileservice;

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
 *         &lt;element name="LetPointsTransferResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "letPointsTransferResult"
})
@XmlRootElement(name = "LetPointsTransferResponse")
public class LetPointsTransferResponse {

    @XmlElement(name = "LetPointsTransferResult")
    protected boolean letPointsTransferResult;

    /**
     * 获取letPointsTransferResult属性的值。
     * 
     */
    public boolean isLetPointsTransferResult() {
        return letPointsTransferResult;
    }

    /**
     * 设置letPointsTransferResult属性的值。
     * 
     */
    public void setLetPointsTransferResult(boolean value) {
        this.letPointsTransferResult = value;
    }

}
