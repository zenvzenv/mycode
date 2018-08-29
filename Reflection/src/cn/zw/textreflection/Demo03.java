package cn.zw.textreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cn.zw.bean.User;

/**
 * 
 * <p>Title:Demo03</p>
 * <p>Description:ͨ������API��̬�Ĳ���������������</p>
 * @author zhengwei
 * @date 2017-5-14 ����11:27:27
 */
public class Demo03 {
	public static void main(String[] args) {
		String path="cn.zw.bean.User";
		try {
			Class<User> clz=(Class<User>) Class.forName(path);
			//ͨ������API���ù��췽�����������
			User u=clz.newInstance();//���õ����޲ι���
			System.out.println(u);
			
			Constructor<User> c=clz.getDeclaredConstructor(int.class,int.class,String.class);
			User u2=c.newInstance(01,23,"֣ΰ");
			System.out.println(u2.getUname());
			
			//ͨ������API������ͨ����
			User u3=clz.newInstance();
			Method method=clz.getDeclaredMethod("setUname", String.class);
			method.invoke(u3, "֣ΰ");	//u3.setUname("֣ΰ")
			System.out.println(u3.getUname());
			//ͨ������API��������
			User u4=clz.newInstance();
			Field f=clz.getDeclaredField("uname");
			f.setAccessible(true);//������Բ���Ҫ����ȫ����ˣ�����ֱ�ӷ���
			
			f.set(u4, "֣ΰ");
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
