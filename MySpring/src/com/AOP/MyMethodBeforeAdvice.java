package com.AOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	//arg0 被调用的方法
	//arg1 被method传递的参数
	//arg2 目标对象
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("记录日志"+arg0.getName()+"...");
	}

}
