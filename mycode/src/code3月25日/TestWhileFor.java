package code3月25日;

public class TestWhileFor {
	public static void main(String[] args) {
		int sum2=0;
		for (int i = 1; i <= 100; i++) {
			int sum1=0;
			System.out.println("i="+i);
			for (int j = 1; j <= i; j++) {
				System.out.println("j="+j);
				sum1+=j;
				System.out.println("sum1="+sum1);
				sum2+=sum1;
			}
		}
		System.out.println("sum2="+sum2);
		/*****************九九乘法表**********************/
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		/**********************************************/
		
	}
}
