package com.AOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyMethodAfterAdvice implements AfterReturningAdvice {

	@Override
	//arg0 ����method�ķ���ֵ
	//arg1 ���õ�method
	//arg2 ����method�Ĳ���
	//arg3 Ŀ�����
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("�ر���Դ������");
	}

}
