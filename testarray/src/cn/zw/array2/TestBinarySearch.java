package cn.zw.array2;

import java.util.Arrays;

/**
 * 
 * <p>Title:TestBinarySearch</p>
 * <p>Description:���ַ�</p>
 * @author zhengwei
 * @date 2017-4-14 ����10:25:56
 */
public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr={23,45,234,24,456,23,123,34};
		int searchWord=45;//Ҫ���ҵ���
		int searchCount=0;//ѭ���Ĵ���
		//searchCount=gentalLoop(arr,searchWord);
		searchCount=binarySearch(arr,searchWord);
		System.out.printf("��ͨѭ������%d�Ĵ�����%d",searchWord,searchCount);
		System.out.printf("���ַ�����%d�Ĵ�����%d",searchWord,searchCount);
	}
	/**
	 * ��ͨѭ�����ҷ���
	 * @param arr���ҵ�����
	 * @param searchWordҪ���ҵ���
	 * @return ���ҵ���
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
	 * ���ַ����ҷŴ�
	 * @param arr
	 * @param searchWord
	 * @return
	 */
	public static int binarySearch(int[] arr,int searchWord){
		Arrays.sort(arr);
		System.out.println("\n"+Arrays.toString(arr));
		//���ַ�
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
