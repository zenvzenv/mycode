package cn.zw.sort.bubble;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] arr={9,8,7,6,5};
		//��һ��
		/*
		System.out.println("��һ�ˣ���һ��");
		int i=0;
		if (arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("��һ�ˣ��ڶ���");
		i++;
		if (arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("��һ�ˣ�������");
		i++;
		if (arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("��һ�ˣ����Ĵ�");
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
			System.out.println("��"+(i+1)+"��");
			for (int j = 0; j < arr.length-1; j++) {
				System.out.print("��"+(j+1)+"��");
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
		System.out.println("��һ��");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("��"+(i+1)+"��");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void sortSecond(int[] arr){
		System.out.println("��һ��");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("��"+(i+1)+"��");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("�ڶ���");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("��"+(i+1)+"��");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void sortThird(int[] arr){
		System.out.println("��һ��");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("��"+(i+1)+"��");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("�ڶ���");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("��"+(i+1)+"��");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("������");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("��"+(i+1)+"��");
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
