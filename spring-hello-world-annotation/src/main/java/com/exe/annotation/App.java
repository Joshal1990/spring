package com.exe.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.exe.annotation.config.AppConfig;
import com.exe.annotation.service.AppService;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		AppService app_serv = (AppService) context.getBean("appService");
		app_serv.sayHello("johnpaul....!!");
	}
}
