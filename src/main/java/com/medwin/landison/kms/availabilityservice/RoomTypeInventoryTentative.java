
package com.medwin.landison.kms.availabilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomTypeInventoryTentative complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomTypeInventoryTentative"&gt;
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
@XmlType(name = "RoomTypeInventoryTentative", propOrder = {
    "count",
    "blockCount",
    "resvCount"
})
public class RoomTypeInventoryTentative {

    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "BlockCount")
    protected int blockCount;
    @XmlElement(name = "ResvCount")
    protected int resvCount;

    /**
     * 获取count属性的值。
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * 获取blockCount属性的值。
     * 
     */
    public int getBlockCount() {
        return blockCount;
    }

    /**
     * 设置blockCount属性的值。
     * 
     */
    public void setBlockCount(int value) {
        this.blockCount = value;
    }

    /**
     * 获取resvCount属性的值。
     * 
     */
    public int getResvCount() {
        return resvCount;
    }

    /**
     * 设置resvCount属性的值。
     * 
     */
    public void setResvCount(int value) {
        this.resvCount = value;
    }

}
