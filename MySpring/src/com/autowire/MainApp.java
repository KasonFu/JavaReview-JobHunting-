package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inherit.Graduate;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/beans.xml");
		Owner o = (Owner) context.getBean("owner");
		System.out.print(o.getName()+"Ñø "+o.getDog().getName()+" "+o.getDog().getAge());
	}

}
