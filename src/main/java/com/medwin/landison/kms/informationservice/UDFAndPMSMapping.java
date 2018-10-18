
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UDFAndPMSMapping complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UDFAndPMSMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CrsTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CrsColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Show" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDFAndPMSMapping", propOrder = {
    "id",
    "hotelCode",
    "moduleName",
    "crsTable",
    "crsColumn",
    "pmsTable",
    "pmsColumn",
    "direction",
    "des",
    "show"
})
public class UDFAndPMSMapping {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "ModuleName")
    protected String moduleName;
    @XmlElement(name = "CrsTable")
    protected String crsTable;
    @XmlElement(name = "CrsColumn")
    protected String crsColumn;
    @XmlElement(name = "PmsTable")
    protected String pmsTable;
    @XmlElement(name = "PmsColumn")
    protected String pmsColumn;
    @XmlElement(name = "Direction")
    protected int direction;
    @XmlElement(name = "Des")
    protected String des;
    @XmlElement(name = "Show")
    protected String show;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * ��ȡhotelCode���Ե�ֵ��
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
     * ����hotelCode���Ե�ֵ��
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
     * ��ȡmoduleName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * ����moduleName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * ��ȡcrsTable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrsTable() {
        return crsTable;
    }

    /**
     * ����crsTable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrsTable(String value) {
        this.crsTable = value;
    }

    /**
     * ��ȡcrsColumn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrsColumn() {
        return crsColumn;
    }

    /**
     * ����crsColumn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrsColumn(String value) {
        this.crsColumn = value;
    }

    /**
     * ��ȡpmsTable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsTable() {
        return pmsTable;
    }

    /**
     * ����pmsTable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsTable(String value) {
        this.pmsTable = value;
    }

    /**
     * ��ȡpmsColumn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsColumn() {
        return pmsColumn;
    }

    /**
     * ����pmsColumn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsColumn(String value) {
        this.pmsColumn = value;
    }

    /**
     * ��ȡdirection���Ե�ֵ��
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * ����direction���Ե�ֵ��
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

    /**
     * ��ȡdes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDes() {
        return des;
    }

    /**
     * ����des���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDes(String value) {
        this.des = value;
    }

    /**
     * ��ȡshow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * ����show���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

}
