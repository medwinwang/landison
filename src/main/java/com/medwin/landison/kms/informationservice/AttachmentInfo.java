
package com.medwin.landison.kms.informationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AttachmentInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AttachmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Obj_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Obj_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Origin_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="File_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="File_Extend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Path_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Web_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Local_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="File_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Upload_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Upload_User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentInfo", propOrder = {
    "id",
    "objID",
    "objName",
    "originName",
    "fileName",
    "fileExtend",
    "pathType",
    "webPath",
    "localPath",
    "fileDesc",
    "uploadDate",
    "uploadUser"
})
public class AttachmentInfo
    extends BaseInfo
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Obj_ID")
    protected String objID;
    @XmlElement(name = "Obj_Name")
    protected String objName;
    @XmlElement(name = "Origin_Name")
    protected String originName;
    @XmlElement(name = "File_Name")
    protected String fileName;
    @XmlElement(name = "File_Extend")
    protected String fileExtend;
    @XmlElement(name = "Path_Type")
    protected String pathType;
    @XmlElement(name = "Web_Path")
    protected String webPath;
    @XmlElement(name = "Local_Path")
    protected String localPath;
    @XmlElement(name = "File_Desc")
    protected String fileDesc;
    @XmlElement(name = "Upload_Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar uploadDate;
    @XmlElement(name = "Upload_User")
    protected String uploadUser;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * ��ȡobjID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjID() {
        return objID;
    }

    /**
     * ����objID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjID(String value) {
        this.objID = value;
    }

    /**
     * ��ȡobjName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjName() {
        return objName;
    }

    /**
     * ����objName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjName(String value) {
        this.objName = value;
    }

    /**
     * ��ȡoriginName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * ����originName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginName(String value) {
        this.originName = value;
    }

    /**
     * ��ȡfileName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * ����fileName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * ��ȡfileExtend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtend() {
        return fileExtend;
    }

    /**
     * ����fileExtend���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtend(String value) {
        this.fileExtend = value;
    }

    /**
     * ��ȡpathType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathType() {
        return pathType;
    }

    /**
     * ����pathType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathType(String value) {
        this.pathType = value;
    }

    /**
     * ��ȡwebPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPath() {
        return webPath;
    }

    /**
     * ����webPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPath(String value) {
        this.webPath = value;
    }

    /**
     * ��ȡlocalPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * ����localPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPath(String value) {
        this.localPath = value;
    }

    /**
     * ��ȡfileDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDesc() {
        return fileDesc;
    }

    /**
     * ����fileDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDesc(String value) {
        this.fileDesc = value;
    }

    /**
     * ��ȡuploadDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUploadDate() {
        return uploadDate;
    }

    /**
     * ����uploadDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUploadDate(XMLGregorianCalendar value) {
        this.uploadDate = value;
    }

    /**
     * ��ȡuploadUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadUser() {
        return uploadUser;
    }

    /**
     * ����uploadUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadUser(String value) {
        this.uploadUser = value;
    }

}
