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
		
		//Application�����������ڴ���ʱ�����е�bean�������ò��ã����Ѿ���ʵ�����ˣ����㵫�˷��ڴ棬���������ڴ���������Ϊ�ڴ治ֵ̫Ǯ��
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/beanfactory/beans.xml");
		student s1 = (student) ac.getBean("student");
		student s2 = (student) ac.getBean("student");
		//System.out.print(s1+" "+s2);
		//Beanfactory�������õ�һ��beanfactory������beanδ��ʵ���������Լ�ʵ�������������ڴ��С���ƶ��ն�
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/beanfactory/beans.xml"));
//		bf.getBean("student");
		
		
		//·����ȡ
		//ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\Hongkun Fu\\eclipse-workspace\\MySpring\\src\\com\\beanfactory\\beans.xml");
	}

}
