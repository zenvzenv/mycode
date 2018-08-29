package cn.zw.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * 
 * <p>Title:Demo01</p>
 * <p>Description:只读设置</p>
 * @author zhengwei
 * @date 2017-5-6 下午11:18:11
 */
public class Demo01 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("as");
		list.add("b");
		list.add("c");
		//最原有的list进行包装，相当于原有的list的一个快照，不够安全
		List<String> readList=Collections.synchronizedList(list);
		readList.add("d");
		list.add("e");//改变原有list，视图也一起改变
		//guava相对简单
		List<String> immutableList=ImmutableList.of("a","b","c");
		immutableList.add("d");
	}
}
