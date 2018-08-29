package cn.zw.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		List list=new ArrayList();
		Map map=new HashMap();
		Set set=new HashSet();
		
		list.add("zw");
		list.add("zw");
		list.add("qwer");
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		set.add("zw");
		set.add("add");
		set.add("zw");
		set.add(new String("add"));
		System.out.println(set.size());
		
		map.put("1", "zw");
		map.put("2", "qw");
		map.put("3", "zw");
		map.put("1", "er");
		System.out.println(map.size());
		System.out.println(map.get("1"));
	}
}
