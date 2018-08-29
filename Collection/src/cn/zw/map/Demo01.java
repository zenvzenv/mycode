package cn.zw.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * <p>Title:Demo01</p>
 * this is a cat and that is a mice and where is the food?
 * 统计每个单词出现的次数
 * 存储到Map中
 * key:String
 * value:自定义类型
 * 
 * “分拣”思路
 * 1.最所有的key创建容器，之后在容器里面存放对于的value
 * 2.第一次创建容器并存放值，第二次之后，直接使用容器存放值
 * 
 * @author zhengwei
 * @date 2017-5-3 下午10:35:38
 */
public class Demo01 {
	public static void main(String[] args) {
		String str="this is a cat and that is a mice and where is the food";
		//分割字符串
		String[] strArray=str.split(" ");
		//存储到Map中
		Map<String,Letter> letters=new HashMap<String,Letter>();
		Letter col=null;
				//1.创建容器并存放值
		for (String key : strArray) {
			if(null==letters.get(key)){
				col=new Letter();
				col.setCount(1);//第一次的值存放了
				letters.put(key, col);
			}else{
				//2.直接使用容器存放值
				col=letters.get(key);
				col.setCount(col.getCount()+1);
			}
		}
		Set<String> keys=letters.keySet();
		for (String key : keys) {
			col=letters.get(key);
			System.out.println("字母："+key+"，次数"+col.getCount());
		}
	}
	
	public static void test01(){
		String str="this is a cat and that is a mice and where is the food";
		//分割字符串
		String[] strArray=str.split(" ");
		
		//存储到Map中
		Map<String,Letter> letters=new HashMap<String,Letter>();
		/*
		for (String key : strArray) {
			//为所有的key创建容器
			if (letters.containsKey(key)) {
				letters.put(key, new Letter());
			}
		}
		for (String key : strArray) {
			//之后在容器中寻访对应的value
			Letter col=letters.get(key);//直接使用容器
			col.setCount(col.getCount()+1);
		}
		*/
		for (String key : strArray) {
			if (!letters.containsKey(key)) {
				letters.put(key, new Letter());
			}
			Letter col=letters.get(key);
			col.setCount(col.getCount()+1);
		}
		//输出Map的值
		Set<String> keys=letters.keySet();
		for (String key : keys) {
			Letter col=letters.get(key);
			System.out.println("字母："+key+"，次数"+col.getCount());
		}
	}
}
