package com.musala.gm.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.musala.gm.service.GatewayService;

public class MainApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);
	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		LOGGER.info("Work work");
		GatewayService service = appContext.getBean("gatewayService", GatewayService.class);
		LOGGER.debug(service.toString());		
	}
}
