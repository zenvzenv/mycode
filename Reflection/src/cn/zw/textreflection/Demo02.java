package cn.zw.textreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo02 {
	public static void main(String[] args) {
		String path="cn.zw.bean.User";
		try {
			Class clz=Class.forName(path);
			
			//获取类的名字
			System.out.println(clz.getName());
			System.out.println(clz.getSimpleName());
			//获取类的属性
			System.out.println(clz.getFields());//只能获得public的field
			Field[] f=clz.getDeclaredFields();//获得所有的属性
			Field str=clz.getDeclaredField("uname");
			for (Field field : f) {
				System.out.println("属性"+field);
			}
			//获取类的方法，如果方法有参数，则必须川传递参数类型，来对于Class对象
			Method[] method=clz.getDeclaredMethods();
			Method m01=clz.getDeclaredMethod("getUname", null);
			Method m02=clz.getDeclaredMethod("setUname", String.class);
//			Method m03=clz.getDeclaredMethod("setUname", null);
			for (Method method2 : method) {
				System.out.println("方法"+method2);
			}
			//获取类的构造器
			Constructor[] constructors=clz.getDeclaredConstructors();
			Constructor c=clz.getDeclaredConstructor(int.class,int.class,String.class);
			Constructor c2=clz.getDeclaredConstructor(null);
			System.out.println(c);
			System.out.println(c2);
			for(Constructor temp:constructors){
				System.out.println("构造器"+temp);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
