package cn.zw.spring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zw.spring.service.CustomerService;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("SpringCustomer.xml");
		CustomerService customerService=(CustomerService) context.getBean("customerService");
		System.out.println(customerService);
	}
}
