package cn.zw.sort.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * <p>Title:CollectionsDemo01</p>
 * binarySearch(List<? extends Comparable<? super T>> list,T key)	��������
 * sort(List<?> list)
 * reverse(List<?> list)	Ԫ�ط�ת
 * shuffle(List<?> list)	Ԫ�ش��ң�ģ��ϴ��
 * swap(List<?> list,int i,int j)ָ��������������������������Ԫ��
 * @author zhengwei
 * @date 2017-5-5 ����11:38:10
 */
public class CollectionsDemo01 {
	public static void main(String[] args) {
		List<Integer> cards=new ArrayList<Integer>();
		//shuffle ģ��ϴ��
		for (int i = 0; i < 54; i++) {
			cards.add(i);
		}
		//ϴ��
		Collections.shuffle(cards);
		//һ�η���
		List<Integer> p1=new ArrayList<Integer>();
		List<Integer> p2=new ArrayList<Integer>();
		List<Integer> p3=new ArrayList<Integer>();
		List<Integer> last=new ArrayList<Integer>();
		for (int i = 0; i < 51; i+=3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
		}
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));
		System.out.println("��һ���ˣ�"+p1);
		System.out.println("�ڶ����ˣ�"+p2);
		System.out.println("�������ˣ�"+p3);
		System.out.println("����Ϊ"+last);
	}
	public static void test01(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("��ת֮��"+list);
	}
}
