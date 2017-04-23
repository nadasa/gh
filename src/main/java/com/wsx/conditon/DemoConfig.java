package com.wsx.conditon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
	 
	@Bean
	@Conditional(DemoWindowsCondition.class)
	public ListService windowsSerivce(){
		return new WindowsService();
	}
	
	@Bean
	@Conditional(DemoLinuxCondition.class)
	public ListService linuxSerivce(){
		return new LinuxService();
	}
}
