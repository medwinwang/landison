
package com.medwin.landison.kms.securityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="AppLoginResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "appLoginResult"
})
@XmlRootElement(name = "AppLoginResponse")
public class AppLoginResponse {

    @XmlElement(name = "AppLoginResult")
    protected boolean appLoginResult;

    /**
     * ��ȡappLoginResult���Ե�ֵ��
     * 
     */
    public boolean isAppLoginResult() {
        return appLoginResult;
    }

    /**
     * ����appLoginResult���Ե�ֵ��
     * 
     */
    public void setAppLoginResult(boolean value) {
        this.appLoginResult = value;
    }

}
