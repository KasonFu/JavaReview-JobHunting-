package com.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inherit.Graduate;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dispatch/beans.xml");
		DBUtil o = (DBUtil) context.getBean("dbutil");
		System.out.print(o.getUsername()+" "+o.getAge()+" "+o.getUrl());
	}

}
