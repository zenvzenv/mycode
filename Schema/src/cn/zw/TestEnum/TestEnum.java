package cn.zw.TestEnum;

import org.junit.Test;

/**
 * 
 * <p>Title:TestEnum</p>
 * name();返回枚举的名称
 * ordinal();枚举的下标，下标从0开始
 * valueof(Class<T> enumType,String name);得到枚举的对象
 * valueof(String name);得到枚举的对象
 * values();获得所有枚举对象的数组
 * @author zhengwei
 * @date 2017-5-29 下午9:51:03
 */

public class TestEnum {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int[] arr2={};
		int[] arr3=new int[]{1,2,3,4,4};
	}
	/**
	 * 知道下标，得到枚举的对象和名称
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
	 * 知道枚举的名字，得到枚举的对象和下标
	 */
	@Test
	public void test2(){
		String name="GREEN";
		Color green=Color.valueOf(name);
		int index=green.ordinal();
		System.out.println(index);
	}
	
	/**
	 * 知道枚举的对象，得到枚举名称和下标
	 */
	@Test
	public void test1(){
		//得到枚举对象
		Color red=Color.RED;
		//获得枚举名称
		String name=red.name();
		//获得枚举下标
		int index=red.ordinal();
		System.out.println(name+" "+index);
	}
}
enum Color{
	//下标从0开始
	RED,YELLOW,GREEN;
}