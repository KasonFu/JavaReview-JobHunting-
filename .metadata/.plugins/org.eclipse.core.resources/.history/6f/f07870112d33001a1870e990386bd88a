package com.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/AOP/beans.xml");
		TestServiceInterface ts = (TestServiceInterface) context.getBean("proxyfactorybean");
		ts.sayhello();
		((TestServiceInterface2)ts).sayBye();
	}

}
