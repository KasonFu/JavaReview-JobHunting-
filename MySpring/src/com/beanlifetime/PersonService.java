package com.beanlifetime;

import org.springframework.beans.factory.BeanNameAware;

public class PersonService implements BeanNameAware{
	private String name;
	
	public String getName() {
		return name;
	}

	public void init() {
		System.out.println("This is init method");
	}
	
	public void destroy() {
		
	}
	public void setName(String name) {
		//System.out.println("Setting name...");
		this.name = name;
	}

	public void sayhello() {
		System.out.print("Hello "+name);
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0 + " is initializing...");
	}
}
