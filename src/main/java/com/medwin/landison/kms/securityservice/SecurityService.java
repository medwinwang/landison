package com.medwin.landison.kms.securityservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-10-17T14:29:49.602+08:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "SecurityService",
                  wsdlLocation = "file:/E:/github/landison/src/main/java/com/medwin/landison/kms/securityservice/SecurityService.asmx",
                  targetNamespace = "http://www.shijinet.com.cn/kunlun/kws/1.1/")
public class SecurityService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.shijinet.com.cn/kunlun/kws/1.1/", "SecurityService");
    public final static QName SecurityServiceSoap = new QName("http://www.shijinet.com.cn/kunlun/kws/1.1/", "SecurityServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/github/landison/src/main/java/com/medwin/landison/kms/securityservice/SecurityService.asmx");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SecurityService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/E:/github/landison/src/main/java/com/medwin/landison/kms/securityservice/SecurityService.asmx");
        }
        WSDL_LOCATION = url;
    }

    public SecurityService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SecurityService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SecurityService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SecurityService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SecurityService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SecurityService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SecurityServiceSoap
     */
    @WebEndpoint(name = "SecurityServiceSoap")
    public SecurityServiceSoap getSecurityServiceSoap() {
        return super.getPort(SecurityServiceSoap, SecurityServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SecurityServiceSoap
     */
    @WebEndpoint(name = "SecurityServiceSoap")
    public SecurityServiceSoap getSecurityServiceSoap(WebServiceFeature... features) {
        return super.getPort(SecurityServiceSoap, SecurityServiceSoap.class, features);
    }

}
