package cn.zw.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 * <p>Title:Demo</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-14 下午5:38:09
 */
public class Demo {
	public static void main(String[] args) {
		try {
			Class clz=Class.forName("cn.zw.annotation.Student");
			Annotation[] annotations= clz.getAnnotations();//获得类里面所有的注解
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
			//获得类指定注解的值
			StudentTable st=(StudentTable) clz.getAnnotation(StudentTable.class);
			System.out.println(st.value());
			//获得类的属性的注解
			Field f=clz.getDeclaredField("name");
			StudentField sf=f.getAnnotation(StudentField.class);
			System.out.println(sf.columnName()+"--"+sf.type()+"--"+sf.length());
			//根据获得表名、字段的信息，并处DDL语句，然后把表添加到数据库中
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
