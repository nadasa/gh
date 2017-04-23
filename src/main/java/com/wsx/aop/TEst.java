package com.wsx.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TEst {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		DemoAnnotationService annotationS = context.getBean(DemoAnnotationService.class);
		DemoMethodService methodS = context.getBean(DemoMethodService.class);
		annotationS.add();
		methodS.add();
		context.close();
	}
}
