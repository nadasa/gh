package com.wsx.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Async
	public void oo1(int i){
		System.out.println("mmmm:///"+i);
	}
	@Async
	public void oo2(int i){
		System.out.println("ssss:///"+i);
	}
}
