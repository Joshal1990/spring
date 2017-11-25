package com.exe.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exe.annotation.service.AppService;

@Configuration
public class AppConfig {

	@Bean(name="appService")
	public AppService appService() {
		return new AppService();
	}
}
