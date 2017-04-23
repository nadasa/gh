package com.wsx.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublish publish2 = context.getBean(DemoPublish.class);
		publish2.publish("hello");
		context.close();
	}
}
