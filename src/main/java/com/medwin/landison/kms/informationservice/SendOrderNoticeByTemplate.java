
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sendOrderNoticeByTemplateIn" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}SendOrderNoticeByTemplateIn" minOccurs="0"/&gt;
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
    "sendOrderNoticeByTemplateIn"
})
@XmlRootElement(name = "SendOrderNoticeByTemplate")
public class SendOrderNoticeByTemplate {

    protected SendOrderNoticeByTemplateIn sendOrderNoticeByTemplateIn;

    /**
     * ��ȡsendOrderNoticeByTemplateIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendOrderNoticeByTemplateIn }
     *     
     */
    public SendOrderNoticeByTemplateIn getSendOrderNoticeByTemplateIn() {
        return sendOrderNoticeByTemplateIn;
    }

    /**
     * ����sendOrderNoticeByTemplateIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendOrderNoticeByTemplateIn }
     *     
     */
    public void setSendOrderNoticeByTemplateIn(SendOrderNoticeByTemplateIn value) {
        this.sendOrderNoticeByTemplateIn = value;
    }

}
