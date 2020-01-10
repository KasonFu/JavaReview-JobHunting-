package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ByeService;
import com.service.UserService;
import com.utility.ApplicationContextUtil;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ͳ��������Userservice�ķ���
//		UserService user = new UserService();
//		user.setName("Kason");
//		user.sayHello();
//	
		
		
		//��Spring��sayHello
		//�õ�spring��applicationContext����
		//û��new���󣬽������������񽻸�spring��ܣ���ֻ��Ҫget
		/*��仰��ִ��ʱ��spring������������ͬʱapplicationcontext�����õ�bean�ͻ����ڴ��б�����������Hashmap������һ��
			�ڴ������и����󣬶�����id��ͨ��id������ ��id����������property
			�����벻���ظ�ִ�У������ظ��ܳ��ڴ�
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService user = (UserService) context.getBean("userService");
		user.sayHello();
		
		
		//�ɼ�дΪһ�����
		//((UserService) ApplicationContextUtil.getApplicationContext().getBean("userService"))
		//.sayHello();
		
		
//		ByeService user1 = (ByeService) context.getBean("byeService");
//		user1.sayBye();
		
	}

}
