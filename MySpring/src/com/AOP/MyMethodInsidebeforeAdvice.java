package com.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInsidebeforeAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("调用方法前。。。");
		Object obj=arg0.proceed();
		System.out.println("调用方法后。。。");
		return obj;
	}

}
