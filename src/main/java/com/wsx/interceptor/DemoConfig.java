package com.wsx.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.wsx.mvc.DemoInterceptor;

@Configuration
@ComponentScan("com.wsx.interceptor")
@EnableWebMvc
public class DemoConfig extends WebMvcConfigurerAdapter{
	@Bean
	public DemoInterceptor interceptor(){
		return new DemoInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor());
	}
}
