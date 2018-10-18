
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomRateDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomRateDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomTypeDetail" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}RoomTypeDetail" minOccurs="0"/&gt;
 *         &lt;element name="RateDetailDailys" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfRateDetailDaily" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRateDetail", propOrder = {
    "roomTypeDetail",
    "rateDetailDailys"
})
public class RoomRateDetail {

    @XmlElement(name = "RoomTypeDetail")
    protected RoomTypeDetail roomTypeDetail;
    @XmlElement(name = "RateDetailDailys")
    protected ArrayOfRateDetailDaily rateDetailDailys;

    /**
     * 获取roomTypeDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomTypeDetail }
     *     
     */
    public RoomTypeDetail getRoomTypeDetail() {
        return roomTypeDetail;
    }

    /**
     * 设置roomTypeDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypeDetail }
     *     
     */
    public void setRoomTypeDetail(RoomTypeDetail value) {
        this.roomTypeDetail = value;
    }

    /**
     * 获取rateDetailDailys属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateDetailDaily }
     *     
     */
    public ArrayOfRateDetailDaily getRateDetailDailys() {
        return rateDetailDailys;
    }

    /**
     * 设置rateDetailDailys属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateDetailDaily }
     *     
     */
    public void setRateDetailDailys(ArrayOfRateDetailDaily value) {
        this.rateDetailDailys = value;
    }

}
