package cn.zw.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * 
 * <p>Title:Demo01</p>
 * <p>Description:ֻ������</p>
 * @author zhengwei
 * @date 2017-5-6 ����11:18:11
 */
public class Demo01 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("as");
		list.add("b");
		list.add("c");
		//��ԭ�е�list���а�װ���൱��ԭ�е�list��һ�����գ�������ȫ
		List<String> readList=Collections.synchronizedList(list);
		readList.add("d");
		list.add("e");//�ı�ԭ��list����ͼҲһ��ı�
		//guava��Լ�
		List<String> immutableList=ImmutableList.of("a","b","c");
		immutableList.add("d");
	}
}
