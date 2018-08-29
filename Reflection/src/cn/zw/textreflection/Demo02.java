package cn.zw.textreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo02 {
	public static void main(String[] args) {
		String path="cn.zw.bean.User";
		try {
			Class clz=Class.forName(path);
			
			//��ȡ�������
			System.out.println(clz.getName());
			System.out.println(clz.getSimpleName());
			//��ȡ�������
			System.out.println(clz.getFields());//ֻ�ܻ��public��field
			Field[] f=clz.getDeclaredFields();//������е�����
			Field str=clz.getDeclaredField("uname");
			for (Field field : f) {
				System.out.println("����"+field);
			}
			//��ȡ��ķ�������������в���������봨���ݲ������ͣ�������Class����
			Method[] method=clz.getDeclaredMethods();
			Method m01=clz.getDeclaredMethod("getUname", null);
			Method m02=clz.getDeclaredMethod("setUname", String.class);
//			Method m03=clz.getDeclaredMethod("setUname", null);
			for (Method method2 : method) {
				System.out.println("����"+method2);
			}
			//��ȡ��Ĺ�����
			Constructor[] constructors=clz.getDeclaredConstructors();
			Constructor c=clz.getDeclaredConstructor(int.class,int.class,String.class);
			Constructor c2=clz.getDeclaredConstructor(null);
			System.out.println(c);
			System.out.println(c2);
			for(Constructor temp:constructors){
				System.out.println("������"+temp);
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
