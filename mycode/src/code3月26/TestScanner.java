package code3��26;

import java.util.Scanner;

/**
 * ����Scanner��ʹ��
 * @author zhengwei
 *
 */
public class TestScanner {
	public static void test01(){
		Scanner s=new Scanner(System.in);
		System.out.println("������һ������:");
		int x=s.nextInt();
		System.out.println("��������һ������:");
		int y=s.nextInt();
		int sum=x+y;
		System.out.println("���������ĺ�Ϊ:"+sum);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//������
		System.out.println("������:");
		String str=s.next();
		System.err.println("�ոռ��������������:"+str);
		test01();
	}
}
