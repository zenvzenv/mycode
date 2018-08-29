package cn.zw.sort.col;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * 
 * <p>Title:PersonApp</p>
 * TreeSet:数据元素要求可以排序并且不可重复
 * 1.如果要使用new TreeSet()来实例化，那么就要实现java.lang.Comparable+compareTo
 * 2.如果要使用new TreeSet(Comparator<? extends E> compartor)
 * @author zhengwei
 * @date 2017-5-8 下午10:36:10
 */
public class PersonApp {
	public static void main(String[] args) {
		Person p1=new Person("zw",100);
		Person p2=new Person("刘德华", 1000);
		Person p3=new Person("梁兆伟", 1200);
		
		//一次存放到TreeSet中
		TreeSet<Person> persons=new TreeSet<Person>(
				new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						return -(o1.getHandsome()-o2.getHandsome());
					}
				});//内部类
		//TreeSet在添加数据时排序，而不是在数据添加完成后调用sort方法进行排序
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		System.out.println(persons);
		
		System.out.println(persons);
	}
}
