
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomTypeInventoryDefinite complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RoomTypeInventoryDefinite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BlockCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResvCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypeInventoryDefinite", propOrder = {
    "count",
    "blockCount",
    "resvCount"
})
public class RoomTypeInventoryDefinite {

    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "BlockCount")
    protected int blockCount;
    @XmlElement(name = "ResvCount")
    protected int resvCount;

    /**
     * ��ȡcount���Ե�ֵ��
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * ��ȡblockCount���Ե�ֵ��
     * 
     */
    public int getBlockCount() {
        return blockCount;
    }

    /**
     * ����blockCount���Ե�ֵ��
     * 
     */
    public void setBlockCount(int value) {
        this.blockCount = value;
    }

    /**
     * ��ȡresvCount���Ե�ֵ��
     * 
     */
    public int getResvCount() {
        return resvCount;
    }

    /**
     * ����resvCount���Ե�ֵ��
     * 
     */
    public void setResvCount(int value) {
        this.resvCount = value;
    }

}
