package com.wsx.el;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfig {
	@Bean
	public DemoService demoService(){
		return new DemoService();
	}
	@Bean
	public ElConfig el()
	{
		return new ElConfig();
	}
}
