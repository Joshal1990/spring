package com.ibm.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.hello.service.AppServices;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AppServices sevice = (AppServices) context.getBean("myService");
		sevice.setName("johnpaul....!!");
		String sayHellow = sevice.sayHellow();
		System.out.println(sayHellow);

	}
}
