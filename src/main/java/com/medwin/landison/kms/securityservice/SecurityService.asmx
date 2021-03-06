<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.shijinet.com.cn/kunlun/kws/1.1/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://www.shijinet.com.cn/kunlun/kws/1.1/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.shijinet.com.cn/kunlun/kws/1.1/">
      <s:element name="AppLogin">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="encryptMethod" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AppLoginResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AppLoginResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="KwsSoapHeader" type="tns:KwsSoapHeader" />
      <s:complexType name="KwsSoapHeader">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="SessionId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RetCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ErrReason" type="s:string" />
        </s:sequence>
        <s:anyAttribute />
      </s:complexType>
      <s:element name="AppLoginOut">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AppLoginOutResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AppLoginOutResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AppModifyPw">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="newpassword" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AppModifyPwResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AppModifyPwResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="AppLoginSoapIn">
    <wsdl:part name="parameters" element="tns:AppLogin" />
  </wsdl:message>
  <wsdl:message name="AppLoginSoapOut">
    <wsdl:part name="parameters" element="tns:AppLoginResponse" />
  </wsdl:message>
  <wsdl:message name="AppLoginKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="AppLoginOutSoapIn">
    <wsdl:part name="parameters" element="tns:AppLoginOut" />
  </wsdl:message>
  <wsdl:message name="AppLoginOutSoapOut">
    <wsdl:part name="parameters" element="tns:AppLoginOutResponse" />
  </wsdl:message>
  <wsdl:message name="AppLoginOutKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="AppModifyPwSoapIn">
    <wsdl:part name="parameters" element="tns:AppModifyPw" />
  </wsdl:message>
  <wsdl:message name="AppModifyPwSoapOut">
    <wsdl:part name="parameters" element="tns:AppModifyPwResponse" />
  </wsdl:message>
  <wsdl:message name="AppModifyPwKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:portType name="SecurityServiceSoap">
    <wsdl:operation name="AppLogin">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">系统用户登录</wsdl:documentation>
      <wsdl:input message="tns:AppLoginSoapIn" />
      <wsdl:output message="tns:AppLoginSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AppLoginOut">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">系统用户登出注销Ver2.8SP420110630</wsdl:documentation>
      <wsdl:input message="tns:AppLoginOutSoapIn" />
      <wsdl:output message="tns:AppLoginOutSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AppModifyPw">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">系统用户修改密码</wsdl:documentation>
      <wsdl:input message="tns:AppModifyPwSoapIn" />
      <wsdl:output message="tns:AppModifyPwSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="SecurityServiceSoap" type="tns:SecurityServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="AppLogin">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/AppLogin" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:AppLoginKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AppLoginOut">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/AppLoginOut" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AppLoginOutKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:AppLoginOutKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AppModifyPw">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/AppModifyPw" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:AppModifyPwKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="SecurityService">
    <wsdl:port name="SecurityServiceSoap" binding="tns:SecurityServiceSoap">
      <soap:address location="http://116.62.146.178:9000/KWS_TRAIN/SecurityService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>