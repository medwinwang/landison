<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.shijinet.com.cn/kunlun/kws/1.1/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://www.shijinet.com.cn/kunlun/kws/1.1/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.shijinet.com.cn/kunlun/kws/1.1/">
      <s:element name="CreateReservation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="oOrderInfo" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="OrderInfo">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Udf_1" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_2" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_3" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_4" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_5" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_6" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_7" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_8" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_9" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_10" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_11" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_12" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_13" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_14" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_15" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_16" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_17" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_18" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_19" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Udf_20" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GroupType" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="BarType" type="tns:BarType" />
              <s:element minOccurs="1" maxOccurs="1" name="Resv_points" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="RecommendedLevel" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ChannelConfirmID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ChannelCancelID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Deposit" type="tns:DepositInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="OriginalOrderInfo" type="tns:OriginalOrderInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="OrderRoomStayInfos" type="tns:ArrayOfOrderRoomStayInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="OrderInfoDiscounts" type="tns:ArrayOfOrderInfoDiscount" />
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="Isfixedrate" type="s:boolean" />
              <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="Hotel_code" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Guesttype_code" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="GuestID" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Room_num" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Roomtype_code" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Rate_code" type="tns:CommonInfo" />
              <s:element minOccurs="1" maxOccurs="1" name="Rate" type="s:decimal" />
              <s:element minOccurs="1" maxOccurs="1" name="Wrate" type="s:decimal" />
              <s:element minOccurs="1" maxOccurs="1" name="Adults" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Children" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Extra_bed" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Firstname" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Lastname" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CountryCode" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Address" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Fax" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Phone" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Email" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="IdNumber" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CredittypeCode" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="CardHolder" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Creditid" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Expire" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="Makedate" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="Maker" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="InsertUserName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="UpdateUserName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Makehotel_code" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Flag" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Status_code" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ConfirmID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BookerID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BookerName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BookerMobile" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BookerEmail" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SplitOrderIds" type="tns:ArrayOfSplitOrderId" />
              <s:element minOccurs="0" maxOccurs="1" name="MoreOccupants" type="tns:ArrayOfMoreOccupant" />
              <s:element minOccurs="0" maxOccurs="1" name="SynchroSplitOrder" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="OriginalOrderId" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Infant" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="City" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Languag_code" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Title" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Province_code" type="tns:CommonInfo" />
              <s:element minOccurs="1" maxOccurs="1" name="Birthday" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="Company" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Roomno" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Email_confirm" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Com_ok" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Order_type" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="InitialRateDateTime" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="Total_revenue" type="s:decimal" />
              <s:element minOccurs="1" maxOccurs="1" name="InitialPrice" type="s:decimal" />
              <s:element minOccurs="1" maxOccurs="1" name="Com_err" type="s:short" />
              <s:element minOccurs="0" maxOccurs="1" name="Market" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Source" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Sex" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Postcode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Channel" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="C_card_err" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ChineseName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Turn_away" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Fly_num" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ArrivalTime" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DepartTime" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Member_id" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="CardType" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="CardLevel" type="tns:CommonInfo" />
              <s:element minOccurs="1" maxOccurs="1" name="Adj" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="CancelID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Pms_res_id" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="PmsCancelId" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Reservation_type" type="tns:CommonInfo" />
              <s:element minOccurs="0" maxOccurs="1" name="Special_codes" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Mobile" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Keep_hour" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="Chname" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GroupID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Zip" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Office_phone" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="CustID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Address1" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Address2" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Address3" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Address4" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Id_no" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="CancelDate" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="DepositCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CommisionCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CancelCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Promotion_Code" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Ffp_Id" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Provider_code" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Provider_key" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="PartyNO" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="CrsPartyNO" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="ShareCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ArrivalTransportationYN" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ArrivalTransportType" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ArrivalStationCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ArrivalCarrierCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="ArrivalDateTime" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="ArrivalTransportNo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ArrivalComments" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DepartureTransportationYN" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DepartureTransportType" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DepartureStationCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DepartureCarrierCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="DepartureDateTime" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="DepartureTransportNo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DepartureComments" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="PayMentGateWay" type="tns:ArrayOfOrderInfoPaymentGateway" />
              <s:element minOccurs="0" maxOccurs="1" name="Accompanyings" type="tns:ArrayOfOrderInfoAccompanying" />
              <s:element minOccurs="0" maxOccurs="1" name="OrderInfoTraceTextsList" type="tns:ArrayOfOrderInfoTraceTexts" />
              <s:element minOccurs="0" maxOccurs="1" name="DailyItems" type="tns:ArrayOfDailyItem" />
              <s:element minOccurs="0" maxOccurs="1" name="OrderInfoPackageList" type="tns:ArrayOfOrderInfoPackage" />
              <s:element minOccurs="0" maxOccurs="1" name="OrderInfoAlertsList" type="tns:ArrayOfOrderInfoAlerts" />
              <s:element minOccurs="0" maxOccurs="1" name="Payment" type="tns:Payment" />
              <s:element minOccurs="1" maxOccurs="1" name="GuestInfoId" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="DepositScheduleInfo" type="tns:OrderInfoDepositSchedule" />
              <s:element minOccurs="0" maxOccurs="1" name="CancelScheduleInfo" type="tns:OrderInfoCancelSchedule" />
              <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="BlockCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="OrderInfoComments" type="tns:ArrayOfOrderInfoComments" />
              <s:element minOccurs="0" maxOccurs="1" name="DicInfoFfp" type="tns:ArrayOfFfpAttribute" />
              <s:element minOccurs="0" maxOccurs="1" name="MemberInfoFfp" type="tns:ArrayOfMemberInfoFFP" />
              <s:element minOccurs="0" maxOccurs="1" name="TravelAgency" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SourceOfBusiness" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="IdOfTravelAgency" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="IdOfSourceBusiness" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="AccountOfTravelAgency" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="AccountOfSourceBusiness" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CompanyName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CompanyAccount" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="CompanyID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="CroPermissionName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DiscountMethod" type="s:string" />
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
      <s:complexType name="MemberInfoFFP">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="MemberNo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FfpId" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FfpCardType" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FfpCardLevel" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FfpCardNo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CardStatus" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="IsBinding" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Mileages" type="s:decimal" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="FfpAttribute">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="FfpTypeCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FfpTypeName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FfpType" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FfpLevelName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="FfpLevalCode" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="OrderInfoComments">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="OrderID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="ReservationType" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="OrderInfoPaymentGateway">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="OrderId" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="PaymentDate" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="Amount_type" type="tns:Amount_type" />
              <s:element minOccurs="0" maxOccurs="1" name="Currency" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Amount" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="GatewayReferenceNo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GatewayIdentification" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="ExpirePayment" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="CardHolderPayment" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Category" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Status" type="tns:PayMentStatus" />
              <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Points" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="PaymentCode" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="OrderType" type="tns:DataType" />
              <s:element minOccurs="1" maxOccurs="1" name="Update_status" type="tns:PayMentStatus" />
              <s:element minOccurs="0" maxOccurs="1" name="UseCouponIn" type="tns:UseCouponIn" />
              <s:element minOccurs="1" maxOccurs="1" name="IsCancelRule" type="s:boolean" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:simpleType name="Amount_type">
        <s:restriction base="s:string">
          <s:enumeration value="POINTS" />
          <s:enumeration value="MONEY" />
          <s:enumeration value="CARDVALUE" />
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="PayMentStatus">
        <s:restriction base="s:string">
          <s:enumeration value="PAID" />
          <s:enumeration value="CANCEL" />
          <s:enumeration value="UNPAID" />
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="DataType">
        <s:restriction base="s:string">
          <s:enumeration value="RESVROOM" />
          <s:enumeration value="PURCHASEPOINTS" />
          <s:enumeration value="TOPUP" />
        </s:restriction>
      </s:simpleType>
      <s:complexType name="UseCouponIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="SerialNumber" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardNo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PlaceCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="MoreOccupant">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="OccupantFirstName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="OccupantLastName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="OccupantChineseName" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="SplitOrderId">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="SplitOrderIds" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SplitOrderstatus" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="OrderInfoDiscount">
        <s:complexContent mixed="false">
          <s:extension base="tns:BaseInfo">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="OrderID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="DiscountDt" type="s:dateTime" />
              <s:element minOccurs="0" maxOccurs="1" name="DiscountMethod" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="DiscountAmount" type="s:decimal" />
              <s:element minOccurs="0" maxOccurs="1" name="SerialNumber" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="RecordNumber" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DiscountReasonCode" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DiscountReasonName" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DiscountPercentage" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
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
              <s:element minOccurs="0" maxOccurs="1" name="DiscountPercentage" type="s:string" />
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
      <s:simpleType name="BarType">
        <s:restriction base="s:string">
          <s:enumeration value="NONE" />
          <s:enumeration value="BAR" />
          <s:enumeration value="DBAR" />
        </s:restriction>
      </s:simpleType>
      <s:complexType name="DepositInfo">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="RequestDeposit" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="ReceiveDeposit" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="CurrencyCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OriginalOrderInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OriginalFirstName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OriginalBundledRoomCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OriginalIdList" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OriginalId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OriginaStatus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OriginalTotalRevenue" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OriginalRoomNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OriginalOrderId" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderRoomStayInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderRoomStayInfo" nillable="true" type="tns:OrderRoomStayInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderInfoDiscount">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderInfoDiscount" nillable="true" type="tns:OrderInfoDiscount" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CommonInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
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
              <s:element minOccurs="0" maxOccurs="1" name="PostNextDay" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfItemInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ItemInfo" nillable="true" type="tns:ItemInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSplitOrderId">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="SplitOrderId" nillable="true" type="tns:SplitOrderId" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfMoreOccupant">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="MoreOccupant" nillable="true" type="tns:MoreOccupant" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderInfoPaymentGateway">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderInfoPaymentGateway" nillable="true" type="tns:OrderInfoPaymentGateway" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderInfoAccompanying">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderInfoAccompanying" nillable="true" type="tns:OrderInfoAccompanying" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderInfoAccompanying">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderID" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="FirstName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LastName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Mobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CountryCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ProvinceCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Address" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Birthday" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Title" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Email" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChineseName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BookerName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderInfoTraceTexts">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderInfoTraceTexts" nillable="true" type="tns:OrderInfoTraceTexts" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderInfoTraceTexts">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="TraceDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="PmsDepartmentCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PmsDepartmentName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TraceTexts" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ResolveDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="ResolveUser" type="s:string" />
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
      <s:complexType name="ArrayOfOrderInfoPackage">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderInfoPackage" nillable="true" type="tns:OrderInfoPackage" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderInfoPackage">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Package" type="tns:Package" />
          <s:element minOccurs="0" maxOccurs="1" name="DailyPackages" type="tns:ArrayOfDailyPackage" />
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
          <s:element minOccurs="0" maxOccurs="1" name="PostNextDay" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderInfoAlerts">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderInfoAlerts" nillable="true" type="tns:OrderInfoAlerts" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderInfoAlerts">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="AlertCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Area" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="SortId" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderInfoDepositSchedule">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="DepositRuleCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Amount" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="DueDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderInfoCancelSchedule">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="CancelRuleCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Amount" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="DueDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderInfoComments">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderInfoComments" nillable="true" type="tns:OrderInfoComments" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfFfpAttribute">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FfpAttribute" nillable="true" type="tns:FfpAttribute" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfMemberInfoFFP">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="MemberInfoFFP" nillable="true" type="tns:MemberInfoFFP" />
        </s:sequence>
      </s:complexType>
      <s:element name="CreateReservationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateReservationResult" type="tns:OrderInfo" />
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
      <s:element name="GetCancelRuleByOrderId">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="orderId" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCancelRuleByOrderIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCancelRuleByOrderIdResult" type="tns:CancelRule" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="CancelRule">
        <s:complexContent mixed="false">
          <s:extension base="tns:CommonInfo">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="type" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="day_before_arrival" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="cancel_before_time" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="cancel_before_time_minit" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="cancel_before_time_str" type="s:string" />
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
          <s:element minOccurs="1" maxOccurs="1" name="cancel_before_time_minit" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="cancel_before_time_str" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="penalty_fee" type="s:decimal" />
        </s:sequence>
      </s:complexType>
      <s:element name="PegasusCreateReservation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="oOrderInfo" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PegasusCreateReservationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PegasusCreateReservationResult" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ModifyReservation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="oOrderInfo" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ModifyReservationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ModifyReservationResult" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PegasusModifyReservation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="oOrderInfo" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PegasusModifyReservationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PegasusModifyReservationResult" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelReservation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="comments" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelReservationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CancelReservationResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="comments" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="croPermission" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CancelOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddorderInfoPaymentGateway">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="paymentGateway" type="tns:OrderInfoPaymentGateway" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddorderInfoPaymentGatewayResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AddorderInfoPaymentGatewayResult" type="tns:OrderInfoPaymentGateway" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddAndUpdateOrderInfoPaymentGateway">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="paymentGateway" type="tns:OrderInfoPaymentGateway" />
            <s:element minOccurs="1" maxOccurs="1" name="id" nillable="true" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isRequiredCredit" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="creditId" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cardHolder" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="expire" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="isCancelPayment" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddAndUpdateOrderInfoPaymentGatewayResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AddAndUpdateOrderInfoPaymentGatewayResult" type="tns:OrderInfoPaymentGateway" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CompelCancelReservation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="comments" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="croPermission" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CompelCancelReservationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CompelCancelReservationResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PegasusCancelReservation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="comments" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="channelCancelID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PegasusCancelReservationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="PegasusCancelReservationResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PegasusSetDepositsNotification">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="oOrderInfo" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PegasusSetDepositsNotificationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="PegasusSetDepositsNotificationResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OrderQuery">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="beginMakedate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="endMakedate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="0" maxOccurs="1" name="status_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="reservation_type" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="firstname" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="lastname" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="guest_id" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="guestType" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OrderQueryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OrderQueryResult" type="tns:ArrayOfOrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfOrderInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderInfo" nillable="true" type="tns:OrderInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="OrderQueryPerPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="beginMakedate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="endMakedate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="arrival" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="departure" type="s:dateTime" />
            <s:element minOccurs="0" maxOccurs="1" name="status_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="reservation_type" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hotel_code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="firstname" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="lastname" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="guest_id" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="guestType" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="currentPage" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OrderQueryPerPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OrderQueryPerPageResult" type="tns:ExtraOrderInfoSummary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ExtraOrderInfoSummary">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="CountNums" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="OOrderArr" type="tns:ArrayOfOrderInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="QueryOrderPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:QueryOrderPageIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="QueryOrderPageIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginArrivalDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndArrivalDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginDepartureDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndDepartureDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginInsertDate" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndInsertDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Hotels" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="FirstName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LastName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ProfileId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardNumber" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PhoneNumber" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Party" type="tns:Party" />
          <s:element minOccurs="0" maxOccurs="1" name="PageInfo" type="tns:PageInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="BlockCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChannelConfirmID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PmsId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ShareCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Channel" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="InsertUser" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CancelId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChannelCancelId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PmsCancelId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChineseName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BookerName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BookerMobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="StatusCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CompanyType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RoomNo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IsRtOrigOrder" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Party">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PartyNo" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="PartyAction" type="tns:PartyAction" />
        </s:sequence>
      </s:complexType>
      <s:simpleType name="PartyAction">
        <s:restriction base="s:string">
          <s:enumeration value="SELECT" />
          <s:enumeration value="ADD" />
          <s:enumeration value="CHANGE" />
        </s:restriction>
      </s:simpleType>
      <s:complexType name="PageInfo">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="PageIndex" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="PageSize" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="TotalRecords" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="QueryOrderPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryOrderPageResult" type="tns:QueryOrderPageOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="QueryOrderPageOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfos" type="tns:ArrayOfOrderInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="PageInfo" type="tns:PageInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetOrderInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderInfoResult" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderLogs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderLogsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderLogsResult" type="tns:ArrayOfOrderLog" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfOrderLog">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderLog" nillable="true" type="tns:OrderLog" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderLog">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Content" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="InsertUser" type="tns:CommonInfo" />
          <s:element minOccurs="1" maxOccurs="1" name="InserDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetOrderInfoByEmailAndID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="email" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoByEmailAndIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderInfoByEmailAndIDResult" type="tns:OrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoByGuestType">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="guestType" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="account" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="beginMakedate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="endMakedate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoByGuestTypeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderInfoByGuestTypeResult" type="tns:ArrayOfOrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PNR" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderIDResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoComments">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="OrderID" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoCommentsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderInfoCommentsResult" type="tns:ArrayOfOrderInfoComments" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SelfCheckInAllowed">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SelfCheckInAllowedResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SelfCheckInAllowedResult" type="tns:SelfCheckInAllowedInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SelfCheckInAllowedInfo">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Allowed" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="AllowedTime" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetOrderInfoAlert">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getOrderInfoAlertIn" type="tns:GetOrderInfoAlertIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetOrderInfoAlertIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetOrderInfoAlertResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderInfoAlertResult" type="tns:GetOrderInfoAlertOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetOrderInfoAlertOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfoAlertsList" type="tns:ArrayOfOrderInfoAlerts" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetOrderInfoTrace">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getOrderInfoTraceIn" type="tns:GetOrderInfoTraceIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetOrderInfoTraceIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetOrderInfoTraceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderInfoTraceResult" type="tns:GetOrderInfoTraceOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GetOrderInfoTraceOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfoTraceList" type="tns:ArrayOfOrderInfoTraceTexts" />
        </s:sequence>
      </s:complexType>
      <s:element name="SaveOrderInfoAlert">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="saveOrderInfoAlertIn" type="tns:SaveOrderInfoAlertIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SaveOrderInfoAlertIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="SaveAction" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfoAlerts" type="tns:OrderInfoAlerts" />
        </s:sequence>
      </s:complexType>
      <s:element name="SaveOrderInfoAlertResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SaveOrderInfoAlertResult" type="tns:SaveOrderInfoAlertOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SaveOrderInfoAlertOut">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfoAlerts" type="tns:OrderInfoAlerts" />
        </s:sequence>
      </s:complexType>
      <s:element name="SaveOrderInfoTrace">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="saveOrderInfoTraceIn" type="tns:SaveOrderInfoTraceIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SaveOrderInfoTraceIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="SaveAction" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfoTraceTexts" type="tns:OrderInfoTraceTexts" />
        </s:sequence>
      </s:complexType>
      <s:element name="SaveOrderInfoTraceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SaveOrderInfoTraceResult" type="tns:SaveOrderInfoTraceOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SaveOrderInfoTraceOut">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfoTraceTexts" type="tns:OrderInfoTraceTexts" />
        </s:sequence>
      </s:complexType>
      <s:element name="SplitOrderToParty">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:SplitOrderToPartyIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SplitOrderToPartyIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SplitOrderToPartyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SplitOrderToPartyResult" type="tns:SplitOrderToPartyOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SplitOrderToPartyOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfos" type="tns:ArrayOfOrderInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="AddOrderToParty">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:AddOrderToPartyIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="AddOrderToPartyIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="AttachOrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="AddOrderToPartyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AddOrderToPartyResult" type="tns:AddOrderToPartyOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="AddOrderToPartyOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfos" type="tns:ArrayOfOrderInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="ChangeOrderToParty">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:ChangeOrderToPartyIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ChangeOrderToPartyIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="FromOrderId" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="ToOrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ChangeOrderToPartyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ChangeOrderToPartyResult" type="tns:ChangeOrderToPartyOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ChangeOrderToPartyOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfos" type="tns:ArrayOfOrderInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="RemoveParty">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RemovePartyIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RemovePartyIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="RomoveOrderID" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="RemovePartyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RemovePartyResult" type="tns:RemovePartyOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RemovePartyOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderInfos" type="tns:ArrayOfOrderInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="RestoreReservation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="restoreReservationIn" type="tns:RestoreReservationIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RestoreReservationIn">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="RestoreReason" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUser" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CroPermissionName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="RestoreReservationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RestoreReservationResult" type="tns:RestoreReservationOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RestoreReservationOut">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:element name="AddGiveUpOrderReserveReason">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cOrderReason" type="tns:GiveUpOrderReserveReasonIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GiveUpOrderReserveReasonIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUserCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ReasonCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GuestType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GuestID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comment" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChannelCode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="AddGiveUpOrderReserveReasonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AddGiveUpOrderReserveReasonResult" type="tns:GiveUpOrderReserveReasonOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GiveUpOrderReserveReasonOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ReasonCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ChannelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ExternalUserCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Dt" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="GuestType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GuestID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comment" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="InsertUser" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="InsertDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="UpdateUser" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="UpdateDate" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="ChangeReservationStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="status" type="tns:ResvStatus" />
            <s:element minOccurs="1" maxOccurs="1" name="order_id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:simpleType name="ResvStatus">
        <s:restriction base="s:string">
          <s:enumeration value="Reserved" />
          <s:enumeration value="Canceled" />
          <s:enumeration value="CheckIn" />
          <s:enumeration value="Watting" />
          <s:enumeration value="CheckOut" />
          <s:enumeration value="NoShow" />
          <s:enumeration value="Rejected" />
        </s:restriction>
      </s:simpleType>
      <s:element name="ChangeReservationStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ChangeReservationStatusResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ChangeOrderStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="status" type="tns:ResvStatus" />
            <s:element minOccurs="1" maxOccurs="1" name="order_id" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="croPermission" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ChangeOrderStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ChangeOrderStatusResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderAlertList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="orderAlertIn" type="tns:OrderAlertIn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="OrderAlertIn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PageInfo" type="tns:PageInfo" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginInsertDate" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndInsertDate" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="BeginArrivalDate" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EndArrivalDate" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Phone" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IsShowConfirm" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetOrderAlertListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderAlertListResult" type="tns:OrderAlertOut" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="OrderAlertOut">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="OrderAlertList" type="tns:ArrayOfOrderAlert" />
          <s:element minOccurs="0" maxOccurs="1" name="PageInfo" type="tns:PageInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOrderAlert">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OrderAlert" nillable="true" type="tns:OrderAlert" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OrderAlert">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HotelName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="OrderId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Phone" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Arrival" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Departure" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Status" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ConfirmDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="IsConfim" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ConfirmOrderAlert">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="orderAlert" type="tns:OrderAlert" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConfirmOrderAlertResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ConfirmOrderAlertResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoDiscounts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="orderID" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOrderInfoDiscountsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetOrderInfoDiscountsResult" type="tns:ArrayOfOrderInfoDiscount" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="CreateReservationSoapIn">
    <wsdl:part name="parameters" element="tns:CreateReservation" />
  </wsdl:message>
  <wsdl:message name="CreateReservationSoapOut">
    <wsdl:part name="parameters" element="tns:CreateReservationResponse" />
  </wsdl:message>
  <wsdl:message name="CreateReservationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetCancelRuleByOrderIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetCancelRuleByOrderId" />
  </wsdl:message>
  <wsdl:message name="GetCancelRuleByOrderIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetCancelRuleByOrderIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetCancelRuleByOrderIdKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="PegasusCreateReservationSoapIn">
    <wsdl:part name="parameters" element="tns:PegasusCreateReservation" />
  </wsdl:message>
  <wsdl:message name="PegasusCreateReservationSoapOut">
    <wsdl:part name="parameters" element="tns:PegasusCreateReservationResponse" />
  </wsdl:message>
  <wsdl:message name="PegasusCreateReservationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="ModifyReservationSoapIn">
    <wsdl:part name="parameters" element="tns:ModifyReservation" />
  </wsdl:message>
  <wsdl:message name="ModifyReservationSoapOut">
    <wsdl:part name="parameters" element="tns:ModifyReservationResponse" />
  </wsdl:message>
  <wsdl:message name="ModifyReservationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="PegasusModifyReservationSoapIn">
    <wsdl:part name="parameters" element="tns:PegasusModifyReservation" />
  </wsdl:message>
  <wsdl:message name="PegasusModifyReservationSoapOut">
    <wsdl:part name="parameters" element="tns:PegasusModifyReservationResponse" />
  </wsdl:message>
  <wsdl:message name="PegasusModifyReservationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="CancelReservationSoapIn">
    <wsdl:part name="parameters" element="tns:CancelReservation" />
  </wsdl:message>
  <wsdl:message name="CancelReservationSoapOut">
    <wsdl:part name="parameters" element="tns:CancelReservationResponse" />
  </wsdl:message>
  <wsdl:message name="CancelReservationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="CancelOrderSoapIn">
    <wsdl:part name="parameters" element="tns:CancelOrder" />
  </wsdl:message>
  <wsdl:message name="CancelOrderSoapOut">
    <wsdl:part name="parameters" element="tns:CancelOrderResponse" />
  </wsdl:message>
  <wsdl:message name="CancelOrderKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="AddorderInfoPaymentGatewaySoapIn">
    <wsdl:part name="parameters" element="tns:AddorderInfoPaymentGateway" />
  </wsdl:message>
  <wsdl:message name="AddorderInfoPaymentGatewaySoapOut">
    <wsdl:part name="parameters" element="tns:AddorderInfoPaymentGatewayResponse" />
  </wsdl:message>
  <wsdl:message name="AddorderInfoPaymentGatewayKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="AddAndUpdateOrderInfoPaymentGatewaySoapIn">
    <wsdl:part name="parameters" element="tns:AddAndUpdateOrderInfoPaymentGateway" />
  </wsdl:message>
  <wsdl:message name="AddAndUpdateOrderInfoPaymentGatewaySoapOut">
    <wsdl:part name="parameters" element="tns:AddAndUpdateOrderInfoPaymentGatewayResponse" />
  </wsdl:message>
  <wsdl:message name="AddAndUpdateOrderInfoPaymentGatewayKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="CompelCancelReservationSoapIn">
    <wsdl:part name="parameters" element="tns:CompelCancelReservation" />
  </wsdl:message>
  <wsdl:message name="CompelCancelReservationSoapOut">
    <wsdl:part name="parameters" element="tns:CompelCancelReservationResponse" />
  </wsdl:message>
  <wsdl:message name="CompelCancelReservationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="PegasusCancelReservationSoapIn">
    <wsdl:part name="parameters" element="tns:PegasusCancelReservation" />
  </wsdl:message>
  <wsdl:message name="PegasusCancelReservationSoapOut">
    <wsdl:part name="parameters" element="tns:PegasusCancelReservationResponse" />
  </wsdl:message>
  <wsdl:message name="PegasusCancelReservationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="PegasusSetDepositsNotificationSoapIn">
    <wsdl:part name="parameters" element="tns:PegasusSetDepositsNotification" />
  </wsdl:message>
  <wsdl:message name="PegasusSetDepositsNotificationSoapOut">
    <wsdl:part name="parameters" element="tns:PegasusSetDepositsNotificationResponse" />
  </wsdl:message>
  <wsdl:message name="PegasusSetDepositsNotificationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="OrderQuerySoapIn">
    <wsdl:part name="parameters" element="tns:OrderQuery" />
  </wsdl:message>
  <wsdl:message name="OrderQuerySoapOut">
    <wsdl:part name="parameters" element="tns:OrderQueryResponse" />
  </wsdl:message>
  <wsdl:message name="OrderQueryKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="OrderQueryPerPageSoapIn">
    <wsdl:part name="parameters" element="tns:OrderQueryPerPage" />
  </wsdl:message>
  <wsdl:message name="OrderQueryPerPageSoapOut">
    <wsdl:part name="parameters" element="tns:OrderQueryPerPageResponse" />
  </wsdl:message>
  <wsdl:message name="OrderQueryPerPageKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="QueryOrderPageSoapIn">
    <wsdl:part name="parameters" element="tns:QueryOrderPage" />
  </wsdl:message>
  <wsdl:message name="QueryOrderPageSoapOut">
    <wsdl:part name="parameters" element="tns:QueryOrderPageResponse" />
  </wsdl:message>
  <wsdl:message name="QueryOrderPageKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderInfo" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderLogsSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderLogs" />
  </wsdl:message>
  <wsdl:message name="GetOrderLogsSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderLogsResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderLogsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoByEmailAndIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderInfoByEmailAndID" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoByEmailAndIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderInfoByEmailAndIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoByEmailAndIDKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoByGuestTypeSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderInfoByGuestType" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoByGuestTypeSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderInfoByGuestTypeResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoByGuestTypeKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderID" />
  </wsdl:message>
  <wsdl:message name="GetOrderIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderIDKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoCommentsSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderInfoComments" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoCommentsSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderInfoCommentsResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoCommentsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="SelfCheckInAllowedSoapIn">
    <wsdl:part name="parameters" element="tns:SelfCheckInAllowed" />
  </wsdl:message>
  <wsdl:message name="SelfCheckInAllowedSoapOut">
    <wsdl:part name="parameters" element="tns:SelfCheckInAllowedResponse" />
  </wsdl:message>
  <wsdl:message name="SelfCheckInAllowedKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoAlertSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderInfoAlert" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoAlertSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderInfoAlertResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoAlertKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoTraceSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderInfoTrace" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoTraceSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderInfoTraceResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoTraceKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="SaveOrderInfoAlertSoapIn">
    <wsdl:part name="parameters" element="tns:SaveOrderInfoAlert" />
  </wsdl:message>
  <wsdl:message name="SaveOrderInfoAlertSoapOut">
    <wsdl:part name="parameters" element="tns:SaveOrderInfoAlertResponse" />
  </wsdl:message>
  <wsdl:message name="SaveOrderInfoAlertKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="SaveOrderInfoTraceSoapIn">
    <wsdl:part name="parameters" element="tns:SaveOrderInfoTrace" />
  </wsdl:message>
  <wsdl:message name="SaveOrderInfoTraceSoapOut">
    <wsdl:part name="parameters" element="tns:SaveOrderInfoTraceResponse" />
  </wsdl:message>
  <wsdl:message name="SaveOrderInfoTraceKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="SplitOrderToPartySoapIn">
    <wsdl:part name="parameters" element="tns:SplitOrderToParty" />
  </wsdl:message>
  <wsdl:message name="SplitOrderToPartySoapOut">
    <wsdl:part name="parameters" element="tns:SplitOrderToPartyResponse" />
  </wsdl:message>
  <wsdl:message name="SplitOrderToPartyKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="AddOrderToPartySoapIn">
    <wsdl:part name="parameters" element="tns:AddOrderToParty" />
  </wsdl:message>
  <wsdl:message name="AddOrderToPartySoapOut">
    <wsdl:part name="parameters" element="tns:AddOrderToPartyResponse" />
  </wsdl:message>
  <wsdl:message name="AddOrderToPartyKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="ChangeOrderToPartySoapIn">
    <wsdl:part name="parameters" element="tns:ChangeOrderToParty" />
  </wsdl:message>
  <wsdl:message name="ChangeOrderToPartySoapOut">
    <wsdl:part name="parameters" element="tns:ChangeOrderToPartyResponse" />
  </wsdl:message>
  <wsdl:message name="ChangeOrderToPartyKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="RemovePartySoapIn">
    <wsdl:part name="parameters" element="tns:RemoveParty" />
  </wsdl:message>
  <wsdl:message name="RemovePartySoapOut">
    <wsdl:part name="parameters" element="tns:RemovePartyResponse" />
  </wsdl:message>
  <wsdl:message name="RemovePartyKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="RestoreReservationSoapIn">
    <wsdl:part name="parameters" element="tns:RestoreReservation" />
  </wsdl:message>
  <wsdl:message name="RestoreReservationSoapOut">
    <wsdl:part name="parameters" element="tns:RestoreReservationResponse" />
  </wsdl:message>
  <wsdl:message name="RestoreReservationKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="AddGiveUpOrderReserveReasonSoapIn">
    <wsdl:part name="parameters" element="tns:AddGiveUpOrderReserveReason" />
  </wsdl:message>
  <wsdl:message name="AddGiveUpOrderReserveReasonSoapOut">
    <wsdl:part name="parameters" element="tns:AddGiveUpOrderReserveReasonResponse" />
  </wsdl:message>
  <wsdl:message name="AddGiveUpOrderReserveReasonKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="ChangeReservationStatusSoapIn">
    <wsdl:part name="parameters" element="tns:ChangeReservationStatus" />
  </wsdl:message>
  <wsdl:message name="ChangeReservationStatusSoapOut">
    <wsdl:part name="parameters" element="tns:ChangeReservationStatusResponse" />
  </wsdl:message>
  <wsdl:message name="ChangeReservationStatusKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="ChangeOrderStatusSoapIn">
    <wsdl:part name="parameters" element="tns:ChangeOrderStatus" />
  </wsdl:message>
  <wsdl:message name="ChangeOrderStatusSoapOut">
    <wsdl:part name="parameters" element="tns:ChangeOrderStatusResponse" />
  </wsdl:message>
  <wsdl:message name="ChangeOrderStatusKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderAlertListSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderAlertList" />
  </wsdl:message>
  <wsdl:message name="GetOrderAlertListSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderAlertListResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderAlertListKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="ConfirmOrderAlertSoapIn">
    <wsdl:part name="parameters" element="tns:ConfirmOrderAlert" />
  </wsdl:message>
  <wsdl:message name="ConfirmOrderAlertSoapOut">
    <wsdl:part name="parameters" element="tns:ConfirmOrderAlertResponse" />
  </wsdl:message>
  <wsdl:message name="ConfirmOrderAlertKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoDiscountsSoapIn">
    <wsdl:part name="parameters" element="tns:GetOrderInfoDiscounts" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoDiscountsSoapOut">
    <wsdl:part name="parameters" element="tns:GetOrderInfoDiscountsResponse" />
  </wsdl:message>
  <wsdl:message name="GetOrderInfoDiscountsKwsSoapHeader">
    <wsdl:part name="KwsSoapHeader" element="tns:KwsSoapHeader" />
  </wsdl:message>
  <wsdl:portType name="ReservationSoap">
    <wsdl:operation name="CreateReservation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新建订单,输入OrderInfo,输出OrderInfo</wsdl:documentation>
      <wsdl:input message="tns:CreateReservationSoapIn" />
      <wsdl:output message="tns:CreateReservationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCancelRuleByOrderId">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查找对应订单ID的取消规则</wsdl:documentation>
      <wsdl:input message="tns:GetCancelRuleByOrderIdSoapIn" />
      <wsdl:output message="tns:GetCancelRuleByOrderIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PegasusCreateReservation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新建Pegasus订单,输入OrderInfo,输出OrderInfo</wsdl:documentation>
      <wsdl:input message="tns:PegasusCreateReservationSoapIn" />
      <wsdl:output message="tns:PegasusCreateReservationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ModifyReservation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改订单,输入OrderInfo,输出OrderInfo</wsdl:documentation>
      <wsdl:input message="tns:ModifyReservationSoapIn" />
      <wsdl:output message="tns:ModifyReservationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PegasusModifyReservation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改Pegasus订单,输入OrderInfo,输出OrderInfo</wsdl:documentation>
      <wsdl:input message="tns:PegasusModifyReservationSoapIn" />
      <wsdl:output message="tns:PegasusModifyReservationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CancelReservation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">取消订单,输入订单id,取消原因</wsdl:documentation>
      <wsdl:input message="tns:CancelReservationSoapIn" />
      <wsdl:output message="tns:CancelReservationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CancelOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">取消订单,输入订单id,取消原因</wsdl:documentation>
      <wsdl:input message="tns:CancelOrderSoapIn" />
      <wsdl:output message="tns:CancelOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddorderInfoPaymentGateway">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">添加第三方支付信息（如网银支付流水，是否成功）</wsdl:documentation>
      <wsdl:input message="tns:AddorderInfoPaymentGatewaySoapIn" />
      <wsdl:output message="tns:AddorderInfoPaymentGatewaySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddAndUpdateOrderInfoPaymentGateway">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">添加、修改第三方支付信息（如网银支付流水，是否成功）</wsdl:documentation>
      <wsdl:input message="tns:AddAndUpdateOrderInfoPaymentGatewaySoapIn" />
      <wsdl:output message="tns:AddAndUpdateOrderInfoPaymentGatewaySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CompelCancelReservation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">强制取消订单</wsdl:documentation>
      <wsdl:input message="tns:CompelCancelReservationSoapIn" />
      <wsdl:output message="tns:CompelCancelReservationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PegasusCancelReservation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Pegasus取消订单,输入订单id,取消原因,渠道取消号</wsdl:documentation>
      <wsdl:input message="tns:PegasusCancelReservationSoapIn" />
      <wsdl:output message="tns:PegasusCancelReservationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PegasusSetDepositsNotification">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Pegasus Deposits (payment) notification</wsdl:documentation>
      <wsdl:input message="tns:PegasusSetDepositsNotificationSoapIn" />
      <wsdl:output message="tns:PegasusSetDepositsNotificationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="OrderQuery">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按条件查询订单,输入:订单号（其中如果id=-1表示查询所有渠道服务条件的订单，如果为0表示获取该渠道符合条件的订单，其他表示获取对应订单号的订单）,预定起始时间,预定结束时间,入住日期,离店日期,订单状态,担保方式,酒店code,firstname,lastname,员工编号,公司预订登陆帐号,客人类型</wsdl:documentation>
      <wsdl:input message="tns:OrderQuerySoapIn" />
      <wsdl:output message="tns:OrderQuerySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="OrderQueryPerPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询多个订单,输入:订单号,预定起始时间,预定结束时间,入住日期,离店日期,订单状态,担保方式,酒店code,firstname,lastname,员工编号,公司预订登陆帐号,客人类型,每页数量,第几页</wsdl:documentation>
      <wsdl:input message="tns:OrderQueryPerPageSoapIn" />
      <wsdl:output message="tns:OrderQueryPerPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryOrderPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">分页查询多个订单,输入:订单号,到店开始、结束时间，离店开始、结束时间，酒店，FirstName，LastName，客户协议号，会员卡号，查询页数，每页行数</wsdl:documentation>
      <wsdl:input message="tns:QueryOrderPageSoapIn" />
      <wsdl:output message="tns:QueryOrderPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询单个订单,输入订单号</wsdl:documentation>
      <wsdl:input message="tns:GetOrderInfoSoapIn" />
      <wsdl:output message="tns:GetOrderInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderLogs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询单个订单的修改记录,输入订单号</wsdl:documentation>
      <wsdl:input message="tns:GetOrderLogsSoapIn" />
      <wsdl:output message="tns:GetOrderLogsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoByEmailAndID">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询散客订单,输入订单号，Email</wsdl:documentation>
      <wsdl:input message="tns:GetOrderInfoByEmailAndIDSoapIn" />
      <wsdl:output message="tns:GetOrderInfoByEmailAndIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoByGuestType">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询公司或会员订单,输入:客人类型,帐号，起始日期,结束日期</wsdl:documentation>
      <wsdl:input message="tns:GetOrderInfoByGuestTypeSoapIn" />
      <wsdl:output message="tns:GetOrderInfoByGuestTypeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderID">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据Pegasus PNR号获取订单号</wsdl:documentation>
      <wsdl:input message="tns:GetOrderIDSoapIn" />
      <wsdl:output message="tns:GetOrderIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoComments">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询某个订单的备注信息</wsdl:documentation>
      <wsdl:input message="tns:GetOrderInfoCommentsSoapIn" />
      <wsdl:output message="tns:GetOrderInfoCommentsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SelfCheckInAllowed">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据订单号判断该订单是否可以使用自助入住功能,和自助check-in系统配合使用</wsdl:documentation>
      <wsdl:input message="tns:SelfCheckInAllowedSoapIn" />
      <wsdl:output message="tns:SelfCheckInAllowedSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoAlert">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询某个订单的alert信息</wsdl:documentation>
      <wsdl:input message="tns:GetOrderInfoAlertSoapIn" />
      <wsdl:output message="tns:GetOrderInfoAlertSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoTrace">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询某个订单的trace信息</wsdl:documentation>
      <wsdl:input message="tns:GetOrderInfoTraceSoapIn" />
      <wsdl:output message="tns:GetOrderInfoTraceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SaveOrderInfoAlert">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">保存订单的alert信息,SaveAction:新增(ADD),修改(UPDATE),删除(DELETE)</wsdl:documentation>
      <wsdl:input message="tns:SaveOrderInfoAlertSoapIn" />
      <wsdl:output message="tns:SaveOrderInfoAlertSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SaveOrderInfoTrace">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">保存订单的trace信息,SaveAction:新增(ADD),修改(UPDATE),删除(DELETE)</wsdl:documentation>
      <wsdl:input message="tns:SaveOrderInfoTraceSoapIn" />
      <wsdl:output message="tns:SaveOrderInfoTraceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SplitOrderToParty">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">将一个房间数大于1的订单拆分为多个订单并绑定PARTY关系</wsdl:documentation>
      <wsdl:input message="tns:SplitOrderToPartySoapIn" />
      <wsdl:output message="tns:SplitOrderToPartySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddOrderToParty">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">将两个已经存在的订单关联PARTY关系</wsdl:documentation>
      <wsdl:input message="tns:AddOrderToPartySoapIn" />
      <wsdl:output message="tns:AddOrderToPartySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ChangeOrderToParty">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">将一个已经存在PARTY关系的订单修改其PARTY关系并关联到另一个PARTY中</wsdl:documentation>
      <wsdl:input message="tns:ChangeOrderToPartySoapIn" />
      <wsdl:output message="tns:ChangeOrderToPartySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveParty">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">解除一个已经存在PARTY关系的订单的PARTY关系</wsdl:documentation>
      <wsdl:input message="tns:RemovePartySoapIn" />
      <wsdl:output message="tns:RemovePartySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RestoreReservation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">恢复订单到预定状态</wsdl:documentation>
      <wsdl:input message="tns:RestoreReservationSoapIn" />
      <wsdl:output message="tns:RestoreReservationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddGiveUpOrderReserveReason">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">取消订单原因</wsdl:documentation>
      <wsdl:input message="tns:AddGiveUpOrderReserveReasonSoapIn" />
      <wsdl:output message="tns:AddGiveUpOrderReserveReasonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ChangeReservationStatus">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">变更订单状态</wsdl:documentation>
      <wsdl:input message="tns:ChangeReservationStatusSoapIn" />
      <wsdl:output message="tns:ChangeReservationStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ChangeOrderStatus">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">变更订单状态</wsdl:documentation>
      <wsdl:input message="tns:ChangeOrderStatusSoapIn" />
      <wsdl:output message="tns:ChangeOrderStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderAlertList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询订单提醒信息</wsdl:documentation>
      <wsdl:input message="tns:GetOrderAlertListSoapIn" />
      <wsdl:output message="tns:GetOrderAlertListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConfirmOrderAlert">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">确认提醒信息</wsdl:documentation>
      <wsdl:input message="tns:ConfirmOrderAlertSoapIn" />
      <wsdl:output message="tns:ConfirmOrderAlertSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoDiscounts">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询订单折扣信息</wsdl:documentation>
      <wsdl:input message="tns:GetOrderInfoDiscountsSoapIn" />
      <wsdl:output message="tns:GetOrderInfoDiscountsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="ReservationSoap" type="tns:ReservationSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CreateReservation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CreateReservation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CreateReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CreateReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCancelRuleByOrderId">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetCancelRuleByOrderId" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetCancelRuleByOrderIdKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetCancelRuleByOrderIdKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PegasusCreateReservation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/PegasusCreateReservation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:PegasusCreateReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:PegasusCreateReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ModifyReservation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/ModifyReservation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:ModifyReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:ModifyReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PegasusModifyReservation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/PegasusModifyReservation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:PegasusModifyReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:PegasusModifyReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelReservation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CancelReservation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CancelReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CancelReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelOrder">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CancelOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CancelOrderKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CancelOrderKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddorderInfoPaymentGateway">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/AddorderInfoPaymentGateway" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AddorderInfoPaymentGatewayKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:AddorderInfoPaymentGatewayKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddAndUpdateOrderInfoPaymentGateway">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/AddAndUpdateOrderInfoPaymentGateway" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AddAndUpdateOrderInfoPaymentGatewayKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:AddAndUpdateOrderInfoPaymentGatewayKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CompelCancelReservation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/CompelCancelReservation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:CompelCancelReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:CompelCancelReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PegasusCancelReservation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/PegasusCancelReservation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:PegasusCancelReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:PegasusCancelReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PegasusSetDepositsNotification">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/PegasusSetDepositsNotification" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:PegasusSetDepositsNotificationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:PegasusSetDepositsNotificationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OrderQuery">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/OrderQuery" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:OrderQueryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:OrderQueryKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OrderQueryPerPage">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/OrderQueryPerPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:OrderQueryPerPageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:OrderQueryPerPageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryOrderPage">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/QueryOrderPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:QueryOrderPageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:QueryOrderPageKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfo">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderLogs">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderLogs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderLogsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderLogsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoByEmailAndID">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderInfoByEmailAndID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoByEmailAndIDKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoByEmailAndIDKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoByGuestType">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderInfoByGuestType" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoByGuestTypeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoByGuestTypeKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderID">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderIDKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderIDKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoComments">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderInfoComments" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoCommentsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoCommentsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SelfCheckInAllowed">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/SelfCheckInAllowed" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:SelfCheckInAllowedKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:SelfCheckInAllowedKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoAlert">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderInfoAlert" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoAlertKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoAlertKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoTrace">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderInfoTrace" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoTraceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoTraceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveOrderInfoAlert">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/SaveOrderInfoAlert" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:SaveOrderInfoAlertKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:SaveOrderInfoAlertKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveOrderInfoTrace">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/SaveOrderInfoTrace" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:SaveOrderInfoTraceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:SaveOrderInfoTraceKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SplitOrderToParty">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/SplitOrderToParty" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:SplitOrderToPartyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:SplitOrderToPartyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddOrderToParty">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/AddOrderToParty" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AddOrderToPartyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:AddOrderToPartyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ChangeOrderToParty">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/ChangeOrderToParty" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:ChangeOrderToPartyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:ChangeOrderToPartyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveParty">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/RemoveParty" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:RemovePartyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:RemovePartyKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RestoreReservation">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/RestoreReservation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:RestoreReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:RestoreReservationKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddGiveUpOrderReserveReason">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/AddGiveUpOrderReserveReason" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AddGiveUpOrderReserveReasonKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:AddGiveUpOrderReserveReasonKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ChangeReservationStatus">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/ChangeReservationStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:ChangeReservationStatusKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:ChangeReservationStatusKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ChangeOrderStatus">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/ChangeOrderStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:ChangeOrderStatusKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:ChangeOrderStatusKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderAlertList">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderAlertList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderAlertListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderAlertListKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConfirmOrderAlert">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/ConfirmOrderAlert" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:ConfirmOrderAlertKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:ConfirmOrderAlertKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOrderInfoDiscounts">
      <soap:operation soapAction="http://www.shijinet.com.cn/kunlun/kws/1.1/GetOrderInfoDiscounts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoDiscountsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
        <soap:header message="tns:GetOrderInfoDiscountsKwsSoapHeader" part="KwsSoapHeader" use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="Reservation">
    <wsdl:port name="ReservationSoap" binding="tns:ReservationSoap">
      <soap:address location="http://116.62.146.178:9000/KWS_TRAIN/ReservationService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>