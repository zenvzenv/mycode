package xn.zw.reflection.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflectionDemo01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person person=new Person();
		//1.
		Class clazz1=person.getClass();
		//2.
		Class clazz2=Person.class;
		//3.
		Class clazz3=Class.forName("xn.zw.reflection.demo.Person");
		
		Person person2=(Person) clazz3.newInstance();
		person2.setNane("֣ΰ");
		System.out.println(person2.getNane());
		
		Constructor<Person> cs=clazz3.getConstructor(String.class,int.class);
		try {
			Person person3=cs.newInstance("֣ΰ",100);
			System.out.println(person3.getSalary());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
