package cn.zw.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * <p>Title:TestEquals</p>
 * <p>Description:equslsΪtrue��hashcodeһ����ȣ�hashcode��ȣ�equsls��һ�����</p>
 * @author zhengwei
 * @date 2017-4-30 ����3:08:26
 */
public class TestEquals {
	public static void main(String[] args) {
		List list=new ArrayList();
		String s1=new String("aaa");
		String s2=new String("aaa");
		
		list.add(s1);
		list.add(s2);
		
		System.out.println(list.size());
		System.out.println(s1==s2);
		
		Map map=new HashMap();
		//Map�ļ������ظ���Map�ڲ���������equsls�������Ƚϼ���ֵ��
		map.put(s1, "qwer");
		map.put(s2, "asdf");
		System.out.println(map.get("aaa"));
	}
}
