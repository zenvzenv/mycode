package cn.zw.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * <p>Title:TestSet</p>
 * <p>Description:����Set���÷���</p>
 * @author zhengwei
 * @date 2017-5-1 ����12:59:32
 */
public class TestSet {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("aaaa");
		set.add("bbbb");
		set.add(new String("aaaa"));
		System.out.println(set.size());
		System.out.println(set.contains("aaaa"));
		set.remove("aaaa");
		System.out.println(set.size());
	}
}
