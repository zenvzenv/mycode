package cn.zw.teststring;
/**
 * String是不可变字符序列
 * 练习String类中常用的方法
 * 结合数组查看源码
 * @author zhengwei
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str=new String("abcd");
		String str1=new String("abcd");
		String str2="abcd";
		System.out.println(str.charAt(2));
		System.out.println(str1.equals(str));
		System.out.println(str2.equals(str));//equals比较的是内容是否相等
		System.out.println(str2==str);
		
		String str3="abc";
		String str4="abc";
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		
		System.out.println(str3.indexOf('c'));
		String s=str3.substring(1);//切割字符串
		System.out.println(s);
		
		String str5=str3.replace('c', '*');//替换字符
		System.out.println(str5);
		
		String str6="abc,efg,higk";//字符串切割
		String[] strArry=str6.split(",");
		for (int i = 0; i < strArry.length; i++) {
			System.out.println(strArry[i]);
		}
		
		String str7="  aa  bb  ";
		String str77=str7.trim();//去除首尾空格
		System.out.println(str77);
		
		System.out.println("Abc".equalsIgnoreCase("abc"));
		
		System.out.println("Abcbf".indexOf("b"));
		System.out.println("Abcbf".lastIndexOf("b"));
		System.out.println("Abcbd".startsWith("A"));
		System.out.println("Abcbd".endsWith("d"));
		System.out.println("Abcbd".toLowerCase());//全变小写
		System.out.println("Abcbd".toUpperCase());//全变大写
		
		System.out.println("#############################");
		String gh="a";
		for (int i = 0; i < 10; i++) {
			gh+=i;
		}
		System.out.println(gh);
	}
}
