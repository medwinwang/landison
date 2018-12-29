
package com.medwin.landison.kms.reservationservice;

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
 *         &lt;element name="ChangeReservationStatusResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "changeReservationStatusResult"
})
@XmlRootElement(name = "ChangeReservationStatusResponse")
public class ChangeReservationStatusResponse {

    @XmlElement(name = "ChangeReservationStatusResult")
    protected boolean changeReservationStatusResult;

    /**
     * 获取changeReservationStatusResult属性的值。
     * 
     */
    public boolean isChangeReservationStatusResult() {
        return changeReservationStatusResult;
    }

    /**
     * 设置changeReservationStatusResult属性的值。
     * 
     */
    public void setChangeReservationStatusResult(boolean value) {
        this.changeReservationStatusResult = value;
    }

}
