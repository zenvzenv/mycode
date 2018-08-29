package cn.zw.others.three;

import java.util.IdentityHashMap;

/**
 * 
 * <p>Title:IdentityHashMapDemo</p>
 * <p>Description:IdentityHashMap键只以地址去重,只比较地址</p>
 * @author zhengwei
 * @date 2017-5-6 下午9:26:54
 */
public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap<String,String> map=new IdentityHashMap<String,String>();
		//常量池中的“a”
		map.put("a", "a1");
		map.put("a", "a2");
		System.out.println(map.size());
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		System.out.println(map.size());
	}
}
