<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.shijinet.com.cn/kunlun/kws/1.1/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://www.shijinet.com.cn/kunlun/kws/1.1/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.shijinet.com.cn/kunlun/kws/1.1/">
      <s:element name="GetConvertValue">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="datatype" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="flag" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetConvertValueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetConvertValueResult" type="s:string" />
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
      <s:element name="GetSingleHotelInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSingleHotelInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSingleHotelInfoResult" type="tns:HotelInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="HotelInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RecommendedLevel" type="tns:CommonInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="PicPath" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Map" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Level" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="CityCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GroupCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Area" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Tel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Currency" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelOperationType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="FullName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="InternalCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ShowVIPPlanLogo" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="SortId" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Flag" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Des" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Dt" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="DbName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EngName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Stars" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Address" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EngAddress" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="TotalRoom" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="TotalArea" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="TotalMeetingArea" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="TotalFbArea" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Province" type="tns:Province" />
          <s:element minOccurs="0" maxOccurs="1" name="Country" type="tns:Country" />
          <s:element minOccurs="0" maxOccurs="1" name="Keyword" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UniteHotels" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SalesInfo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="City" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Tags" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Email" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Mobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Phone" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Fax" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="WithGroupHotels" type="tns:CommonInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="PostCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CommonInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Country">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo" />
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Province">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Country" type="tns:Country" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetHotels">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="stars" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="address" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="keyword" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cityCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cityName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="groupCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHotelsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHotelsResult" type="tns:ArrayOfHotelInfoSummary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfHotelInfoSummary">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="HotelInfoSummary" nillable="true" type="tns:HotelInfoSummary" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="HotelInfoSummary">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PicPath" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RecommendedLevel" type="tns:CommonInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="FullName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Desc" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Keyword" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Email" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Map" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Level" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="MinPrice" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="MaxPrice" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="CommentResult" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf_5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EngName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Stars" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="StarName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Address" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EngAddress" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Country" type="tns:Country" />
          <s:element minOccurs="0" maxOccurs="1" name="Province" type="tns:Province" />
          <s:element minOccurs="0" maxOccurs="1" name="Phone" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Fax" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PostCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CityName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CityCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ShowVIPPlanLogo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="WithGroupHotels" type="tns:CommonInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetInformation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DataType" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ParentCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetInformationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetInformationResult" type="tns:ArrayOfCommonInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfCommonInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CommonInfo" nillable="true" type="tns:CommonInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetStarLevel">
        <s:complexType />
      </s:element>
      <s:element name="GetStarLevelResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetStarLevelResult" type="tns:ArrayOfStarLevel" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfStarLevel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="StarLevel" nillable="true" type="tns:StarLevel" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="StarLevel">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Level" type="s:int" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetGuaranteeRulesByRateCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="rate_code" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetGuaranteeRulesByRateCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetGuaranteeRulesByRateCodeResult" type="tns:ArrayOfGuaranteeRule" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfGuaranteeRule">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GuaranteeRule" nillable="true" type="tns:GuaranteeRule" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GuaranteeRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="OCancelRule" type="tns:CancelRule" />
              <s:element minOccurs="0" maxOccurs="1" name="ODepositRule" type="tns:DepositRules" />
              <s:element minOccurs="0" maxOccurs="1" name="Is_related_points" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="arrival_time_required" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="arrival_time" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="credit_card_required" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="deduct" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="deposit_required" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="IsPrepay" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="inactive" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="IsRelatedCardValue" type="s:boolean" />
              <s:element minOccurs="0" maxOccurs="1" name="rate_code" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="CancelRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="type" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="day_before_arrival" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="cancel_before_time" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="inactive" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="penalty_fee" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="reservation_type" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CancelRuleDetails" type="tns:ArrayOfCancelRuleDetail" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfCancelRuleDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CancelRuleDetail" nillable="true" type="tns:CancelRuleDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CancelRuleDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="type" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="day_before_arrival" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="cancel_before_time" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="penalty_fee" type="s:decimal" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DepositRules">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="type" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="deposit_amount" type="s:decimal" />
              <s:element minOccurs="1" maxOccurs="1" name="day_before_arrival" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="day_after_booking" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="inactive" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetGuaranteeRule">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetGuaranteeRuleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetGuaranteeRuleResult" type="tns:GuaranteeRule" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCountry">
        <s:complexType />
      </s:element>
      <s:element name="GetCountryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCountryResult" type="tns:ArrayOfCountry" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfCountry">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Country" nillable="true" type="tns:Country" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetCityList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="countryCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCityListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCityListResult" type="tns:ArrayOfCity" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfCity">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="City" nillable="true" type="tns:City" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="City">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Province_Code" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetProvince">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="country_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProvinceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetProvinceResult" type="tns:ArrayOfProvince" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfProvince">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Province" nillable="true" type="tns:Province" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSegment">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="parent_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSegmentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSegmentResult" type="tns:ArrayOfSegment" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfSegment">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Segment" nillable="true" type="tns:Segment" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Segment">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="mcode" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetSource">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="parent_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSourceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSourceResult" type="tns:ArrayOfSource" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfSource">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Source" nillable="true" type="tns:Source" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Source">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="mcode" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetSpecials">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="channelCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSpecialsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSpecialsResult" type="tns:ArrayOfSpecials" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfSpecials">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Specials" nillable="true" type="tns:Specials" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Specials">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Hotel" type="tns:Hotel" />
              <s:element minOccurs="0" maxOccurs="1" name="SpecialsType" type="tns:SpecialsType" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Hotel">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Eng_Name" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CityName" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SpecialsType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetCardType">
        <s:complexType />
      </s:element>
      <s:element name="GetCardTypeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCardTypeResult" type="tns:ArrayOfCardType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfCardType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CardType" nillable="true" type="tns:CardType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CardType">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Valid_FN" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetPackage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPackageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPackageResult" type="tns:Package" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="Package">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="GroupCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GroupName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Price" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="PackageType" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="PostingRhythm" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CalculationRule" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="KwsDesc" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="InputQuantityYn" type="s:boolean" />
              <s:element minOccurs="1" maxOccurs="1" name="Quantity" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="RoomTypeCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="BeginDate" nillable="true" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="EndDate" nillable="true" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="ItemInfoList" type="tns:ArrayOfItemInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="FromFlag" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfItemInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ItemInfo" nillable="true" type="tns:ItemInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ItemInfo">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Inactive" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ItemClassCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="DefaultQuantity" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="AvailableFrom" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="AvailableTo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SellSeparate" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ItemTrace" type="tns:ItemTraceInfo" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ItemTraceInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PmsDepartmentCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PmsDepartmentName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TraceText" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetRate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotelCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRateResult" type="tns:Rate" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="Rate">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="OGuaranteeRule" type="tns:ArrayOfGuaranteeRule" />
              <s:element minOccurs="0" maxOccurs="1" name="GroupType" type="tns:CommonInfo" />
              <s:element minOccurs="1" maxOccurs="1" name="Isfixedrate" type="s:boolean" />
              <s:element minOccurs="0" maxOccurs="1" name="CateCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="MinLos" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="MaxLos" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="AdvBookin" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="MaxAdvBookin" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="AvailableLimitRooms" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Des" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="BasePrice" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfPackage" />
              <s:element minOccurs="0" maxOccurs="1" name="Market" type="tns:Segment" />
              <s:element minOccurs="0" maxOccurs="1" name="Source" type="tns:Source" />
              <s:element minOccurs="0" maxOccurs="1" name="ShortInfo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="LongInfo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="IsStandard" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="IsDiscount" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SortId" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Promotion" type="tns:Promotion" />
              <s:element minOccurs="0" maxOccurs="1" name="RoomtypeCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BarRate" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BarBaseRate" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DbarRate" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DbarBaseRate" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BarGroup" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DbarGroup" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DayUse" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="BaseAmount" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="BasePercent" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BaseRounding" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BasePrecise" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BaseDigitsFrom" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BaseDigitsTo" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Yieldable" type="s:boolean" />
              <s:element minOccurs="0" maxOccurs="1" name="TaxFlag" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="TaxCharge" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="ServiceFlag" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="ServiceCharge" type="s:decimal" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfPackage">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Package" nillable="true" type="tns:Package" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Promotion">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="DiscountType" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="StayNights" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="FreeNights" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="LastNights" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="BeginTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EndTime" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Discount" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="Desc" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetLandmarkByCity">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLandmarkByCityResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLandmarkByCityResult" type="tns:ArrayOfTagsInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfTagsInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="TagsInfo" nillable="true" type="tns:TagsInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TagsInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Obj_Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Tag" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Tag_Type" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetLandmark">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="type_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="city_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLandmarkResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLandmarkResult" type="tns:ArrayOfTagsInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLandmarkByHotel">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="type_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLandmarkByHotelResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLandmarkByHotelResult" type="tns:ArrayOfTagsInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHotelUsersByCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="userCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="userName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHotelUsersByCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHotelUsersByCodeResult" type="tns:ArrayOfUserInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfUserInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="UserInfo" nillable="true" type="tns:UserInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="UserInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Sid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Grade" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Flag" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Hotel_Code" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="AddSendInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="info" type="tns:SendInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SendInfo">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Send_Type" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Recipient_Name" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Address" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Title" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Content" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Content2" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Content_Flag" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Begin_Time" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="End_Time" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="User_Code" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Hotel_Code" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Createdate" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="Attachment" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Status" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Last_Send_Time" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="Try_Num" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Card_No" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="RelativePath" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DbSource" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="KeyPairs" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ModelNo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SendMode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GuestEnName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BookerEnName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="HotelChName" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="BaseInfo" abstract="true">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="InsertUser" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="InsertDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="UpdateUser" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="UpdateDate" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="AddSendInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddSendInfoResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSysParamInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSysParamInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSysParamInfoResult" type="tns:SysParamInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SysParamInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Par_Value" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EnName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Desc" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="InsertUser" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="InsertDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="UpdateUser" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="UpdateDate" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAttachmentInfoByHotelCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotelCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAttachmentInfoByHotelCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAttachmentInfoByHotelCodeResult" type="tns:ArrayOfAttachmentInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfAttachmentInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="AttachmentInfo" nillable="true" type="tns:AttachmentInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="AttachmentInfo">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Obj_ID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Obj_Name" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Origin_Name" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="File_Name" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="File_Extend" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Path_Type" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Web_Path" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Local_Path" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="File_Desc" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Upload_Date" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="Upload_User" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="CheckIsCorporation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="account" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CheckIsCorporationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CheckIsCorporationResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHotelPromotionInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotelCode" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="arrive" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="flag" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHotelPromotionInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHotelPromotionInfoResult" type="tns:ArrayOfHotelPromotionInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfHotelPromotionInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="HotelPromotionInfo" nillable="true" type="tns:HotelPromotionInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="HotelPromotionInfo">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="PromotionCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="BeginDate" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="EndDate" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="Title" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Content" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ChannelCodes" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Level" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="PromotionType" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DiscountType" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="StayNight" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="FreeNight" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="LastNight" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Discount" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="PromotionGroup" type="tns:ProtmotionGroup" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ProtmotionGroup">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Sortid" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetHotelInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotelCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHotelInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHotelInfoResult" type="tns:ArrayOfHotelInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfHotelInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="HotelInfo" nillable="true" type="tns:HotelInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetHotelRoomType">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotelCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetHotelRoomTypeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHotelRoomTypeResult" type="tns:ArrayOfRoomTypeDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfRoomTypeDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RoomTypeDetail" nillable="true" type="tns:RoomTypeDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RoomTypeDetail">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="MaxOccupancy" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="HotelInstallations" type="tns:ArrayOfCommonInfo" />
              <s:element minOccurs="1" maxOccurs="1" name="Status" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Hotel" type="tns:Hotel" />
              <s:element minOccurs="0" maxOccurs="1" name="RoomType" type="tns:Roomtype" />
              <s:element minOccurs="1" maxOccurs="1" name="Number" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="SortId" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="IsHurdle" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FirstNightPrice" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="TotalPrice" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="AvailableRooms" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Des" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Address" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Pic" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Installations" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="RoomTypeCate" type="tns:CommonInfo" />
              <s:element minOccurs="1" maxOccurs="1" name="Area" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfPackage" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Roomtype">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="color" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="des" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="HotelRoomInstallations" type="tns:ArrayOfCommonInfo" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetHotelRateSimple">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getHotelRateSimple" type="tns:GetHotelRateSimpleIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetHotelRateSimpleIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetHotelRateSimpleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHotelRateSimpleResult" type="tns:GetHotelRateSimpleOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetHotelRateSimpleOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RateList" type="tns:ArrayOfRate" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRate">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Rate" nillable="true" type="tns:Rate" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetPreferences">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="preferencegroup_codes" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPreferencesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPreferencesResult" type="tns:ArrayOfPreferenceGroup" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPreferenceGroup">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PreferenceGroup" nillable="true" type="tns:PreferenceGroup" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="PreferenceGroup">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Preferences" type="tns:ArrayOfPreference" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfPreference">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Preference" nillable="true" type="tns:Preference" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Preference">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo" />
        </s:complexContent>
      </s:complexType>
      <s:element name="SendOrderNoticeByTemplate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sendOrderNoticeByTemplateIn" type="tns:SendOrderNoticeByTemplateIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SendOrderNoticeByTemplateIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="NotificationTempateId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Address" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SendRole" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RecipientName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalOperator" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SendOrderNoticeByTemplateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SendOrderNoticeByTemplateResult" type="tns:SendOrderNoticeByTemplateOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SendOrderNoticeByTemplateOut">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetTransportation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getTransportationIn" type="tns:GetTransportationIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetTransportationIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetTransportationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTransportationResult" type="tns:GetTransportationOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetTransportationOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="TransportInfoList" type="tns:ArrayOfTransportInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfTransportInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="TransportInfo" nillable="true" type="tns:TransportInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TransportInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Phone" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DistinceType" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Distince" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PriceRange" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="SortId" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAlertInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getAlertInfoIn" type="tns:GetAlertInfoIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetAlertInfoIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAlertInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAlertInfoResult" type="tns:GetAlertInfoOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetAlertInfoOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="AlertInfoList" type="tns:ArrayOfAlertInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfAlertInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="AlertInfo" nillable="true" type="tns:AlertInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="AlertInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="SortId" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetPmsDepartments">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getPmsDepartmentsIn" type="tns:GetPmsDepartmentsIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetPmsDepartmentsIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetPmsDepartmentsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPmsDepartmentsResult" type="tns:GetPmsDepartmentsOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetPmsDepartmentsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PmsDepartmentsList" type="tns:ArrayOfPmsDepartments" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfPmsDepartments">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PmsDepartments" nillable="true" type="tns:PmsDepartments" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="PmsDepartments">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="SortId" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetTraceTexts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getTraceTextsIn" type="tns:GetTraceTextsIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetTraceTextsIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PmsDepartments" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetTraceTextsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTraceTextsResult" type="tns:GetTraceTextsOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetTraceTextsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="TraceTextsList" type="tns:ArrayOfTraceTexts" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfTraceTexts">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="TraceTexts" nillable="true" type="tns:TraceTexts" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TraceTexts">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DepartmentCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="SortId" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetPayment">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getPaymentIn" type="tns:GetPaymentIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetPaymentIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CreditCardYn" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ResFlag" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetPaymentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPaymentResult" type="tns:GetPaymentOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetPaymentOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Payments" type="tns:ArrayOfPayment" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfPayment">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Payment" nillable="true" type="tns:Payment" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Payment">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="ResFlag" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ValidFn" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Category" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetFaq">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getFaqIn" type="tns:GetFaqIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetFaqIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="FuzzyContent" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFaqResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFaqResult" type="tns:GetFaqOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetFaqOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="FaqList" type="tns:ArrayOfFaq" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfFaq">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Faq" nillable="true" type="tns:Faq" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Faq">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Question" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Answers" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetHotelCity">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getHotelCityIn" type="tns:GetHotelCityIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetHotelCityIn" />
      <s:element name="GetHotelCityResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHotelCityResult" type="tns:GetHotelCityOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetHotelCityOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCityList" type="tns:ArrayOfCommonInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSendInfoByKey">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getSendInfoByKeyIn" type="tns:GetSendInfoByKeyIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetSendInfoByKeyIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Source" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="KeyPairs" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSendInfoByKeyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSendInfoByKeyResult" type="tns:GetSendInfoByKeyOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetSendInfoByKeyOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="SendInfos" type="tns:ArrayOfSendInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSendInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="SendInfo" nillable="true" type="tns:SendInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSingleSendInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="sendId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSingleSendInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSingleSendInfoResult" type="tns:GetSendInfoByKeyOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMessageTempletsByRule">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getMessageTemplateByOrderRuleIn" type="tns:GetMessageTemplateByOrderRuleIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetMessageTemplateByOrderRuleIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ReservationTypeCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChannelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ActionType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Language" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetMessageTempletsByRuleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMessageTempletsByRuleResult" type="tns:MessageTemplets" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="MessageTemplets">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ReservationEmailModelList" type="tns:ArrayOfReservationModel" />
          <s:element minOccurs="0" maxOccurs="1" name="ReservationFaxModelList" type="tns:ArrayOfReservationModel" />
          <s:element minOccurs="0" maxOccurs="1" name="ReservationSMSModelList" type="tns:ArrayOfReservationModel" />
          <s:element minOccurs="0" maxOccurs="1" name="ProfileEmailModelList" type="tns:ArrayOfProfileModel" />
          <s:element minOccurs="0" maxOccurs="1" name="ProfileSMSModelList" type="tns:ArrayOfProfileModel" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfReservationModel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ReservationModel" nillable="true" type="tns:ReservationModel" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ReservationModel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ActionType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ModelId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Consignee" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ModelTitle" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfProfileModel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ProfileModel" nillable="true" type="tns:ProfileModel" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ProfileModel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ModelId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ActionType" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="PreviewMessageTemplate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="orderId" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="notificationTempateId" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PreviewMessageTemplateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PreviewMessageTemplateResult" type="tns:GetMessageTemplateContentByKeyOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetMessageTemplateContentByKeyOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="TemplateContent" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MessageType" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetMesageTemplates">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:GetMessageTempletsIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetMessageTempletsIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="MessagePurpose" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MessageType" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetMesageTemplatesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMesageTemplatesResult" type="tns:GetMessageTempletsOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetMessageTempletsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="MessageTemplets" type="tns:ArrayOfMessageTemplet" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfMessageTemplet">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="MessageTemplet" nillable="true" type="tns:MessageTemplet" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="MessageTemplet">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="TemplateId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="TemplateName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TemplateContent" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TemplateType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UsageCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetTitle">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getTitleByKeyIn" type="tns:GetTitleIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetTitleIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetTitleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTitleResult" type="tns:GetTitleOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetTitleOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="GetTitleReponseOut" type="tns:ArrayOfGetTitleOut" />
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GenderCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GenderName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfGetTitleOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GetTitleOut" nillable="true" type="tns:GetTitleOut" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetItemClasses">
        <s:complexType />
      </s:element>
      <s:element name="GetItemClassesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemClassesResult" type="tns:GetItemClassOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetItemClassOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ItemClassInfo" type="tns:ArrayOfItemClassInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfItemClassInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ItemClassInfo" nillable="true" type="tns:ItemClassInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ItemClassInfo">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="SortId" type="s:int" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="GetItemInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getItemInfoIn" type="tns:GetItemInfoIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetItemInfoIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemClassCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCodes" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetItemInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemInfoResult" type="tns:GetItemInfoOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetItemInfoOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ItemInfos" type="tns:ArrayOfItemInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckHotelInterface">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CheckHotelInterfaceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CheckHotelInterfaceResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNotEnabledHotelInterface">
        <s:complexType />
      </s:element>
      <s:element name="GetNotEnabledHotelInterfaceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNotEnabledHotelInterfaceResult" type="tns:ArrayOfCommonInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPublishRateAndRoomtype">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:GetPublishRateAndRoomtypeIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetPublishRateAndRoomtypeIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ChannelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardLevel" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetPublishRateAndRoomtypeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPublishRateAndRoomtypeResult" type="tns:ArrayOfPublishRateAndRoomtype" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPublishRateAndRoomtype">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PublishRateAndRoomtype" nillable="true" type="tns:PublishRateAndRoomtype" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="PublishRateAndRoomtype">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RateName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Roomtypes" type="tns:ArrayOfRoomtype" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRoomtype">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Roomtype" nillable="true" type="tns:Roomtype" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetPMSUDFMapping">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPMSUDFMappingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPMSUDFMappingResult" type="tns:ArrayOfUDFAndPMSMapping" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfUDFAndPMSMapping">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="UDFAndPMSMapping" nillable="true" type="tns:UDFAndPMSMapping" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="UDFAndPMSMapping">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ModuleName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CrsTable" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CrsColumn" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PmsTable" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PmsColumn" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Direction" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Des" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Show" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetPlaceCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPlaceCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPlaceCodeResult" type="tns:GetPlacesOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetPlacesOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Places" type="tns:ArrayOfCommonInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetBookersList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:GetBookersIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetBookersIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="QueryString" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CategoryCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetBookersListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBookersListResult" type="tns:ArrayOfGetBookersOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfGetBookersOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GetBookersOut" nillable="true" type="tns:GetBookersOut" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GetBookersOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DepCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DepName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetHotelsList">
        <s:complexType />
      </s:element>
      <s:element name="GetHotelsListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetHotelsListResult" type="tns:ArrayOfGetHotelsOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfGetHotelsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GetHotelsOut" nillable="true" type="tns:GetHotelsOut" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GetHotelsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Seq" nillable="true" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetDepartmentsList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotelCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDepartmentsListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDepartmentsListResult" type="tns:ArrayOfGetDepartmentsOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfGetDepartmentsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GetDepartmentsOut" nillable="true" type="tns:GetDepartmentsOut" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GetDepartmentsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Seq" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Isdel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Des" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetConvertValueSoapIn">
    <wsdl:part name="parameters" element="tns:GetConvertValue" />
  </wsdl:message>
  <wsdl:message name="GetConvertValueSoapOut">
    <wsdl:part name="parameters" element="tns:GetConvertValueResponse" />
  </wsdl:message>
  <wsdl:message name="GetConvertValueKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSingleHotelInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetSingleHotelInfo" />
  </wsdl:message>
  <wsdl:message name="GetSingleHotelInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetSingleHotelInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetSingleHotelInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetHotelsSoapIn">
    <wsdl:part name="parameters" element="tns:GetHotels" />
  </wsdl:message>
  <wsdl:message name="GetHotelsSoapOut">
    <wsdl:part name="parameters" element="tns:GetHotelsResponse" />
  </wsdl:message>
  <wsdl:message name="GetHotelsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetInformationSoapIn">
    <wsdl:part name="parameters" element="tns:GetInformation" />
  </wsdl:message>
  <wsdl:message name="GetInformationSoapOut">
    <wsdl:part name="parameters" element="tns:GetInformationResponse" />
  </wsdl:message>
  <wsdl:message name="GetInformationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetStarLevelSoapIn">
    <wsdl:part name="parameters" element="tns:GetStarLevel" />
  </wsdl:message>
  <wsdl:message name="GetStarLevelSoapOut">
    <wsdl:part name="parameters" element="tns:GetStarLevelResponse" />
  </wsdl:message>
  <wsdl:message name="GetStarLevelKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetGuaranteeRulesByRateCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetGuaranteeRulesByRateCode" />
  </wsdl:message>
  <wsdl:message name="GetGuaranteeRulesByRateCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetGuaranteeRulesByRateCodeResponse" />
  </wsdl:message>
  <wsdl:message name="GetGuaranteeRulesByRateCodeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetGuaranteeRuleSoapIn">
    <wsdl:part name="parameters" element="tns:GetGuaranteeRule" />
  </wsdl:message>
  <wsdl:message name="GetGuaranteeRuleSoapOut">
    <wsdl:part name="parameters" element="tns:GetGuaranteeRuleResponse" />
  </wsdl:message>
  <wsdl:message name="GetGuaranteeRuleKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetCountrySoapIn">
    <wsdl:part name="parameters" element="tns:GetCountry" />
  </wsdl:message>
  <wsdl:message name="GetCountrySoapOut">
    <wsdl:part name="parameters" element="tns:GetCountryResponse" />
  </wsdl:message>
  <wsdl:message name="GetCountryKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetCityListSoapIn">
    <wsdl:part name="parameters" element="tns:GetCityList" />
  </wsdl:message>
  <wsdl:message name="GetCityListSoapOut">
    <wsdl:part name="parameters" element="tns:GetCityListResponse" />
  </wsdl:message>
  <wsdl:message name="GetCityListKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetProvinceSoapIn">
    <wsdl:part name="parameters" element="tns:GetProvince" />
  </wsdl:message>
  <wsdl:message name="GetProvinceSoapOut">
    <wsdl:part name="parameters" element="tns:GetProvinceResponse" />
  </wsdl:message>
  <wsdl:message name="GetProvinceKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSegmentSoapIn">
    <wsdl:part name="parameters" element="tns:GetSegment" />
  </wsdl:message>
  <wsdl:message name="GetSegmentSoapOut">
    <wsdl:part name="parameters" element="tns:GetSegmentResponse" />
  </wsdl:message>
  <wsdl:message name="GetSegmentKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSourceSoapIn">
    <wsdl:part name="parameters" element="tns:GetSource" />
  </wsdl:message>
  <wsdl:message name="GetSourceSoapOut">
    <wsdl:part name="parameters" element="tns:GetSourceResponse" />
  </wsdl:message>
  <wsdl:message name="GetSourceKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSpecialsSoapIn">
    <wsdl:part name="parameters" element="tns:GetSpecials" />
  </wsdl:message>
  <wsdl:message name="GetSpecialsSoapOut">
    <wsdl:part name="parameters" element="tns:GetSpecialsResponse" />
  </wsdl:message>
  <wsdl:message name="GetSpecialsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetCardTypeSoapIn">
    <wsdl:part name="parameters" element="tns:GetCardType" />
  </wsdl:message>
  <wsdl:message name="GetCardTypeSoapOut">
    <wsdl:part name="parameters" element="tns:GetCardTypeResponse" />
  </wsdl:message>
  <wsdl:message name="GetCardTypeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetPackageSoapIn">
    <wsdl:part name="parameters" element="tns:GetPackage" />
  </wsdl:message>
  <wsdl:message name="GetPackageSoapOut">
    <wsdl:part name="parameters" element="tns:GetPackageResponse" />
  </wsdl:message>
  <wsdl:message name="GetPackageKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetRateSoapIn">
    <wsdl:part name="parameters" element="tns:GetRate" />
  </wsdl:message>
  <wsdl:message name="GetRateSoapOut">
    <wsdl:part name="parameters" element="tns:GetRateResponse" />
  </wsdl:message>
  <wsdl:message name="GetRateKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkByCitySoapIn">
    <wsdl:part name="parameters" element="tns:GetLandmarkByCity" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkByCitySoapOut">
    <wsdl:part name="parameters" element="tns:GetLandmarkByCityResponse" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkByCityKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkSoapIn">
    <wsdl:part name="parameters" element="tns:GetLandmark" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkSoapOut">
    <wsdl:part name="parameters" element="tns:GetLandmarkResponse" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkByHotelSoapIn">
    <wsdl:part name="parameters" element="tns:GetLandmarkByHotel" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkByHotelSoapOut">
    <wsdl:part name="parameters" element="tns:GetLandmarkByHotelResponse" />
  </wsdl:message>
  <wsdl:message name="GetLandmarkByHotelKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetHotelUsersByCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetHotelUsersByCode" />
  </wsdl:message>
  <wsdl:message name="GetHotelUsersByCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetHotelUsersByCodeResponse" />
  </wsdl:message>
  <wsdl:message name="GetHotelUsersByCodeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="AddSendInfoSoapIn">
    <wsdl:part name="parameters" element="tns:AddSendInfo" />
  </wsdl:message>
  <wsdl:message name="AddSendInfoSoapOut">
    <wsdl:part name="parameters" element="tns:AddSendInfoResponse" />
  </wsdl:message>
  <wsdl:message name="AddSendInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSysParamInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetSysParamInfo" />
  </wsdl:message>
  <wsdl:message name="GetSysParamInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetSysParamInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetSysParamInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAttachmentInfoByHotelCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetAttachmentInfoByHotelCode" />
  </wsdl:message>
  <wsdl:message name="GetAttachmentInfoByHotelCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetAttachmentInfoByHotelCodeResponse" />
  </wsdl:message>
  <wsdl:message name="GetAttachmentInfoByHotelCodeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="CheckIsCorporationSoapIn">
    <wsdl:part name="parameters" element="tns:CheckIsCorporation" />
  </wsdl:message>
  <wsdl:message name="CheckIsCorporationSoapOut">
    <wsdl:part name="parameters" element="tns:CheckIsCorporationResponse" />
  </wsdl:message>
  <wsdl:message name="CheckIsCorporationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetHotelPromotionInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetHotelPromotionInfo" />
  </wsdl:message>
  <wsdl:message name="GetHotelPromotionInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetHotelPromotionInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetHotelPromotionInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetHotelInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetHotelInfo" />
  </wsdl:message>
  <wsdl:message name="GetHotelInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetHotelInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetHotelInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetHotelRoomTypeSoapIn">
    <wsdl:part name="parameters" element="tns:GetHotelRoomType" />
  </wsdl:message>
  <wsdl:message name="GetHotelRoomTypeSoapOut">
    <wsdl:part name="parameters" element="tns:GetHotelRoomTypeResponse" />
  </wsdl:message>
  <wsdl:message name="GetHotelRoomTypeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetHotelRateSimpleSoapIn">
    <wsdl:part name="parameters" element="tns:GetHotelRateSimple" />
  </wsdl:message>
  <wsdl:message name="GetHotelRateSimpleSoapOut">
    <wsdl:part name="parameters" element="tns:GetHotelRateSimpleResponse" />
  </wsdl:message>
  <wsdl:message name="GetHotelRateSimpleKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetPreferencesSoapIn">
    <wsdl:part name="parameters" element="tns:GetPreferences" />
  </wsdl:message>
  <wsdl:message name="GetPreferencesSoapOut">
    <wsdl:part name="parameters" element="tns:GetPreferencesResponse" />
  </wsdl:message>
  <wsdl:message name="GetPreferencesKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="SendOrderNoticeByTemplateSoapIn">
    <wsdl:part name="parameters" element="tns:SendOrderNoticeByTemplate" />
  </wsdl:message>
  <wsdl:message name="SendOrderNoticeByTemplateSoapOut">
    <wsdl:part name="parameters" element="tns:SendOrderNoticeByTemplateResponse" />
  </wsdl:message>
  <wsdl:message name="SendOrderNoticeByTemplateKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetTransportationSoapIn">
    <wsdl:part name="parameters" element="tns:GetTransportation" />
  </wsdl:message>
  <wsdl:message name="GetTransportationSoapOut">
    <wsdl:part name="parameters" element="tns:GetTransportationResponse" />
  </wsdl:message>
  <wsdl:message name="GetTransportationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAlertInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetAlertInfo" />
  </wsdl:message>
  <wsdl:message name="GetAlertInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetAlertInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetAlertInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetPmsDepartmentsSoapIn">
    <wsdl:part name="parameters" element="tns:GetPmsDepartments" />
  </wsdl:message>
  <wsdl:message name="GetPmsDepartmentsSoapOut">
    <wsdl:part name="parameters" element="tns:GetPmsDepartmentsResponse" />
  </wsdl:message>
  <wsdl:message name="GetPmsDepartmentsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetTraceTextsSoapIn">
    <wsdl:part name="parameters" element="tns:GetTraceTexts" />
  </wsdl:message>
  <wsdl:message name="GetTraceTextsSoapOut">
    <wsdl:part name="parameters" element="tns:GetTraceTextsResponse" />
  </wsdl:message>
  <wsdl:message name="GetTraceTextsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetPaymentSoapIn">
    <wsdl:part name="parameters" element="tns:GetPayment" />
  </wsdl:message>
  <wsdl:message name="GetPaymentSoapOut">
    <wsdl:part name="parameters" element="tns:GetPaymentResponse" />
  </wsdl:message>
  <wsdl:message name="GetPaymentKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetFaqSoapIn">
    <wsdl:part name="parameters" element="tns:GetFaq" />
  </wsdl:message>
  <wsdl:message name="GetFaqSoapOut">
    <wsdl:part name="parameters" element="tns:GetFaqResponse" />
  </wsdl:message>
  <wsdl:message name="GetFaqKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetHotelCitySoapIn">
    <wsdl:part name="parameters" element="tns:GetHotelCity" />
  </wsdl:message>
  <wsdl:message name="GetHotelCitySoapOut">
    <wsdl:part name="parameters" element="tns:GetHotelCityResponse" />
  </wsdl:message>
  <wsdl:message name="GetHotelCityKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSendInfoByKeySoapIn">
    <wsdl:part name="parameters" element="tns:GetSendInfoByKey" />
  </wsdl:message>
  <wsdl:message name="GetSendInfoByKeySoapOut">
    <wsdl:part name="parameters" element="tns:GetSendInfoByKeyResponse" />
  </wsdl:message>
  <wsdl:message name="GetSendInfoByKeyKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSingleSendInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetSingleSendInfo" />
  </wsdl:message>
  <wsdl:message name="GetSingleSendInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetSingleSendInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetSingleSendInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetMessageTempletsByRuleSoapIn">
    <wsdl:part name="parameters" element="tns:GetMessageTempletsByRule" />
  </wsdl:message>
  <wsdl:message name="GetMessageTempletsByRuleSoapOut">
    <wsdl:part name="parameters" element="tns:GetMessageTempletsByRuleResponse" />
  </wsdl:message>
  <wsdl:message name="GetMessageTempletsByRuleKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="PreviewMessageTemplateSoapIn">
    <wsdl:part name="parameters" element="tns:PreviewMessageTemplate" />
  </wsdl:message>
  <wsdl:message name="PreviewMessageTemplateSoapOut">
    <wsdl:part name="parameters" element="tns:PreviewMessageTemplateResponse" />
  </wsdl:message>
  <wsdl:message name="PreviewMessageTemplateKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetMesageTemplatesSoapIn">
    <wsdl:part name="parameters" element="tns:GetMesageTemplates" />
  </wsdl:message>
  <wsdl:message name="GetMesageTemplatesSoapOut">
    <wsdl:part name="parameters" element="tns:GetMesageTemplatesResponse" />
  </wsdl:message>
  <wsdl:message name="GetMesageTemplatesKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetTitleSoapIn">
    <wsdl:part name="parameters" element="tns:GetTitle" />
  </wsdl:message>
  <wsdl:message name="GetTitleSoapOut">
    <wsdl:part name="parameters" element="tns:GetTitleResponse" />
  </wsdl:message>
  <wsdl:message name="GetTitleKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetItemClassesSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemClasses" />
  </wsdl:message>
  <wsdl:message name="GetItemClassesSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemClassesResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemClassesKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemInfo" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="CheckHotelInterfaceSoapIn">
    <wsdl:part name="parameters" element="tns:CheckHotelInterface" />
  </wsdl:message>
  <wsdl:message name="CheckHotelInterfaceSoapOut">
    <wsdl:part name="parameters" element="tns:CheckHotelInterfaceResponse" />
  </wsdl:message>
  <wsdl:message name="CheckHotelInterfaceKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetNotEnabledHotelInterfaceSoapIn">
    <wsdl:part name="parameters" element="tns:GetNotEnabledHotelInterface" />
  </wsdl:message>
  <wsdl:message name="GetNotEnabledHotelInterfaceSoapOut">
    <wsdl:part name="parameters" element="tns:GetNotEnabledHotelInterfaceResponse" />
  </wsdl:message>
  <wsdl:message name="GetNotEnabledHotelInterfaceKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetPublishRateAndRoomtypeSoapIn">
    <wsdl:part name="parameters" element="tns:GetPublishRateAndRoomtype" />
  </wsdl:message>
  <wsdl:message name="GetPublishRateAndRoomtypeSoapOut">
    <wsdl:part name="parameters" element="tns:GetPublishRateAndRoomtypeResponse" />
  </wsdl:message>
  <wsdl:message name="GetPublishRateAndRoomtypeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetPMSUDFMappingSoapIn">
    <wsdl:part name="parameters" element="tns:GetPMSUDFMapping" />
  </wsdl:message>
  <wsdl:message name="GetPMSUDFMappingSoapOut">
    <wsdl:part name="parameters" element="tns:GetPMSUDFMappingResponse" />
  </wsdl:message>
  <wsdl:message name="GetPMSUDFMappingKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetPlaceCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetPlaceCode" />
  </wsdl:message>
  <wsdl:message name="GetPlaceCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetPlaceCodeResponse" />
  </wsdl:message>
  <wsdl:message name="GetPlaceCodeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetBookersListSoapIn">
    <wsdl:part name="parameters" element="tns:GetBookersList" />
  </wsdl:message>
  <wsdl:message name="GetBookersListSoapOut">
    <wsdl:part name="parameters" element="tns:GetBookersListResponse" />
  </wsdl:message>
  <wsdl:message name="GetBookersListKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetHotelsListSoapIn">
    <wsdl:part name="parameters" element="tns:GetHotelsList" />
  </wsdl:message>
  <wsdl:message name="GetHotelsListSoapOut">
    <wsdl:part name="parameters" element="tns:GetHotelsListResponse" />
  </wsdl:message>
  <wsdl:message name="GetHotelsListKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetDepartmentsListSoapIn">
    <wsdl:part name="parameters" element="tns:GetDepartmentsList" />
  </wsdl:message>
  <wsdl:message name="GetDepartmentsListSoapOut">
    <wsdl:part name="parameters" element="tns:GetDepartmentsListResponse" />
  </wsdl:message>
  <wsdl:message name="GetDepartmentsListKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:portType name="InformationServiceSoap">
    <wsdl:operation name="GetConvertValue">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询conversion</wsdl:documentation>
      <wsdl:input message="tns:GetConvertValueSoapIn" />
      <wsdl:output message="tns:GetConvertValueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSingleHotelInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询单个酒店信息, 输入酒店code</wsdl:documentation>
      <wsdl:input message="tns:GetSingleHotelInfoSoapIn" />
      <wsdl:output message="tns:GetSingleHotelInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHotels">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询多个酒店信息,输入酒店code,酒店中或英名称,星级级别,地址,关键字,城市code,城市名称</wsdl:documentation>
      <wsdl:input message="tns:GetHotelsSoapIn" />
      <wsdl:output message="tns:GetHotelsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetInformation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询字典表的code 和name</wsdl:documentation>
      <wsdl:input message="tns:GetInformationSoapIn" />
      <wsdl:output message="tns:GetInformationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetStarLevel">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询星级信息</wsdl:documentation>
      <wsdl:input message="tns:GetStarLevelSoapIn" />
      <wsdl:output message="tns:GetStarLevelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetGuaranteeRulesByRateCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询预定规则</wsdl:documentation>
      <wsdl:input message="tns:GetGuaranteeRulesByRateCodeSoapIn" />
      <wsdl:output message="tns:GetGuaranteeRulesByRateCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetGuaranteeRule">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询单个预定规则</wsdl:documentation>
      <wsdl:input message="tns:GetGuaranteeRuleSoapIn" />
      <wsdl:output message="tns:GetGuaranteeRuleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCountry">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询国家列表</wsdl:documentation>
      <wsdl:input message="tns:GetCountrySoapIn" />
      <wsdl:output message="tns:GetCountrySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCityList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询城市列表,输入国家code</wsdl:documentation>
      <wsdl:input message="tns:GetCityListSoapIn" />
      <wsdl:output message="tns:GetCityListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetProvince">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询省份列表</wsdl:documentation>
      <wsdl:input message="tns:GetProvinceSoapIn" />
      <wsdl:output message="tns:GetProvinceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSegment">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询市场</wsdl:documentation>
      <wsdl:input message="tns:GetSegmentSoapIn" />
      <wsdl:output message="tns:GetSegmentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSource">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询来源</wsdl:documentation>
      <wsdl:input message="tns:GetSourceSoapIn" />
      <wsdl:output message="tns:GetSourceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSpecials">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询特殊需求</wsdl:documentation>
      <wsdl:input message="tns:GetSpecialsSoapIn" />
      <wsdl:output message="tns:GetSpecialsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCardType">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询信用卡类型</wsdl:documentation>
      <wsdl:input message="tns:GetCardTypeSoapIn" />
      <wsdl:output message="tns:GetCardTypeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPackage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询package</wsdl:documentation>
      <wsdl:input message="tns:GetPackageSoapIn" />
      <wsdl:output message="tns:GetPackageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询酒店特定房价信息</wsdl:documentation>
      <wsdl:input message="tns:GetRateSoapIn" />
      <wsdl:output message="tns:GetRateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLandmarkByCity">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询地标,输入城市code</wsdl:documentation>
      <wsdl:input message="tns:GetLandmarkByCitySoapIn" />
      <wsdl:output message="tns:GetLandmarkByCitySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLandmark">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询地标,输入地标类型,城市</wsdl:documentation>
      <wsdl:input message="tns:GetLandmarkSoapIn" />
      <wsdl:output message="tns:GetLandmarkSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLandmarkByHotel">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询酒店地标,输入酒店Code</wsdl:documentation>
      <wsdl:input message="tns:GetLandmarkByHotelSoapIn" />
      <wsdl:output message="tns:GetLandmarkByHotelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHotelUsersByCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询酒店用户列表,输入酒店code,用户code,用户名,不填查询所有</wsdl:documentation>
      <wsdl:input message="tns:GetHotelUsersByCodeSoapIn" />
      <wsdl:output message="tns:GetHotelUsersByCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddSendInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新建邮件/传真/短信</wsdl:documentation>
      <wsdl:input message="tns:AddSendInfoSoapIn" />
      <wsdl:output message="tns:AddSendInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSysParamInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取系统参数,输入系统参数code,酒店code</wsdl:documentation>
      <wsdl:input message="tns:GetSysParamInfoSoapIn" />
      <wsdl:output message="tns:GetSysParamInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAttachmentInfoByHotelCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取酒店图片信息列表,输入酒店code</wsdl:documentation>
      <wsdl:input message="tns:GetAttachmentInfoByHotelCodeSoapIn" />
      <wsdl:output message="tns:GetAttachmentInfoByHotelCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckIsCorporation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">判断协议客户,输入公司预订登陆帐号</wsdl:documentation>
      <wsdl:input message="tns:CheckIsCorporationSoapIn" />
      <wsdl:output message="tns:CheckIsCorporationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHotelPromotionInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取酒店促销信息列表,输入酒店code，到店日期，限制标志</wsdl:documentation>
      <wsdl:input message="tns:GetHotelPromotionInfoSoapIn" />
      <wsdl:output message="tns:GetHotelPromotionInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHotelInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取酒店信息列表,输入酒店code</wsdl:documentation>
      <wsdl:input message="tns:GetHotelInfoSoapIn" />
      <wsdl:output message="tns:GetHotelInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHotelRoomType">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取酒店可用房型列表,输入酒店code</wsdl:documentation>
      <wsdl:input message="tns:GetHotelRoomTypeSoapIn" />
      <wsdl:output message="tns:GetHotelRoomTypeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHotelRateSimple">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得酒店级的房价描述信息</wsdl:documentation>
      <wsdl:input message="tns:GetHotelRateSimpleSoapIn" />
      <wsdl:output message="tns:GetHotelRateSimpleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPreferences">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取会员偏好</wsdl:documentation>
      <wsdl:input message="tns:GetPreferencesSoapIn" />
      <wsdl:output message="tns:GetPreferencesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SendOrderNoticeByTemplate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">利用crs的模板，发送订单相关通知</wsdl:documentation>
      <wsdl:input message="tns:SendOrderNoticeByTemplateSoapIn" />
      <wsdl:output message="tns:SendOrderNoticeByTemplateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTransportation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得酒店接机方式</wsdl:documentation>
      <wsdl:input message="tns:GetTransportationSoapIn" />
      <wsdl:output message="tns:GetTransportationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAlertInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询酒店alert信息</wsdl:documentation>
      <wsdl:input message="tns:GetAlertInfoSoapIn" />
      <wsdl:output message="tns:GetAlertInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPmsDepartments">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得opera的部门信息</wsdl:documentation>
      <wsdl:input message="tns:GetPmsDepartmentsSoapIn" />
      <wsdl:output message="tns:GetPmsDepartmentsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTraceTexts">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询某酒店部门下的trace信息</wsdl:documentation>
      <wsdl:input message="tns:GetTraceTextsSoapIn" />
      <wsdl:output message="tns:GetTraceTextsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPayment">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询支付方式字典信息</wsdl:documentation>
      <wsdl:input message="tns:GetPaymentSoapIn" />
      <wsdl:output message="tns:GetPaymentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFaq">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询某酒店的常见问答信息</wsdl:documentation>
      <wsdl:input message="tns:GetFaqSoapIn" />
      <wsdl:output message="tns:GetFaqSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHotelCity">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得所有酒店的所在城市</wsdl:documentation>
      <wsdl:input message="tns:GetHotelCitySoapIn" />
      <wsdl:output message="tns:GetHotelCitySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSendInfoByKey">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得外发通知（邮件、短信、传真）历史，可根据订单id或其他数据标识查询</wsdl:documentation>
      <wsdl:input message="tns:GetSendInfoByKeySoapIn" />
      <wsdl:output message="tns:GetSendInfoByKeySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSingleSendInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得外发通知（邮件、短信、传真）历史的单条历史记录（发送历史上的详情）</wsdl:documentation>
      <wsdl:input message="tns:GetSingleSendInfoSoapIn" />
      <wsdl:output message="tns:GetSingleSendInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMessageTempletsByRule">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据某个订单、外发通知的规则获得通知模板id，用于在补发前展示给操作员（CRO）</wsdl:documentation>
      <wsdl:input message="tns:GetMessageTempletsByRuleSoapIn" />
      <wsdl:output message="tns:GetMessageTempletsByRuleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PreviewMessageTemplate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">利用crs中已定义的模板,预览某个模板的内容</wsdl:documentation>
      <wsdl:input message="tns:PreviewMessageTemplateSoapIn" />
      <wsdl:output message="tns:PreviewMessageTemplateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMesageTemplates">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得模板信息</wsdl:documentation>
      <wsdl:input message="tns:GetMesageTemplatesSoapIn" />
      <wsdl:output message="tns:GetMesageTemplatesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTitle">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取称呼字典中的数据,返回code,name,gender字段</wsdl:documentation>
      <wsdl:input message="tns:GetTitleSoapIn" />
      <wsdl:output message="tns:GetTitleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemClasses">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取item大类</wsdl:documentation>
      <wsdl:input message="tns:GetItemClassesSoapIn" />
      <wsdl:output message="tns:GetItemClassesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取item信息</wsdl:documentation>
      <wsdl:input message="tns:GetItemInfoSoapIn" />
      <wsdl:output message="tns:GetItemInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckHotelInterface">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">校验酒店是否启用了酒店接口</wsdl:documentation>
      <wsdl:input message="tns:CheckHotelInterfaceSoapIn" />
      <wsdl:output message="tns:CheckHotelInterfaceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNotEnabledHotelInterface">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取没有启用酒店接口的数据</wsdl:documentation>
      <wsdl:input message="tns:GetNotEnabledHotelInterfaceSoapIn" />
      <wsdl:output message="tns:GetNotEnabledHotelInterfaceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPublishRateAndRoomtype">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取发布的房价及定义了房价的房型信息</wsdl:documentation>
      <wsdl:input message="tns:GetPublishRateAndRoomtypeSoapIn" />
      <wsdl:output message="tns:GetPublishRateAndRoomtypeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPMSUDFMapping">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取PMS和UDF的映射</wsdl:documentation>
      <wsdl:input message="tns:GetPMSUDFMappingSoapIn" />
      <wsdl:output message="tns:GetPMSUDFMappingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPlaceCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取酒店消费地点</wsdl:documentation>
      <wsdl:input message="tns:GetPlaceCodeSoapIn" />
      <wsdl:output message="tns:GetPlaceCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBookersList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取CRS里的操作员,仅供CRO使用</wsdl:documentation>
      <wsdl:input message="tns:GetBookersListSoapIn" />
      <wsdl:output message="tns:GetBookersListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetHotelsList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取CRS里的酒店,仅供CRO使用</wsdl:documentation>
      <wsdl:input message="tns:GetHotelsListSoapIn" />
      <wsdl:output message="tns:GetHotelsListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDepartmentsList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取CRS里的部门,仅供CRO使用</wsdl:documentation>
      <wsdl:input message="tns:GetDepartmentsListSoapIn" />
      <wsdl:output message="tns:GetDepartmentsListSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="InformationServiceSoap" type="tns:InformationServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetConvertValue">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetConvertValue" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetConvertValueKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetConvertValueKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSingleHotelInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSingleHotelInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSingleHotelInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSingleHotelInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHotels">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetHotels" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetInformation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetInformation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetInformationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetInformationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStarLevel">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetStarLevel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetStarLevelKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetStarLevelKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetGuaranteeRulesByRateCode">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetGuaranteeRulesByRateCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetGuaranteeRulesByRateCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetGuaranteeRulesByRateCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetGuaranteeRule">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetGuaranteeRule" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetGuaranteeRuleKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetGuaranteeRuleKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCountry">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetCountry" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetCountryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetCountryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCityList">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetCityList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetCityListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetCityListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProvince">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetProvince" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetProvinceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetProvinceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSegment">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSegment" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSegmentKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSegmentKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSource">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSource" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSourceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSourceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSpecials">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSpecials" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSpecialsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSpecialsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCardType">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetCardType" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetCardTypeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetCardTypeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPackage">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetPackage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetPackageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetPackageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRate">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetRate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLandmarkByCity">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetLandmarkByCity" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetLandmarkByCityKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetLandmarkByCityKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLandmark">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetLandmark" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetLandmarkKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetLandmarkKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLandmarkByHotel">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetLandmarkByHotel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetLandmarkByHotelKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetLandmarkByHotelKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHotelUsersByCode">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetHotelUsersByCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelUsersByCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelUsersByCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddSendInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/AddSendInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AddSendInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:AddSendInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSysParamInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSysParamInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSysParamInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSysParamInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAttachmentInfoByHotelCode">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAttachmentInfoByHotelCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAttachmentInfoByHotelCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAttachmentInfoByHotelCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckIsCorporation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CheckIsCorporation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CheckIsCorporationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CheckIsCorporationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHotelPromotionInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetHotelPromotionInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelPromotionInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelPromotionInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHotelInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetHotelInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHotelRoomType">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetHotelRoomType" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelRoomTypeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelRoomTypeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHotelRateSimple">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetHotelRateSimple" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelRateSimpleKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelRateSimpleKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPreferences">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetPreferences" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetPreferencesKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetPreferencesKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SendOrderNoticeByTemplate">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/SendOrderNoticeByTemplate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:SendOrderNoticeByTemplateKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:SendOrderNoticeByTemplateKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTransportation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetTransportation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetTransportationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetTransportationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAlertInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAlertInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAlertInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAlertInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPmsDepartments">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetPmsDepartments" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetPmsDepartmentsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetPmsDepartmentsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTraceTexts">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetTraceTexts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetTraceTextsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetTraceTextsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPayment">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetPayment" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetPaymentKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetPaymentKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFaq">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetFaq" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetFaqKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetFaqKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHotelCity">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetHotelCity" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelCityKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelCityKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSendInfoByKey">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSendInfoByKey" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSendInfoByKeyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSendInfoByKeyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSingleSendInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSingleSendInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSingleSendInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSingleSendInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMessageTempletsByRule">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetMessageTempletsByRule" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetMessageTempletsByRuleKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetMessageTempletsByRuleKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PreviewMessageTemplate">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/PreviewMessageTemplate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:PreviewMessageTemplateKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:PreviewMessageTemplateKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMesageTemplates">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetMesageTemplates" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetMesageTemplatesKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetMesageTemplatesKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTitle">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetTitle" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetTitleKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetTitleKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemClasses">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetItemClasses" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetItemClassesKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetItemClassesKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetItemInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetItemInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetItemInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckHotelInterface">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CheckHotelInterface" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CheckHotelInterfaceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CheckHotelInterfaceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNotEnabledHotelInterface">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetNotEnabledHotelInterface" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetNotEnabledHotelInterfaceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetNotEnabledHotelInterfaceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPublishRateAndRoomtype">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetPublishRateAndRoomtype" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetPublishRateAndRoomtypeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetPublishRateAndRoomtypeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPMSUDFMapping">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetPMSUDFMapping" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetPMSUDFMappingKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetPMSUDFMappingKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPlaceCode">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetPlaceCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetPlaceCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetPlaceCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBookersList">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetBookersList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetBookersListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetBookersListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetHotelsList">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetHotelsList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelsListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetHotelsListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDepartmentsList">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetDepartmentsList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetDepartmentsListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetDepartmentsListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="InformationService">
    <wsdl:port name="InformationServiceSoap" binding="tns:InformationServiceSoap">
      <soap:address location="http://116.62.146.178:9000/KWS_TRAIN/InformationService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>