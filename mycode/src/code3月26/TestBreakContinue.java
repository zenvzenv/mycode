package code3月26;

public class TestBreakContinue {
	public static void main(String[] args) {
		int total=0;
		System.out.println("begin");
		while(true){
			total++;
			int i=(int) (100*Math.random());
			if (i==88) {
				break;//跳出整个循环
			}
		}
		System.out.println("game over,"+"total="+total);
		
		for (int i = 100; i <= 150; i++) {
			if(i%3==0){
				continue;
			}
			System.out.println(i);
		}
	}
}
