package cn.zw.sort.bubble;

import java.util.Arrays;

/**
 * 
 * <p>Title:BubbleSort2</p>
 * <p>Description:ð�������Ż��棬���ٴ���</p>
 * @author zhengwei
 * @date 2017-5-4 ����10:08:57
 */
public class BubbleSort2 {
	public static void main(String[] args) {
		int[] arr={9,8,7,6,5};
		sort(arr);
	}
	public static void sort(int[] arr){
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
}
