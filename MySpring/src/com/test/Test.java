package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ByeService;
import com.service.UserService;
import com.utility.ApplicationContextUtil;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//传统方法调用Userservice的方法
//		UserService user = new UserService();
//		user.setName("Kason");
//		user.sayHello();
//	
		
		
		//用Spring来sayHello
		//得到spring的applicationContext对象
		//没有new对象，将创建对象任务交给spring框架，你只需要get
		/*这句话被执行时，spring容器被创建，同时applicationcontext中配置的bean就会在内存中被创建，就像Hashmap被创建一样
			内存中有有个对象，对象有id，通过id创建出 此id包含的属性property
			这句代码不能重复执行，否则重复很吃内存
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService user = (UserService) context.getBean("userService");
		user.sayHello();
		
		
		//可简写为一句代码
		//((UserService) ApplicationContextUtil.getApplicationContext().getBean("userService"))
		//.sayHello();
		
		
//		ByeService user1 = (ByeService) context.getBean("byeService");
//		user1.sayBye();
		
	}

}
