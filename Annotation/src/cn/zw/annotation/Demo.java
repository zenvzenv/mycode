package cn.zw.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * ʹ�÷����ȡע�����Ϣ��ģ�⴦��ע����Ϣ������
 * <p>Title:Demo</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-14 ����5:38:09
 */
public class Demo {
	public static void main(String[] args) {
		try {
			Class clz=Class.forName("cn.zw.annotation.Student");
			Annotation[] annotations= clz.getAnnotations();//������������е�ע��
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
			//�����ָ��ע���ֵ
			StudentTable st=(StudentTable) clz.getAnnotation(StudentTable.class);
			System.out.println(st.value());
			//���������Ե�ע��
			Field f=clz.getDeclaredField("name");
			StudentField sf=f.getAnnotation(StudentField.class);
			System.out.println(sf.columnName()+"--"+sf.type()+"--"+sf.length());
			//���ݻ�ñ������ֶε���Ϣ������DDL��䣬Ȼ��ѱ���ӵ����ݿ���
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
