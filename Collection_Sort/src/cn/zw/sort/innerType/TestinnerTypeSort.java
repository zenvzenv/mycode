package cn.zw.sort.innerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestinnerTypeSort {
	public static void main(String[] args) {
		String[] arr={"a","bc","de","abc"};
		Utils.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//´æµ½ÈÝÆ÷ÖÐ
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("bcd");
		//Utils.sort(list);
		System.out.println(list);
		Utils.sort(list, new StringComparator());
	}
}
