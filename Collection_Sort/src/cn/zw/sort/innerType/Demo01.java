package cn.zw.sort.innerType;

import java.util.Date;

/**
 * 
 * <p>Title:Demo01</p>
 * 1.整数、小数Integer,Float,Double直接比较基本数据类型的大小
 * 2.字符：比较的Unicode码之差
 * 2.字符串：如果其中一个是另外一个起始的子串，返回长度之差，否则返回第一个不相等的Unicode码之差
 * 3.java.util.Date
 * @author zhengwei
 * @date 2017-5-5 上午10:30:35
 */
public class Demo01 {
	public static void main(String[] args) {
		Integer a;
		Character ch;//根据Unicode编码顺序
		String str="abc";
		String str2="abcd";
		System.out.println(str.compareTo(str2));
		
		Date d;//根据日期的长整型数比较
	}
}
