package code3��25��;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		double d=Math.random();
		int e=(int) (1+5*d);
		System.out.println(e);
		switch (e) {//int�������Զ�ת��int�����ͣ�byte,char,short��,ö��
		case 6:
			System.out.println("������ã�");
			break;//��������ѭ��������break�Ļ������case��͸������
		case 5:
			System.out.println("��������");
			break;
		case 4:
			System.out.println("��������");
			break;
		default:
			System.out.println("��������");
			break;
		}
		/************************************/
		char c='a';
		int rand=(int) (26*Math.random());
		char c2=(char) (c+rand);
		System.out.print(c2+":");
		switch (c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.print("Ԫ��");
			break;

		default:
			System.out.print("����Ԫ��");
			break;
		}
		/***************java7������**********************/
		Scanner s=new Scanner(System.in);
		System.out.println("�������ַ���:");
		String str=s.next();
		switch (str) {//�����ԣ�switch�������ַ���
		case "֣ΰ":
			System.out.println("�������֣ΰ");
			break;
		case "��Һ�":
			System.out.println("������Ǵ�Һ�");

		default:
			System.out.println("���������");
			break;
		}
	}
}
