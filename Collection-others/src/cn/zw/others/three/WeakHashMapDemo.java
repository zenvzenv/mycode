package cn.zw.others.three;

import java.util.WeakHashMap;

/**
 * 
 * <p>Title:WeakHashMapDemo</p>
 * <p>Description:WeakHashMap键为弱类型，gc运行之后立即回收</p>
 * @author zhengwei
 * @date 2017-5-6 下午9:20:11
 */
public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap<String,String> map=new WeakHashMap<String,String>();
		//测试数据
		//前面两个的声明，声明在常量池中，不会被gc回收
		map.put("abc", "a");
		map.put("d", "test");
		//后面两个的声明是在对战中，弱类型，会被gc回收
		map.put(new String("abc"), "zw");
		map.put(new String("dsf"), "zw1");
		
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}
}
