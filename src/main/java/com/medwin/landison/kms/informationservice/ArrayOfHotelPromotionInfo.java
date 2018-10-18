
package com.medwin.landison.kms.informationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelPromotionInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelPromotionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelPromotionInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}HotelPromotionInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelPromotionInfo", propOrder = {
    "hotelPromotionInfo"
})
public class ArrayOfHotelPromotionInfo {

    @XmlElement(name = "HotelPromotionInfo", nillable = true)
    protected List<HotelPromotionInfo> hotelPromotionInfo;

    /**
     * Gets the value of the hotelPromotionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelPromotionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelPromotionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelPromotionInfo }
     * 
     * 
     */
    public List<HotelPromotionInfo> getHotelPromotionInfo() {
        if (hotelPromotionInfo == null) {
            hotelPromotionInfo = new ArrayList<HotelPromotionInfo>();
        }
        return this.hotelPromotionInfo;
    }

}
