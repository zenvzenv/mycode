package cn.zw.TestEnum;

import java.util.Arrays;

/**
 * 
 * <p>Title:TestReserve</p>
 * <p>Description:颠倒数组里面的内容</p>
 * @author zhengwei
 * @date 2017-5-29 下午11:06:27
 */
public class TestReserve {
	public static void main(String[] args) {
		String[] names={"zw","zw2","zw3"};
		reserve(names);
		System.out.println(Arrays.toString(names));
	}
	public static <T> void reserve(T[] arr){
		for (int i = 0; i < arr.length/2; i++) {
			T temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
}
