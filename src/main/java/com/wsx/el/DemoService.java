package com.wsx.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Value("author name!")
	private String pw;
	public String get(){
		return pw;
	}
	public void set(String kk){
		this.pw= kk;
	}
}
