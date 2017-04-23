package com.wsx.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoTask.class);
		DemoService task = context.getBean(DemoService.class);
		for(int i=0;i<10;i++){
			task.oo1(i);
			task.oo2(i);
		}
		context.close();
	}
}
