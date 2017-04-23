package com.wsx.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect//ע������һ������
@Component//�ô������Ϊspring�����һ��bean
public class AspectDemo {
	//ע�������е�
	@Pointcut("@annotation(com.wsx.aop.Action)")
	public void piececut(){
		System.out.println("pointcut111");
	}
	//@After����һ��֪ͨ,.��ʹ��@Pointcut�������е�
	@After(value = "piececut()")
	public void after(){
		System.out.println("after");
	}
	//@Before����һ��֪ͨ,ʹ�����ع�����Ϊ����
	@Before(value = "execution(* com.wsx.aop.DemoMethodService.* (..))")
	public void before(){
		System.out.println("before");
	}
}
