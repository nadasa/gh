package com.wsx.conditon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		ListService service = context.getBean(ListService.class);
		service.oo();
		context.close();
		
	}
}
