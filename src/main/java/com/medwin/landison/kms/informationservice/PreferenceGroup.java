
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PreferenceGroup complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PreferenceGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Preferences" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfPreference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferenceGroup", propOrder = {
    "preferences"
})
public class PreferenceGroup
    extends CommonInfo
{

    @XmlElement(name = "Preferences")
    protected ArrayOfPreference preferences;

    /**
     * ��ȡpreferences���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPreference }
     *     
     */
    public ArrayOfPreference getPreferences() {
        return preferences;
    }

    /**
     * ����preferences���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPreference }
     *     
     */
    public void setPreferences(ArrayOfPreference value) {
        this.preferences = value;
    }

}
