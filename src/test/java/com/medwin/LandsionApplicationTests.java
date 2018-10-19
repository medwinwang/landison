package com.medwin;

import com.medwin.landison.common.EnvUtil;
import com.medwin.landison.common.KmsAddSoapHeader;
import com.medwin.landison.config.KmsConfig;
import com.medwin.landison.config.LpsConfig;
import com.medwin.landison.service.UserService;
import com.medwin.landison.service.impl.KmsServiceImpl;
import com.medwin.landison.service.impl.LpsServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LandsionApplicationTests {

	@Autowired
	private LpsServiceImpl lpsService;

	@Autowired
	private KmsServiceImpl kmsService;

	@Autowired
	private KmsConfig kmsConfig;

	@Autowired
	private LpsConfig lpsConfig;

	@Autowired
	private UserService userService;

	@Autowired
	private KmsAddSoapHeader  kmsAddSoapHeader;

	@Autowired
	private EnvUtil envUtil;

	@Test
	public void contextLoads() {

		lpsConfig.getRegister();
//		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//
//		List<Interceptor<? extends Message>> list = new ArrayList();
//		// 添加soap header 信息
//		list.add(kmsAddSoapHeader);
//		list.add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
//		// 添加soap消息日志打印
//		factory.setOutInterceptors(list);
//		factory.getInInterceptors().add(new LoggingInInterceptor());
//		factory.setAddress("http://116.62.146.178:9000/KWS_TRAIN/InformationService.asmx");
//		factory.setServiceClass(InformationServiceSoap.class);
//		InformationServiceSoap informationServiceSoap = (InformationServiceSoap) factory.create();
//
//		SendInfo sendInfo = new SendInfo();
//		sendInfo.setSendType("3");
//		sendInfo.setRecipientName("汪工");
//		sendInfo.setAddress("15824436258");
//		sendInfo.setTitle("注册验证码");
//		sendInfo.setContent("您的验证码是【8888】");
//		sendInfo.setContentFlag("S");
//		sendInfo.setEndTime("2018-10-19");
//		sendInfo.setHotelCode("000001");
//		informationServiceSoap.addSendInfo(sendInfo);
//		kmsService.appLogin();
//		System.out.println(kmsConfig.getSessionId());
//		System.out.println(userService.sendRegisterSms("15824436258", "汪工"));

//		lpsService.getUser("15824436258");
//		lpsService.getUser("15824436258");
	}

}
