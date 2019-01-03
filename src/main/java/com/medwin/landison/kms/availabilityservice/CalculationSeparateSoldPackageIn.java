
package com.medwin.landison.kms.availabilityservice;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>CalculationSeparateSoldPackageIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CalculationSeparateSoldPackageIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rooms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationSeparateSoldPackageIn", propOrder = {
    "packageCode",
    "quantity",
    "arrival",
    "departure",
    "adults",
    "children",
    "rooms",
    "hotelCode",
    "beginDate",
    "endDate"
})
public class CalculationSeparateSoldPackageIn {

    @XmlElement(name = "PackageCode")
    protected String packageCode;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "Arrival", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date arrival;
    @XmlElement(name = "Departure", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date departure;
    @XmlElement(name = "Adults")
    protected int adults;
    @XmlElement(name = "Children")
    protected int children;
    @XmlElement(name = "Rooms")
    protected int rooms;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "BeginDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date beginDate;
    @XmlElement(name = "EndDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;

    /**
     * 获取packageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * 设置packageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCode(String value) {
        this.packageCode = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * 获取arrival属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getArrival() {
        return arrival;
    }

    /**
     * 设置arrival属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrival(Date value) {
        this.arrival = value;
    }

    /**
     * 获取departure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDeparture() {
        return departure;
    }

    /**
     * 设置departure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparture(Date value) {
        this.departure = value;
    }

    /**
     * 获取adults属性的值。
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * 设置adults属性的值。
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * 获取children属性的值。
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * 设置children属性的值。
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * 获取rooms属性的值。
     * 
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * 设置rooms属性的值。
     * 
     */
    public void setRooms(int value) {
        this.rooms = value;
    }

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * 获取beginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置beginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(Date value) {
        this.beginDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

}
