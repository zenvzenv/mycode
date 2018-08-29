package cn.zw.guava;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * 
 * <p>Title:Demo02</p>
 * 函数式编程
 * 1.predicate
 * 2.Function
 * 
 * 工具：Collection2.filter() 过滤器，过滤出我们想要的
 * @author zhengwei
 * @date 2017-5-6 下午11:27:16
 */
public class Demo02 {
	public static void main(String[] args) {
		List<String> list=Lists.newArrayList("zw","zw1","zw2","moom","dad");
		//找出回文
		//匿名内部类
		Collection<String> palindromeList=Collections2.filter(list, new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return new StringBuilder(input).reverse().toString().equals(input);
			}
		});
		for (String temp : palindromeList) {
			System.out.println(temp);
		}
	}
}
