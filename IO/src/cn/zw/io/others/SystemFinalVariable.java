package cn.zw.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 * <p>Title:SystemFinalVariable</p>
 * 三个常量
 * 1.System.out	输入流	键盘输入
 * 2.System.in	输出流	控制台输出
 * 3.System.err	错误流
 * 
 * 重定向
 * setIn()
 * setOut()
 * setErr()
 * 
 * FileDescriptor.in	输入
 * FileDescriptor.out	输出
 * FileDescriptor.err	错误
 * @author zhengwei
 * @date 2017-5-10 下午5:24:01
 */
public class SystemFinalVariable {
	public static void main(String[] args) throws FileNotFoundException {
//		test1();
//		test2();
		//重定向,把控制台的内容输入到文件中
		System.setOut(new java.io.PrintStream(new BufferedOutputStream(new FileOutputStream(new File("c:/迅雷下载/1.txt"))),true));
		System.out.println("asddf");
		System.out.println("zw");
		//重定向会控制台
		System.setOut(new java.io.PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("asad");
	}
	public static void test1(){
		System.out.println("test");
		System.out.println("err");
	}
	public static void test2() throws FileNotFoundException{
		InputStream is=System.in;
		is=new BufferedInputStream(new FileInputStream(new File("c:/迅雷下载/1.txt")));
		Scanner sc=new Scanner(is);
		System.out.println("请输入");
		String str=sc.nextLine();
		System.out.println(str);
	}
}
