<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.shijinet.com.cn/kunlun/kws/1.1/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://www.shijinet.com.cn/kunlun/kws/1.1/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.shijinet.com.cn/kunlun/kws/1.1/">
      <s:element name="NewGetAvailabilityListByCustom">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="extra_bed" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="adults" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="room_num" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="guesttype_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cust_account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="card_no" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="children" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotelArr" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="NewGetAvailabilityListByCustomResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="NewGetAvailabilityListByCustomResult" type="tns:ArrayOfAvailability" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfAvailability">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Availability" nillable="true" type="tns:Availability" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Availability">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelInfo" type="tns:HotelInfoSummary" />
          <s:element minOccurs="0" maxOccurs="1" name="RateInfos" type="tns:ArrayOfRateInfo" />
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
      <s:complexType name="CommonInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
        </s:sequence>
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
      <s:complexType name="ArrayOfCommonInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CommonInfo" nillable="true" type="tns:CommonInfo" />
        </s:sequence>
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
      <s:complexType name="ArrayOfPackage">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Package" nillable="true" type="tns:Package" />
        </s:sequence>
      </s:complexType>
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
      <s:complexType name="Source">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="mcode" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
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
      <s:complexType name="ArrayOfGuaranteeRule">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GuaranteeRule" nillable="true" type="tns:GuaranteeRule" />
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
      <s:complexType name="Province">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Country" type="tns:Country" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="Country">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo" />
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfRateInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RateInfo" nillable="true" type="tns:RateInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RateInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Default_Rate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Rate" type="tns:Rate" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomRateDetails" type="tns:ArrayOfRoomRateDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRoomRateDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RoomRateDetail" nillable="true" type="tns:RoomRateDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RoomRateDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RoomTypeDetail" type="tns:RoomTypeDetail" />
          <s:element minOccurs="0" maxOccurs="1" name="RateDetailDailys" type="tns:ArrayOfRateDetailDaily" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRateDetailDaily">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RateDetailDaily" nillable="true" type="tns:RateDetailDaily" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RateDetailDaily">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Resv_coupon_Code" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Resv_points" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Status" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="InHouseDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="price" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="prs_1" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="prs_2" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="prs_3" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="prs_4" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="prs_5" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="isWeekend" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="ExtraBed" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Child" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Tax" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="TaxFlag" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ServiceCharge" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="ServiceChargeFlag" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Des" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="AvailableRooms" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfPackage" />
        </s:sequence>
      </s:complexType>
      <s:element name="KwsSoapHeader" type="tns:KwsSoapHeader" />
      <s:complexType name="KwsSoapHeader">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="SessionId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RetCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ErrReason" type="s:string" />
        </s:sequence>
        <s:anyAttribute />
      </s:complexType>
      <s:element name="GetAvailabilityListByCustom">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="min_price" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="max_price" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="extra_bed" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="adults" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="room_num" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="guesttype_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cust_account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="card_no" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="children" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="groupCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="countryCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cityCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="tag" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotelName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="starCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilityListByCustomResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAvailabilityListByCustomResult" type="tns:ArrayOfAvailability" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilityList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="min_price" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="max_price" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="extra_bed" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="adults" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="room_num" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="guesttype_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cust_account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="card_no" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="children" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="groupCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="countryCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cityCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="tag" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotelName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="starCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilityListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAvailabilityListResult" type="tns:ArrayOfAvailability" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilityListPerPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="min_price" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="max_price" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="extra_bed" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="adults" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="room_num" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="guesttype_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cust_account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="card_no" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="children" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="groupCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="countryCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cityCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="tag" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotelName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="starCode" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="currentPage" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilityListPerPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAvailabilityListPerPageResult" type="tns:ExtraAvailability" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ExtraAvailability">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="CountNums" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="OAvailabilityArr" type="tns:ArrayOfAvailability" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAvailabilityHotels">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="min_price" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="max_price" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="extra_bed" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="adults" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="room_num" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="guesttype_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cust_account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="card_no" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="children" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="groupCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="countryCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cityCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="tag" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotelName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="starCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilityHotelsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAvailabilityHotelsResult" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="HotelAvail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:HotelAvailIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="HotelAvailIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="min_price" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="max_price" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="adults" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="room_num" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="extra_bed" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="children" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="guesttype_code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="cust_account" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="card_no" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="card_type" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="card_level" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="groupCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="countryCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="cityCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="hotelName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="starCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="HotelAvailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="HotelAvailResult" type="tns:ArrayOfHotelInfoSummary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfHotelInfoSummary">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="HotelInfoSummary" nillable="true" type="tns:HotelInfoSummary" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetBestAvailability">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="availabilityRequest" type="tns:AvailabilityRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="AvailabilityRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PromotionCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="ExtraBed" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Adults" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="RoomNum" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="GuesttypeCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CustAccount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardNo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardLevel" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Children" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Channel" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="BarType" type="tns:BarType" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GroupType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IsAllPrices" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:simpleType name="BarType">
        <s:restriction base="s:string">
          <s:enumeration value="NONE" />
          <s:enumeration value="BAR" />
          <s:enumeration value="DBAR" />
        </s:restriction>
      </s:simpleType>
      <s:element name="GetBestAvailabilityResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBestAvailabilityResult" type="tns:Availability" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailability">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="extra_bed" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="adults" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="room_num" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="guesttype_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cust_account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="card_no" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="children" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilityResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAvailabilityResult" type="tns:Availability" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilitybyRateCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="rateRequest" type="tns:GetAvailabilitybyRateCodeIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetAvailabilitybyRateCodeIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Adults" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="RoomNum" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="GuesttypeCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CustAccount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardNo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardLevel" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Children" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Channel" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="BarType" type="tns:BarType" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GroupType" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAvailabilitybyRateCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAvailabilitybyRateCodeResult" type="tns:Availability" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRoomDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="roomtype_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRoomDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRoomDetailResult" type="tns:RoomTypeDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRateDetailSummary">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="room_type" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="rate_code" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="date" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRateDetailSummaryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRateDetailSummaryResult" type="tns:RateDetailSummary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RateDetailSummary">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Rate" type="tns:Rate" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomType" type="tns:Roomtype" />
          <s:element minOccurs="1" maxOccurs="1" name="Price" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="FromDt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="ToDt" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomNumbers" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Prs1" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Prs2" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Prs3" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Prs4" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Prs5" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Wprs1" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Wprs2" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Wprs3" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Wprs4" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Wprs5" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="ExtraBed" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="WextraBed" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Child" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Wchild" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Memo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Hotel" type="tns:Hotel" />
          <s:element minOccurs="0" maxOccurs="1" name="WeekControl" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="SumPrice" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfPackage" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetRateDetailDaily">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="channel_code" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="rooms" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="rate_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="room_type" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRateDetailDailyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRateDetailDailyResult" type="tns:RateInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBestRateDetailDaily">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="rateDetailRequest" type="tns:RateDetailRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RateDetailRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Hotel_code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Channel" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Rate_code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Roomtype_code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Card_no" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardLevel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="BarType" type="tns:BarType" />
          <s:element minOccurs="1" maxOccurs="1" name="Room_num" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="GroupType" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Adults" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="IsAllPrices" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetBestRateDetailDailyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBestRateDetailDailyResult" type="tns:RateInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDailyInventory">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="dtBegin" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="dtEnd" type="s:dateTime" />
            <s:element minOccurs="0" maxOccurs="1" name="room_type" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDailyInventoryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDailyInventoryResult" type="tns:HotelDailyInventory" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="HotelDailyInventory">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DailyInventories" type="tns:ArrayOfDailyInventory" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfDailyInventory">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DailyInventory" nillable="true" type="tns:DailyInventory" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DailyInventory">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Datum" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="HouseOverBook" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomTypeInventories" type="tns:ArrayOfDailyInventoryRoomTypeInventory" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfDailyInventoryRoomTypeInventory">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DailyInventoryRoomTypeInventory" nillable="true" type="tns:DailyInventoryRoomTypeInventory" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DailyInventoryRoomTypeInventory">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Status" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomType" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Generic" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="PhysicalRooms" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="RoomTypeOverbook" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="OutOfOrder" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="AvailableRooms" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomTypeColor" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomTypeName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Definite" type="tns:RoomTypeInventoryDefinite" />
          <s:element minOccurs="0" maxOccurs="1" name="Tentative" type="tns:RoomTypeInventoryTentative" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RoomTypeInventoryDefinite">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Count" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="BlockCount" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="ResvCount" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RoomTypeInventoryTentative">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Count" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="BlockCount" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="ResvCount" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetRatePlan">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="room_type" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="rate_code" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="begin_date" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="end_date" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRatePlanResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRatePlanResult" type="tns:ArrayOfRatePlan" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfRatePlan">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RatePlan" nillable="true" type="tns:RatePlan" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RatePlan">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RateHeader" type="tns:RateHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="RateDetail" type="tns:ArrayOfRateDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RateHeader">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="CateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RatePlan" type="tns:CommonInfo" />
          <s:element minOccurs="1" maxOccurs="1" name="MinLos" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="MaxLos" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="AdvBookin" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="MaxAdvBookin" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Des" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ShortInfo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LongInfo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Segments" type="tns:ArrayOfSegment" />
          <s:element minOccurs="0" maxOccurs="1" name="Sources" type="tns:ArrayOfSource" />
          <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfPackage" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="SortId" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSegment">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Segment" nillable="true" type="tns:Segment" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSource">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Source" nillable="true" type="tns:Source" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRateDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RateDetail" nillable="true" type="tns:RateDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RateDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RoomType" type="tns:CommonInfo" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="WeekControls" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Price1" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Price2" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Price3" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Price4" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="Price5" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="PriceBed" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="PriceChild" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="TaxFlag" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Tax" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="ServiceChargeFlag" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ServiceCharge" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="Des" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfPackage" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetRateSwitch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="channel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="rate_code" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="year" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRateSwitchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRateSwitchResult" type="tns:RateSwitch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RateSwitch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChannelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DayStatus" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Year" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSeparateSoldPackage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="separateSoldPackageIn" type="tns:SeparateSoldPackageIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SeparateSoldPackageIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSeparateSoldPackageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeparateSoldPackageResult" type="tns:SeparateSoldPackageOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SeparateSoldPackageOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfPackage" />
        </s:sequence>
      </s:complexType>
      <s:element name="CalculateSeparateSoldPackage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="calculationSeparateSoldPackageIn" type="tns:CalculationSeparateSoldPackageIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="CalculationSeparateSoldPackageIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PackageCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Adults" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Children" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Rooms" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndDate" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="CalculateSeparateSoldPackageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CalculateSeparateSoldPackageResult" type="tns:CalculationSeparateSoldPackageOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="CalculationSeparateSoldPackageOut">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="TotalPrice" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="TotalQuantity" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="PackageDesc" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemInfos" type="tns:ArrayOfItemInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="DailyPackages" type="tns:ArrayOfDailyPackage" />
          <s:element minOccurs="0" maxOccurs="1" name="DailyItems" type="tns:ArrayOfDailyItem" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfDailyPackage">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DailyPackage" nillable="true" type="tns:DailyPackage" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DailyPackage">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PackageCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Price" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="PackageName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CalculationRule" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfDailyItem">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DailyItem" nillable="true" type="tns:DailyItem" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DailyItem">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PackageCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PackageName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="SubTotalQuantity" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSeparateSoldItems">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getItemIn" type="tns:SeparateSoldItemIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SeparateSoldItemIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ItemClassCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemKey" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSeparateSoldItemsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeparateSoldItemsResult" type="tns:SeparateSoldItemOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SeparateSoldItemOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ItemInfos" type="tns:ArrayOfItemInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetItemDailyInventory">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getItemDailyInventoryIn" type="tns:GetItemDailyInventoryIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetItemDailyInventoryIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ItemClassCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="KeyWord" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="FromDt" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="ToDt" nillable="true" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetItemDailyInventoryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemDailyInventoryResult" type="tns:GetItemDailyInventoryOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetItemDailyInventoryOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ItemDailyInventoryInfos" type="tns:ArrayOfItemDailyInventoryInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfItemDailyInventoryInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ItemDailyInventoryInfo" nillable="true" type="tns:ItemDailyInventoryInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ItemDailyInventoryInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="AvailableQuantity" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="LimitInventory" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAvailabilityPackage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getAvailabilityPackageIn" type="tns:GetAvailabilityPackageIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetAvailabilityPackageIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomTypeCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Adult" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Children" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Rooms" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAvailabilityPackageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAvailabilityPackageResult" type="tns:GetAvailabilityPackageOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetAvailabilityPackageOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="AvailabilityPackages" type="tns:ArrayOfAvailabilityPackage" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfAvailabilityPackage">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="AvailabilityPackage" nillable="true" type="tns:AvailabilityPackage" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="AvailabilityPackage">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Package" type="tns:Package" />
          <s:element minOccurs="0" maxOccurs="1" name="DailyPackages" type="tns:ArrayOfDailyPackage" />
          <s:element minOccurs="0" maxOccurs="1" name="DailyItems" type="tns:ArrayOfDailyItem" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckItemIsEnough">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="checkItemIsEnoughIn" type="tns:CheckItemIsEnoughIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="CheckItemIsEnoughIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="DailyItems" type="tns:ArrayOfDailyItem" />
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Hotel_code" type="tns:CommonInfo" />
          <s:element minOccurs="1" maxOccurs="1" name="Room_num" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Roomtype_code" type="tns:CommonInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="Rate_code" type="tns:CommonInfo" />
          <s:element minOccurs="1" maxOccurs="1" name="Adults" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Children" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfPackage" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckItemIsEnoughResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CheckItemIsEnoughResult" type="tns:ArrayOfCheckItemIsEnoughOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfCheckItemIsEnoughOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CheckItemIsEnoughOut" nillable="true" type="tns:CheckItemIsEnoughOut" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CheckItemIsEnoughOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Dt" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="OverstepQuantity" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LimitInventory" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckRateAndRoomTypeEnabled">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="checkRateAndRoomTypeEnabledIn" type="tns:CheckRateAndRoomTypeEnabledIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="CheckRateAndRoomTypeEnabledIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Packages" type="tns:ArrayOfSeparateSoldPackages" />
          <s:element minOccurs="0" maxOccurs="1" name="ChannelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomTypeCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Adult" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Children" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="ExtraBed" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="RoomNumber" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="BarType" type="tns:BarType" />
          <s:element minOccurs="0" maxOccurs="1" name="GuestTypeCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MemberID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardLevel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GroupType" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSeparateSoldPackages">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="SeparateSoldPackages" nillable="true" type="tns:SeparateSoldPackages" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="SeparateSoldPackages">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PackageCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndDate" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckRateAndRoomTypeEnabledResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CheckRateAndRoomTypeEnabledResult" type="tns:CheckRateAndRoomTypeEnabledOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="CheckRateAndRoomTypeEnabledOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RateAndRoomTypeEnabledList" type="tns:ArrayOfRateAndRoomTypeEnabled" />
          <s:element minOccurs="1" maxOccurs="1" name="TotalPrice" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="OrderRoomStays" type="tns:ArrayOfOrderRoomStayInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="PackageOut" type="tns:CalculationSeparateSoldPackageOut" />
          <s:element minOccurs="0" maxOccurs="1" name="OGuaranteeRule" type="tns:ArrayOfGuaranteeRule" />
          <s:element minOccurs="0" maxOccurs="1" name="RatePackages" type="tns:ArrayOfAvailabilityPackage" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRateAndRoomTypeEnabled">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RateAndRoomTypeEnabled" nillable="true" type="tns:RateAndRoomTypeEnabled" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RateAndRoomTypeEnabled">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderRoomStayInfo" type="tns:OrderRoomStayInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="CheckItem" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderRoomStayInfo">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="OrderID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="DT" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="RoomTypeCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="RateAmount" type="s:decimal" />
              <s:element minOccurs="1" maxOccurs="1" name="Tax" type="s:decimal" />
              <s:element minOccurs="1" maxOccurs="1" name="ServiceCharge" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="CurrencyType" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="DiscountAmount" type="s:decimal" />
              <s:element minOccurs="1" maxOccurs="1" name="DiscountPercent" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="DiscountReason" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="StatusCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="RoomNum" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Adults" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="LastOperator" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="ExtraBed" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="RoomNo" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Children" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FixedRate" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Source" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Market" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="RTC" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Couponcode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Points" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="CouponNum" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="AavailableRooms" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="SerialNumber" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="IsInverse" type="s:boolean" />
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
      <s:complexType name="ArrayOfOrderRoomStayInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderRoomStayInfo" nillable="true" type="tns:OrderRoomStayInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAvailabilityInventory">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="room_num" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAvailabilityInventoryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAvailabilityInventoryResult" type="tns:AvailabilityInventory" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="AvailabilityInventory">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelInfo" type="tns:HotelInfoSummary" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomDetails" type="tns:ArrayOfRoomDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfRoomDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="RoomDetail" nillable="true" type="tns:RoomDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RoomDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RoomType" type="tns:Roomtype" />
          <s:element minOccurs="0" maxOccurs="1" name="AvailableRooms" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetEcryption">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="key" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="action" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEcryptionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEcryptionResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBestAvailabilityARI">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ARIRequest" type="tns:AvailabilityRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBestAvailabilityARIResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBestAvailabilityARIResult" type="tns:Availability" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRateRestrictions">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRateRestrictionsIn" type="tns:GetRateRestrictionsIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetRateRestrictionsIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Channel" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Start" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="End" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomTypeCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetRateRestrictionsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRateRestrictionsResult" type="tns:ArrayOfGetRateRestrictionsOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfGetRateRestrictionsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GetRateRestrictionsOut" nillable="true" type="tns:GetRateRestrictionsOut" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GetRateRestrictionsOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Channel" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="RestrictionType" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="RestrictionValue" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Dow" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HouseLevel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomTypeCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RateCate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomClass" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Los" type="s:string" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="NewGetAvailabilityListByCustomSoapIn">
    <wsdl:part name="parameters" element="tns:NewGetAvailabilityListByCustom" />
  </wsdl:message>
  <wsdl:message name="NewGetAvailabilityListByCustomSoapOut">
    <wsdl:part name="parameters" element="tns:NewGetAvailabilityListByCustomResponse" />
  </wsdl:message>
  <wsdl:message name="NewGetAvailabilityListByCustomKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListByCustomSoapIn">
    <wsdl:part name="parameters" element="tns:GetAvailabilityListByCustom" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListByCustomSoapOut">
    <wsdl:part name="parameters" element="tns:GetAvailabilityListByCustomResponse" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListByCustomKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListSoapIn">
    <wsdl:part name="parameters" element="tns:GetAvailabilityList" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListSoapOut">
    <wsdl:part name="parameters" element="tns:GetAvailabilityListResponse" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListPerPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetAvailabilityListPerPage" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListPerPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetAvailabilityListPerPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityListPerPageKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityHotelsSoapIn">
    <wsdl:part name="parameters" element="tns:GetAvailabilityHotels" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityHotelsSoapOut">
    <wsdl:part name="parameters" element="tns:GetAvailabilityHotelsResponse" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityHotelsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="HotelAvailSoapIn">
    <wsdl:part name="parameters" element="tns:HotelAvail" />
  </wsdl:message>
  <wsdl:message name="HotelAvailSoapOut">
    <wsdl:part name="parameters" element="tns:HotelAvailResponse" />
  </wsdl:message>
  <wsdl:message name="HotelAvailKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetBestAvailabilitySoapIn">
    <wsdl:part name="parameters" element="tns:GetBestAvailability" />
  </wsdl:message>
  <wsdl:message name="GetBestAvailabilitySoapOut">
    <wsdl:part name="parameters" element="tns:GetBestAvailabilityResponse" />
  </wsdl:message>
  <wsdl:message name="GetBestAvailabilityKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilitySoapIn">
    <wsdl:part name="parameters" element="tns:GetAvailability" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilitySoapOut">
    <wsdl:part name="parameters" element="tns:GetAvailabilityResponse" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilitybyRateCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetAvailabilitybyRateCode" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilitybyRateCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetAvailabilitybyRateCodeResponse" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilitybyRateCodeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetRoomDetailSoapIn">
    <wsdl:part name="parameters" element="tns:GetRoomDetail" />
  </wsdl:message>
  <wsdl:message name="GetRoomDetailSoapOut">
    <wsdl:part name="parameters" element="tns:GetRoomDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetRoomDetailKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetRateDetailSummarySoapIn">
    <wsdl:part name="parameters" element="tns:GetRateDetailSummary" />
  </wsdl:message>
  <wsdl:message name="GetRateDetailSummarySoapOut">
    <wsdl:part name="parameters" element="tns:GetRateDetailSummaryResponse" />
  </wsdl:message>
  <wsdl:message name="GetRateDetailSummaryKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetRateDetailDailySoapIn">
    <wsdl:part name="parameters" element="tns:GetRateDetailDaily" />
  </wsdl:message>
  <wsdl:message name="GetRateDetailDailySoapOut">
    <wsdl:part name="parameters" element="tns:GetRateDetailDailyResponse" />
  </wsdl:message>
  <wsdl:message name="GetRateDetailDailyKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetBestRateDetailDailySoapIn">
    <wsdl:part name="parameters" element="tns:GetBestRateDetailDaily" />
  </wsdl:message>
  <wsdl:message name="GetBestRateDetailDailySoapOut">
    <wsdl:part name="parameters" element="tns:GetBestRateDetailDailyResponse" />
  </wsdl:message>
  <wsdl:message name="GetBestRateDetailDailyKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetDailyInventorySoapIn">
    <wsdl:part name="parameters" element="tns:GetDailyInventory" />
  </wsdl:message>
  <wsdl:message name="GetDailyInventorySoapOut">
    <wsdl:part name="parameters" element="tns:GetDailyInventoryResponse" />
  </wsdl:message>
  <wsdl:message name="GetDailyInventoryKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetRatePlanSoapIn">
    <wsdl:part name="parameters" element="tns:GetRatePlan" />
  </wsdl:message>
  <wsdl:message name="GetRatePlanSoapOut">
    <wsdl:part name="parameters" element="tns:GetRatePlanResponse" />
  </wsdl:message>
  <wsdl:message name="GetRatePlanKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetRateSwitchSoapIn">
    <wsdl:part name="parameters" element="tns:GetRateSwitch" />
  </wsdl:message>
  <wsdl:message name="GetRateSwitchSoapOut">
    <wsdl:part name="parameters" element="tns:GetRateSwitchResponse" />
  </wsdl:message>
  <wsdl:message name="GetRateSwitchKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSeparateSoldPackageSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeparateSoldPackage" />
  </wsdl:message>
  <wsdl:message name="GetSeparateSoldPackageSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeparateSoldPackageResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeparateSoldPackageKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="CalculateSeparateSoldPackageSoapIn">
    <wsdl:part name="parameters" element="tns:CalculateSeparateSoldPackage" />
  </wsdl:message>
  <wsdl:message name="CalculateSeparateSoldPackageSoapOut">
    <wsdl:part name="parameters" element="tns:CalculateSeparateSoldPackageResponse" />
  </wsdl:message>
  <wsdl:message name="CalculateSeparateSoldPackageKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetSeparateSoldItemsSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeparateSoldItems" />
  </wsdl:message>
  <wsdl:message name="GetSeparateSoldItemsSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeparateSoldItemsResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeparateSoldItemsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetItemDailyInventorySoapIn">
    <wsdl:part name="parameters" element="tns:GetItemDailyInventory" />
  </wsdl:message>
  <wsdl:message name="GetItemDailyInventorySoapOut">
    <wsdl:part name="parameters" element="tns:GetItemDailyInventoryResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemDailyInventoryKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityPackageSoapIn">
    <wsdl:part name="parameters" element="tns:GetAvailabilityPackage" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityPackageSoapOut">
    <wsdl:part name="parameters" element="tns:GetAvailabilityPackageResponse" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityPackageKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="CheckItemIsEnoughSoapIn">
    <wsdl:part name="parameters" element="tns:CheckItemIsEnough" />
  </wsdl:message>
  <wsdl:message name="CheckItemIsEnoughSoapOut">
    <wsdl:part name="parameters" element="tns:CheckItemIsEnoughResponse" />
  </wsdl:message>
  <wsdl:message name="CheckItemIsEnoughKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="CheckRateAndRoomTypeEnabledSoapIn">
    <wsdl:part name="parameters" element="tns:CheckRateAndRoomTypeEnabled" />
  </wsdl:message>
  <wsdl:message name="CheckRateAndRoomTypeEnabledSoapOut">
    <wsdl:part name="parameters" element="tns:CheckRateAndRoomTypeEnabledResponse" />
  </wsdl:message>
  <wsdl:message name="CheckRateAndRoomTypeEnabledKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityInventorySoapIn">
    <wsdl:part name="parameters" element="tns:GetAvailabilityInventory" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityInventorySoapOut">
    <wsdl:part name="parameters" element="tns:GetAvailabilityInventoryResponse" />
  </wsdl:message>
  <wsdl:message name="GetAvailabilityInventoryKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetEcryptionSoapIn">
    <wsdl:part name="parameters" element="tns:GetEcryption" />
  </wsdl:message>
  <wsdl:message name="GetEcryptionSoapOut">
    <wsdl:part name="parameters" element="tns:GetEcryptionResponse" />
  </wsdl:message>
  <wsdl:message name="GetBestAvailabilityARISoapIn">
    <wsdl:part name="parameters" element="tns:GetBestAvailabilityARI" />
  </wsdl:message>
  <wsdl:message name="GetBestAvailabilityARISoapOut">
    <wsdl:part name="parameters" element="tns:GetBestAvailabilityARIResponse" />
  </wsdl:message>
  <wsdl:message name="GetBestAvailabilityARIKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetRateRestrictionsSoapIn">
    <wsdl:part name="parameters" element="tns:GetRateRestrictions" />
  </wsdl:message>
  <wsdl:message name="GetRateRestrictionsSoapOut">
    <wsdl:part name="parameters" element="tns:GetRateRestrictionsResponse" />
  </wsdl:message>
  <wsdl:message name="GetRateRestrictionsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:portType name="AvailabilityQuerySoap">
    <wsdl:operation name="NewGetAvailabilityListByCustom">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询可用酒店房价详情(过滤酒店CODE),输入条件:入住时间,离店时间,加床数,人数,房间数,客人类型,协议客户预订号,信用卡号,儿童数,渠道,酒店code数组</wsdl:documentation>
      <wsdl:input message="tns:NewGetAvailabilityListByCustomSoapIn" />
      <wsdl:output message="tns:NewGetAvailabilityListByCustomSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityListByCustom">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询可用酒店房价详情,输入条件:房价最小价格,房价最大价格,入住时间,离店时间,加床,人数,房间数,客人类型,协议客户预订号,信用卡号,儿童数,渠道,集团code,国家code,城市code,地标名称,酒店名称,星级级别</wsdl:documentation>
      <wsdl:input message="tns:GetAvailabilityListByCustomSoapIn" />
      <wsdl:output message="tns:GetAvailabilityListByCustomSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询可用酒店房价详情,输入条件:房价最小价格,房价最大价格,入住时间,离店时间,加床,人数,房间数,客人类型,协议客户预订号,信用卡号,儿童数,渠道,集团code,国家code,城市code,地标名称,酒店名称,星级级别</wsdl:documentation>
      <wsdl:input message="tns:GetAvailabilityListSoapIn" />
      <wsdl:output message="tns:GetAvailabilityListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityListPerPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">分页查询可用酒店房价详情,输入条件:房价最小价格,房价最大价格,入住时间,离店时间,加床,人数,房间数,客人类型,协议客户预订号,信用卡号,儿童数,渠道,集团code,国家code,城市code,地标名称,酒店名称,星级级别，每页数量，第几页</wsdl:documentation>
      <wsdl:input message="tns:GetAvailabilityListPerPageSoapIn" />
      <wsdl:output message="tns:GetAvailabilityListPerPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityHotels">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询可用房价酒店code列表,输入房价最小价格,房价最大价格,入住时间,离店时间,加床,人数,房间数,客人类型,协议客户预订号,信用卡号,儿童数,渠道,集团code,国家code,城市code,地标名称,酒店名称,星级级别</wsdl:documentation>
      <wsdl:input message="tns:GetAvailabilityHotelsSoapIn" />
      <wsdl:output message="tns:GetAvailabilityHotelsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="HotelAvail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询酒店列表,输入房价最小价格,房价最大价格,入住时间,离店时间,加床,人数,房间数,客人类型,协议客户预订号,信用卡号,儿童数,渠道,集团code,国家code,城市code,地标名称,酒店名称,星级级别</wsdl:documentation>
      <wsdl:input message="tns:HotelAvailSoapIn" />
      <wsdl:output message="tns:HotelAvailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBestAvailability">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据房价类型查询单个酒店房型和房价详情</wsdl:documentation>
      <wsdl:input message="tns:GetBestAvailabilitySoapIn" />
      <wsdl:output message="tns:GetBestAvailabilitySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAvailability">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询单个酒店房型和房价详情</wsdl:documentation>
      <wsdl:input message="tns:GetAvailabilitySoapIn" />
      <wsdl:output message="tns:GetAvailabilitySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilitybyRateCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询单个酒店某房价的房型和房价详情</wsdl:documentation>
      <wsdl:input message="tns:GetAvailabilitybyRateCodeSoapIn" />
      <wsdl:output message="tns:GetAvailabilitybyRateCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRoomDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询房型详情</wsdl:documentation>
      <wsdl:input message="tns:GetRoomDetailSoapIn" />
      <wsdl:output message="tns:GetRoomDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRateDetailSummary">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询房价详情概要</wsdl:documentation>
      <wsdl:input message="tns:GetRateDetailSummarySoapIn" />
      <wsdl:output message="tns:GetRateDetailSummarySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRateDetailDaily">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询某房型的每日房价详情</wsdl:documentation>
      <wsdl:input message="tns:GetRateDetailDailySoapIn" />
      <wsdl:output message="tns:GetRateDetailDailySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBestRateDetailDaily">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据房价类型(DBarRate)查询某房型的每日房价详情</wsdl:documentation>
      <wsdl:input message="tns:GetBestRateDetailDailySoapIn" />
      <wsdl:output message="tns:GetBestRateDetailDailySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDailyInventory">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询渠道房态信息</wsdl:documentation>
      <wsdl:input message="tns:GetDailyInventorySoapIn" />
      <wsdl:output message="tns:GetDailyInventorySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRatePlan">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询房价定义</wsdl:documentation>
      <wsdl:input message="tns:GetRatePlanSoapIn" />
      <wsdl:output message="tns:GetRatePlanSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRateSwitch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询房价开关</wsdl:documentation>
      <wsdl:input message="tns:GetRateSwitchSoapIn" />
      <wsdl:output message="tns:GetRateSwitchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeparateSoldPackage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询可单独销售的package，在某个订单上进行动态打包时选择</wsdl:documentation>
      <wsdl:input message="tns:GetSeparateSoldPackageSoapIn" />
      <wsdl:output message="tns:GetSeparateSoldPackageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CalculateSeparateSoldPackage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据客人选择的可单独销售的某个package，计算它的每日详情和总价</wsdl:documentation>
      <wsdl:input message="tns:CalculateSeparateSoldPackageSoapIn" />
      <wsdl:output message="tns:CalculateSeparateSoldPackageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeparateSoldItems">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取可以额外单独选择的所有item的信息</wsdl:documentation>
      <wsdl:input message="tns:GetSeparateSoldItemsSoapIn" />
      <wsdl:output message="tns:GetSeparateSoldItemsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemDailyInventory">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取日常库存信息</wsdl:documentation>
      <wsdl:input message="tns:GetItemDailyInventorySoapIn" />
      <wsdl:output message="tns:GetItemDailyInventorySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityPackage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询某个房价中的Package和Item信息，用于查询可用房结果后，循环房价详情来获得房价中绑定的package和Item信息</wsdl:documentation>
      <wsdl:input message="tns:GetAvailabilityPackageSoapIn" />
      <wsdl:output message="tns:GetAvailabilityPackageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckItemIsEnough">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">判断item库存是否足够</wsdl:documentation>
      <wsdl:input message="tns:CheckItemIsEnoughSoapIn" />
      <wsdl:output message="tns:CheckItemIsEnoughSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckRateAndRoomTypeEnabled">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">检查房价及房型的可用性</wsdl:documentation>
      <wsdl:input message="tns:CheckRateAndRoomTypeEnabledSoapIn" />
      <wsdl:output message="tns:CheckRateAndRoomTypeEnabledSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityInventory">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回某个酒店的房型和可用房量</wsdl:documentation>
      <wsdl:input message="tns:GetAvailabilityInventorySoapIn" />
      <wsdl:output message="tns:GetAvailabilityInventorySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEcryption">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">加密解密字符(action：0解密，1加密)</wsdl:documentation>
      <wsdl:input message="tns:GetEcryptionSoapIn" />
      <wsdl:output message="tns:GetEcryptionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBestAvailabilityARI">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据房价类型查询单个酒店可用房型和房价（ARI）</wsdl:documentation>
      <wsdl:input message="tns:GetBestAvailabilityARISoapIn" />
      <wsdl:output message="tns:GetBestAvailabilityARISoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRateRestrictions">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取某个酒店在某渠道的房价约束信息</wsdl:documentation>
      <wsdl:input message="tns:GetRateRestrictionsSoapIn" />
      <wsdl:output message="tns:GetRateRestrictionsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="AvailabilityQuerySoap" type="tns:AvailabilityQuerySoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="NewGetAvailabilityListByCustom">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/NewGetAvailabilityListByCustom" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:NewGetAvailabilityListByCustomKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:NewGetAvailabilityListByCustomKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityListByCustom">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAvailabilityListByCustom" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityListByCustomKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityListByCustomKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityList">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAvailabilityList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityListPerPage">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAvailabilityListPerPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityListPerPageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityListPerPageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityHotels">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAvailabilityHotels" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityHotelsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityHotelsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HotelAvail">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/HotelAvail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:HotelAvailKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:HotelAvailKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBestAvailability">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetBestAvailability" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetBestAvailabilityKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetBestAvailabilityKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAvailability">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAvailability" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilitybyRateCode">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAvailabilitybyRateCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilitybyRateCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilitybyRateCodeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRoomDetail">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetRoomDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetRoomDetailKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetRoomDetailKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRateDetailSummary">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetRateDetailSummary" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateDetailSummaryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateDetailSummaryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRateDetailDaily">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetRateDetailDaily" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateDetailDailyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateDetailDailyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBestRateDetailDaily">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetBestRateDetailDaily" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetBestRateDetailDailyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetBestRateDetailDailyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDailyInventory">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetDailyInventory" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetDailyInventoryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetDailyInventoryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRatePlan">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetRatePlan" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetRatePlanKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetRatePlanKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRateSwitch">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetRateSwitch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateSwitchKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateSwitchKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeparateSoldPackage">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSeparateSoldPackage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSeparateSoldPackageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSeparateSoldPackageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CalculateSeparateSoldPackage">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CalculateSeparateSoldPackage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CalculateSeparateSoldPackageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CalculateSeparateSoldPackageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeparateSoldItems">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetSeparateSoldItems" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetSeparateSoldItemsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetSeparateSoldItemsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemDailyInventory">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetItemDailyInventory" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetItemDailyInventoryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetItemDailyInventoryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityPackage">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAvailabilityPackage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityPackageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityPackageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckItemIsEnough">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CheckItemIsEnough" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CheckItemIsEnoughKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CheckItemIsEnoughKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckRateAndRoomTypeEnabled">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CheckRateAndRoomTypeEnabled" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CheckRateAndRoomTypeEnabledKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CheckRateAndRoomTypeEnabledKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAvailabilityInventory">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetAvailabilityInventory" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityInventoryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetAvailabilityInventoryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEcryption">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetEcryption" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBestAvailabilityARI">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetBestAvailabilityARI" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetBestAvailabilityARIKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetBestAvailabilityARIKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRateRestrictions">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetRateRestrictions" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateRestrictionsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetRateRestrictionsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="AvailabilityQuery">
    <wsdl:port name="AvailabilityQuerySoap" binding="tns:AvailabilityQuerySoap">
      <soap:address location="http://116.62.146.178:9000/KWS_TRAIN/AvailabilityService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>