package com.wsx.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect//注解声明一个切面
@Component//让次切面成为spring管理的一个bean
public class AspectDemo {
	//注册声明切点
	@Pointcut("@annotation(com.wsx.aop.Action)")
	public void piececut(){
		System.out.println("pointcut111");
	}
	//@After声明一个通知,.并使用@Pointcut声明的切点
	@After(value = "piececut()")
	public void after(){
		System.out.println("after");
	}
	//@Before声明一个通知,使用拦截规则作为参数
	@Before(value = "execution(* com.wsx.aop.DemoMethodService.* (..))")
	public void before(){
		System.out.println("before");
	}
}
