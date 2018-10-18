
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
 *         &lt;element name="CheckHotelInterfaceResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "checkHotelInterfaceResult"
})
@XmlRootElement(name = "CheckHotelInterfaceResponse")
public class CheckHotelInterfaceResponse {

    @XmlElement(name = "CheckHotelInterfaceResult")
    protected boolean checkHotelInterfaceResult;

    /**
     * 获取checkHotelInterfaceResult属性的值。
     * 
     */
    public boolean isCheckHotelInterfaceResult() {
        return checkHotelInterfaceResult;
    }

    /**
     * 设置checkHotelInterfaceResult属性的值。
     * 
     */
    public void setCheckHotelInterfaceResult(boolean value) {
        this.checkHotelInterfaceResult = value;
    }

}
