
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetPlacesOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetPlacesOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Places" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfCommonInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPlacesOut", propOrder = {
    "places"
})
public class GetPlacesOut {

    @XmlElement(name = "Places")
    protected ArrayOfCommonInfo places;

    /**
     * ��ȡplaces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public ArrayOfCommonInfo getPlaces() {
        return places;
    }

    /**
     * ����places���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonInfo }
     *     
     */
    public void setPlaces(ArrayOfCommonInfo value) {
        this.places = value;
    }

}
