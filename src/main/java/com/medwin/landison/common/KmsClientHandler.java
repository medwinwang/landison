package com.medwin.landison.common;

import com.medwin.landison.config.KmsConfig;
import com.medwin.landison.exception.KmsSystemException;
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

    public static final String RET_CODE = "RetCode";
    public static final String ERR_REASON = "ErrReason";


    @Autowired
    private KmsConfig kmsConfig;

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

//        log.info(convertDomToString(context.getMessage().getSOAPPart()));
        try {
            String point = (String) context.get("org.apache.cxf.message.Message.ENDPOINT_ADDRESS");
            SOAPHeader soapHeader = context.getMessage().getSOAPHeader();

            if(soapHeader != null ) {

                if(point.indexOf("SecurityService") != -1) {

                    String sessionId = getValueByEle(soapHeader, "SessionId");
                    if(!StringUtils.isEmpty(sessionId)){
                        kmsConfig.setSessionId(sessionId);
                    }
                } else if(point.indexOf("ReservationService") != -1){

                    String retCode = getValueByEle(soapHeader, RET_CODE);
                    if(!StringUtils.isEmpty(retCode) && !"5001".equals(retCode)) {
                        String errReason = getValueByEle(soapHeader, ERR_REASON);
                        throw new KmsSystemException(retCode, errReason);
                    }

                } else if(point.indexOf("AvailabilityService") != -1){

                    String retCode = getValueByEle(soapHeader, RET_CODE);
                    if(!StringUtils.isEmpty(retCode) && !"4001".equals(retCode)) {
                        String errReason = getValueByEle(soapHeader, ERR_REASON);
                        throw new KmsSystemException(retCode, errReason);
                    }

                } else if(point.indexOf("InformationService") != -1){

                    String retCode = getValueByEle(soapHeader, RET_CODE);
                    if(!StringUtils.isEmpty(retCode) && !"2001".equals(retCode)) {
                        String errReason = getValueByEle(soapHeader, ERR_REASON);
                        throw new KmsSystemException(retCode, errReason);
                    }

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

    private String getValueByEle(SOAPHeader header, String ele){

        NodeList nodeList = header.getOwnerDocument().getElementsByTagName(ele);
        if (nodeList.getLength() > 0) {
            return nodeList.item(0).getTextContent();
        }
        return null;
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
