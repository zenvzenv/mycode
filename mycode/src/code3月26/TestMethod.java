package code3月26;
/*
 * 设计方法的原则：方法的本意是功能块，就是实现某个功能的语句的集合。
 * 我们设计方法的时候，最好保持方法的原子性，就是一个方法只完成一个功能，这样有利于扩展。
 */
public class TestMethod {
	public static void test01(int x){//void表示无返回值
		int oddSum=0;
		int evenSum=0;
		for (int i = 1; i <= x; i++) {
			if(i%2==0){
				oddSum+=i;
			}else{
				evenSum+=i;
			}
		}
		System.out.println("偶数和为:"+oddSum);
		System.out.println("奇数和为:"+evenSum);
	}
	public static void test02(int x,int y,int z){
		for (int i = 1; i <= x; i++) {
			if(i%y==0){
				System.out.print(i+"\t");
			}
			if(i%(y*z)==0){
				System.out.println();
			}
		}
	}
	//java中只有值传递，没有引用传递
	public static int add(int x,int y){//x,y是形式参数
		return x+y;//1.返回一个值，2.代表整个方法结束了
	}
	public static void main(String[] args) {
		test01(1000);
		System.out.println();
		test02(100,6,3);
		System.out.println();
		int s=add(24, 42);//实参
		System.out.println(s);
	}
}
