package cn.zw.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("zw");
		list.add(new Date());
		list.add(1234);//×Ô¶¯×°Ïä
		
		System.out.println(list.size());
		List list2=new ArrayList();
		list2.add("wz");
		list.add("qwer");
		list.add(list2);
		System.out.println(list.size());
		
		System.out.println(list.get(3));
		list.set(2, "zw123");
		System.out.println(list.get(3));
		list.remove(0);
		System.out.println();
	}
}
