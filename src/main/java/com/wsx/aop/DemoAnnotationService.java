package com.wsx.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
	@Action(name="ע�ⷽʽ")
	public void add(){
		System.out.println("hello");
	}
}
