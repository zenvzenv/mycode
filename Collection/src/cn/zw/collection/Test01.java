package cn.zw.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 
 * <p>Title:Test01</p>
 * <p>Description:���������Ļ�������</p>
 * @author zhengwei
 * @date 2017-4-25 ����10:10:23
 */
public class Test01 {
	public static void main(String[] args) {
		//ArrayList:�Ͳ�ʵ�������飬�̲߳���ȫ��Ч�ʸߣ���ѯ�飬�޸ġ����롢ɾ����
		//LinkedList:�Ͳ�ʵ���������̲߳���ȫ��Ч�ʸߣ���ѯ�����޸ġ����롢ɾ����
		//Vector:�̰߳�ȫ��Ч�ʵ�
		List list=new ArrayList();
		list.add("aaa");
		list.add(new Date());
		list.add(1234);//�Զ�װ��
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		List list2=new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
		list.add(list2);
		System.out.println(list.size());
		
		String str=(String) list.get(0);
		System.out.println(str);
		list.set(0, "qwer");
		System.out.println(list.get(0));
	}
}
