package cn.zw.array2;

import java.util.Arrays;

/**
 * 
 * <p>Title:Test02</p>
 * <p>Description:增强型for循环，冒泡排序</p>
 * @author zhengwei
 * @date 2017-4-14 下午10:11:28
 */
public class Test02 {
	/**
	 * 冒泡排序
	 * @param values要排序的数组
	 */
	public static void sort(int[] values){
		int temp;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length-1-i; j++) {
				if(values[j]>values[j+1]){
					temp=values[j];
					values[j]=values[j+1];
					values[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a={2,33,21,543,23,67,75};
		sort(a);
		System.out.println(Arrays.toString(a));
		int[] b={32,45,643,4343,346,2,24,4};
		for (int i : b) {//增强型for循环，遍历数组中的所有元素
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
