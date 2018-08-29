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
 * ��������
 * 1.System.out	������	��������
 * 2.System.in	�����	����̨���
 * 3.System.err	������
 * 
 * �ض���
 * setIn()
 * setOut()
 * setErr()
 * 
 * FileDescriptor.in	����
 * FileDescriptor.out	���
 * FileDescriptor.err	����
 * @author zhengwei
 * @date 2017-5-10 ����5:24:01
 */
public class SystemFinalVariable {
	public static void main(String[] args) throws FileNotFoundException {
//		test1();
//		test2();
		//�ض���,�ѿ���̨���������뵽�ļ���
		System.setOut(new java.io.PrintStream(new BufferedOutputStream(new FileOutputStream(new File("c:/Ѹ������/1.txt"))),true));
		System.out.println("asddf");
		System.out.println("zw");
		//�ض�������̨
		System.setOut(new java.io.PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("asad");
	}
	public static void test1(){
		System.out.println("test");
		System.out.println("err");
	}
	public static void test2() throws FileNotFoundException{
		InputStream is=System.in;
		is=new BufferedInputStream(new FileInputStream(new File("c:/Ѹ������/1.txt")));
		Scanner sc=new Scanner(is);
		System.out.println("������");
		String str=sc.nextLine();
		System.out.println(str);
	}
}
