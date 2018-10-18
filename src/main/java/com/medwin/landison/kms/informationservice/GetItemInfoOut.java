
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetItemInfoOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetItemInfoOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfItemInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemInfoOut", propOrder = {
    "itemInfos"
})
public class GetItemInfoOut {

    @XmlElement(name = "ItemInfos")
    protected ArrayOfItemInfo itemInfos;

    /**
     * ��ȡitemInfos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemInfo }
     *     
     */
    public ArrayOfItemInfo getItemInfos() {
        return itemInfos;
    }

    /**
     * ����itemInfos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemInfo }
     *     
     */
    public void setItemInfos(ArrayOfItemInfo value) {
        this.itemInfos = value;
    }

}
