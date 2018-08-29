package cn.zw.spring.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("SpringBeans.xml");
		CustomerService cs1=(CustomerService) context.getBean("CustomerService");
		cs1.setMessage("zwzwzw");
		System.out.println("Message:"+cs1.getMessage());
		
		CustomerService cs2=(CustomerService) context.getBean("CustomerService");
		cs2.setMessage("123123123");
		System.out.println("Message:"+cs2.getMessage());
	}
}
