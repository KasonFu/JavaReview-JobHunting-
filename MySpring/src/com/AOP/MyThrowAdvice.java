package com.AOP;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;



public class MyThrowAdvice implements ThrowsAdvice {

	//格式
	public void afterThrowing(Method m,Object[] os,Object target, Exception e) {
		System.out.println("出异常了"+e.getMessage());
	}
}
