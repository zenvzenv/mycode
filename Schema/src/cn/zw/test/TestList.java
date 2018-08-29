package cn.zw.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Map<String,String> map=new HashMap<String,String>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");
//		Set<String> set=map.keySet();
//		for (String string : set) {
//			System.out.println(map.get(string));
//		}
		Set<Entry<String, String>> set=map.entrySet();
		for (Entry<String, String> entry : set) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
