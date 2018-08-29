package cn.zw.sort.bubble;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Test {
	public static void main(String[] args) {
//		int[] arr=new int[10];
//		int[] arr2={1,2,3,4};
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		arr2=new int[]{4,5,6,7};
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
//		int[] arr3=new int[]{7,8,9,10};
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.println(arr3[i]);
//		}
		Solution s=new Solution();
		int[] arr={1,2,3};
		String s1="135465498";
		System.out.println(Integer.valueOf(s1.charAt(2)+""));
//		s.plusOne(arr);
//		System.out.println(Arrays.toString(arr));
	}
	
}
class Solution {
	public int[] plusOne(int[] digits) {
		String s="";
		for (int i = 0; i < digits.length; i++) {
			s+=digits[i];
		}
		Long sum=Long.valueOf(s)+1;
		String s2=sum+"";
		int[] result=new int[s2.length()];
		for (int i = 0; i < s2.length(); i++) {
			result[i]=Integer.valueOf(s2.charAt(i)+"");
		}
        return result;
    }
}