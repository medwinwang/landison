
package com.medwin.landison.kms.profileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PreferenceGroup complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取preferences属性的值。
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
     * 设置preferences属性的值。
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
