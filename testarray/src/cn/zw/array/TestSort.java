package cn.zw.array;

import java.util.Arrays;

public class TestSort {
	public static void main(String[] args) {
		int[] a={11,64,2134,64,135,213,5,53,4};
		Arrays.sort(a);//sort是从小到大排序数组里面的东西
		System.out.println(Arrays.toString(a));//这里的toString和Object里的toString有什么区别
		
	}
}
