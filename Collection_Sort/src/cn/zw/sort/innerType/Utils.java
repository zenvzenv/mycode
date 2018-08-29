package cn.zw.sort.innerType;

import java.util.Comparator;
import java.util.List;

/**
 * 
 * <p>Title:Utils</p>
 * <p>Description:针对数组排序</p>
 * @author zhengwei
 * @date 2017-5-5 上午10:41:20
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
	 * 泛型排序
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
	 * 容器的排序
	 * @param list
	 */
	public static <T extends Comparable> void sort(List<T> list){
		//第一步转成数组
		Object[] arr=list.toArray();
		sort(arr);
		//第二部该不安容器中的值
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T) arr[i]);
		}
	}
	/**
	 * 数组排序+Comparator接口
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
	 * 容器排序+Comparator接口
	 * @param list
	 * @param com
	 */
	public static <T> void sort(List<T> list,Comparator com){
		//第一步转成数组
		Object[] arr=list.toArray();
		sort(arr);
		//第二部该不安容器中的值
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T) arr[i]);
		}
	}
}
