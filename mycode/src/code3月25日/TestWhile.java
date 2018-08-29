package code3月25日;

public class TestWhile {
	public static void main(String[] args) {
		int a=1;//初始化
		while (a<=100) {//条件判断
			System.out.println(a);//循环体
			a++;//迭代
		}
		System.out.println("while循环结束");
		
		int sum=0;
		int b=1;
		while (b<=100) {//先判断后执行
			sum+=b;
			b++;
		}
		System.out.println("和为:"+sum);
		
		int c=0;
		do {//先执行后判断
			System.out.println(c);
			c++;
		} while (c<=0);
	}
}
