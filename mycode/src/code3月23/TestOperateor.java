package code3月23;
//测试运算符
public class TestOperateor {
	public static void main(String[] args) {
		int d=10%3;
		System.out.println(d);
		
		int a=3;
		int b=a++;//先赋值后自增
		int c=++a;//先自增后赋值
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		
//		int a1=3/0;
//		System.out.println(a1);
		
		boolean b1=1>2&&2>(3/0);//短路，直接给出结果
		System.out.println(b1);
//		boolean b2=1<2&&2>(3/0);
//		System.out.println(b2);
		
		int n=8;
		int m=3;
		System.out.println(m&n);
		System.out.println(m|n);
		System.out.println(m^n);
		System.out.println(~m);
		
		int a1=2*2*2;
		int b2=2<<3;//左移一位相当于乘以二
		int c2=12/2/2;
		int d1=12>>2;//右移一位相当于除以二
		System.out.println(a1);
		System.out.println(b2);
		System.out.println(c2);
		System.out.println(d1);
		
		int x=3;
		int y=5;
		String str=(a<b)?"x<y":"x>y";
		System.out.println(str);
	}
}
