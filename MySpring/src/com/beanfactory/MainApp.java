package com.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Application上下文容器在创建时，所有的bean不管你用不用，都已经被实例化了，方便但浪费内存，基本运用于大多情况，因为内存不太值钱了
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/beanfactory/beans.xml");
		student s1 = (student) ac.getBean("student");
		student s2 = (student) ac.getBean("student");
		//System.out.print(s1+" "+s2);
		//Beanfactory容器，得到一个beanfactory，但是bean未被实例化，得自己实例化，适用于内存较小的移动终端
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/beanfactory/beans.xml"));
//		bf.getBean("student");
		
		
		//路径获取
		//ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\Hongkun Fu\\eclipse-workspace\\MySpring\\src\\com\\beanfactory\\beans.xml");
	}

}
