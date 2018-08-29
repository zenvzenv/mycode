package code3月26;
//测试递归
public class TestRecurious {
	static int a=0;
	public static void test01(){
		a++;
		System.out.println("test01="+a);
		if(a<=10){		//递归头
			test01();
		}else{			//递归体
			System.out.println("over");
		}
	}
	public static void test02(){
		System.out.println("test02");
	}
	/*
	 * 1.定义递归头：什么时候不调用自己。如果没有递归头将陷入死循环
	 * 2.递归体：什么时候需要调用自身
	 */
	public static long f(int x){
		if(x==1){//递归头
			return 1;
		}else{//递归体
			return x*f(x-1);
		}
	}
	public static int f2(int x){
		if(x==1){
			return x;
		}else{
			return x+f2(x-1);		
		}
	}
	public static void main(String[] args) {
		test01();
		long s=f(10);
		System.out.println(s);
		int sum=f2(100);
		System.out.println(sum);
	}
}
