package cn.zw.textreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cn.zw.bean.User;

/**
 * 
 * <p>Title:Demo03</p>
 * <p>Description:通过反射API动态的操作构造器、属性</p>
 * @author zhengwei
 * @date 2017-5-14 下午11:27:27
 */
public class Demo03 {
	public static void main(String[] args) {
		String path="cn.zw.bean.User";
		try {
			Class<User> clz=(Class<User>) Class.forName(path);
			//通过反射API调用构造方法，构造对象
			User u=clz.newInstance();//调用的是无参构造
			System.out.println(u);
			
			Constructor<User> c=clz.getDeclaredConstructor(int.class,int.class,String.class);
			User u2=c.newInstance(01,23,"郑伟");
			System.out.println(u2.getUname());
			
			//通过反射API调用普通方法
			User u3=clz.newInstance();
			Method method=clz.getDeclaredMethod("setUname", String.class);
			method.invoke(u3, "郑伟");	//u3.setUname("郑伟")
			System.out.println(u3.getUname());
			//通过反射API操作属性
			User u4=clz.newInstance();
			Field f=clz.getDeclaredField("uname");
			f.setAccessible(true);//这个属性不需要做安全检查了，可以直接访问
			
			f.set(u4, "郑伟");
			System.out.println(u4.getUname());
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		
	}
}
