package cn.zw.testWarppedclass;

public class Test01 {
	public static void main(String[] args) {
		Integer a=new Integer(123);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(a));
		Integer a2=Integer.parseInt("1234");//字符串转成整数
		System.out.println(a2);
		System.out.println(a2.intValue());
		Integer a3=new Integer("12335");
	}
}
