package cn.zw.sort.bubble;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] arr={9,8,7,6,5};
		//第一趟
		/*
		System.out.println("第一趟，第一次");
		int i=0;
		if (arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("第一趟，第二次");
		i++;
		if (arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("第一趟，第三次");
		i++;
		if (arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("第一趟，第四次");
		i++;
		if (arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		*/
		//sortFirst(arr);
		//sortSecond(arr);
		sort(arr);
	}
	public static void sort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("第"+(i+1)+"趟");
			for (int j = 0; j < arr.length-1; j++) {
				System.out.print("第"+(j+1)+"次");
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	public static void sortFirst(int[] arr){
		System.out.println("第一趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("第"+(i+1)+"次");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void sortSecond(int[] arr){
		System.out.println("第一趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("第"+(i+1)+"次");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("第二趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("第"+(i+1)+"次");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void sortThird(int[] arr){
		System.out.println("第一趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("第"+(i+1)+"次");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("第二趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("第"+(i+1)+"次");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("第三趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("第"+(i+1)+"次");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
