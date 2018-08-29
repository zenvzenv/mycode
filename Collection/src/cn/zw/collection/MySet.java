package cn.zw.collection;

import java.util.HashMap;

/**
 * 
 * <p>Title:MySet</p>
 * <p>Description:自定义HashSet</p>
 * @author zhengwei
 * @date 2017-5-1 下午1:09:25
 */
public class MySet {
	private static final Object PRESENT=new Object();
	HashMap map;
	public MySet(){
		map=new HashMap();
	}
	public int size(){
		return map.size();
	}
	public void add(Object o){
		map.put(o, PRESENT);
	}
	public static void main(String[] args) {
		MySet s=new MySet();
		s.add("aaa");
		s.add("ccc");
		s.add("aaa");
		System.out.println(s.size());
	}
}
