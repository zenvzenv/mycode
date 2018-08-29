package cn.zw.demo.spring3_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zw.demo.helloworld.HelloWorld;
import cn.zw.demo.loosely_coupled.OutputHelper;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
        context=new ClassPathXmlApplicationContext(new String[] {"Spring-Output.xml","SpringBeans.xml"});
        HelloWorld hw=(HelloWorld) context.getBean("helloBean");//获取bean中的id属性
        hw.printHello();
        OutputHelper output=(OutputHelper) context.getBean("OutputHelper");//获取bean中的id属性
        output.generateOutput();
    }
}
