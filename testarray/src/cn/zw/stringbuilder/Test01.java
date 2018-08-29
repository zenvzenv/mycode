package cn.zw.stringbuilder;
/**
 * String不可变字符序列
 * StringBuikder：可变长字符串，线程不安全，效率较低
 * StringBuffer线程安全，效率低
 * @author zhengwei
 *
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();//字符长度默认为16
		StringBuilder sb1=new StringBuilder(4);//字符串长度为4
		StringBuilder sb2=new StringBuilder("abcd");//字符长度为32,value[]={'a','b','c','d',/u000,/u000,....}
		sb2.append("efg");//字符串累加
		sb2.append(true).append(321).append("zw");//方法链
		System.out.println(sb2);
		
		System.out.println("###################");
		StringBuilder sb3=new StringBuilder("a");
		for (int i = 0; i < 1000; i++) {//字符串长度不够时，新数组长度=老数组的长度*2+2
			sb3.append(i);
		}
		System.out.println(sb3);
	}
}
