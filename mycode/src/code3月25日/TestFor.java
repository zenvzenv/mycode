package code3月25日;

public class TestFor {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <=100; i++) {
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("1到100的和是:"+sum);
		
		int a = 0;
		int sum1=0;
		while (a<=100) {
			//System.out.println(sum);
			sum1+=a;
			a+=2;
		}
		System.out.println("偶数的和是:"+sum1);
		
		int b=1;
		int sum3=0;
		while(b<=100){
			sum3+=b;
			b+=2;
		}
		System.out.println("奇数的和是:"+sum3);
		
		System.out.println("**************************");
		for (int i = 1; i <=1000; i++) {
			if(i%5==0){
				System.out.print(i+"\t");
			}
			if (i%15==0) {
				System.out.println();
			}
		}
	}
	
}
