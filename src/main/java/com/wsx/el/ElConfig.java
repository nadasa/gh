package com.wsx.el;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan(value="com.wsx.el")
@PropertySource("classpath:com/wsx/el/test.properties")
public class ElConfig {
	@Value("${com.author}")
	private String author;
	@Value("#{systemProperties['os.name']}")
	private String os;
	//@Value("#{demoService.pw}")
	private String pw;
	@Value("classpath:com/wsx/el/test.properties")
	private Resource file;
	
	@Value("http://www.baidu.com")
	private Resource kk;
	@Autowired
	private Environment en;
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySource(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void oo() throws IOException{
		System.out.println(author);
		System.out.println(os);
		//System.out.println(pw);
		System.out.println(IOUtils.toString(kk.getInputStream()));
		System.out.println(IOUtils.toString(file.getInputStream()));
	}
}
