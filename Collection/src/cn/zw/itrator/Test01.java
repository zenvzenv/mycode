package cn.zw.itrator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		//通过索引遍历list
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//
		Set set=new HashSet();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		Iterator iter=set.iterator();//迭代器
		while(iter.hasNext()){
			String str=(String) iter.next();
			System.out.println(str);
		}
		
	}
}
