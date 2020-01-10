package com.interfaceTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//不用接口访问bean
		ApplicationContext context = new ClassPathXmlApplicationContext("com/interfaceTest/beans.xml");
		//System.out.print(((Lowercase) context.getBean("lowercase")).change());
		
		
		//用接口访问bean，可以new一个接口实例，然后改变beans中哪个bean叫changeCase来解决要使用uppercase或者lowercase，只需要把不用的那个注释掉即可
		changeCase cc = (changeCase) context.getBean("changeCase");
		System.out.println(cc.change());
	}

}
