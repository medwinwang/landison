
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetMessageTempletsOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetMessageTempletsOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageTemplets" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfMessageTemplet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessageTempletsOut", propOrder = {
    "messageTemplets"
})
public class GetMessageTempletsOut {

    @XmlElement(name = "MessageTemplets")
    protected ArrayOfMessageTemplet messageTemplets;

    /**
     * ��ȡmessageTemplets���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessageTemplet }
     *     
     */
    public ArrayOfMessageTemplet getMessageTemplets() {
        return messageTemplets;
    }

    /**
     * ����messageTemplets���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessageTemplet }
     *     
     */
    public void setMessageTemplets(ArrayOfMessageTemplet value) {
        this.messageTemplets = value;
    }

}
