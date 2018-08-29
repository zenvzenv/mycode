package cn.zw.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zw.spring.innerBean.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	FileNameGenerator fng=(FileNameGenerator) context.getBean("FileNameGenerator");
    	fng.printFileName();
    	Customer customer=(Customer) context.getBean("CustomerBean");
    	System.out.println(customer.toString());
    }
}
