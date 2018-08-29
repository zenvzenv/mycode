package cn.zw.server.demo1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		String str="hamburger".substring(4,8);
//		System.out.println(str);
//		String str1="as dad adada awdfa";
//		String str2=str1.toString().trim();
//		System.out.println(str2);
		
//		String s = "abc";
//		String ss = "abc";
//		String s3 = "abc"+"def"; //此处编译器做了优化!
//		String s4 = "abcdef";
//		String s5 = ss+"def";
//		String s2 = new String("abc");
//		System.out.println(s==ss);//true
//		System.out.println(s3==s4);//true
//		System.out.println(s4==s5);//false
//		System.out.println(s4.equals(s5));//true
		
//		File file=new File("c:/迅雷下载/b.txt");
//		file.mkdir();
		
//		Collection c=null;
//		System.out.println(c.isEmpty());
		
		List list1=new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		System.out.println(list1.get(0));
		List list2=new ArrayList();
		list2.add("b");
		list2.add("c");
		list2.add("f");
		list2.add(0, "g");
		List list3=new ArrayList();
		list1.retainAll(list2);
		System.out.println(list1);
		
		Object[] obj=new Object[10];
		obj[0]=new Integer(123);
		
		
		
		
		
	}
}
