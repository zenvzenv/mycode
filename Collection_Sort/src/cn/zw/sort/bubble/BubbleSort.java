package cn.zw.sort.bubble;

import java.util.Arrays;

/**
 * 
 * <p>Title:BubbleSort</p>
 * <p>Description:���Ǵ���˳��</p>
 * @author zhengwei
 * @date 2017-5-4 ����10:15:42
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr={9,1,2,3,4};
		sortFinal(arr);
	}
	public static void sotr(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("��"+(i+1)+"��");
			for (int j = 0; j < arr.length-1-i; j++) {//ÿ�Ƚ�һ�αȽϴ�������һ��
				System.out.println("��"+(j+1)+"��");
				if (arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	public static void sortFinal(int[] arr){
		boolean flag=true;
		for (int i = 0; i < arr.length-1; i++) {
			flag=true;
			System.out.println("��"+(i+1)+"��");
			for (int j = 0; j < arr.length-1-i; j++) {//ÿ�Ƚ�һ�αȽϴ�������һ��
				System.out.print("��"+(j+1)+"��");
				if (arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
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
