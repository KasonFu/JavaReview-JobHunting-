package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inherit.Graduate;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/constructor/beans.xml");
//		Employee e = (Employee) ac.getBean("employee");
//		System.out.print(e.getName()+" "+e.getAge());
	}

}
