package cn.zw.guava;

import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * 
 * <p>Title:Demo3</p>
 * 统计单词出现的次数
 * 1.HashMap分拣存储+面向对象思维+大量判断
 * 2.Muitiset：无序+可重复，需要用法哦count()方法，增强可读性+操作简单
 * @author zhengwei
 * @date 2017-5-8 上午11:36:35
 */
public class Demo3 {
	public static void main(String[] args) {
		String str="this is a cat and that is a mice where is the food";
		String[] strArray=str.split(" ");
		//存储到Multiest中
		Multiset<String> set=HashMultiset.create();
		for (String strTemp : strArray) {
			set.add(strTemp);
		}
		//获取所有的胆子set
		Set<String> letters=set.elementSet();
		for (String temp : letters) {
			System.out.println(temp+"-->"+set.count(temp));
		}
	}
}
