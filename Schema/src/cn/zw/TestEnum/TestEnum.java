package cn.zw.TestEnum;

import org.junit.Test;

/**
 * 
 * <p>Title:TestEnum</p>
 * name();����ö�ٵ�����
 * ordinal();ö�ٵ��±꣬�±��0��ʼ
 * valueof(Class<T> enumType,String name);�õ�ö�ٵĶ���
 * valueof(String name);�õ�ö�ٵĶ���
 * values();�������ö�ٶ��������
 * @author zhengwei
 * @date 2017-5-29 ����9:51:03
 */

public class TestEnum {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int[] arr2={};
		int[] arr3=new int[]{1,2,3,4,4};
	}
	/**
	 * ֪���±꣬�õ�ö�ٵĶ��������
	 */
	@Test
	public void test3(){
		int index=1;
		Color[] colors=Color.values();
		Color yellow=colors[index];
		String name=yellow.name();
		System.out.println(name);
	}
	
	
	/**
	 * ֪��ö�ٵ����֣��õ�ö�ٵĶ�����±�
	 */
	@Test
	public void test2(){
		String name="GREEN";
		Color green=Color.valueOf(name);
		int index=green.ordinal();
		System.out.println(index);
	}
	
	/**
	 * ֪��ö�ٵĶ��󣬵õ�ö�����ƺ��±�
	 */
	@Test
	public void test1(){
		//�õ�ö�ٶ���
		Color red=Color.RED;
		//���ö������
		String name=red.name();
		//���ö���±�
		int index=red.ordinal();
		System.out.println(name+" "+index);
	}
}
enum Color{
	//�±��0��ʼ
	RED,YELLOW,GREEN;
}