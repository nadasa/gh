package com.wsx.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		DemoAware aware  = context.getBean(DemoAware.class);
		aware.oo();
		context.close();
	}
}
