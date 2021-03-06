package com.medwin.landison.kms.profileservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * 会员管理服务
 *
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-27T16:20:33.689+08:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "Profile",
                  wsdlLocation = "http://116.62.146.178:9000/KWS_TRAIN/ProfileService.asmx?wsdl",
                  targetNamespace = "http://www.shijinet.com.cn/kunlun/kws/1.1/")
public class Profile extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.shijinet.com.cn/kunlun/kws/1.1/", "Profile");
    public final static QName ProfileSoap = new QName("http://www.shijinet.com.cn/kunlun/kws/1.1/", "ProfileSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://116.62.146.178:9000/KWS_TRAIN/ProfileService.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Profile.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://116.62.146.178:9000/KWS_TRAIN/ProfileService.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Profile(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Profile(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Profile() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Profile(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Profile(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Profile(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ProfileSoap
     */
    @WebEndpoint(name = "ProfileSoap")
    public ProfileSoap getProfileSoap() {
        return super.getPort(ProfileSoap, ProfileSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProfileSoap
     */
    @WebEndpoint(name = "ProfileSoap")
    public ProfileSoap getProfileSoap(WebServiceFeature... features) {
        return super.getPort(ProfileSoap, ProfileSoap.class, features);
    }

}
