package com.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.Department;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/inherit/beans.xml");
		Graduate g = (Graduate) context.getBean("graduate");
		System.out.print(g.getName()+ " "+g.getAge()+" "+g.getDegree());
	}

}
