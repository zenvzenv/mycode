package code3月25日;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		double d=Math.random();
		int e=(int) (1+5*d);
		System.out.println(e);
		switch (e) {//int，或者自动转成int的类型（byte,char,short）,枚举
		case 6:
			System.out.println("运气真好！");
			break;//跳出整个循环，不加break的话会出现case穿透的现象
		case 5:
			System.out.println("运气不错");
			break;
		case 4:
			System.out.println("运气还行");
			break;
		default:
			System.out.println("运气不好");
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
			System.out.print("元音");
			break;

		default:
			System.out.print("不是元音");
			break;
		}
		/***************java7新特性**********************/
		Scanner s=new Scanner(System.in);
		System.out.println("请输入字符串:");
		String str=s.next();
		switch (str) {//新特性：switch可以是字符串
		case "郑伟":
			System.out.println("输入的是郑伟");
			break;
		case "大家好":
			System.out.println("输入的是大家好");

		default:
			System.out.println("输入的其它");
			break;
		}
	}
}
