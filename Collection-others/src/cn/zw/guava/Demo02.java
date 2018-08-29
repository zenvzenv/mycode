package cn.zw.guava;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * 
 * <p>Title:Demo02</p>
 * ����ʽ���
 * 1.predicate
 * 2.Function
 * 
 * ���ߣ�Collection2.filter() �����������˳�������Ҫ��
 * @author zhengwei
 * @date 2017-5-6 ����11:27:16
 */
public class Demo02 {
	public static void main(String[] args) {
		List<String> list=Lists.newArrayList("zw","zw1","zw2","moom","dad");
		//�ҳ�����
		//�����ڲ���
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
