package cn.zw.sort.col;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * 
 * <p>Title:PersonApp</p>
 * TreeSet:����Ԫ��Ҫ����������Ҳ����ظ�
 * 1.���Ҫʹ��new TreeSet()��ʵ��������ô��Ҫʵ��java.lang.Comparable+compareTo
 * 2.���Ҫʹ��new TreeSet(Comparator<? extends E> compartor)
 * @author zhengwei
 * @date 2017-5-8 ����10:36:10
 */
public class PersonApp {
	public static void main(String[] args) {
		Person p1=new Person("zw",100);
		Person p2=new Person("���»�", 1000);
		Person p3=new Person("����ΰ", 1200);
		
		//һ�δ�ŵ�TreeSet��
		TreeSet<Person> persons=new TreeSet<Person>(
				new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						return -(o1.getHandsome()-o2.getHandsome());
					}
				});//�ڲ���
		//TreeSet���������ʱ���򣬶����������������ɺ����sort������������
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		System.out.println(persons);
		
		System.out.println(persons);
	}
}
