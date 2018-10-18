
package com.medwin.landison.kms.securityservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.medwin.landison.kms.securityservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KwsSoapHeader_QNAME = new QName("http://www.shijinet.com.cn/kunlun/kws/1.1/", "KwsSoapHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.medwin.landison.kms.securityservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppLogin }
     * 
     */
    public AppLogin createAppLogin() {
        return new AppLogin();
    }

    /**
     * Create an instance of {@link AppLoginResponse }
     * 
     */
    public AppLoginResponse createAppLoginResponse() {
        return new AppLoginResponse();
    }

    /**
     * Create an instance of {@link KwsSoapHeader }
     * 
     */
    public KwsSoapHeader createKwsSoapHeader() {
        return new KwsSoapHeader();
    }

    /**
     * Create an instance of {@link AppLoginOut }
     * 
     */
    public AppLoginOut createAppLoginOut() {
        return new AppLoginOut();
    }

    /**
     * Create an instance of {@link AppLoginOutResponse }
     * 
     */
    public AppLoginOutResponse createAppLoginOutResponse() {
        return new AppLoginOutResponse();
    }

    /**
     * Create an instance of {@link AppModifyPw }
     * 
     */
    public AppModifyPw createAppModifyPw() {
        return new AppModifyPw();
    }

    /**
     * Create an instance of {@link AppModifyPwResponse }
     * 
     */
    public AppModifyPwResponse createAppModifyPwResponse() {
        return new AppModifyPwResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KwsSoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.shijinet.com.cn/kunlun/kws/1.1/", name = "KwsSoapHeader")
    public JAXBElement<KwsSoapHeader> createKwsSoapHeader(KwsSoapHeader value) {
        return new JAXBElement<KwsSoapHeader>(_KwsSoapHeader_QNAME, KwsSoapHeader.class, null, value);
    }

}
