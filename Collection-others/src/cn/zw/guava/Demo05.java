package cn.zw.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * 
 * <p>Title:Demo05</p>
 * HashMap ��Ψһ��ֵ�����ظ�
 * BiMap ˫��Map ��ֵ�������ظ�(unique value map)
 * @author zhengwei
 * @date 2017-5-8 ����1:54:16
 */
public class Demo05 {
	public static void main(String[] args) {
		BiMap<String, String> bimap=HashBiMap.create();
		bimap.put("zw", "zw@qq.com");
		bimap.put("zw1", "zw1@live.com");
		//ͨ���������û�
		String user=bimap.inverse().get("zw1@qq.com");
		System.out.println(user);
		System.out.println(bimap.inverse()==bimap);
	}
}
