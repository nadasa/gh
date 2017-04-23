package com.wsx.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
@Component
public class DemoAware implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	private ResourceLoader resource;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resource = resourceLoader;
	}

	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
	}
	
	public void oo(){
		System.out.println("0000000000:"+beanName);
		Resource resource2 = resource.getResource("classpath:com/wsx/el/test.properties");
		try {
			System.out.println("111111111:"+IOUtils.toString(resource2.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
