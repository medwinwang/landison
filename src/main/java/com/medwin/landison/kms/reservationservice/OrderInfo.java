
package com.medwin.landison.kms.reservationservice;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>OrderInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
    @XmlElement(name = "Arrival", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date arrival;
    @XmlElement(name = "Isfixedrate")
    protected boolean isfixedrate;
    @XmlElement(name = "Departure", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date departure;
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
    @XmlElement(name = "Expire", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date expire;
    @XmlElement(name = "Makedate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date makedate;
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
    @XmlElement(name = "Birthday", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthday;
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
    @XmlElement(name = "InitialRateDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date initialRateDateTime;
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
    @XmlElement(name = "Keep_hour", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date keepHour;
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
    @XmlElement(name = "CancelDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date cancelDate;
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
    @XmlElement(name = "ArrivalDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date arrivalDateTime;
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
    @XmlElement(name = "DepartureDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date departureDateTime;
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
     * 获取udf1属性的值。
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
     * 设置udf1属性的值。
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
     * 获取udf2属性的值。
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
     * 设置udf2属性的值。
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
     * 获取udf3属性的值。
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
     * 设置udf3属性的值。
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
     * 获取udf4属性的值。
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
     * 设置udf4属性的值。
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
     * 获取udf5属性的值。
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
     * 设置udf5属性的值。
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
     * 获取udf6属性的值。
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
     * 设置udf6属性的值。
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
     * 获取udf7属性的值。
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
     * 设置udf7属性的值。
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
     * 获取udf8属性的值。
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
     * 设置udf8属性的值。
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
     * 获取udf9属性的值。
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
     * 设置udf9属性的值。
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
     * 获取udf10属性的值。
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
     * 设置udf10属性的值。
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
     * 获取udf11属性的值。
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
     * 设置udf11属性的值。
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
     * 获取udf12属性的值。
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
     * 设置udf12属性的值。
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
     * 获取udf13属性的值。
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
     * 设置udf13属性的值。
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
     * 获取udf14属性的值。
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
     * 设置udf14属性的值。
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
     * 获取udf15属性的值。
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
     * 设置udf15属性的值。
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
     * 获取udf16属性的值。
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
     * 设置udf16属性的值。
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
     * 获取udf17属性的值。
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
     * 设置udf17属性的值。
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
     * 获取udf18属性的值。
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
     * 设置udf18属性的值。
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
     * 获取udf19属性的值。
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
     * 设置udf19属性的值。
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
     * 获取udf20属性的值。
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
     * 设置udf20属性的值。
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
     * 获取groupType属性的值。
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
     * 设置groupType属性的值。
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
     * 获取barType属性的值。
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
     * 设置barType属性的值。
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
     * 获取resvPoints属性的值。
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
     * 设置resvPoints属性的值。
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
     * 获取recommendedLevel属性的值。
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
     * 设置recommendedLevel属性的值。
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
     * 获取channelConfirmID属性的值。
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
     * 设置channelConfirmID属性的值。
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
     * 获取channelCancelID属性的值。
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
     * 设置channelCancelID属性的值。
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
     * 获取deposit属性的值。
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
     * 设置deposit属性的值。
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
     * 获取originalOrderInfo属性的值。
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
     * 设置originalOrderInfo属性的值。
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
     * 获取orderRoomStayInfos属性的值。
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
     * 设置orderRoomStayInfos属性的值。
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
     * 获取orderInfoDiscounts属性的值。
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
     * 设置orderInfoDiscounts属性的值。
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
     * 获取id属性的值。
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * 获取arrival属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getArrival() {
        return arrival;
    }

    /**
     * 设置arrival属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrival(Date value) {
        this.arrival = value;
    }

    /**
     * 获取isfixedrate属性的值。
     * 
     */
    public boolean isIsfixedrate() {
        return isfixedrate;
    }

    /**
     * 设置isfixedrate属性的值。
     * 
     */
    public void setIsfixedrate(boolean value) {
        this.isfixedrate = value;
    }

    /**
     * 获取departure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDeparture() {
        return departure;
    }

    /**
     * 设置departure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparture(Date value) {
        this.departure = value;
    }

    /**
     * 获取hotelCode属性的值。
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
     * 设置hotelCode属性的值。
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
     * 获取guesttypeCode属性的值。
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
     * 设置guesttypeCode属性的值。
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
     * 获取guestID属性的值。
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
     * 设置guestID属性的值。
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
     * 获取roomNum属性的值。
     * 
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * 设置roomNum属性的值。
     * 
     */
    public void setRoomNum(int value) {
        this.roomNum = value;
    }

    /**
     * 获取roomtypeCode属性的值。
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
     * 设置roomtypeCode属性的值。
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
     * 获取rateCode属性的值。
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
     * 设置rateCode属性的值。
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
     * 获取rate属性的值。
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
     * 设置rate属性的值。
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
     * 获取wrate属性的值。
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
     * 设置wrate属性的值。
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
     * 获取adults属性的值。
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * 设置adults属性的值。
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * 获取children属性的值。
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * 设置children属性的值。
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * 获取extraBed属性的值。
     * 
     */
    public int getExtraBed() {
        return extraBed;
    }

    /**
     * 设置extraBed属性的值。
     * 
     */
    public void setExtraBed(int value) {
        this.extraBed = value;
    }

    /**
     * 获取firstname属性的值。
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
     * 设置firstname属性的值。
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
     * 获取lastname属性的值。
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
     * 设置lastname属性的值。
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
     * 获取countryCode属性的值。
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
     * 设置countryCode属性的值。
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
     * 获取address属性的值。
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
     * 设置address属性的值。
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
     * 获取fax属性的值。
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
     * 设置fax属性的值。
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
     * 获取phone属性的值。
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
     * 设置phone属性的值。
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
     * 获取email属性的值。
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
     * 设置email属性的值。
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
     * 获取idNumber属性的值。
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
     * 设置idNumber属性的值。
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
     * 获取credittypeCode属性的值。
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
     * 设置credittypeCode属性的值。
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
     * 获取cardHolder属性的值。
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
     * 设置cardHolder属性的值。
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
     * 获取creditid属性的值。
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
     * 设置creditid属性的值。
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
     * 获取expire属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpire() {
        return expire;
    }

    /**
     * 设置expire属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpire(Date value) {
        this.expire = value;
    }

    /**
     * 获取makedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMakedate() {
        return makedate;
    }

    /**
     * 设置makedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakedate(Date value) {
        this.makedate = value;
    }

    /**
     * 获取maker属性的值。
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
     * 设置maker属性的值。
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
     * 获取insertUserName属性的值。
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
     * 设置insertUserName属性的值。
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
     * 获取updateUserName属性的值。
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
     * 设置updateUserName属性的值。
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
     * 获取makehotelCode属性的值。
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
     * 设置makehotelCode属性的值。
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
     * 获取flag属性的值。
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
     * 设置flag属性的值。
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
     * 获取statusCode属性的值。
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
     * 设置statusCode属性的值。
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
     * 获取comments属性的值。
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
     * 设置comments属性的值。
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
     * 获取confirmID属性的值。
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
     * 设置confirmID属性的值。
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
     * 获取bookerID属性的值。
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
     * 设置bookerID属性的值。
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
     * 获取bookerName属性的值。
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
     * 设置bookerName属性的值。
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
     * 获取bookerMobile属性的值。
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
     * 设置bookerMobile属性的值。
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
     * 获取bookerEmail属性的值。
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
     * 设置bookerEmail属性的值。
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
     * 获取splitOrderIds属性的值。
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
     * 设置splitOrderIds属性的值。
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
     * 获取moreOccupants属性的值。
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
     * 设置moreOccupants属性的值。
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
     * 获取synchroSplitOrder属性的值。
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
     * 设置synchroSplitOrder属性的值。
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
     * 获取originalOrderId属性的值。
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
     * 设置originalOrderId属性的值。
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
     * 获取infant属性的值。
     * 
     */
    public int getInfant() {
        return infant;
    }

    /**
     * 设置infant属性的值。
     * 
     */
    public void setInfant(int value) {
        this.infant = value;
    }

    /**
     * 获取city属性的值。
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
     * 设置city属性的值。
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
     * 获取languagCode属性的值。
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
     * 设置languagCode属性的值。
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
     * 获取title属性的值。
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
     * 设置title属性的值。
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
     * 获取provinceCode属性的值。
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
     * 设置provinceCode属性的值。
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
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(Date value) {
        this.birthday = value;
    }

    /**
     * 获取company属性的值。
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
     * 设置company属性的值。
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
     * 获取roomno属性的值。
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
     * 设置roomno属性的值。
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
     * 获取emailConfirm属性的值。
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
     * 设置emailConfirm属性的值。
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
     * 获取comOk属性的值。
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
     * 设置comOk属性的值。
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
     * 获取orderType属性的值。
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
     * 设置orderType属性的值。
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
     * 获取initialRateDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getInitialRateDateTime() {
        return initialRateDateTime;
    }

    /**
     * 设置initialRateDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialRateDateTime(Date value) {
        this.initialRateDateTime = value;
    }

    /**
     * 获取totalRevenue属性的值。
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
     * 设置totalRevenue属性的值。
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
     * 获取initialPrice属性的值。
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
     * 设置initialPrice属性的值。
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
     * 获取comErr属性的值。
     * 
     */
    public short getComErr() {
        return comErr;
    }

    /**
     * 设置comErr属性的值。
     * 
     */
    public void setComErr(short value) {
        this.comErr = value;
    }

    /**
     * 获取market属性的值。
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
     * 设置market属性的值。
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
     * 获取source属性的值。
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
     * 设置source属性的值。
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
     * 获取sex属性的值。
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
     * 设置sex属性的值。
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
     * 获取postcode属性的值。
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
     * 设置postcode属性的值。
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
     * 获取channel属性的值。
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
     * 设置channel属性的值。
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
     * 获取cCardErr属性的值。
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
     * 设置cCardErr属性的值。
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
     * 获取chineseName属性的值。
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
     * 设置chineseName属性的值。
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
     * 获取turnAway属性的值。
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
     * 设置turnAway属性的值。
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
     * 获取flyNum属性的值。
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
     * 设置flyNum属性的值。
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
     * 获取arrivalTime属性的值。
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
     * 设置arrivalTime属性的值。
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
     * 获取departTime属性的值。
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
     * 设置departTime属性的值。
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
     * 获取memberId属性的值。
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
     * 设置memberId属性的值。
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
     * 获取cardType属性的值。
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
     * 设置cardType属性的值。
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
     * 获取cardLevel属性的值。
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
     * 设置cardLevel属性的值。
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
     * 获取adj属性的值。
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
     * 设置adj属性的值。
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
     * 获取cancelID属性的值。
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
     * 设置cancelID属性的值。
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
     * 获取pmsResId属性的值。
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
     * 设置pmsResId属性的值。
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
     * 获取pmsCancelId属性的值。
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
     * 设置pmsCancelId属性的值。
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
     * 获取reservationType属性的值。
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
     * 设置reservationType属性的值。
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
     * 获取specialCodes属性的值。
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
     * 设置specialCodes属性的值。
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
     * 获取mobile属性的值。
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
     * 设置mobile属性的值。
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
     * 获取keepHour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getKeepHour() {
        return keepHour;
    }

    /**
     * 设置keepHour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepHour(Date value) {
        this.keepHour = value;
    }

    /**
     * 获取chname属性的值。
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
     * 设置chname属性的值。
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
     * 获取groupID属性的值。
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
     * 设置groupID属性的值。
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
     * 获取zip属性的值。
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
     * 设置zip属性的值。
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
     * 获取officePhone属性的值。
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
     * 设置officePhone属性的值。
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
     * 获取custID属性的值。
     * 
     */
    public int getCustID() {
        return custID;
    }

    /**
     * 设置custID属性的值。
     * 
     */
    public void setCustID(int value) {
        this.custID = value;
    }

    /**
     * 获取account属性的值。
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
     * 设置account属性的值。
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
     * 获取address1属性的值。
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
     * 设置address1属性的值。
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
     * 获取address2属性的值。
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
     * 设置address2属性的值。
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
     * 获取address3属性的值。
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
     * 设置address3属性的值。
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
     * 获取address4属性的值。
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
     * 设置address4属性的值。
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
     * 获取idNo属性的值。
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
     * 设置idNo属性的值。
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
     * 获取cancelDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCancelDate() {
        return cancelDate;
    }

    /**
     * 设置cancelDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(Date value) {
        this.cancelDate = value;
    }

    /**
     * 获取depositCode属性的值。
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
     * 设置depositCode属性的值。
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
     * 获取commisionCode属性的值。
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
     * 设置commisionCode属性的值。
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
     * 获取cancelCode属性的值。
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
     * 设置cancelCode属性的值。
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
     * 获取promotionCode属性的值。
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
     * 设置promotionCode属性的值。
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
     * 获取ffpId属性的值。
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
     * 设置ffpId属性的值。
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
     * 获取providerCode属性的值。
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
     * 设置providerCode属性的值。
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
     * 获取providerKey属性的值。
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
     * 设置providerKey属性的值。
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
     * 获取partyNO属性的值。
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
     * 设置partyNO属性的值。
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
     * 获取crsPartyNO属性的值。
     * 
     */
    public int getCrsPartyNO() {
        return crsPartyNO;
    }

    /**
     * 设置crsPartyNO属性的值。
     * 
     */
    public void setCrsPartyNO(int value) {
        this.crsPartyNO = value;
    }

    /**
     * 获取shareCode属性的值。
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
     * 设置shareCode属性的值。
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
     * 获取arrivalTransportationYN属性的值。
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
     * 设置arrivalTransportationYN属性的值。
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
     * 获取arrivalTransportType属性的值。
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
     * 设置arrivalTransportType属性的值。
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
     * 获取arrivalStationCode属性的值。
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
     * 设置arrivalStationCode属性的值。
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
     * 获取arrivalCarrierCode属性的值。
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
     * 设置arrivalCarrierCode属性的值。
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
     * 获取arrivalDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * 设置arrivalDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDateTime(Date value) {
        this.arrivalDateTime = value;
    }

    /**
     * 获取arrivalTransportNo属性的值。
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
     * 设置arrivalTransportNo属性的值。
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
     * 获取arrivalComments属性的值。
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
     * 设置arrivalComments属性的值。
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
     * 获取departureTransportationYN属性的值。
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
     * 设置departureTransportationYN属性的值。
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
     * 获取departureTransportType属性的值。
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
     * 设置departureTransportType属性的值。
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
     * 获取departureStationCode属性的值。
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
     * 设置departureStationCode属性的值。
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
     * 获取departureCarrierCode属性的值。
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
     * 设置departureCarrierCode属性的值。
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
     * 获取departureDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * 设置departureDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(Date value) {
        this.departureDateTime = value;
    }

    /**
     * 获取departureTransportNo属性的值。
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
     * 设置departureTransportNo属性的值。
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
     * 获取departureComments属性的值。
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
     * 设置departureComments属性的值。
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
     * 获取payMentGateWay属性的值。
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
     * 设置payMentGateWay属性的值。
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
     * 获取accompanyings属性的值。
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
     * 设置accompanyings属性的值。
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
     * 获取orderInfoTraceTextsList属性的值。
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
     * 设置orderInfoTraceTextsList属性的值。
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
     * 获取dailyItems属性的值。
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
     * 设置dailyItems属性的值。
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
     * 获取orderInfoPackageList属性的值。
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
     * 设置orderInfoPackageList属性的值。
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
     * 获取orderInfoAlertsList属性的值。
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
     * 设置orderInfoAlertsList属性的值。
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
     * 获取payment属性的值。
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
     * 设置payment属性的值。
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
     * 获取guestInfoId属性的值。
     * 
     */
    public int getGuestInfoId() {
        return guestInfoId;
    }

    /**
     * 设置guestInfoId属性的值。
     * 
     */
    public void setGuestInfoId(int value) {
        this.guestInfoId = value;
    }

    /**
     * 获取depositScheduleInfo属性的值。
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
     * 设置depositScheduleInfo属性的值。
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
     * 获取cancelScheduleInfo属性的值。
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
     * 设置cancelScheduleInfo属性的值。
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
     * 获取externalUser属性的值。
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
     * 设置externalUser属性的值。
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
     * 获取blockCode属性的值。
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
     * 设置blockCode属性的值。
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
     * 获取orderInfoComments属性的值。
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
     * 设置orderInfoComments属性的值。
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
     * 获取dicInfoFfp属性的值。
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
     * 设置dicInfoFfp属性的值。
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
     * 获取memberInfoFfp属性的值。
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
     * 设置memberInfoFfp属性的值。
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
     * 获取travelAgency属性的值。
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
     * 设置travelAgency属性的值。
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
     * 获取sourceOfBusiness属性的值。
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
     * 设置sourceOfBusiness属性的值。
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
     * 获取idOfTravelAgency属性的值。
     * 
     */
    public int getIdOfTravelAgency() {
        return idOfTravelAgency;
    }

    /**
     * 设置idOfTravelAgency属性的值。
     * 
     */
    public void setIdOfTravelAgency(int value) {
        this.idOfTravelAgency = value;
    }

    /**
     * 获取idOfSourceBusiness属性的值。
     * 
     */
    public int getIdOfSourceBusiness() {
        return idOfSourceBusiness;
    }

    /**
     * 设置idOfSourceBusiness属性的值。
     * 
     */
    public void setIdOfSourceBusiness(int value) {
        this.idOfSourceBusiness = value;
    }

    /**
     * 获取accountOfTravelAgency属性的值。
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
     * 设置accountOfTravelAgency属性的值。
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
     * 获取accountOfSourceBusiness属性的值。
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
     * 设置accountOfSourceBusiness属性的值。
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
     * 获取companyName属性的值。
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
     * 设置companyName属性的值。
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
     * 获取companyAccount属性的值。
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
     * 设置companyAccount属性的值。
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
     * 获取companyID属性的值。
     * 
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * 设置companyID属性的值。
     * 
     */
    public void setCompanyID(int value) {
        this.companyID = value;
    }

    /**
     * 获取croPermissionName属性的值。
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
     * 设置croPermissionName属性的值。
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
     * 获取discountMethod属性的值。
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
     * 设置discountMethod属性的值。
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
