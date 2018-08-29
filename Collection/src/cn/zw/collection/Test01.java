package cn.zw.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 
 * <p>Title:Test01</p>
 * <p>Description:测试容器的基本方法</p>
 * @author zhengwei
 * @date 2017-4-25 下午10:10:23
 */
public class Test01 {
	public static void main(String[] args) {
		//ArrayList:低层实现是数组，线程不安全，效率高，查询块，修改、插入、删除慢
		//LinkedList:低层实现是链表，线程不安全，效率高，查询慢，修改、插入、删除快
		//Vector:线程安全。效率低
		List list=new ArrayList();
		list.add("aaa");
		list.add(new Date());
		list.add(1234);//自动装箱
		
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
