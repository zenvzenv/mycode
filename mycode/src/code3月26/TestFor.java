package code3ÔÂ26;

public class TestFor {
	public static void main(String[] args) {
		long sum1=1;
		Object obj=new Object();
		for (long i = 1; i <= 10; i++) {
			long sum2 = 1;
			System.out.println("i="+i);
			for (long j = 1; j <= i; j++) {
				System.out.println("j="+j);
				sum2*=j;
				System.out.println("sum2="+sum2);
			}
		}
	}
}
