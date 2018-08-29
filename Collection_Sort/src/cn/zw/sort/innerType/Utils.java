package cn.zw.sort.innerType;

import java.util.Comparator;
import java.util.List;

/**
 * 
 * <p>Title:Utils</p>
 * <p>Description:�����������</p>
 * @author zhengwei
 * @date 2017-5-5 ����10:41:20
 */
public class Utils {
	public static void sort(Object[] arr){
		boolean flag=true;
		for (int i = 0; i < arr.length-1; i++) {
			flag=true;
			for (int j = 0; j < arr.length-1-j; j++) {
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {
					Object temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=false;
				}
			}
			if (flag) {
				break;
			}
		}
	}
	/**
	 * ��������
	 * @param arr
	 */
	public static <T extends Comparable<T>> void sort(T[] arr){
		boolean flag=true;
		for (int i = 0; i < arr.length-1; i++) {
			flag=true;
			for (int j = 0; j < arr.length-1-j; j++) {
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {
					T temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=false;
				}
			}
			if (flag) {
				break;
			}
		}
	}
	/**
	 * ����������
	 * @param list
	 */
	public static <T extends Comparable> void sort(List<T> list){
		//��һ��ת������
		Object[] arr=list.toArray();
		sort(arr);
		//�ڶ����ò��������е�ֵ
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T) arr[i]);
		}
	}
	/**
	 * ��������+Comparator�ӿ�
	 * @param arr
	 * @param com
	 */
	public static void sort(Object[] arr,Comparator com){
		boolean flag=true;
		for (int i = 0; i < arr.length-1; i++) {
			flag=true;
			for (int j = 0; j < arr.length-1-j; j++) {
				if (com.compare(arr[i], arr[i+1])>0) {
					Object temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=false;
				}
			}
			if (flag) {
				break;
			}
		}
	}
	/**
	 * ��������+Comparator�ӿ�
	 * @param list
	 * @param com
	 */
	public static <T> void sort(List<T> list,Comparator com){
		//��һ��ת������
		Object[] arr=list.toArray();
		sort(arr);
		//�ڶ����ò��������е�ֵ
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T) arr[i]);
		}
	}
}
