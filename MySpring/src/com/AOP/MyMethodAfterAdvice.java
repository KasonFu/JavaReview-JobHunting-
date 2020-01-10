package com.AOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyMethodAfterAdvice implements AfterReturningAdvice {

	@Override
	//arg0 调用method的返回值
	//arg1 调用的method
	//arg2 调用method的参数
	//arg3 目标对象
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("关闭资源。。。");
	}

}
