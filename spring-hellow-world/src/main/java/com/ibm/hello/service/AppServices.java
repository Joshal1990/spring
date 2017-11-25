package com.ibm.hello.service;

import org.springframework.stereotype.Service;

@Service("myService")
public class AppServices {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String sayHellow() {
		return "Hellow " + name + "how are you?";
	}

}
