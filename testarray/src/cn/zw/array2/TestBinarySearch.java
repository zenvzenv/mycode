package cn.zw.array2;

import java.util.Arrays;

/**
 * 
 * <p>Title:TestBinarySearch</p>
 * <p>Description:二分法</p>
 * @author zhengwei
 * @date 2017-4-14 下午10:25:56
 */
public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr={23,45,234,24,456,23,123,34};
		int searchWord=45;//要查找的数
		int searchCount=0;//循环的次数
		//searchCount=gentalLoop(arr,searchWord);
		searchCount=binarySearch(arr,searchWord);
		System.out.printf("普通循环查找%d的次数是%d",searchWord,searchCount);
		System.out.printf("二分法查找%d的次数是%d",searchWord,searchCount);
	}
	/**
	 * 普通循环查找方法
	 * @param arr查找的数组
	 * @param searchWord要查找的数
	 * @return 查找的数
	 */
	public static int gentalLoop(int[] arr,int searchWord){
		int searchCount=0;
		for (int i = 0; i < arr.length; i++) {
			searchCount++;
			if(searchWord==arr[i]){
				break;
			}
		}
		return searchCount;
	}
	/**
	 * 二分法查找放大
	 * @param arr
	 * @param searchWord
	 * @return
	 */
	public static int binarySearch(int[] arr,int searchWord){
		Arrays.sort(arr);
		System.out.println("\n"+Arrays.toString(arr));
		//二分法
		int iIndex=0;
		int iStart=0;
		int iEnd=arr.length-1;
		int searchCount=0;
		for (int i = 0; i < arr.length/2; i++) {
			searchCount++;
			iIndex=(iStart+iEnd)/2;
			if(arr[iIndex]<searchWord){
				System.out.println("aa");
				iStart=iIndex;
			}else if(arr[iIndex]>searchWord){
				System.out.println("bb");
				iEnd=iIndex;
			}else{
				break;
			}
		}
		return searchCount;
		
	}
}
