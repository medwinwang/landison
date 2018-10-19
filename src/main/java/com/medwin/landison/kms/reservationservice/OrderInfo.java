
package com.medwin.landison.kms.reservationservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.lang.String;


/**
 * <p>OrderInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Udf_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Udf_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}BarType"/&gt;
 *         &lt;element name="Resv_points" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RecommendedLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelConfirmID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelCancelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Deposit" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}DepositInfo" minOccurs="0"/&gt;
 *         &lt;element name="OriginalOrderInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OriginalOrderInfo" minOccurs="0"/&gt;
 *         &lt;element name="OrderRoomStayInfos" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderRoomStayInfo" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfoDiscounts" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoDiscount" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Isfixedrate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Hotel_code" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Guesttype_code" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="GuestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Room_num" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Roomtype_code" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Rate_code" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Wrate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Extra_bed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CredittypeCode" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Creditid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Expire" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Makedate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Maker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsertUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Makehotel_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status_code" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SplitOrderIds" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfSplitOrderId" minOccurs="0"/&gt;
 *         &lt;element name="MoreOccupants" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfMoreOccupant" minOccurs="0"/&gt;
 *         &lt;element name="SynchroSplitOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Infant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="City" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Languag_code" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Province_code" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Roomno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email_confirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Com_ok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Order_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InitialRateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Total_revenue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="InitialPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Com_err" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Market" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Channel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="C_card_err" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChineseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Turn_away" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fly_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Member_id" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CardLevel" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Adj" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CancelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pms_res_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsCancelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reservation_type" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}CommonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Special_codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Keep_hour" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Chname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Office_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepositCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Promotion_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ffp_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provider_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provider_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartyNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CrsPartyNO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShareCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTransportationYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTransportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalTransportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTransportationYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTransportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartureTransportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayMentGateWay" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoPaymentGateway" minOccurs="0"/&gt;
 *         &lt;element name="Accompanyings" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoAccompanying" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfoTraceTextsList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoTraceTexts" minOccurs="0"/&gt;
 *         &lt;element name="DailyItems" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfDailyItem" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfoPackageList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoPackage" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfoAlertsList" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoAlerts" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}Payment" minOccurs="0"/&gt;
 *         &lt;element name="GuestInfoId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DepositScheduleInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoDepositSchedule" minOccurs="0"/&gt;
 *         &lt;element name="CancelScheduleInfo" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}OrderInfoCancelSchedule" minOccurs="0"/&gt;
 *         &lt;element name="ExternalUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfoComments" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfOrderInfoComments" minOccurs="0"/&gt;
 *         &lt;element name="DicInfoFfp" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfFfpAttribute" minOccurs="0"/&gt;
 *         &lt;element name="MemberInfoFfp" type="{http://www.shijinet.com.cn/kunlun/kws/1.1/}ArrayOfMemberInfoFFP" minOccurs="0"/&gt;
 *         &lt;element name="TravelAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdOfTravelAgency" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdOfSourceBusiness" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AccountOfTravelAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountOfSourceBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CroPermissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfo", propOrder = {
    "udf1",
    "udf2",
    "udf3",
    "udf4",
    "udf5",
    "udf6",
    "udf7",
    "udf8",
    "udf9",
    "udf10",
    "udf11",
    "udf12",
    "udf13",
    "udf14",
    "udf15",
    "udf16",
    "udf17",
    "udf18",
    "udf19",
    "udf20",
    "groupType",
    "barType",
    "resvPoints",
    "recommendedLevel",
    "channelConfirmID",
    "channelCancelID",
    "deposit",
    "originalOrderInfo",
    "orderRoomStayInfos",
    "orderInfoDiscounts",
    "id",
    "arrival",
    "isfixedrate",
    "departure",
    "hotelCode",
    "guesttypeCode",
    "guestID",
    "roomNum",
    "roomtypeCode",
    "rateCode",
    "rate",
    "wrate",
    "adults",
    "children",
    "extraBed",
    "firstname",
    "lastname",
    "countryCode",
    "address",
    "fax",
    "phone",
    "email",
    "idNumber",
    "credittypeCode",
    "cardHolder",
    "creditid",
    "expire",
    "makedate",
    "maker",
    "insertUserName",
    "updateUserName",
    "makehotelCode",
    "flag",
    "statusCode",
    "comments",
    "confirmID",
    "bookerID",
    "bookerName",
    "bookerMobile",
    "bookerEmail",
    "splitOrderIds",
    "moreOccupants",
    "synchroSplitOrder",
    "originalOrderId",
    "infant",
    "city",
    "languagCode",
    "title",
    "provinceCode",
    "birthday",
    "company",
    "roomno",
    "emailConfirm",
    "comOk",
    "orderType",
    "initialRateDateTime",
    "totalRevenue",
    "initialPrice",
    "comErr",
    "market",
    "source",
    "sex",
    "postcode",
    "channel",
    "cCardErr",
    "chineseName",
    "turnAway",
    "flyNum",
    "arrivalTime",
    "departTime",
    "memberId",
    "cardType",
    "cardLevel",
    "adj",
    "cancelID",
    "pmsResId",
    "pmsCancelId",
    "reservationType",
    "specialCodes",
    "mobile",
    "keepHour",
    "chname",
    "groupID",
    "zip",
    "officePhone",
    "custID",
    "account",
    "address1",
    "address2",
    "address3",
    "address4",
    "idNo",
    "cancelDate",
    "depositCode",
    "commisionCode",
    "cancelCode",
    "promotionCode",
    "ffpId",
    "providerCode",
    "providerKey",
    "partyNO",
    "crsPartyNO",
    "shareCode",
    "arrivalTransportationYN",
    "arrivalTransportType",
    "arrivalStationCode",
    "arrivalCarrierCode",
    "arrivalDateTime",
    "arrivalTransportNo",
    "arrivalComments",
    "departureTransportationYN",
    "departureTransportType",
    "departureStationCode",
    "departureCarrierCode",
    "departureDateTime",
    "departureTransportNo",
    "departureComments",
    "payMentGateWay",
    "accompanyings",
    "orderInfoTraceTextsList",
    "dailyItems",
    "orderInfoPackageList",
    "orderInfoAlertsList",
    "payment",
    "guestInfoId",
    "depositScheduleInfo",
    "cancelScheduleInfo",
    "externalUser",
    "blockCode",
    "orderInfoComments",
    "dicInfoFfp",
    "memberInfoFfp",
    "travelAgency",
    "sourceOfBusiness",
    "idOfTravelAgency",
    "idOfSourceBusiness",
    "accountOfTravelAgency",
    "accountOfSourceBusiness",
    "companyName",
    "companyAccount",
    "companyID",
    "croPermissionName",
    "discountMethod"
})
public class OrderInfo
    extends BaseInfo
{

    @XmlElement(name = "Udf_1")
    protected String udf1;
    @XmlElement(name = "Udf_2")
    protected String udf2;
    @XmlElement(name = "Udf_3")
    protected String udf3;
    @XmlElement(name = "Udf_4")
    protected String udf4;
    @XmlElement(name = "Udf_5")
    protected String udf5;
    @XmlElement(name = "Udf_6")
    protected String udf6;
    @XmlElement(name = "Udf_7")
    protected String udf7;
    @XmlElement(name = "Udf_8")
    protected String udf8;
    @XmlElement(name = "Udf_9")
    protected String udf9;
    @XmlElement(name = "Udf_10")
    protected String udf10;
    @XmlElement(name = "Udf_11")
    protected String udf11;
    @XmlElement(name = "Udf_12")
    protected String udf12;
    @XmlElement(name = "Udf_13")
    protected String udf13;
    @XmlElement(name = "Udf_14")
    protected String udf14;
    @XmlElement(name = "Udf_15")
    protected String udf15;
    @XmlElement(name = "Udf_16")
    protected String udf16;
    @XmlElement(name = "Udf_17")
    protected String udf17;
    @XmlElement(name = "Udf_18")
    protected String udf18;
    @XmlElement(name = "Udf_19")
    protected String udf19;
    @XmlElement(name = "Udf_20")
    protected String udf20;
    @XmlElement(name = "GroupType")
    protected String groupType;
    @XmlElement(name = "BarType", required = true)
    @XmlSchemaType(name = "string")
    protected BarType barType;
    @XmlElement(name = "Resv_points", required = true)
    protected BigDecimal resvPoints;
    @XmlElement(name = "RecommendedLevel")
    protected String recommendedLevel;
    @XmlElement(name = "ChannelConfirmID")
    protected String channelConfirmID;
    @XmlElement(name = "ChannelCancelID")
    protected String channelCancelID;
    @XmlElement(name = "Deposit")
    protected DepositInfo deposit;
    @XmlElement(name = "OriginalOrderInfo")
    protected OriginalOrderInfo originalOrderInfo;
    @XmlElement(name = "OrderRoomStayInfos")
    protected ArrayOfOrderRoomStayInfo orderRoomStayInfos;
    @XmlElement(name = "OrderInfoDiscounts")
    protected ArrayOfOrderInfoDiscount orderInfoDiscounts;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Arrival", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String arrival;
    @XmlElement(name = "Isfixedrate")
    protected boolean isfixedrate;
    @XmlElement(name = "Departure", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String departure;
    @XmlElement(name = "Hotel_code")
    protected CommonInfo hotelCode;
    @XmlElement(name = "Guesttype_code")
    protected CommonInfo guesttypeCode;
    @XmlElement(name = "GuestID")
    protected String guestID;
    @XmlElement(name = "Room_num")
    protected int roomNum;
    @XmlElement(name = "Roomtype_code")
    protected CommonInfo roomtypeCode;
    @XmlElement(name = "Rate_code")
    protected CommonInfo rateCode;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Wrate", required = true)
    protected BigDecimal wrate;
    @XmlElement(name = "Adults")
    protected int adults;
    @XmlElement(name = "Children")
    protected int children;
    @XmlElement(name = "Extra_bed")
    protected int extraBed;
    @XmlElement(name = "Firstname")
    protected String firstname;
    @XmlElement(name = "Lastname")
    protected String lastname;
    @XmlElement(name = "CountryCode")
    protected CommonInfo countryCode;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "IdNumber")
    protected String idNumber;
    @XmlElement(name = "CredittypeCode")
    protected CommonInfo credittypeCode;
    @XmlElement(name = "CardHolder")
    protected String cardHolder;
    @XmlElement(name = "Creditid")
    protected String creditid;
    @XmlElement(name = "Expire", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String expire;
    @XmlElement(name = "Makedate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String makedate;
    @XmlElement(name = "Maker")
    protected String maker;
    @XmlElement(name = "InsertUserName")
    protected String insertUserName;
    @XmlElement(name = "UpdateUserName")
    protected String updateUserName;
    @XmlElement(name = "Makehotel_code")
    protected String makehotelCode;
    @XmlElement(name = "Flag")
    protected String flag;
    @XmlElement(name = "Status_code")
    protected CommonInfo statusCode;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ConfirmID")
    protected String confirmID;
    @XmlElement(name = "BookerID")
    protected String bookerID;
    @XmlElement(name = "BookerName")
    protected String bookerName;
    @XmlElement(name = "BookerMobile")
    protected String bookerMobile;
    @XmlElement(name = "BookerEmail")
    protected String bookerEmail;
    @XmlElement(name = "SplitOrderIds")
    protected ArrayOfSplitOrderId splitOrderIds;
    @XmlElement(name = "MoreOccupants")
    protected ArrayOfMoreOccupant moreOccupants;
    @XmlElement(name = "SynchroSplitOrder")
    protected String synchroSplitOrder;
    @XmlElement(name = "OriginalOrderId")
    protected String originalOrderId;
    @XmlElement(name = "Infant")
    protected int infant;
    @XmlElement(name = "City")
    protected CommonInfo city;
    @XmlElement(name = "Languag_code")
    protected CommonInfo languagCode;
    @XmlElement(name = "Title")
    protected CommonInfo title;
    @XmlElement(name = "Province_code")
    protected CommonInfo provinceCode;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String birthday;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "Roomno")
    protected String roomno;
    @XmlElement(name = "Email_confirm")
    protected String emailConfirm;
    @XmlElement(name = "Com_ok")
    protected String comOk;
    @XmlElement(name = "Order_type")
    protected String orderType;
    @XmlElement(name = "InitialRateDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String initialRateDateTime;
    @XmlElement(name = "Total_revenue", required = true)
    protected BigDecimal totalRevenue;
    @XmlElement(name = "InitialPrice", required = true)
    protected BigDecimal initialPrice;
    @XmlElement(name = "Com_err")
    protected short comErr;
    @XmlElement(name = "Market")
    protected CommonInfo market;
    @XmlElement(name = "Source")
    protected CommonInfo source;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "Postcode")
    protected String postcode;
    @XmlElement(name = "Channel")
    protected CommonInfo channel;
    @XmlElement(name = "C_card_err")
    protected String cCardErr;
    @XmlElement(name = "ChineseName")
    protected String chineseName;
    @XmlElement(name = "Turn_away")
    protected String turnAway;
    @XmlElement(name = "Fly_num")
    protected String flyNum;
    @XmlElement(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlElement(name = "DepartTime")
    protected String departTime;
    @XmlElement(name = "Member_id")
    protected CommonInfo memberId;
    @XmlElement(name = "CardType")
    protected CommonInfo cardType;
    @XmlElement(name = "CardLevel")
    protected CommonInfo cardLevel;
    @XmlElement(name = "Adj", required = true)
    protected BigDecimal adj;
    @XmlElement(name = "CancelID")
    protected String cancelID;
    @XmlElement(name = "Pms_res_id")
    protected String pmsResId;
    @XmlElement(name = "PmsCancelId")
    protected String pmsCancelId;
    @XmlElement(name = "Reservation_type")
    protected CommonInfo reservationType;
    @XmlElement(name = "Special_codes")
    protected String specialCodes;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Keep_hour", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String keepHour;
    @XmlElement(name = "Chname")
    protected String chname;
    @XmlElement(name = "GroupID")
    protected String groupID;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Office_phone")
    protected String officePhone;
    @XmlElement(name = "CustID")
    protected int custID;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "Address4")
    protected String address4;
    @XmlElement(name = "Id_no")
    protected String idNo;
    @XmlElement(name = "CancelDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String cancelDate;
    @XmlElement(name = "DepositCode")
    protected String depositCode;
    @XmlElement(name = "CommisionCode")
    protected String commisionCode;
    @XmlElement(name = "CancelCode")
    protected String cancelCode;
    @XmlElement(name = "Promotion_Code")
    protected String promotionCode;
    @XmlElement(name = "Ffp_Id")
    protected String ffpId;
    @XmlElement(name = "Provider_code")
    protected String providerCode;
    @XmlElement(name = "Provider_key")
    protected String providerKey;
    @XmlElement(name = "PartyNO")
    protected String partyNO;
    @XmlElement(name = "CrsPartyNO")
    protected int crsPartyNO;
    @XmlElement(name = "ShareCode")
    protected String shareCode;
    @XmlElement(name = "ArrivalTransportationYN")
    protected String arrivalTransportationYN;
    @XmlElement(name = "ArrivalTransportType")
    protected String arrivalTransportType;
    @XmlElement(name = "ArrivalStationCode")
    protected String arrivalStationCode;
    @XmlElement(name = "ArrivalCarrierCode")
    protected String arrivalCarrierCode;
    @XmlElement(name = "ArrivalDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String arrivalDateTime;
    @XmlElement(name = "ArrivalTransportNo")
    protected String arrivalTransportNo;
    @XmlElement(name = "ArrivalComments")
    protected String arrivalComments;
    @XmlElement(name = "DepartureTransportationYN")
    protected String departureTransportationYN;
    @XmlElement(name = "DepartureTransportType")
    protected String departureTransportType;
    @XmlElement(name = "DepartureStationCode")
    protected String departureStationCode;
    @XmlElement(name = "DepartureCarrierCode")
    protected String departureCarrierCode;
    @XmlElement(name = "DepartureDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String departureDateTime;
    @XmlElement(name = "DepartureTransportNo")
    protected String departureTransportNo;
    @XmlElement(name = "DepartureComments")
    protected String departureComments;
    @XmlElement(name = "PayMentGateWay")
    protected ArrayOfOrderInfoPaymentGateway payMentGateWay;
    @XmlElement(name = "Accompanyings")
    protected ArrayOfOrderInfoAccompanying accompanyings;
    @XmlElement(name = "OrderInfoTraceTextsList")
    protected ArrayOfOrderInfoTraceTexts orderInfoTraceTextsList;
    @XmlElement(name = "DailyItems")
    protected ArrayOfDailyItem dailyItems;
    @XmlElement(name = "OrderInfoPackageList")
    protected ArrayOfOrderInfoPackage orderInfoPackageList;
    @XmlElement(name = "OrderInfoAlertsList")
    protected ArrayOfOrderInfoAlerts orderInfoAlertsList;
    @XmlElement(name = "Payment")
    protected Payment payment;
    @XmlElement(name = "GuestInfoId")
    protected int guestInfoId;
    @XmlElement(name = "DepositScheduleInfo")
    protected OrderInfoDepositSchedule depositScheduleInfo;
    @XmlElement(name = "CancelScheduleInfo")
    protected OrderInfoCancelSchedule cancelScheduleInfo;
    @XmlElement(name = "ExternalUser")
    protected String externalUser;
    @XmlElement(name = "BlockCode")
    protected String blockCode;
    @XmlElement(name = "OrderInfoComments")
    protected ArrayOfOrderInfoComments orderInfoComments;
    @XmlElement(name = "DicInfoFfp")
    protected ArrayOfFfpAttribute dicInfoFfp;
    @XmlElement(name = "MemberInfoFfp")
    protected ArrayOfMemberInfoFFP memberInfoFfp;
    @XmlElement(name = "TravelAgency")
    protected String travelAgency;
    @XmlElement(name = "SourceOfBusiness")
    protected String sourceOfBusiness;
    @XmlElement(name = "IdOfTravelAgency")
    protected int idOfTravelAgency;
    @XmlElement(name = "IdOfSourceBusiness")
    protected int idOfSourceBusiness;
    @XmlElement(name = "AccountOfTravelAgency")
    protected String accountOfTravelAgency;
    @XmlElement(name = "AccountOfSourceBusiness")
    protected String accountOfSourceBusiness;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "CompanyAccount")
    protected String companyAccount;
    @XmlElement(name = "CompanyID")
    protected int companyID;
    @XmlElement(name = "CroPermissionName")
    protected String croPermissionName;
    @XmlElement(name = "DiscountMethod")
    protected String discountMethod;

    /**
     * ��ȡudf1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf1() {
        return udf1;
    }

    /**
     * ����udf1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf1(String value) {
        this.udf1 = value;
    }

    /**
     * ��ȡudf2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf2() {
        return udf2;
    }

    /**
     * ����udf2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf2(String value) {
        this.udf2 = value;
    }

    /**
     * ��ȡudf3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf3() {
        return udf3;
    }

    /**
     * ����udf3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf3(String value) {
        this.udf3 = value;
    }

    /**
     * ��ȡudf4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf4() {
        return udf4;
    }

    /**
     * ����udf4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf4(String value) {
        this.udf4 = value;
    }

    /**
     * ��ȡudf5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf5() {
        return udf5;
    }

    /**
     * ����udf5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf5(String value) {
        this.udf5 = value;
    }

    /**
     * ��ȡudf6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf6() {
        return udf6;
    }

    /**
     * ����udf6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf6(String value) {
        this.udf6 = value;
    }

    /**
     * ��ȡudf7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf7() {
        return udf7;
    }

    /**
     * ����udf7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf7(String value) {
        this.udf7 = value;
    }

    /**
     * ��ȡudf8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf8() {
        return udf8;
    }

    /**
     * ����udf8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf8(String value) {
        this.udf8 = value;
    }

    /**
     * ��ȡudf9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf9() {
        return udf9;
    }

    /**
     * ����udf9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf9(String value) {
        this.udf9 = value;
    }

    /**
     * ��ȡudf10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf10() {
        return udf10;
    }

    /**
     * ����udf10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf10(String value) {
        this.udf10 = value;
    }

    /**
     * ��ȡudf11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf11() {
        return udf11;
    }

    /**
     * ����udf11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf11(String value) {
        this.udf11 = value;
    }

    /**
     * ��ȡudf12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf12() {
        return udf12;
    }

    /**
     * ����udf12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf12(String value) {
        this.udf12 = value;
    }

    /**
     * ��ȡudf13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf13() {
        return udf13;
    }

    /**
     * ����udf13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf13(String value) {
        this.udf13 = value;
    }

    /**
     * ��ȡudf14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf14() {
        return udf14;
    }

    /**
     * ����udf14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf14(String value) {
        this.udf14 = value;
    }

    /**
     * ��ȡudf15���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf15() {
        return udf15;
    }

    /**
     * ����udf15���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf15(String value) {
        this.udf15 = value;
    }

    /**
     * ��ȡudf16���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf16() {
        return udf16;
    }

    /**
     * ����udf16���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf16(String value) {
        this.udf16 = value;
    }

    /**
     * ��ȡudf17���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf17() {
        return udf17;
    }

    /**
     * ����udf17���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf17(String value) {
        this.udf17 = value;
    }

    /**
     * ��ȡudf18���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf18() {
        return udf18;
    }

    /**
     * ����udf18���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf18(String value) {
        this.udf18 = value;
    }

    /**
     * ��ȡudf19���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf19() {
        return udf19;
    }

    /**
     * ����udf19���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf19(String value) {
        this.udf19 = value;
    }

    /**
     * ��ȡudf20���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf20() {
        return udf20;
    }

    /**
     * ����udf20���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf20(String value) {
        this.udf20 = value;
    }

    /**
     * ��ȡgroupType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * ����groupType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * ��ȡbarType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BarType }
     *     
     */
    public BarType getBarType() {
        return barType;
    }

    /**
     * ����barType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BarType }
     *     
     */
    public void setBarType(BarType value) {
        this.barType = value;
    }

    /**
     * ��ȡresvPoints���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResvPoints() {
        return resvPoints;
    }

    /**
     * ����resvPoints���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResvPoints(BigDecimal value) {
        this.resvPoints = value;
    }

    /**
     * ��ȡrecommendedLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedLevel() {
        return recommendedLevel;
    }

    /**
     * ����recommendedLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedLevel(String value) {
        this.recommendedLevel = value;
    }

    /**
     * ��ȡchannelConfirmID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelConfirmID() {
        return channelConfirmID;
    }

    /**
     * ����channelConfirmID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelConfirmID(String value) {
        this.channelConfirmID = value;
    }

    /**
     * ��ȡchannelCancelID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCancelID() {
        return channelCancelID;
    }

    /**
     * ����channelCancelID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCancelID(String value) {
        this.channelCancelID = value;
    }

    /**
     * ��ȡdeposit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DepositInfo }
     *     
     */
    public DepositInfo getDeposit() {
        return deposit;
    }

    /**
     * ����deposit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DepositInfo }
     *     
     */
    public void setDeposit(DepositInfo value) {
        this.deposit = value;
    }

    /**
     * ��ȡoriginalOrderInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OriginalOrderInfo }
     *     
     */
    public OriginalOrderInfo getOriginalOrderInfo() {
        return originalOrderInfo;
    }

    /**
     * ����originalOrderInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalOrderInfo }
     *     
     */
    public void setOriginalOrderInfo(OriginalOrderInfo value) {
        this.originalOrderInfo = value;
    }

    /**
     * ��ȡorderRoomStayInfos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderRoomStayInfo }
     *     
     */
    public ArrayOfOrderRoomStayInfo getOrderRoomStayInfos() {
        return orderRoomStayInfos;
    }

    /**
     * ����orderRoomStayInfos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderRoomStayInfo }
     *     
     */
    public void setOrderRoomStayInfos(ArrayOfOrderRoomStayInfo value) {
        this.orderRoomStayInfos = value;
    }

    /**
     * ��ȡorderInfoDiscounts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoDiscount }
     *     
     */
    public ArrayOfOrderInfoDiscount getOrderInfoDiscounts() {
        return orderInfoDiscounts;
    }

    /**
     * ����orderInfoDiscounts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoDiscount }
     *     
     */
    public void setOrderInfoDiscounts(ArrayOfOrderInfoDiscount value) {
        this.orderInfoDiscounts = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * ��ȡarrival���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * ����arrival���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrival(String value) {
        this.arrival = value;
    }

    /**
     * ��ȡisfixedrate���Ե�ֵ��
     * 
     */
    public boolean isIsfixedrate() {
        return isfixedrate;
    }

    /**
     * ����isfixedrate���Ե�ֵ��
     * 
     */
    public void setIsfixedrate(boolean value) {
        this.isfixedrate = value;
    }

    /**
     * ��ȡdeparture���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * ����departure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparture(String value) {
        this.departure = value;
    }

    /**
     * ��ȡhotelCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getHotelCode() {
        return hotelCode;
    }

    /**
     * ����hotelCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setHotelCode(CommonInfo value) {
        this.hotelCode = value;
    }

    /**
     * ��ȡguesttypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getGuesttypeCode() {
        return guesttypeCode;
    }

    /**
     * ����guesttypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setGuesttypeCode(CommonInfo value) {
        this.guesttypeCode = value;
    }

    /**
     * ��ȡguestID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestID() {
        return guestID;
    }

    /**
     * ����guestID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestID(String value) {
        this.guestID = value;
    }

    /**
     * ��ȡroomNum���Ե�ֵ��
     * 
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * ����roomNum���Ե�ֵ��
     * 
     */
    public void setRoomNum(int value) {
        this.roomNum = value;
    }

    /**
     * ��ȡroomtypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getRoomtypeCode() {
        return roomtypeCode;
    }

    /**
     * ����roomtypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setRoomtypeCode(CommonInfo value) {
        this.roomtypeCode = value;
    }

    /**
     * ��ȡrateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getRateCode() {
        return rateCode;
    }

    /**
     * ����rateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setRateCode(CommonInfo value) {
        this.rateCode = value;
    }

    /**
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * ��ȡwrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWrate() {
        return wrate;
    }

    /**
     * ����wrate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWrate(BigDecimal value) {
        this.wrate = value;
    }

    /**
     * ��ȡadults���Ե�ֵ��
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * ����adults���Ե�ֵ��
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * ��ȡchildren���Ե�ֵ��
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * ����children���Ե�ֵ��
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * ��ȡextraBed���Ե�ֵ��
     * 
     */
    public int getExtraBed() {
        return extraBed;
    }

    /**
     * ����extraBed���Ե�ֵ��
     * 
     */
    public void setExtraBed(int value) {
        this.extraBed = value;
    }

    /**
     * ��ȡfirstname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * ����firstname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * ��ȡlastname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * ����lastname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * ��ȡcountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getCountryCode() {
        return countryCode;
    }

    /**
     * ����countryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setCountryCode(CommonInfo value) {
        this.countryCode = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * ��ȡfax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * ����fax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡidNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * ����idNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * ��ȡcredittypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getCredittypeCode() {
        return credittypeCode;
    }

    /**
     * ����credittypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setCredittypeCode(CommonInfo value) {
        this.credittypeCode = value;
    }

    /**
     * ��ȡcardHolder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * ����cardHolder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * ��ȡcreditid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditid() {
        return creditid;
    }

    /**
     * ����creditid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditid(String value) {
        this.creditid = value;
    }

    /**
     * ��ȡexpire���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpire() {
        return expire;
    }

    /**
     * ����expire���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpire(String value) {
        this.expire = value;
    }

    /**
     * ��ȡmakedate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakedate() {
        return makedate;
    }

    /**
     * ����makedate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakedate(String value) {
        this.makedate = value;
    }

    /**
     * ��ȡmaker���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaker() {
        return maker;
    }

    /**
     * ����maker���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaker(String value) {
        this.maker = value;
    }

    /**
     * ��ȡinsertUserName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertUserName() {
        return insertUserName;
    }

    /**
     * ����insertUserName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertUserName(String value) {
        this.insertUserName = value;
    }

    /**
     * ��ȡupdateUserName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * ����updateUserName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUserName(String value) {
        this.updateUserName = value;
    }

    /**
     * ��ȡmakehotelCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakehotelCode() {
        return makehotelCode;
    }

    /**
     * ����makehotelCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakehotelCode(String value) {
        this.makehotelCode = value;
    }

    /**
     * ��ȡflag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * ����flag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * ��ȡstatusCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getStatusCode() {
        return statusCode;
    }

    /**
     * ����statusCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setStatusCode(CommonInfo value) {
        this.statusCode = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * ��ȡconfirmID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmID() {
        return confirmID;
    }

    /**
     * ����confirmID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmID(String value) {
        this.confirmID = value;
    }

    /**
     * ��ȡbookerID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerID() {
        return bookerID;
    }

    /**
     * ����bookerID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerID(String value) {
        this.bookerID = value;
    }

    /**
     * ��ȡbookerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerName() {
        return bookerName;
    }

    /**
     * ����bookerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerName(String value) {
        this.bookerName = value;
    }

    /**
     * ��ȡbookerMobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerMobile() {
        return bookerMobile;
    }

    /**
     * ����bookerMobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerMobile(String value) {
        this.bookerMobile = value;
    }

    /**
     * ��ȡbookerEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerEmail() {
        return bookerEmail;
    }

    /**
     * ����bookerEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerEmail(String value) {
        this.bookerEmail = value;
    }

    /**
     * ��ȡsplitOrderIds���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSplitOrderId }
     *     
     */
    public ArrayOfSplitOrderId getSplitOrderIds() {
        return splitOrderIds;
    }

    /**
     * ����splitOrderIds���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSplitOrderId }
     *     
     */
    public void setSplitOrderIds(ArrayOfSplitOrderId value) {
        this.splitOrderIds = value;
    }

    /**
     * ��ȡmoreOccupants���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMoreOccupant }
     *     
     */
    public ArrayOfMoreOccupant getMoreOccupants() {
        return moreOccupants;
    }

    /**
     * ����moreOccupants���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMoreOccupant }
     *     
     */
    public void setMoreOccupants(ArrayOfMoreOccupant value) {
        this.moreOccupants = value;
    }

    /**
     * ��ȡsynchroSplitOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchroSplitOrder() {
        return synchroSplitOrder;
    }

    /**
     * ����synchroSplitOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchroSplitOrder(String value) {
        this.synchroSplitOrder = value;
    }

    /**
     * ��ȡoriginalOrderId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalOrderId() {
        return originalOrderId;
    }

    /**
     * ����originalOrderId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalOrderId(String value) {
        this.originalOrderId = value;
    }

    /**
     * ��ȡinfant���Ե�ֵ��
     * 
     */
    public int getInfant() {
        return infant;
    }

    /**
     * ����infant���Ե�ֵ��
     * 
     */
    public void setInfant(int value) {
        this.infant = value;
    }

    /**
     * ��ȡcity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getCity() {
        return city;
    }

    /**
     * ����city���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setCity(CommonInfo value) {
        this.city = value;
    }

    /**
     * ��ȡlanguagCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getLanguagCode() {
        return languagCode;
    }

    /**
     * ����languagCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setLanguagCode(CommonInfo value) {
        this.languagCode = value;
    }

    /**
     * ��ȡtitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getTitle() {
        return title;
    }

    /**
     * ����title���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setTitle(CommonInfo value) {
        this.title = value;
    }

    /**
     * ��ȡprovinceCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getProvinceCode() {
        return provinceCode;
    }

    /**
     * ����provinceCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setProvinceCode(CommonInfo value) {
        this.provinceCode = value;
    }

    /**
     * ��ȡbirthday���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * ����birthday���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * ��ȡcompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * ����company���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * ��ȡroomno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomno() {
        return roomno;
    }

    /**
     * ����roomno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomno(String value) {
        this.roomno = value;
    }

    /**
     * ��ȡemailConfirm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailConfirm() {
        return emailConfirm;
    }

    /**
     * ����emailConfirm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailConfirm(String value) {
        this.emailConfirm = value;
    }

    /**
     * ��ȡcomOk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComOk() {
        return comOk;
    }

    /**
     * ����comOk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComOk(String value) {
        this.comOk = value;
    }

    /**
     * ��ȡorderType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * ����orderType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * ��ȡinitialRateDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialRateDateTime() {
        return initialRateDateTime;
    }

    /**
     * ����initialRateDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialRateDateTime(String value) {
        this.initialRateDateTime = value;
    }

    /**
     * ��ȡtotalRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * ����totalRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRevenue(BigDecimal value) {
        this.totalRevenue = value;
    }

    /**
     * ��ȡinitialPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialPrice() {
        return initialPrice;
    }

    /**
     * ����initialPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialPrice(BigDecimal value) {
        this.initialPrice = value;
    }

    /**
     * ��ȡcomErr���Ե�ֵ��
     * 
     */
    public short getComErr() {
        return comErr;
    }

    /**
     * ����comErr���Ե�ֵ��
     * 
     */
    public void setComErr(short value) {
        this.comErr = value;
    }

    /**
     * ��ȡmarket���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMarket() {
        return market;
    }

    /**
     * ����market���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMarket(CommonInfo value) {
        this.market = value;
    }

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setSource(CommonInfo value) {
        this.source = value;
    }

    /**
     * ��ȡsex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * ����sex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * ��ȡpostcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * ����postcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * ��ȡchannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getChannel() {
        return channel;
    }

    /**
     * ����channel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setChannel(CommonInfo value) {
        this.channel = value;
    }

    /**
     * ��ȡcCardErr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCardErr() {
        return cCardErr;
    }

    /**
     * ����cCardErr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCardErr(String value) {
        this.cCardErr = value;
    }

    /**
     * ��ȡchineseName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * ����chineseName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChineseName(String value) {
        this.chineseName = value;
    }

    /**
     * ��ȡturnAway���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnAway() {
        return turnAway;
    }

    /**
     * ����turnAway���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnAway(String value) {
        this.turnAway = value;
    }

    /**
     * ��ȡflyNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlyNum() {
        return flyNum;
    }

    /**
     * ����flyNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlyNum(String value) {
        this.flyNum = value;
    }

    /**
     * ��ȡarrivalTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * ����arrivalTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * ��ȡdepartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartTime() {
        return departTime;
    }

    /**
     * ����departTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartTime(String value) {
        this.departTime = value;
    }

    /**
     * ��ȡmemberId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getMemberId() {
        return memberId;
    }

    /**
     * ����memberId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setMemberId(CommonInfo value) {
        this.memberId = value;
    }

    /**
     * ��ȡcardType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getCardType() {
        return cardType;
    }

    /**
     * ����cardType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setCardType(CommonInfo value) {
        this.cardType = value;
    }

    /**
     * ��ȡcardLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getCardLevel() {
        return cardLevel;
    }

    /**
     * ����cardLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setCardLevel(CommonInfo value) {
        this.cardLevel = value;
    }

    /**
     * ��ȡadj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdj() {
        return adj;
    }

    /**
     * ����adj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdj(BigDecimal value) {
        this.adj = value;
    }

    /**
     * ��ȡcancelID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelID() {
        return cancelID;
    }

    /**
     * ����cancelID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelID(String value) {
        this.cancelID = value;
    }

    /**
     * ��ȡpmsResId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsResId() {
        return pmsResId;
    }

    /**
     * ����pmsResId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsResId(String value) {
        this.pmsResId = value;
    }

    /**
     * ��ȡpmsCancelId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsCancelId() {
        return pmsCancelId;
    }

    /**
     * ����pmsCancelId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsCancelId(String value) {
        this.pmsCancelId = value;
    }

    /**
     * ��ȡreservationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommonInfo }
     *     
     */
    public CommonInfo getReservationType() {
        return reservationType;
    }

    /**
     * ����reservationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfo }
     *     
     */
    public void setReservationType(CommonInfo value) {
        this.reservationType = value;
    }

    /**
     * ��ȡspecialCodes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCodes() {
        return specialCodes;
    }

    /**
     * ����specialCodes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCodes(String value) {
        this.specialCodes = value;
    }

    /**
     * ��ȡmobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ����mobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * ��ȡkeepHour���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepHour() {
        return keepHour;
    }

    /**
     * ����keepHour���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepHour(String value) {
        this.keepHour = value;
    }

    /**
     * ��ȡchname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChname() {
        return chname;
    }

    /**
     * ����chname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChname(String value) {
        this.chname = value;
    }

    /**
     * ��ȡgroupID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * ����groupID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * ��ȡzip���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * ����zip���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * ��ȡofficePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * ����officePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * ��ȡcustID���Ե�ֵ��
     * 
     */
    public int getCustID() {
        return custID;
    }

    /**
     * ����custID���Ե�ֵ��
     * 
     */
    public void setCustID(int value) {
        this.custID = value;
    }

    /**
     * ��ȡaccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * ����account���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * ��ȡaddress1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * ����address1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * ��ȡaddress2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * ����address2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * ��ȡaddress3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * ����address3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * ��ȡaddress4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * ����address4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * ��ȡidNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * ����idNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo(String value) {
        this.idNo = value;
    }

    /**
     * ��ȡcancelDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * ����cancelDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    /**
     * ��ȡdepositCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositCode() {
        return depositCode;
    }

    /**
     * ����depositCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositCode(String value) {
        this.depositCode = value;
    }

    /**
     * ��ȡcommisionCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommisionCode() {
        return commisionCode;
    }

    /**
     * ����commisionCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommisionCode(String value) {
        this.commisionCode = value;
    }

    /**
     * ��ȡcancelCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelCode() {
        return cancelCode;
    }

    /**
     * ����cancelCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelCode(String value) {
        this.cancelCode = value;
    }

    /**
     * ��ȡpromotionCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * ����promotionCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * ��ȡffpId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfpId() {
        return ffpId;
    }

    /**
     * ����ffpId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfpId(String value) {
        this.ffpId = value;
    }

    /**
     * ��ȡproviderCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * ����providerCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * ��ȡproviderKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderKey() {
        return providerKey;
    }

    /**
     * ����providerKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderKey(String value) {
        this.providerKey = value;
    }

    /**
     * ��ȡpartyNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNO() {
        return partyNO;
    }

    /**
     * ����partyNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNO(String value) {
        this.partyNO = value;
    }

    /**
     * ��ȡcrsPartyNO���Ե�ֵ��
     * 
     */
    public int getCrsPartyNO() {
        return crsPartyNO;
    }

    /**
     * ����crsPartyNO���Ե�ֵ��
     * 
     */
    public void setCrsPartyNO(int value) {
        this.crsPartyNO = value;
    }

    /**
     * ��ȡshareCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareCode() {
        return shareCode;
    }

    /**
     * ����shareCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareCode(String value) {
        this.shareCode = value;
    }

    /**
     * ��ȡarrivalTransportationYN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTransportationYN() {
        return arrivalTransportationYN;
    }

    /**
     * ����arrivalTransportationYN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTransportationYN(String value) {
        this.arrivalTransportationYN = value;
    }

    /**
     * ��ȡarrivalTransportType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTransportType() {
        return arrivalTransportType;
    }

    /**
     * ����arrivalTransportType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTransportType(String value) {
        this.arrivalTransportType = value;
    }

    /**
     * ��ȡarrivalStationCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalStationCode() {
        return arrivalStationCode;
    }

    /**
     * ����arrivalStationCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalStationCode(String value) {
        this.arrivalStationCode = value;
    }

    /**
     * ��ȡarrivalCarrierCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCarrierCode() {
        return arrivalCarrierCode;
    }

    /**
     * ����arrivalCarrierCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCarrierCode(String value) {
        this.arrivalCarrierCode = value;
    }

    /**
     * ��ȡarrivalDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * ����arrivalDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDateTime(String value) {
        this.arrivalDateTime = value;
    }

    /**
     * ��ȡarrivalTransportNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTransportNo() {
        return arrivalTransportNo;
    }

    /**
     * ����arrivalTransportNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTransportNo(String value) {
        this.arrivalTransportNo = value;
    }

    /**
     * ��ȡarrivalComments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalComments() {
        return arrivalComments;
    }

    /**
     * ����arrivalComments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalComments(String value) {
        this.arrivalComments = value;
    }

    /**
     * ��ȡdepartureTransportationYN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTransportationYN() {
        return departureTransportationYN;
    }

    /**
     * ����departureTransportationYN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTransportationYN(String value) {
        this.departureTransportationYN = value;
    }

    /**
     * ��ȡdepartureTransportType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTransportType() {
        return departureTransportType;
    }

    /**
     * ����departureTransportType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTransportType(String value) {
        this.departureTransportType = value;
    }

    /**
     * ��ȡdepartureStationCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureStationCode() {
        return departureStationCode;
    }

    /**
     * ����departureStationCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureStationCode(String value) {
        this.departureStationCode = value;
    }

    /**
     * ��ȡdepartureCarrierCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCarrierCode() {
        return departureCarrierCode;
    }

    /**
     * ����departureCarrierCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCarrierCode(String value) {
        this.departureCarrierCode = value;
    }

    /**
     * ��ȡdepartureDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * ����departureDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * ��ȡdepartureTransportNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTransportNo() {
        return departureTransportNo;
    }

    /**
     * ����departureTransportNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTransportNo(String value) {
        this.departureTransportNo = value;
    }

    /**
     * ��ȡdepartureComments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureComments() {
        return departureComments;
    }

    /**
     * ����departureComments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureComments(String value) {
        this.departureComments = value;
    }

    /**
     * ��ȡpayMentGateWay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoPaymentGateway }
     *     
     */
    public ArrayOfOrderInfoPaymentGateway getPayMentGateWay() {
        return payMentGateWay;
    }

    /**
     * ����payMentGateWay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoPaymentGateway }
     *     
     */
    public void setPayMentGateWay(ArrayOfOrderInfoPaymentGateway value) {
        this.payMentGateWay = value;
    }

    /**
     * ��ȡaccompanyings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoAccompanying }
     *     
     */
    public ArrayOfOrderInfoAccompanying getAccompanyings() {
        return accompanyings;
    }

    /**
     * ����accompanyings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoAccompanying }
     *     
     */
    public void setAccompanyings(ArrayOfOrderInfoAccompanying value) {
        this.accompanyings = value;
    }

    /**
     * ��ȡorderInfoTraceTextsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoTraceTexts }
     *     
     */
    public ArrayOfOrderInfoTraceTexts getOrderInfoTraceTextsList() {
        return orderInfoTraceTextsList;
    }

    /**
     * ����orderInfoTraceTextsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoTraceTexts }
     *     
     */
    public void setOrderInfoTraceTextsList(ArrayOfOrderInfoTraceTexts value) {
        this.orderInfoTraceTextsList = value;
    }

    /**
     * ��ȡdailyItems���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDailyItem }
     *     
     */
    public ArrayOfDailyItem getDailyItems() {
        return dailyItems;
    }

    /**
     * ����dailyItems���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDailyItem }
     *     
     */
    public void setDailyItems(ArrayOfDailyItem value) {
        this.dailyItems = value;
    }

    /**
     * ��ȡorderInfoPackageList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoPackage }
     *     
     */
    public ArrayOfOrderInfoPackage getOrderInfoPackageList() {
        return orderInfoPackageList;
    }

    /**
     * ����orderInfoPackageList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoPackage }
     *     
     */
    public void setOrderInfoPackageList(ArrayOfOrderInfoPackage value) {
        this.orderInfoPackageList = value;
    }

    /**
     * ��ȡorderInfoAlertsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoAlerts }
     *     
     */
    public ArrayOfOrderInfoAlerts getOrderInfoAlertsList() {
        return orderInfoAlertsList;
    }

    /**
     * ����orderInfoAlertsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoAlerts }
     *     
     */
    public void setOrderInfoAlertsList(ArrayOfOrderInfoAlerts value) {
        this.orderInfoAlertsList = value;
    }

    /**
     * ��ȡpayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * ����payment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * ��ȡguestInfoId���Ե�ֵ��
     * 
     */
    public int getGuestInfoId() {
        return guestInfoId;
    }

    /**
     * ����guestInfoId���Ե�ֵ��
     * 
     */
    public void setGuestInfoId(int value) {
        this.guestInfoId = value;
    }

    /**
     * ��ȡdepositScheduleInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoDepositSchedule }
     *     
     */
    public OrderInfoDepositSchedule getDepositScheduleInfo() {
        return depositScheduleInfo;
    }

    /**
     * ����depositScheduleInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoDepositSchedule }
     *     
     */
    public void setDepositScheduleInfo(OrderInfoDepositSchedule value) {
        this.depositScheduleInfo = value;
    }

    /**
     * ��ȡcancelScheduleInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoCancelSchedule }
     *     
     */
    public OrderInfoCancelSchedule getCancelScheduleInfo() {
        return cancelScheduleInfo;
    }

    /**
     * ����cancelScheduleInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoCancelSchedule }
     *     
     */
    public void setCancelScheduleInfo(OrderInfoCancelSchedule value) {
        this.cancelScheduleInfo = value;
    }

    /**
     * ��ȡexternalUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUser() {
        return externalUser;
    }

    /**
     * ����externalUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUser(String value) {
        this.externalUser = value;
    }

    /**
     * ��ȡblockCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockCode() {
        return blockCode;
    }

    /**
     * ����blockCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockCode(String value) {
        this.blockCode = value;
    }

    /**
     * ��ȡorderInfoComments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderInfoComments }
     *     
     */
    public ArrayOfOrderInfoComments getOrderInfoComments() {
        return orderInfoComments;
    }

    /**
     * ����orderInfoComments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderInfoComments }
     *     
     */
    public void setOrderInfoComments(ArrayOfOrderInfoComments value) {
        this.orderInfoComments = value;
    }

    /**
     * ��ȡdicInfoFfp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFfpAttribute }
     *     
     */
    public ArrayOfFfpAttribute getDicInfoFfp() {
        return dicInfoFfp;
    }

    /**
     * ����dicInfoFfp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFfpAttribute }
     *     
     */
    public void setDicInfoFfp(ArrayOfFfpAttribute value) {
        this.dicInfoFfp = value;
    }

    /**
     * ��ȡmemberInfoFfp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMemberInfoFFP }
     *     
     */
    public ArrayOfMemberInfoFFP getMemberInfoFfp() {
        return memberInfoFfp;
    }

    /**
     * ����memberInfoFfp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMemberInfoFFP }
     *     
     */
    public void setMemberInfoFfp(ArrayOfMemberInfoFFP value) {
        this.memberInfoFfp = value;
    }

    /**
     * ��ȡtravelAgency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgency() {
        return travelAgency;
    }

    /**
     * ����travelAgency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgency(String value) {
        this.travelAgency = value;
    }

    /**
     * ��ȡsourceOfBusiness���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }

    /**
     * ����sourceOfBusiness���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfBusiness(String value) {
        this.sourceOfBusiness = value;
    }

    /**
     * ��ȡidOfTravelAgency���Ե�ֵ��
     * 
     */
    public int getIdOfTravelAgency() {
        return idOfTravelAgency;
    }

    /**
     * ����idOfTravelAgency���Ե�ֵ��
     * 
     */
    public void setIdOfTravelAgency(int value) {
        this.idOfTravelAgency = value;
    }

    /**
     * ��ȡidOfSourceBusiness���Ե�ֵ��
     * 
     */
    public int getIdOfSourceBusiness() {
        return idOfSourceBusiness;
    }

    /**
     * ����idOfSourceBusiness���Ե�ֵ��
     * 
     */
    public void setIdOfSourceBusiness(int value) {
        this.idOfSourceBusiness = value;
    }

    /**
     * ��ȡaccountOfTravelAgency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOfTravelAgency() {
        return accountOfTravelAgency;
    }

    /**
     * ����accountOfTravelAgency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOfTravelAgency(String value) {
        this.accountOfTravelAgency = value;
    }

    /**
     * ��ȡaccountOfSourceBusiness���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOfSourceBusiness() {
        return accountOfSourceBusiness;
    }

    /**
     * ����accountOfSourceBusiness���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOfSourceBusiness(String value) {
        this.accountOfSourceBusiness = value;
    }

    /**
     * ��ȡcompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * ����companyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * ��ȡcompanyAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAccount() {
        return companyAccount;
    }

    /**
     * ����companyAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAccount(String value) {
        this.companyAccount = value;
    }

    /**
     * ��ȡcompanyID���Ե�ֵ��
     * 
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * ����companyID���Ե�ֵ��
     * 
     */
    public void setCompanyID(int value) {
        this.companyID = value;
    }

    /**
     * ��ȡcroPermissionName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCroPermissionName() {
        return croPermissionName;
    }

    /**
     * ����croPermissionName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCroPermissionName(String value) {
        this.croPermissionName = value;
    }

    /**
     * ��ȡdiscountMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountMethod() {
        return discountMethod;
    }

    /**
     * ����discountMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountMethod(String value) {
        this.discountMethod = value;
    }

}
