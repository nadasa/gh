package com.wsx.el;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
		ElConfig e = context.getBean(ElConfig.class);
		try {
			e.oo();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		context.close();
	}
}
