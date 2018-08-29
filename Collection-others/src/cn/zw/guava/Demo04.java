package cn.zw.guava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * 
 * <p>Title:Demo04</p>
 * <p>Description:�����鿴��ʦ���ڵ�ÿ�ſγ�</p>
 * Multimap��key-value�����ظ�
 * @author zhengwei
 * @date 2017-5-8 ����11:48:15
 */
public class Demo04 {
	public static void main(String[] args) {
		Map<String,String> coures=new HashMap<String,String>();
		//��������
		coures.put("�ĸ￪��", "��Сƽ");
		coures.put("��������", "������");
		coures.put("���ٰ˳�", "������");
		coures.put("ǿ������", "ϰ��ƽ");
		coures.put("��г���", "ϰ��ƽ");
		//Multimap
		Multimap<String,String> teachers=ArrayListMultimap.create();
		Iterator<Map.Entry<String,String>> it=coures.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry=it.next();
			String key=entry.getKey();
			String value=entry.getValue();
			//��ʦ-->�γ�
			teachers.put(value, key);
		}
		Set<String> keyset=teachers.keySet();
		for (String key : keyset) {
			Collection<String> col=teachers.get(key);
			System.out.println(key+"-->"+col);
		}
	}
}
