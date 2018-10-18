
package com.medwin.landison.kms.availabilityservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-10-17T20:25:44.436+08:00
 * Generated source version: 3.2.6
 *
 */
public final class AvailabilityQuerySoap_AvailabilityQuerySoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.shijinet.com.cn/kunlun/kws/1.1/", "AvailabilityQuery");

    private AvailabilityQuerySoap_AvailabilityQuerySoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AvailabilityQuery.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        AvailabilityQuery ss = new AvailabilityQuery(wsdlURL, SERVICE_NAME);
        AvailabilityQuerySoap port = ss.getAvailabilityQuerySoap();

        {
        System.out.println("Invoking getSeparateSoldPackage...");
        com.medwin.landison.kms.availabilityservice.SeparateSoldPackageIn _getSeparateSoldPackage_separateSoldPackageIn = null;
        com.medwin.landison.kms.availabilityservice.SeparateSoldPackageOut _getSeparateSoldPackage__return = port.getSeparateSoldPackage(_getSeparateSoldPackage_separateSoldPackageIn);
        System.out.println("getSeparateSoldPackage.result=" + _getSeparateSoldPackage__return);


        }
        {
        System.out.println("Invoking getRateRestrictions...");
        com.medwin.landison.kms.availabilityservice.GetRateRestrictionsIn _getRateRestrictions_getRateRestrictionsIn = null;
        com.medwin.landison.kms.availabilityservice.ArrayOfGetRateRestrictionsOut _getRateRestrictions__return = port.getRateRestrictions(_getRateRestrictions_getRateRestrictionsIn);
        System.out.println("getRateRestrictions.result=" + _getRateRestrictions__return);


        }
        {
        System.out.println("Invoking getRatePlan...");
        java.lang.String _getRatePlan_hotelCode = "";
        java.lang.String _getRatePlan_roomType = "";
        java.lang.String _getRatePlan_rateCode = "";
        javax.xml.datatype.XMLGregorianCalendar _getRatePlan_beginDate = null;
        javax.xml.datatype.XMLGregorianCalendar _getRatePlan_endDate = null;
        com.medwin.landison.kms.availabilityservice.ArrayOfRatePlan _getRatePlan__return = port.getRatePlan(_getRatePlan_hotelCode, _getRatePlan_roomType, _getRatePlan_rateCode, _getRatePlan_beginDate, _getRatePlan_endDate);
        System.out.println("getRatePlan.result=" + _getRatePlan__return);


        }
        {
        System.out.println("Invoking getRoomDetail...");
        java.lang.String _getRoomDetail_hotelCode = "";
        java.lang.String _getRoomDetail_roomtypeCode = "";
        com.medwin.landison.kms.availabilityservice.RoomTypeDetail _getRoomDetail__return = port.getRoomDetail(_getRoomDetail_hotelCode, _getRoomDetail_roomtypeCode);
        System.out.println("getRoomDetail.result=" + _getRoomDetail__return);


        }
        {
        System.out.println("Invoking getAvailabilityList...");
        int _getAvailabilityList_minPrice = 0;
        int _getAvailabilityList_maxPrice = 0;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityList_arrival = null;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityList_departure = null;
        int _getAvailabilityList_extraBed = 0;
        int _getAvailabilityList_adults = 0;
        int _getAvailabilityList_roomNum = 0;
        java.lang.String _getAvailabilityList_guesttypeCode = "";
        java.lang.String _getAvailabilityList_custAccount = "";
        java.lang.String _getAvailabilityList_cardNo = "";
        int _getAvailabilityList_children = 0;
        java.lang.String _getAvailabilityList_channel = "";
        java.lang.String _getAvailabilityList_groupCode = "";
        java.lang.String _getAvailabilityList_countryCode = "";
        java.lang.String _getAvailabilityList_cityCode = "";
        java.lang.String _getAvailabilityList_tag = "";
        java.lang.String _getAvailabilityList_hotelName = "";
        java.lang.String _getAvailabilityList_starCode = "";
        com.medwin.landison.kms.availabilityservice.ArrayOfAvailability _getAvailabilityList__return = port.getAvailabilityList(_getAvailabilityList_minPrice, _getAvailabilityList_maxPrice, _getAvailabilityList_arrival, _getAvailabilityList_departure, _getAvailabilityList_extraBed, _getAvailabilityList_adults, _getAvailabilityList_roomNum, _getAvailabilityList_guesttypeCode, _getAvailabilityList_custAccount, _getAvailabilityList_cardNo, _getAvailabilityList_children, _getAvailabilityList_channel, _getAvailabilityList_groupCode, _getAvailabilityList_countryCode, _getAvailabilityList_cityCode, _getAvailabilityList_tag, _getAvailabilityList_hotelName, _getAvailabilityList_starCode);
        System.out.println("getAvailabilityList.result=" + _getAvailabilityList__return);


        }
        {
        System.out.println("Invoking getBestAvailabilityARI...");
        com.medwin.landison.kms.availabilityservice.AvailabilityRequest _getBestAvailabilityARI_ariRequest = null;
        com.medwin.landison.kms.availabilityservice.Availability _getBestAvailabilityARI__return = port.getBestAvailabilityARI(_getBestAvailabilityARI_ariRequest);
        System.out.println("getBestAvailabilityARI.result=" + _getBestAvailabilityARI__return);


        }
        {
        System.out.println("Invoking getRateDetailSummary...");
        java.lang.String _getRateDetailSummary_hotelCode = "";
        java.lang.String _getRateDetailSummary_roomType = "";
        java.lang.String _getRateDetailSummary_rateCode = "";
        javax.xml.datatype.XMLGregorianCalendar _getRateDetailSummary_date = null;
        com.medwin.landison.kms.availabilityservice.RateDetailSummary _getRateDetailSummary__return = port.getRateDetailSummary(_getRateDetailSummary_hotelCode, _getRateDetailSummary_roomType, _getRateDetailSummary_rateCode, _getRateDetailSummary_date);
        System.out.println("getRateDetailSummary.result=" + _getRateDetailSummary__return);


        }
        {
        System.out.println("Invoking getEcryption...");
        java.lang.String _getEcryption_key = "";
        int _getEcryption_action = 0;
        java.lang.String _getEcryption__return = port.getEcryption(_getEcryption_key, _getEcryption_action);
        System.out.println("getEcryption.result=" + _getEcryption__return);


        }
        {
        System.out.println("Invoking checkRateAndRoomTypeEnabled...");
        com.medwin.landison.kms.availabilityservice.CheckRateAndRoomTypeEnabledIn _checkRateAndRoomTypeEnabled_checkRateAndRoomTypeEnabledIn = null;
        com.medwin.landison.kms.availabilityservice.CheckRateAndRoomTypeEnabledOut _checkRateAndRoomTypeEnabled__return = port.checkRateAndRoomTypeEnabled(_checkRateAndRoomTypeEnabled_checkRateAndRoomTypeEnabledIn);
        System.out.println("checkRateAndRoomTypeEnabled.result=" + _checkRateAndRoomTypeEnabled__return);


        }
        {
        System.out.println("Invoking getRateSwitch...");
        java.lang.String _getRateSwitch_hotelCode = "";
        java.lang.String _getRateSwitch_channelCode = "";
        java.lang.String _getRateSwitch_rateCode = "";
        int _getRateSwitch_year = 0;
        com.medwin.landison.kms.availabilityservice.RateSwitch _getRateSwitch__return = port.getRateSwitch(_getRateSwitch_hotelCode, _getRateSwitch_channelCode, _getRateSwitch_rateCode, _getRateSwitch_year);
        System.out.println("getRateSwitch.result=" + _getRateSwitch__return);


        }
        {
        System.out.println("Invoking getAvailabilityListByCustom...");
        int _getAvailabilityListByCustom_minPrice = 0;
        int _getAvailabilityListByCustom_maxPrice = 0;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityListByCustom_arrival = null;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityListByCustom_departure = null;
        int _getAvailabilityListByCustom_extraBed = 0;
        int _getAvailabilityListByCustom_adults = 0;
        int _getAvailabilityListByCustom_roomNum = 0;
        java.lang.String _getAvailabilityListByCustom_guesttypeCode = "";
        java.lang.String _getAvailabilityListByCustom_custAccount = "";
        java.lang.String _getAvailabilityListByCustom_cardNo = "";
        int _getAvailabilityListByCustom_children = 0;
        java.lang.String _getAvailabilityListByCustom_channel = "";
        java.lang.String _getAvailabilityListByCustom_groupCode = "";
        java.lang.String _getAvailabilityListByCustom_countryCode = "";
        java.lang.String _getAvailabilityListByCustom_cityCode = "";
        java.lang.String _getAvailabilityListByCustom_tag = "";
        java.lang.String _getAvailabilityListByCustom_hotelName = "";
        java.lang.String _getAvailabilityListByCustom_starCode = "";
        com.medwin.landison.kms.availabilityservice.ArrayOfAvailability _getAvailabilityListByCustom__return = port.getAvailabilityListByCustom(_getAvailabilityListByCustom_minPrice, _getAvailabilityListByCustom_maxPrice, _getAvailabilityListByCustom_arrival, _getAvailabilityListByCustom_departure, _getAvailabilityListByCustom_extraBed, _getAvailabilityListByCustom_adults, _getAvailabilityListByCustom_roomNum, _getAvailabilityListByCustom_guesttypeCode, _getAvailabilityListByCustom_custAccount, _getAvailabilityListByCustom_cardNo, _getAvailabilityListByCustom_children, _getAvailabilityListByCustom_channel, _getAvailabilityListByCustom_groupCode, _getAvailabilityListByCustom_countryCode, _getAvailabilityListByCustom_cityCode, _getAvailabilityListByCustom_tag, _getAvailabilityListByCustom_hotelName, _getAvailabilityListByCustom_starCode);
        System.out.println("getAvailabilityListByCustom.result=" + _getAvailabilityListByCustom__return);


        }
        {
        System.out.println("Invoking calculateSeparateSoldPackage...");
        com.medwin.landison.kms.availabilityservice.CalculationSeparateSoldPackageIn _calculateSeparateSoldPackage_calculationSeparateSoldPackageIn = null;
        com.medwin.landison.kms.availabilityservice.CalculationSeparateSoldPackageOut _calculateSeparateSoldPackage__return = port.calculateSeparateSoldPackage(_calculateSeparateSoldPackage_calculationSeparateSoldPackageIn);
        System.out.println("calculateSeparateSoldPackage.result=" + _calculateSeparateSoldPackage__return);


        }
        {
        System.out.println("Invoking getBestRateDetailDaily...");
        com.medwin.landison.kms.availabilityservice.RateDetailRequest _getBestRateDetailDaily_rateDetailRequest = null;
        com.medwin.landison.kms.availabilityservice.RateInfo _getBestRateDetailDaily__return = port.getBestRateDetailDaily(_getBestRateDetailDaily_rateDetailRequest);
        System.out.println("getBestRateDetailDaily.result=" + _getBestRateDetailDaily__return);


        }
        {
        System.out.println("Invoking newGetAvailabilityListByCustom...");
        javax.xml.datatype.XMLGregorianCalendar _newGetAvailabilityListByCustom_arrival = null;
        javax.xml.datatype.XMLGregorianCalendar _newGetAvailabilityListByCustom_departure = null;
        int _newGetAvailabilityListByCustom_extraBed = 0;
        int _newGetAvailabilityListByCustom_adults = 0;
        int _newGetAvailabilityListByCustom_roomNum = 0;
        java.lang.String _newGetAvailabilityListByCustom_guesttypeCode = "";
        java.lang.String _newGetAvailabilityListByCustom_custAccount = "";
        java.lang.String _newGetAvailabilityListByCustom_cardNo = "";
        int _newGetAvailabilityListByCustom_children = 0;
        java.lang.String _newGetAvailabilityListByCustom_channel = "";
        com.medwin.landison.kms.availabilityservice.ArrayOfString _newGetAvailabilityListByCustom_hotelArr = null;
        com.medwin.landison.kms.availabilityservice.ArrayOfAvailability _newGetAvailabilityListByCustom__return = port.newGetAvailabilityListByCustom(_newGetAvailabilityListByCustom_arrival, _newGetAvailabilityListByCustom_departure, _newGetAvailabilityListByCustom_extraBed, _newGetAvailabilityListByCustom_adults, _newGetAvailabilityListByCustom_roomNum, _newGetAvailabilityListByCustom_guesttypeCode, _newGetAvailabilityListByCustom_custAccount, _newGetAvailabilityListByCustom_cardNo, _newGetAvailabilityListByCustom_children, _newGetAvailabilityListByCustom_channel, _newGetAvailabilityListByCustom_hotelArr);
        System.out.println("newGetAvailabilityListByCustom.result=" + _newGetAvailabilityListByCustom__return);


        }
        {
        System.out.println("Invoking hotelAvail...");
        com.medwin.landison.kms.availabilityservice.HotelAvailIn _hotelAvail_request = null;
        com.medwin.landison.kms.availabilityservice.ArrayOfHotelInfoSummary _hotelAvail__return = port.hotelAvail(_hotelAvail_request);
        System.out.println("hotelAvail.result=" + _hotelAvail__return);


        }
        {
        System.out.println("Invoking getBestAvailability...");
        com.medwin.landison.kms.availabilityservice.AvailabilityRequest _getBestAvailability_availabilityRequest = null;
        com.medwin.landison.kms.availabilityservice.Availability _getBestAvailability__return = port.getBestAvailability(_getBestAvailability_availabilityRequest);
        System.out.println("getBestAvailability.result=" + _getBestAvailability__return);


        }
        {
        System.out.println("Invoking getRateDetailDaily...");
        java.lang.String _getRateDetailDaily_hotelCode = "";
        java.lang.String _getRateDetailDaily_channelCode = "";
        javax.xml.datatype.XMLGregorianCalendar _getRateDetailDaily_arrival = null;
        javax.xml.datatype.XMLGregorianCalendar _getRateDetailDaily_departure = null;
        int _getRateDetailDaily_rooms = 0;
        java.lang.String _getRateDetailDaily_rateCode = "";
        java.lang.String _getRateDetailDaily_roomType = "";
        com.medwin.landison.kms.availabilityservice.RateInfo _getRateDetailDaily__return = port.getRateDetailDaily(_getRateDetailDaily_hotelCode, _getRateDetailDaily_channelCode, _getRateDetailDaily_arrival, _getRateDetailDaily_departure, _getRateDetailDaily_rooms, _getRateDetailDaily_rateCode, _getRateDetailDaily_roomType);
        System.out.println("getRateDetailDaily.result=" + _getRateDetailDaily__return);


        }
        {
        System.out.println("Invoking getAvailabilityHotels...");
        int _getAvailabilityHotels_minPrice = 0;
        int _getAvailabilityHotels_maxPrice = 0;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityHotels_arrival = null;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityHotels_departure = null;
        int _getAvailabilityHotels_extraBed = 0;
        int _getAvailabilityHotels_adults = 0;
        int _getAvailabilityHotels_roomNum = 0;
        java.lang.String _getAvailabilityHotels_guesttypeCode = "";
        java.lang.String _getAvailabilityHotels_custAccount = "";
        java.lang.String _getAvailabilityHotels_cardNo = "";
        int _getAvailabilityHotels_children = 0;
        java.lang.String _getAvailabilityHotels_channel = "";
        java.lang.String _getAvailabilityHotels_groupCode = "";
        java.lang.String _getAvailabilityHotels_countryCode = "";
        java.lang.String _getAvailabilityHotels_cityCode = "";
        java.lang.String _getAvailabilityHotels_tag = "";
        java.lang.String _getAvailabilityHotels_hotelName = "";
        java.lang.String _getAvailabilityHotels_starCode = "";
        com.medwin.landison.kms.availabilityservice.ArrayOfString _getAvailabilityHotels__return = port.getAvailabilityHotels(_getAvailabilityHotels_minPrice, _getAvailabilityHotels_maxPrice, _getAvailabilityHotels_arrival, _getAvailabilityHotels_departure, _getAvailabilityHotels_extraBed, _getAvailabilityHotels_adults, _getAvailabilityHotels_roomNum, _getAvailabilityHotels_guesttypeCode, _getAvailabilityHotels_custAccount, _getAvailabilityHotels_cardNo, _getAvailabilityHotels_children, _getAvailabilityHotels_channel, _getAvailabilityHotels_groupCode, _getAvailabilityHotels_countryCode, _getAvailabilityHotels_cityCode, _getAvailabilityHotels_tag, _getAvailabilityHotels_hotelName, _getAvailabilityHotels_starCode);
        System.out.println("getAvailabilityHotels.result=" + _getAvailabilityHotels__return);


        }
        {
        System.out.println("Invoking getSeparateSoldItems...");
        com.medwin.landison.kms.availabilityservice.SeparateSoldItemIn _getSeparateSoldItems_getItemIn = null;
        com.medwin.landison.kms.availabilityservice.SeparateSoldItemOut _getSeparateSoldItems__return = port.getSeparateSoldItems(_getSeparateSoldItems_getItemIn);
        System.out.println("getSeparateSoldItems.result=" + _getSeparateSoldItems__return);


        }
        {
        System.out.println("Invoking getAvailabilityListPerPage...");
        int _getAvailabilityListPerPage_minPrice = 0;
        int _getAvailabilityListPerPage_maxPrice = 0;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityListPerPage_arrival = null;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityListPerPage_departure = null;
        int _getAvailabilityListPerPage_extraBed = 0;
        int _getAvailabilityListPerPage_adults = 0;
        int _getAvailabilityListPerPage_roomNum = 0;
        java.lang.String _getAvailabilityListPerPage_guesttypeCode = "";
        java.lang.String _getAvailabilityListPerPage_custAccount = "";
        java.lang.String _getAvailabilityListPerPage_cardNo = "";
        int _getAvailabilityListPerPage_children = 0;
        java.lang.String _getAvailabilityListPerPage_channel = "";
        java.lang.String _getAvailabilityListPerPage_groupCode = "";
        java.lang.String _getAvailabilityListPerPage_countryCode = "";
        java.lang.String _getAvailabilityListPerPage_cityCode = "";
        java.lang.String _getAvailabilityListPerPage_tag = "";
        java.lang.String _getAvailabilityListPerPage_hotelName = "";
        java.lang.String _getAvailabilityListPerPage_starCode = "";
        int _getAvailabilityListPerPage_pageSize = 0;
        int _getAvailabilityListPerPage_currentPage = 0;
        com.medwin.landison.kms.availabilityservice.ExtraAvailability _getAvailabilityListPerPage__return = port.getAvailabilityListPerPage(_getAvailabilityListPerPage_minPrice, _getAvailabilityListPerPage_maxPrice, _getAvailabilityListPerPage_arrival, _getAvailabilityListPerPage_departure, _getAvailabilityListPerPage_extraBed, _getAvailabilityListPerPage_adults, _getAvailabilityListPerPage_roomNum, _getAvailabilityListPerPage_guesttypeCode, _getAvailabilityListPerPage_custAccount, _getAvailabilityListPerPage_cardNo, _getAvailabilityListPerPage_children, _getAvailabilityListPerPage_channel, _getAvailabilityListPerPage_groupCode, _getAvailabilityListPerPage_countryCode, _getAvailabilityListPerPage_cityCode, _getAvailabilityListPerPage_tag, _getAvailabilityListPerPage_hotelName, _getAvailabilityListPerPage_starCode, _getAvailabilityListPerPage_pageSize, _getAvailabilityListPerPage_currentPage);
        System.out.println("getAvailabilityListPerPage.result=" + _getAvailabilityListPerPage__return);


        }
        {
        System.out.println("Invoking getAvailabilityInventory...");
        java.lang.String _getAvailabilityInventory_hotelCode = "";
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityInventory_arrival = null;
        javax.xml.datatype.XMLGregorianCalendar _getAvailabilityInventory_departure = null;
        java.lang.String _getAvailabilityInventory_channel = "";
        int _getAvailabilityInventory_roomNum = 0;
        com.medwin.landison.kms.availabilityservice.AvailabilityInventory _getAvailabilityInventory__return = port.getAvailabilityInventory(_getAvailabilityInventory_hotelCode, _getAvailabilityInventory_arrival, _getAvailabilityInventory_departure, _getAvailabilityInventory_channel, _getAvailabilityInventory_roomNum);
        System.out.println("getAvailabilityInventory.result=" + _getAvailabilityInventory__return);


        }
        {
        System.out.println("Invoking getAvailability...");
        java.lang.String _getAvailability_hotelCode = "";
        javax.xml.datatype.XMLGregorianCalendar _getAvailability_arrival = null;
        javax.xml.datatype.XMLGregorianCalendar _getAvailability_departure = null;
        int _getAvailability_extraBed = 0;
        int _getAvailability_adults = 0;
        int _getAvailability_roomNum = 0;
        java.lang.String _getAvailability_guesttypeCode = "";
        java.lang.String _getAvailability_custAccount = "";
        java.lang.String _getAvailability_cardNo = "";
        int _getAvailability_children = 0;
        java.lang.String _getAvailability_channel = "";
        com.medwin.landison.kms.availabilityservice.Availability _getAvailability__return = port.getAvailability(_getAvailability_hotelCode, _getAvailability_arrival, _getAvailability_departure, _getAvailability_extraBed, _getAvailability_adults, _getAvailability_roomNum, _getAvailability_guesttypeCode, _getAvailability_custAccount, _getAvailability_cardNo, _getAvailability_children, _getAvailability_channel);
        System.out.println("getAvailability.result=" + _getAvailability__return);


        }
        {
        System.out.println("Invoking getItemDailyInventory...");
        com.medwin.landison.kms.availabilityservice.GetItemDailyInventoryIn _getItemDailyInventory_getItemDailyInventoryIn = null;
        com.medwin.landison.kms.availabilityservice.GetItemDailyInventoryOut _getItemDailyInventory__return = port.getItemDailyInventory(_getItemDailyInventory_getItemDailyInventoryIn);
        System.out.println("getItemDailyInventory.result=" + _getItemDailyInventory__return);


        }
        {
        System.out.println("Invoking getAvailabilitybyRateCode...");
        com.medwin.landison.kms.availabilityservice.GetAvailabilitybyRateCodeIn _getAvailabilitybyRateCode_rateRequest = null;
        com.medwin.landison.kms.availabilityservice.Availability _getAvailabilitybyRateCode__return = port.getAvailabilitybyRateCode(_getAvailabilitybyRateCode_rateRequest);
        System.out.println("getAvailabilitybyRateCode.result=" + _getAvailabilitybyRateCode__return);


        }
        {
        System.out.println("Invoking getAvailabilityPackage...");
        com.medwin.landison.kms.availabilityservice.GetAvailabilityPackageIn _getAvailabilityPackage_getAvailabilityPackageIn = null;
        com.medwin.landison.kms.availabilityservice.GetAvailabilityPackageOut _getAvailabilityPackage__return = port.getAvailabilityPackage(_getAvailabilityPackage_getAvailabilityPackageIn);
        System.out.println("getAvailabilityPackage.result=" + _getAvailabilityPackage__return);


        }
        {
        System.out.println("Invoking getDailyInventory...");
        java.lang.String _getDailyInventory_hotelCode = "";
        java.lang.String _getDailyInventory_channel = "";
        javax.xml.datatype.XMLGregorianCalendar _getDailyInventory_dtBegin = null;
        javax.xml.datatype.XMLGregorianCalendar _getDailyInventory_dtEnd = null;
        java.lang.String _getDailyInventory_roomType = "";
        com.medwin.landison.kms.availabilityservice.HotelDailyInventory _getDailyInventory__return = port.getDailyInventory(_getDailyInventory_hotelCode, _getDailyInventory_channel, _getDailyInventory_dtBegin, _getDailyInventory_dtEnd, _getDailyInventory_roomType);
        System.out.println("getDailyInventory.result=" + _getDailyInventory__return);


        }
        {
        System.out.println("Invoking checkItemIsEnough...");
        com.medwin.landison.kms.availabilityservice.CheckItemIsEnoughIn _checkItemIsEnough_checkItemIsEnoughIn = null;
        com.medwin.landison.kms.availabilityservice.ArrayOfCheckItemIsEnoughOut _checkItemIsEnough__return = port.checkItemIsEnough(_checkItemIsEnough_checkItemIsEnoughIn);
        System.out.println("checkItemIsEnough.result=" + _checkItemIsEnough__return);


        }

        System.exit(0);
    }

}
