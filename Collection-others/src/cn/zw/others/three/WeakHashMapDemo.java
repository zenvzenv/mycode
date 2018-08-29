package cn.zw.others.three;

import java.util.WeakHashMap;

/**
 * 
 * <p>Title:WeakHashMapDemo</p>
 * <p>Description:WeakHashMap��Ϊ�����ͣ�gc����֮����������</p>
 * @author zhengwei
 * @date 2017-5-6 ����9:20:11
 */
public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap<String,String> map=new WeakHashMap<String,String>();
		//��������
		//ǰ�������������������ڳ������У����ᱻgc����
		map.put("abc", "a");
		map.put("d", "test");
		//�����������������ڶ�ս�У������ͣ��ᱻgc����
		map.put(new String("abc"), "zw");
		map.put(new String("dsf"), "zw1");
		
		//֪ͨ����
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}
}
