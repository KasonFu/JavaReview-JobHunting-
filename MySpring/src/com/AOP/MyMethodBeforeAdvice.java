package com.AOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	//arg0 �����õķ���
	//arg1 ��method���ݵĲ���
	//arg2 Ŀ�����
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��¼��־"+arg0.getName()+"...");
	}

}
