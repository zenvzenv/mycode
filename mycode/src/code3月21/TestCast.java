package code3月21;
//测试自动转型和强制转型
public class TestCast {
	public static void main(String[] args) {
//		byte b=123;
//		//byte b2=300;
//		//char c=-1;//0~65535
//		char c2='a';
//		int i=c2;
//		long L=123321;
//		float f=L;
//		int i2=100;
//		char c3=(char) i2;
		
		//表达式中类型提升的问题
		int a=3;
		long b=4;
		double d=3.14;
		int c=(int) (a+b);//做所有的二元运算符，都会有类型提升问题，int提升为long
		float f=(float) (a+d);
		
		int money=1000000000;
		int year=20;
		long total=(long)money*year;//先转型后计算
		System.out.println(total);
		
		//一个人70年心跳多少次
		long times=70*60*24*365*70;
		System.out.println(times);
		long times1=70L*60*24*365*70;
		System.out.println(times1);
	}

}
