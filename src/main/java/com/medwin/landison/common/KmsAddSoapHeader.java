package com.medwin.landison.common;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * Created by medwin on 2018/10/17.
 */
@Component
public class KmsAddSoapHeader extends AbstractSoapInterceptor  {

    @Autowired
    private KmsConfig kmsConfig;

    private static final String NAMESPACE_URI = "http://www.shijinet.com.cn/kunlun/kws/1.1/";
    private static final String QNAME = "KwsSoapHeader";


    public KmsAddSoapHeader(){
        super(Phase.WRITE);
    }

    public KmsAddSoapHeader(String p) {
        super(p);
    }

    public KmsAddSoapHeader(String i, String p) {
        super(i, p);
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {

        QName qname=new QName(QNAME);

        Document doc= DOMUtils.createDocument();
        //自定义节点
        Element sessionId=doc.createElement("SessionId");
        sessionId.setTextContent(kmsConfig.getSessionId());


        Element root=doc.createElementNS(NAMESPACE_URI, QNAME);
        root.appendChild(sessionId);

        SoapHeader head=new SoapHeader(qname,root);
        List<Header> headers=soapMessage.getHeaders();

        headers.add(head);

    }
}
