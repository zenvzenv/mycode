package code3月26;

import java.util.Scanner;

/**
 * 测试Scanner的使用
 * @author zhengwei
 *
 */
public class TestScanner {
	public static void test01(){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个加数:");
		int x=s.nextInt();
		System.out.println("请输入另一个加数:");
		int y=s.nextInt();
		int sum=x+y;
		System.out.println("两个加数的和为:"+sum);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//构造器
		System.out.println("请输入:");
		String str=s.next();
		System.err.println("刚刚键盘输入的内容是:"+str);
		test01();
	}
}
