package cn.zw.guava;

import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * 
 * <p>Title:Demo3</p>
 * ͳ�Ƶ��ʳ��ֵĴ���
 * 1.HashMap�ּ�洢+�������˼ά+�����ж�
 * 2.Muitiset������+���ظ�����Ҫ�÷�Ŷcount()��������ǿ�ɶ���+������
 * @author zhengwei
 * @date 2017-5-8 ����11:36:35
 */
public class Demo3 {
	public static void main(String[] args) {
		String str="this is a cat and that is a mice where is the food";
		String[] strArray=str.split(" ");
		//�洢��Multiest��
		Multiset<String> set=HashMultiset.create();
		for (String strTemp : strArray) {
			set.add(strTemp);
		}
		//��ȡ���еĵ���set
		Set<String> letters=set.elementSet();
		for (String temp : letters) {
			System.out.println(temp+"-->"+set.count(temp));
		}
	}
}
