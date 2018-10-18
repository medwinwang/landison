package com.medwin.landison.common;

import com.medwin.landison.config.KmsConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.helpers.DOMUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.StringWriter;
import java.util.Set;

/**
 * Created by medwin on 2018/10/17.
 */
@Component
@Slf4j
public class KmsClientHandler implements SOAPHandler<SOAPMessageContext> {

    @Autowired
    private KmsConfig kmsConfig;

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        if(!StringUtils.isEmpty(kmsConfig.getSessionId())) {

            QName qname=new QName("KwsSoapHeader");

            Document doc= DOMUtils.createDocument();
            //自定义节点
            Element sessionId=doc.createElement("SessionId");
            sessionId.setTextContent(kmsConfig.getSessionId());


            Element root=doc.createElementNS("http://www.shijinet.com.cn/kunlun/kws/1.1/", "KwsSoapHeader");
            root.appendChild(sessionId);


            try {
//                SOAPHeader head=new Header1_2Impl(context.getMessage().getSOAPHeader().getOwnerDocument(),root);

                context.getMessage().getSOAPPart().getEnvelope().getHeader();

            } catch (SOAPException e) {
                e.printStackTrace();
            }
        }

        log.info(convertDomToString(context.getMessage().getSOAPPart()));

        try {
            SOAPHeader soapHeader = context.getMessage().getSOAPHeader();
            if(soapHeader != null ) {
                NodeList nodeList = soapHeader.getOwnerDocument().getElementsByTagName("SessionId");
                if (nodeList.getLength() > 0) {
                    kmsConfig.setSessionId(nodeList.item(0).getTextContent());
                }
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }

    private String convertToXml(Object obj) {
        // 创建输出流
        StringWriter sw = new StringWriter();
        try {
            // 利用jdk中自带的转换类实现
            JAXBContext context = JAXBContext.newInstance(obj.getClass());

            Marshaller marshaller = context.createMarshaller();
            // 格式化xml输出的格式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);
            // 将对象转换成输出流形式的xml
            marshaller.marshal(obj, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return sw.toString();
    }

    private String convertDomToString(SOAPPart soap){
        final StringWriter sw = new StringWriter();
        try {
            TransformerFactory.newInstance().newTransformer().transform(
                    new DOMSource(soap),
                    new StreamResult(sw));
        } catch (TransformerException e) {
            // do something
        }
        return sw.toString();
    }

}
