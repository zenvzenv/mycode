package cn.zw.sort.bubble;

import java.util.Arrays;

public class BubbleSortFinal {
	public static void main(String[] args) {
		int[] arr={3,2,1,4,5};
		arr=new int[]{3,2,1,4,5};
		boolean flag=true;
		for (int i = 0; i < arr.length-1; i++) {
			flag=true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
				System.out.println(Arrays.toString(arr));
			}
			if (flag) {
				break;
			}
		}
	}
}
