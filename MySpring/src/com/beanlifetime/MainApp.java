package com.beanlifetime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beanlifetime/beans.xml");
		PersonService p = (PersonService) context.getBean("personservice");
		p.sayhello();
	}

}
