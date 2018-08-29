package cn.zw.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("SpringCollectons.xml");
		Customer lists=(Customer) context.getBean("customerBean");
		System.out.println(lists.getLists().toString());
		
		Customer sets=(Customer) context.getBean("customerBean");
		System.out.println(sets.getSets().toString());
		
		Customer maps=(Customer) context.getBean("customerBean");
		System.out.println(maps.getMaps().toString());
		
		Customer pros=(Customer) context.getBean("customerBean");
		System.out.println(pros.getPros().toString());
	}
}
